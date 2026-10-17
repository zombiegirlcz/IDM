package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import zhm.r0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AFf1uSDK extends AFf1qSDK<String> {

    @NotNull
    private final AFf1ySDK AFLogger;

    @NotNull
    private final AFd1sSDK afInfoLog;

    @NotNull
    private final Map<String, Object> force;

    @NotNull
    private final AFg1uSDK i;

    @NotNull
    private final AFg1mSDK v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFd1pSDK f26030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(@NotNull AFf1ySDK aFf1ySDK, @NotNull AFf1ySDK[] aFf1ySDKArr, @NotNull AFd1fSDK aFd1fSDK, String str, @NotNull Map<String, ? extends Object> map) {
        super(aFf1ySDK, aFf1ySDKArr, aFd1fSDK, null);
        Intrinsics.checkNotNullParameter(aFf1ySDK, "");
        Intrinsics.checkNotNullParameter(aFf1ySDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AFLogger = aFf1ySDK;
        this.force = map;
        AFd1sSDK aFd1sSDKValueOf = aFd1fSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1sSDKValueOf, "");
        this.afInfoLog = aFd1sSDKValueOf;
        AFd1pSDK aFd1pSDKAFInAppEventType = aFd1fSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(aFd1pSDKAFInAppEventType, "");
        this.f26030w = aFd1pSDKAFInAppEventType;
        AFg1mSDK aFg1mSDKAFLogger = aFd1fSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFg1mSDKAFLogger, "");
        this.v = aFg1mSDKAFLogger;
        AFg1uSDK currency = aFd1fSDK.getCurrency();
        Intrinsics.checkNotNullExpressionValue(currency, "");
        this.i = currency;
    }

    public String AFInAppEventType(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public void AFKeystoreWrapper(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.afInfoLog.valueOf.AFKeystoreWrapper.getPackageName());
        String strAFInAppEventParameterName = AFd1sSDK.AFInAppEventParameterName();
        if (strAFInAppEventParameterName != null) {
            map.put("cuid", strAFInAppEventParameterName);
        }
        Context context = this.afInfoLog.valueOf.AFKeystoreWrapper;
        map.put("app_version_name", AFb1vSDK.values(context, context.getPackageName()));
        if (AFLogger()) {
            map.put("event_timestamp", Long.valueOf(this.v.AFInAppEventType()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return true;
    }

    public String valueOf(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public abstract AFe1uSDK<String> values(@NotNull Map<String, Object> map, @NotNull String str, String str2);

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AFe1uSDK<String> AFKeystoreWrapper(@NotNull String str) {
        AFe1hSDK aFe1hSDK;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> mapZ = r0.z(this.force);
        String strAFInAppEventType = AFInAppEventType(mapZ);
        String strValueOf = valueOf(mapZ);
        Map<String, Object> mapZ2 = r0.z(mapZ);
        AFKeystoreWrapper(mapZ2, strAFInAppEventType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strAFInAppEventType2 = this.afInfoLog.AFInAppEventType();
        if (strAFInAppEventType2 != null && !d0.W(strAFInAppEventType2)) {
            linkedHashMap.put("advertising_id", strAFInAppEventType2);
        }
        AFa1cSDK aFa1cSDKAFInAppEventType = AFb1uSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper);
        String str2 = null;
        String str3 = aFa1cSDKAFInAppEventType != null ? aFa1cSDKAFInAppEventType.valueOf : null;
        if (str3 != null && !d0.W(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFa1cSDK aFa1cSDKAFInAppEventType2 = AFb1uSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper.getContentResolver());
        String str4 = aFa1cSDKAFInAppEventType2 != null ? aFa1cSDKAFInAppEventType2.valueOf : null;
        if (str4 != null && !d0.W(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            mapZ2.put("deviceTrackingDisabled", "true");
        } else {
            String strValueOf2 = ((AFf1qSDK) this).unregisterClient.valueOf(this.f26030w);
            if (strValueOf2 != null && !d0.W(strValueOf2)) {
                linkedHashMap.put("imei", strValueOf2);
            }
        }
        AFd1sSDK aFd1sSDK = this.afInfoLog;
        String strAFInAppEventType3 = AFb1jSDK.AFInAppEventType(aFd1sSDK.valueOf, aFd1sSDK.values);
        if (strAFInAppEventType3 == null) {
            strAFInAppEventType3 = "";
        }
        linkedHashMap.put("appsflyer_id", strAFInAppEventType3);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.14.2");
        if (strValueOf != null && !d0.W(strValueOf)) {
            linkedHashMap.put("sdk_connector_version", strValueOf);
        }
        mapZ2.put("device_data", linkedHashMap);
        this.i.valueOf(mapZ2, this.AFLogger);
        AFe1uSDK<String> aFe1uSDKValues = values(mapZ2, str, strAFInAppEventType);
        if (aFe1uSDKValues != null && (aFe1hSDK = aFe1uSDKValues.AFKeystoreWrapper) != null) {
            str2 = aFe1hSDK.AFKeystoreWrapper;
        }
        if (str2 != null) {
            String string = new JSONObject(mapZ2).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(toString());
            sb6.append(": preparing data: ");
            sb6.append(string);
            AFb1kSDK.AFInAppEventType(sb6.toString());
            ((AFf1qSDK) this).registerClient.values(str2, string);
        }
        return aFe1uSDKValues;
    }
}
