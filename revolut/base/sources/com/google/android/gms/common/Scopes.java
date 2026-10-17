package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
public final class Scopes {

    @NonNull
    public static final String CLOUD_SAVE = "https://www.googleapis.com/auth/datastoremobile";

    @NonNull
    public static final String DRIVE_FILE = "https://www.googleapis.com/auth/drive.file";

    @NonNull
    public static final String GAMES = "https://www.googleapis.com/auth/games";

    @NonNull
    public static final String PLUS_ME = "https://www.googleapis.com/auth/plus.me";

    @NonNull
    @KeepForSdk
    public static final String GAMES_LITE = "https://www.googleapis.com/auth/games_lite";

    @NonNull
    public static final String EMAIL = "email";

    @NonNull
    @KeepForSdk
    public static final String LEGACY_USERINFO_EMAIL = "https://www.googleapis.com/auth/userinfo.email";

    @NonNull
    @KeepForSdk
    public static final String DRIVE_FULL = "https://www.googleapis.com/auth/drive";

    @NonNull
    @KeepForSdk
    public static final String OPEN_ID = "openid";

    @NonNull
    public static final String PROFILE = "profile";

    @NonNull
    @KeepForSdk
    public static final String DRIVE_APPS = "https://www.googleapis.com/auth/drive.apps";

    @NonNull
    public static final String APP_STATE = "https://www.googleapis.com/auth/appstate";

    @NonNull
    public static final String DRIVE_APPFOLDER = "https://www.googleapis.com/auth/drive.appdata";

    @NonNull
    @Deprecated
    public static final String PLUS_LOGIN = "https://www.googleapis.com/auth/plus.login";

    @NonNull
    @KeepForSdk
    public static final String LEGACY_USERINFO_PROFILE = "https://www.googleapis.com/auth/userinfo.profile";

    private Scopes() {
    }
}
