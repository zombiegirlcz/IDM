package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1eSDK extends AFf1xSDK<AFg1zSDK> {
    private final AFd1sSDK AFLogger;
    private final String afInfoLog;
    public final AFf1aSDK d;
    private final AFg1xSDK e;
    private final AFg1wSDK force;
    private final AFg1tSDK i;
    public AFg1zSDK registerClient;
    public AFi1zSDK unregisterClient;
    private final AFg1sSDK v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AFe1rSDK f26022w;

    public AFf1eSDK(@NonNull AFg1xSDK aFg1xSDK, @NonNull AFd1sSDK aFd1sSDK, @NonNull AFg1wSDK aFg1wSDK, @NonNull AFg1sSDK aFg1sSDK, @NonNull AFe1rSDK aFe1rSDK, @NonNull AFg1tSDK aFg1tSDK, @NonNull String str, AFf1aSDK aFf1aSDK) {
        super(AFf1ySDK.RC_CDN, new AFf1ySDK[0], "UpdateRemoteConfiguration");
        this.registerClient = null;
        this.e = aFg1xSDK;
        this.AFLogger = aFd1sSDK;
        this.force = aFg1wSDK;
        this.v = aFg1sSDK;
        this.f26022w = aFe1rSDK;
        this.i = aFg1tSDK;
        this.afInfoLog = str;
        this.d = aFf1aSDK;
    }

    private void AFInAppEventType(String str, long j2, AFh1cSDK aFh1cSDK, String str2, AFe1jSDK<AFh1aSDK> aFe1jSDK) {
        values(str, j2, aFe1jSDK, aFe1jSDK != null ? aFe1jSDK.getBody() : null, aFh1cSDK, str2 != null ? str2 : null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFg1zSDK e() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1eSDK.e():com.appsflyer.internal.AFg1zSDK");
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NonNull
    public final AFe1fSDK AFInAppEventParameterName() throws Exception {
        try {
            AFg1zSDK aFg1zSDKE = e();
            this.registerClient = aFg1zSDKE;
            return aFg1zSDKE == AFg1zSDK.FAILURE ? AFe1fSDK.FAILURE : AFe1fSDK.SUCCESS;
        } catch (InterruptedException e) {
            e = e;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.registerClient = AFg1zSDK.FAILURE;
            return AFe1fSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.registerClient = AFg1zSDK.FAILURE;
            return AFe1fSDK.TIMEOUT;
        } catch (InterruptedIOException e2) {
            e = e2;
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.registerClient = AFg1zSDK.FAILURE;
            return AFe1fSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }

    private void values(String str, long j2, AFe1jSDK<?> aFe1jSDK, AFh1aSDK aFh1aSDK, AFh1cSDK aFh1cSDK, String str2, Throwable th10) {
        long j3;
        int statusCode;
        Throwable th11;
        if (aFe1jSDK != null) {
            j3 = aFe1jSDK.AFInAppEventParameterName.AFInAppEventParameterName;
            statusCode = aFe1jSDK.getStatusCode();
        } else {
            j3 = 0;
            statusCode = 0;
        }
        int i = statusCode;
        if (th10 instanceof HttpException) {
            Throwable cause = th10.getCause();
            j3 = ((HttpException) th10).getMetrics().AFInAppEventParameterName;
            th11 = cause;
        } else {
            th11 = th10;
        }
        this.unregisterClient = new AFi1zSDK(aFh1aSDK != null ? aFh1aSDK.valueOf : null, str, j3, System.currentTimeMillis() - j2, i, aFh1cSDK, str2, th11);
    }
}
