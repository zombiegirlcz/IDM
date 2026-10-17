package cl;

import com.onfido.api.client.token.sdk.TokenEnterpriseFeatures;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class h {
    public static TokenEnterpriseFeatures a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        return new TokenEnterpriseFeatures(Boolean.valueOf(jSONObject.optBoolean("useCustomizedApiRequests")), Boolean.valueOf(jSONObject.optBoolean("hideOnfidoLogo")), Boolean.valueOf(jSONObject.optBoolean("disableMobileSdkAnalytics")), Boolean.valueOf(jSONObject.optBoolean("cobrand")), Boolean.valueOf(jSONObject.optBoolean("logoCobrand")));
    }
}
