package xc;

import java.util.HashMap;
import java.util.Map;
import prk.o;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f304086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f304087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f304088c;

    static {
        HashMap map = new HashMap();
        f304086a = map;
        HashMap map2 = new HashMap();
        f304087b = map2;
        Integer numN = o.n(map, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", -2, "A requested module is not available (to this user/device, for the installed apk).");
        Integer numN2 = o.n(map, -3, "Request is otherwise invalid.", -4, "Requested session is not found.");
        Integer numN3 = o.n(map, -5, "Split Install API is not available.", -6, "Network error: unable to obtain split details.");
        Integer numN4 = o.n(map, -7, "Download not permitted under current device circumstances (e.g. in background).", -8, "Requested session contains modules from an existing active session and also new modules.");
        Integer numN5 = o.n(map, -9, "Service handling split install has died.", -10, "Install failed due to insufficient storage.");
        Integer numN6 = o.n(map, -11, "Signature verification error when invoking SplitCompat.", -12, "Error in SplitCompat emulation.");
        Integer numN7 = o.n(map, -13, "Error in copying files for SplitCompat.", -14, "The Play Store app is either not installed or not the official version.");
        Integer numN8 = o.n(map, -15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -16, "The download is too large to start over the current connection.");
        map.put(-100, "Unknown error processing split install.");
        map2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        map2.put(numN, "MODULE_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(numN2, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(numN3, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(numN4, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        map2.put(-9, "SERVICE_DIED");
        map2.put(numN5, "INSUFFICIENT_STORAGE");
        map2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        map2.put(numN6, "SPLITCOMPAT_EMULATION_ERROR");
        map2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        map2.put(numN7, "PLAY_STORE_NOT_FOUND");
        map2.put(-15, "APP_NOT_OWNED");
        map2.put(numN8, "DOWNLOAD_TOO_LARGE");
        map2.put(-100, "INTERNAL_ERROR");
        f304088c = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            f304088c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }
}
