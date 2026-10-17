package com.revolut.feature.alipay_plus.mpm.support;

import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMAuthCodeJSAPIResult;", "", "<init>", "()V", "success", "Lorg/json/JSONObject;", "authCode", "", "data", "error", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "noAuthResult", "code", "message", "authSuccessScopes", "Lorg/json/JSONArray;", "authErrorScopes", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMAuthCodeJSAPIResult {

    @NotNull
    public static final APMPMAuthCodeJSAPIResult INSTANCE = new APMPMAuthCodeJSAPIResult();

    private APMPMAuthCodeJSAPIResult() {
    }

    private final JSONObject authErrorScopes(JSONObject data) {
        Object objA;
        Object objOpt = data.opt("authErrorScopes");
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        if (!(objOpt instanceof String)) {
            return new JSONObject();
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = new JSONObject((String) objOpt);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object jSONObject = new JSONObject();
        if (objA instanceof n) {
            objA = jSONObject;
        }
        return (JSONObject) objA;
    }

    private final JSONArray authSuccessScopes(JSONObject data) {
        Object objOpt = data.opt("authSuccessScopes");
        if (objOpt instanceof JSONArray) {
            return (JSONArray) objOpt;
        }
        if (!(objOpt instanceof String)) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        List listM0 = d0.m0((CharSequence) objOpt, new char[]{CoreConstants.COMMA_CHAR, p.SPACE_CHAR, ';'}, 6);
        ArrayList arrayList = new ArrayList(w.t(listM0, 10));
        Iterator it8 = listM0.iterator();
        while (it8.hasNext()) {
            arrayList.add(d0.F0((String) it8.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            jSONArray.put((String) it9.next());
        }
        return jSONArray;
    }

    @NotNull
    public final JSONObject error(@NotNull APMPMError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String code = error.getCode();
        return (Intrinsics.f(code, "INVALID_NETWORK") || Intrinsics.f(code, "12")) ? error("12", "Network error") : noAuthResult();
    }

    @NotNull
    public final JSONObject noAuthResult() {
        return error("3", "Authorization result not found");
    }

    @NotNull
    public final JSONObject success(@NotNull String authCode, @NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObjectPut = new JSONObject().put("authCode", authCode).put("authSuccessScopes", authSuccessScopes(data)).put("authErrorScopes", authErrorScopes(data));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private final JSONObject error(String code, String message) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("error", code).put("errorMessage", message);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
