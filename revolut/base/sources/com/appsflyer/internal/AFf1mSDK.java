package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1mSDK extends AFf1xSDK<Boolean> {
    private static volatile boolean d;
    private Boolean AFLogger;
    private final AFd1fSDK e;
    private final AFe1aSDK registerClient;
    private final AFb1tSDK unregisterClient;

    public AFf1mSDK(@NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1ySDK.LOAD_CACHE, new AFf1ySDK[0], "LoadCachedRequests");
        this.unregisterClient = aFd1fSDK.afWarnLog();
        this.registerClient = aFd1fSDK.w();
        this.e = aFd1fSDK;
    }

    public static boolean AFLogger() {
        return d;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NonNull
    public final AFe1fSDK AFInAppEventParameterName() throws Exception {
        for (AFb1qSDK aFb1qSDK : this.unregisterClient.AFInAppEventParameterName()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.CACHE;
            StringBuilder sb6 = new StringBuilder("resending request: ");
            sb6.append(aFb1qSDK.AFKeystoreWrapper);
            aFLogger.i(aFg1bSDK, sb6.toString());
            try {
                AFh1mSDK aFh1mSDK = new AFh1mSDK(values(aFb1qSDK), aFb1qSDK.AFInAppEventParameterName(), aFb1qSDK.AFInAppEventType, aFb1qSDK.values);
                AFe1aSDK aFe1aSDK = this.registerClient;
                aFe1aSDK.AFInAppEventParameterName.execute(aFe1aSDK.new AnonymousClass4(new AFf1dSDK(aFh1mSDK, this.e)));
            } catch (Exception e) {
                AFLogger.INSTANCE.e(AFg1bSDK.QUEUE, "Failed to resend cached request", e);
            }
        }
        this.AFLogger = Boolean.TRUE;
        d = true;
        return AFe1fSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }

    private static String values(AFb1qSDK aFb1qSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = Long.parseLong(aFb1qSDK.AFInAppEventType, 10);
        String str = aFb1qSDK.AFKeystoreWrapper;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((jCurrentTimeMillis - j2) / 1000)).toString();
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e);
            return str;
        }
    }
}
