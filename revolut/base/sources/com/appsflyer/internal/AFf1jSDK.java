package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1jSDK extends AFf1xSDK<Unit> {

    @NotNull
    private final AFd1nSDK AFLogger;

    @NotNull
    private final AFd1sSDK d;

    @NotNull
    private final AFg1wSDK e;

    @NotNull
    private final String registerClient;

    @NotNull
    private final AFg1mSDK unregisterClient;

    public static final class AFa1tSDK implements OutcomeReceiver {
        private /* synthetic */ CountDownLatch AFInAppEventParameterName;
        private /* synthetic */ AFf1jSDK AFInAppEventType;
        private /* synthetic */ Ref$ObjectRef values;

        public AFa1tSDK(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, AFf1jSDK aFf1jSDK) {
            this.values = ref$ObjectRef;
            this.AFInAppEventParameterName = countDownLatch;
            this.AFInAppEventType = aFf1jSDK;
        }

        public final /* synthetic */ void onError(Throwable th10) {
            Exception exc2 = (Exception) th10;
            Intrinsics.checkNotNullParameter(exc2, "");
            AFf1jSDK.values(exc2);
            this.AFInAppEventParameterName.countDown();
        }

        public final void onResult(@NotNull Object obj2) {
            Intrinsics.checkNotNullParameter(obj2, "");
            this.values.f186409a = AFe1fSDK.SUCCESS;
            this.AFInAppEventParameterName.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1jSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull String str) {
        super(AFf1ySDK.REGISTER_TRIGGER, new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.registerClient = str;
        AFd1sSDK aFd1sSDKValueOf = aFd1fSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1sSDKValueOf, "");
        this.d = aFd1sSDKValueOf;
        AFd1nSDK aFd1nSDKAfInfoLog = aFd1fSDK.afInfoLog();
        Intrinsics.checkNotNullExpressionValue(aFd1nSDKAfInfoLog, "");
        this.AFLogger = aFd1nSDKAfInfoLog;
        AFg1mSDK aFg1mSDKAFLogger = aFd1fSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFg1mSDKAFLogger, "");
        this.unregisterClient = aFg1mSDKAFLogger;
        AFg1wSDK aFg1wSDKV = aFd1fSDK.v();
        Intrinsics.checkNotNullExpressionValue(aFg1wSDKV, "");
        this.e = aFg1wSDKV;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NotNull
    public final AFe1fSDK AFInAppEventParameterName() {
        MeasurementManager measurementManagerA;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = AFe1fSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.AFLogger.AFKeystoreWrapper;
            if (context != null && (measurementManagerA = j.a(context.getSystemService(j.c()))) != null) {
                new AFj1uSDK(this.d, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1uSDK.AFInAppEventParameterName()).buildUpon();
                Pair pair = new Pair("event_name", this.registerClient);
                Pair pair2 = new Pair("app_id", this.d.valueOf.AFKeystoreWrapper.getPackageName());
                Context context2 = this.d.valueOf.AFKeystoreWrapper;
                LinkedHashMap linkedHashMapN = r0.n(pair, pair2, new Pair("app_version", AFb1vSDK.values(context2, context2.getPackageName())), new Pair("sdk_version", AFd1sSDK.AFKeystoreWrapper()), new Pair("api_version", AFd1sSDK.valueOf()), new Pair("timestamp", String.valueOf(this.unregisterClient.AFInAppEventType())), new Pair("request_id", AFd1sSDK.values()));
                AFd1sSDK aFd1sSDK = this.d;
                String strAFInAppEventType = AFb1jSDK.AFInAppEventType(aFd1sSDK.valueOf, aFd1sSDK.values);
                if (strAFInAppEventType != null) {
                    linkedHashMapN.put("appsflyer_id", strAFInAppEventType);
                }
                Long lValues = this.unregisterClient.values();
                if (lValues != null) {
                    linkedHashMapN.put("install_time", String.valueOf(lValues.longValue()));
                }
                for (Map.Entry entry : linkedHashMapN.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerA.registerTrigger(uriBuild, AFd1rSDK.AFInAppEventParameterName(), new AFa1tSDK(ref$ObjectRef, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th10) {
            values(th10);
        }
        return (AFe1fSDK) ref$ObjectRef.f186409a;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void values(Throwable th10) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1bSDK aFg1bSDK = AFg1bSDK.PRIVACY_SANDBOX;
        StringBuilder sb6 = new StringBuilder("Error occurred: ");
        sb6.append(th10.getMessage());
        aFLogger.e(aFg1bSDK, sb6.toString(), th10, false, false, true, true);
    }
}
