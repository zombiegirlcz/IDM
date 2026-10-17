package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFi1bSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1iSDK extends AFf1qSDK<AFc1jSDK> {

    @NotNull
    private final AFc1qSDK AFLogger;

    @NotNull
    private final List<AFi1bSDK> afDebugLog;
    private int afErrorLog;

    @NotNull
    private final AFi1cSDK afInfoLog;
    private int afRDLog;

    @NotNull
    private final CountDownLatch afVerboseLog;
    private int afWarnLog;

    @NotNull
    private final AFd1sSDK force;

    @NotNull
    private final AFh1wSDK i;

    @NotNull
    private final AFc1tSDK v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFd1oSDK f26026w;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] AFInAppEventParameterName;
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFe1fSDK.values().length];
            iArr[AFe1fSDK.SUCCESS.ordinal()] = 1;
            iArr[AFe1fSDK.FAILURE.ordinal()] = 2;
            values = iArr;
            int[] iArr2 = new int[AFi1bSDK.AFa1uSDK.values().length];
            iArr2[AFi1bSDK.AFa1uSDK.FINISHED.ordinal()] = 1;
            iArr2[AFi1bSDK.AFa1uSDK.STARTED.ordinal()] = 2;
            AFInAppEventParameterName = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1iSDK(@NotNull AFc1qSDK aFc1qSDK, @NotNull AFd1fSDK aFd1fSDK) {
        super(AFf1ySDK.DLSDK, new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.FETCH_ADVERTISING_ID}, aFd1fSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        this.AFLogger = aFc1qSDK;
        this.afVerboseLog = new CountDownLatch(1);
        this.afDebugLog = new ArrayList();
        AFd1sSDK aFd1sSDKValueOf = aFd1fSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1sSDKValueOf, "");
        this.force = aFd1sSDKValueOf;
        AFd1oSDK level = aFd1fSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.f26026w = level;
        AFc1tSDK aFc1tSDKAfDebugLog = aFd1fSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFc1tSDKAfDebugLog, "");
        this.v = aFc1tSDKAfDebugLog;
        AFh1wSDK aFh1wSDKRegisterClient = aFd1fSDK.registerClient();
        Intrinsics.checkNotNullExpressionValue(aFh1wSDKRegisterClient, "");
        this.i = aFh1wSDKRegisterClient;
        AFi1cSDK aFi1cSDKForce = aFd1fSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFi1cSDKForce, "");
        this.afInfoLog = aFi1cSDKForce;
        AFi1bSDK[] aFi1bSDKArrValueOf = aFi1cSDKForce.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFi1bSDKArrValueOf, "");
        ArrayList<AFi1bSDK> arrayList = new ArrayList();
        for (AFi1bSDK aFi1bSDK : aFi1bSDKArrValueOf) {
            if (aFi1bSDK != null && aFi1bSDK.AFInAppEventType != AFi1bSDK.AFa1uSDK.NOT_STARTED) {
                arrayList.add(aFi1bSDK);
            }
        }
        this.afRDLog = arrayList.size();
        for (final AFi1bSDK aFi1bSDK2 : arrayList) {
            AFi1bSDK.AFa1uSDK aFa1uSDK = aFi1bSDK2.AFInAppEventType;
            int i = aFa1uSDK == null ? -1 : AFa1vSDK.AFInAppEventParameterName[aFa1uSDK.ordinal()];
            if (i == 1) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1bSDK aFg1bSDK = AFg1bSDK.DDL;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(aFi1bSDK2.valueOf.get("source"));
                sb6.append(" referrer collected earlier");
                AFg1cSDK.d$default(aFLogger, aFg1bSDK, sb6.toString(), false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFi1bSDK2, "");
                AFKeystoreWrapper(aFi1bSDK2);
            } else if (i == 2) {
                aFi1bSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.i
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj2) {
                        AFf1iSDK.valueOf(aFi1bSDK2, this, observable, obj2);
                    }
                });
            }
        }
    }

    private static boolean AFInAppEventType(AFi1bSDK aFi1bSDK) {
        Object obj2 = aFi1bSDK.valueOf.get("click_ts");
        Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
        if (l2 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l2.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private final void AFKeystoreWrapper(AFi1bSDK aFi1bSDK) {
        if (AFInAppEventType(aFi1bSDK)) {
            this.afDebugLog.add(aFi1bSDK);
            this.afVerboseLog.countDown();
            AFg1cSDK.d$default(AFLogger.INSTANCE, AFg1bSDK.DDL, "Added non-organic ".concat(aFi1bSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i = this.afWarnLog + 1;
            this.afWarnLog = i;
            if (i == this.afRDLog) {
                this.afVerboseLog.countDown();
            }
        }
    }

    private final boolean i() {
        Object obj2 = this.AFLogger.AFInAppEventType().get("referrers");
        List list = obj2 instanceof List ? (List) obj2 : null;
        return (list != null ? list.size() : 0) < this.afRDLog && !this.AFLogger.AFInAppEventType().containsKey("referrers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFi1bSDK aFi1bSDK, AFf1iSDK aFf1iSDK, Observable observable, Object obj2) {
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.DDL;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(aFi1bSDK.valueOf.get("source"));
        sb6.append(" referrer collected via observer");
        AFg1cSDK.d$default(aFLogger, aFg1bSDK, sb6.toString(), false, 4, null);
        if (observable == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.referrer.Referrer");
        }
        aFf1iSDK.AFKeystoreWrapper((AFi1bSDK) observable);
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    @NotNull
    public final AFe1fSDK AFInAppEventParameterName() {
        AFe1fSDK aFe1fSDK = AFe1fSDK.FAILURE;
        try {
            AFe1fSDK aFe1fSDKAFInAppEventParameterName = super.AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(aFe1fSDKAFInAppEventParameterName, "");
            try {
                AFh1wSDK aFh1wSDK = this.i;
                int i = this.afErrorLog;
                if (i <= 0 || i > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
                } else {
                    int i2 = i - 1;
                    aFh1wSDK.e[i2] = System.currentTimeMillis();
                    long j2 = aFh1wSDK.unregisterClient[i2];
                    if (j2 != 0) {
                        long[] jArr = aFh1wSDK.registerClient;
                        jArr[i2] = aFh1wSDK.e[i2] - j2;
                        aFh1wSDK.values.put("net", jArr);
                        aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK.values).toString());
                    } else {
                        StringBuilder sb6 = new StringBuilder("Metrics: ddlStart[");
                        sb6.append(i2);
                        sb6.append("] ts is missing");
                        AFLogger.afInfoLog(sb6.toString());
                    }
                }
                int i3 = AFa1vSDK.values[aFe1fSDKAFInAppEventParameterName.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        return aFe1fSDKAFInAppEventParameterName;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1bSDK aFg1bSDK = AFg1bSDK.DDL;
                    StringBuilder sb9 = new StringBuilder("Error occurred. Server response code = ");
                    ResponseNetwork responseNetwork = ((AFf1qSDK) this).d;
                    sb9.append(responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null);
                    AFg1cSDK.d$default(aFLogger, aFg1bSDK, sb9.toString(), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.i.AFInAppEventType(deepLinkResult, this.v.unregisterClient);
                    this.v.AFInAppEventParameterName(deepLinkResult);
                    return aFe1fSDKAFInAppEventParameterName;
                }
                ResponseNetwork responseNetwork2 = ((AFf1qSDK) this).d;
                Intrinsics.h(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFc1jSDK aFc1jSDK = (AFc1jSDK) body;
                DeepLink deepLink = aFc1jSDK.AFInAppEventType;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.i.AFInAppEventType(deepLinkResult2, this.v.unregisterClient);
                    this.v.AFInAppEventParameterName(deepLinkResult2);
                    return aFe1fSDKAFInAppEventParameterName;
                }
                if (this.afErrorLog > 1 || !aFc1jSDK.getValues() || !i()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.i.AFInAppEventType(deepLinkResult3, this.v.unregisterClient);
                    this.v.AFInAppEventParameterName(deepLinkResult3);
                    return aFe1fSDKAFInAppEventParameterName;
                }
                AFg1cSDK.d$default(AFLogger.INSTANCE, AFg1bSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.afVerboseLog.await();
                AFh1wSDK aFh1wSDK2 = this.i;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = aFh1wSDK2.e[0];
                if (j3 != 0) {
                    aFh1wSDK2.values.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j3));
                    aFh1wSDK2.AFInAppEventParameterName.AFInAppEventParameterName("ddl", new JSONObject(aFh1wSDK2.values).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.afWarnLog != this.afRDLog) {
                    return AFInAppEventParameterName();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.i.AFInAppEventType(deepLinkResult4, this.v.unregisterClient);
                this.v.AFInAppEventParameterName(deepLinkResult4);
                return AFe1fSDK.SUCCESS;
            } catch (Exception e) {
                e = e;
                aFe1fSDK = aFe1fSDKAFInAppEventParameterName;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFg1cSDK.d$default(AFLogger.INSTANCE, AFg1bSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.i.AFInAppEventType(deepLinkResult5, this.v.unregisterClient);
                        this.v.AFInAppEventParameterName(deepLinkResult5);
                        return aFe1fSDK;
                    }
                    AFg1cSDK.d$default(AFLogger.INSTANCE, AFg1bSDK.DDL, "Unexpected Exception: ".concat(String.valueOf(e)), false, 4, null);
                    DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                    this.i.AFInAppEventType(deepLinkResult6, this.v.unregisterClient);
                    this.v.AFInAppEventParameterName(deepLinkResult6);
                    return aFe1fSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1bSDK aFg1bSDK2 = AFg1bSDK.DDL;
                StringBuilder sb10 = new StringBuilder("Timeout, didn't manage to find deferred deeplink after ");
                sb10.append(this.afErrorLog);
                sb10.append(" attempt(s) within ");
                sb10.append(this.v.unregisterClient);
                sb10.append(" milliseconds");
                AFg1cSDK.d$default(aFLogger2, aFg1bSDK2, sb10.toString(), false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.i.AFInAppEventType(deepLinkResult7, this.v.unregisterClient);
                this.v.AFInAppEventParameterName(deepLinkResult7);
                return AFe1fSDK.TIMEOUT;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return this.v.unregisterClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0168  */
    @Override // com.appsflyer.internal.AFf1qSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1uSDK<com.appsflyer.internal.AFc1jSDK> AFKeystoreWrapper(@org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.AFKeystoreWrapper(java.lang.String):com.appsflyer.internal.AFe1uSDK");
    }

    private static Map<String, String> AFKeystoreWrapper(AFa1cSDK aFa1cSDK) {
        String str;
        if (aFa1cSDK == null || (str = aFa1cSDK.valueOf) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFa1cSDK.values;
        if (bool == null || !bool.booleanValue()) {
            return r0.k(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }
}
