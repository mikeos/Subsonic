/*
	This file is part of Subsonic.
	
	Subsonic is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.
	
	Subsonic is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.
	
	You should have received a copy of the GNU General Public License
	along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.
	
	Copyright 2009 (C) Sindre Mehus
*/
package github.daneren2005.dsub.util;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import github.daneren2005.dsub.util.Constants;

public class SettingsBackupAgent extends BackupAgentHelper {
	public void onCreate() {
		super.onCreate();
		SharedPreferencesBackupHelper helper = new SharedPreferencesBackupHelper(this, Constants.PREFERENCES_FILE_NAME);
		addHelper("mypreferences", helper);
	}
 }
