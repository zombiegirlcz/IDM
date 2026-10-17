package qc;

import java.util.HashMap;
import prk.o;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f244386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f244387b;

    static {
        HashMap map = new HashMap();
        f244386a = map;
        HashMap map2 = new HashMap();
        f244387b = map2;
        Integer numN = o.n(map, -2, "An unknown error occurred.", -3, "The API is not available on this device.");
        Integer numN2 = o.n(map, -4, "The request that was sent by the app is malformed.", -5, "The install is unavailable to this user or device.");
        Integer numN3 = o.n(map, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", -7, "The install/update has not been (fully) downloaded yet.");
        Integer numN4 = o.n(map, -8, "The install is already in progress and there is no UI flow to resume.", -9, "The Play Store app is either not installed or not the official version.");
        Integer numN5 = o.n(map, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "An internal error happened in the Play Store.");
        map2.put(-2, "ERROR_UNKNOWN");
        map2.put(numN, "ERROR_API_NOT_AVAILABLE");
        map2.put(-4, "ERROR_INVALID_REQUEST");
        map2.put(numN2, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(numN3, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(numN5, "ERROR_INTERNAL_ERROR");
        map2.put(numN4, "ERROR_PLAY_STORE_NOT_FOUND");
        map2.put(-10, "ERROR_APP_NOT_OWNED");
        map2.put(numN5, "ERROR_INTERNAL_ERROR");
    }
}
