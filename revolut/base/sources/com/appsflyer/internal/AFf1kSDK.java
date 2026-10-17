package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import yhm.m;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020$\u0012\u0006\u0010\u0006\u001a\u00020\u001e\u0012\u0006\u0010\n\u001a\u00020!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J/\u0010\b\u001a\u00020\u00072\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJC\u0010\f\u001a\u000e\u0012\b\u0012\u0006*\u00020\u00030\u0003\u0018\u00010\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\b\u0010\u0011J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "Lcom/appsflyer/internal/AFf1uSDK;", "", "", "", "p0", "p1", "", "AFKeystoreWrapper", "(Ljava/util/Map;Ljava/lang/String;)V", "p2", "Lcom/appsflyer/internal/AFe1uSDK;", "values", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFe1uSDK;", "AFInAppEventType", "(Ljava/util/Map;)Ljava/lang/String;", "", "(Ljava/lang/String;I)V", "()V", "", "force", "Ljava/util/Map;", "Lcom/appsflyer/internal/AFj1ySDK;", "i", "Lcom/appsflyer/internal/AFj1ySDK;", "valueOf", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "afInfoLog", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "AFInAppEventParameterName", "Lcom/appsflyer/AppsFlyerProperties;", "AFLogger", "Lcom/appsflyer/AppsFlyerProperties;", "Lcom/appsflyer/AFPurchaseDetails;", "w", "Lcom/appsflyer/AFPurchaseDetails;", "Lcom/appsflyer/internal/AFd1fSDK;", "p3", "p4", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1ySDK;)V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFf1kSDK extends AFf1uSDK {

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private final AppsFlyerProperties AFInAppEventType;

    /* JADX INFO: renamed from: afInfoLog, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback AFInAppEventParameterName;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    private final Map<String, String> AFKeystoreWrapper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AFj1ySDK valueOf;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails values;

    public static final class AFa1vSDK extends RuntimeException {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1kSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1fSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        Object objA;
        super.AFInAppEventType();
        Throwable thD = d();
        if (thD != null && !(thD instanceof AFf1vSDK)) {
            if (thD instanceof AFf1zSDK) {
                AFKeystoreWrapper("No dev key", -1);
            } else if (thD instanceof AFa1vSDK) {
                AFKeystoreWrapper("One or more of provided arguments is empty", -1);
            } else {
                AFKeystoreWrapper("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1qSDK) this).d;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFInAppEventParameterName;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(r0.k(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                m.Companion companion = yhm.m.INSTANCE;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFInAppEventParameterName;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1sSDK.valueOf(new JSONObject((String) responseNetwork.getBody())));
                    objA = Unit.f186387a;
                } else {
                    objA = null;
                }
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            if (yhm.m.a(objA) != null) {
                AFKeystoreWrapper("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> p0, String p17) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.AFKeystoreWrapper(p0, p17);
        List listK = v.k(this.values.getPurchaseToken(), this.values.getProductId(), this.values.getPrice(), this.values.getCurrency());
        if (!(listK instanceof Collection) || !listK.isEmpty()) {
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                if (((String) it8.next()).length() == 0) {
                    throw new AFa1vSDK();
                }
            }
        }
        p0.put("purchase_token", this.values.getPurchaseToken());
        p0.put("product_id", this.values.getProductId());
        p0.put("revenue", this.values.getPrice());
        p0.put("currency", this.values.getCurrency());
        p0.put("purchase_type", this.values.getPurchaseType().getValue());
        Map<String, String> map = this.AFKeystoreWrapper;
        if (map != null && !map.isEmpty()) {
            p0.put("extra_event_values", this.AFKeystoreWrapper);
        }
        String string = this.AFInAppEventType.getString("additionalCustomData");
        p0.put("custom_data", (string == null || string.length() == 0) ? r0.g() : AFj1sSDK.valueOf(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final AFe1uSDK<String> values(@NotNull Map<String, Object> p0, @NotNull String p17, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        return this.e.AFInAppEventType(p0, p17);
    }

    public /* synthetic */ AFf1kSDK(AFd1fSDK aFd1fSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1ySDK aFj1ySDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1fSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1tSDK() : aFj1ySDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1kSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1ySDK aFj1ySDK) {
        super(AFf1ySDK.MANUAL_PURCHASE_VALIDATION, new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.FETCH_ADVERTISING_ID}, aFd1fSDK, null, r0.g());
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        this.AFInAppEventType = appsFlyerProperties;
        this.values = aFPurchaseDetails;
        this.AFKeystoreWrapper = map;
        this.AFInAppEventParameterName = appsFlyerInAppPurchaseValidationCallback;
        this.valueOf = aFj1ySDK;
        this.valueOf.add(AFf1ySDK.CONVERSION);
    }

    private final void AFKeystoreWrapper(String p0, int p17) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFInAppEventParameterName;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(r0.k(new Pair("error_code", Integer.valueOf(p17)), new Pair("error_message", p0)));
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    @NotNull
    public final String AFInAppEventType(@NotNull Map<String, Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.valueOf.AFInAppEventType();
    }
}
