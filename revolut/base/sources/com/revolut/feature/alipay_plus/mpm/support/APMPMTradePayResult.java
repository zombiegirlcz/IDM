package com.revolut.feature.alipay_plus.mpm.support;

import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMTradePayResult;", "", "<init>", "()V", "SUCCESS", "", "FAILED", "CANCELLED", "successJson", "Lorg/json/JSONObject;", "jsonFor", "error", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "jsonFor$feature_alipay_plus_nonsdk_release", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMTradePayResult {

    @NotNull
    public static final String CANCELLED = "6001";

    @NotNull
    public static final String SUCCESS = "9000";

    @NotNull
    public static final String FAILED = "4000";

    @NotNull
    public static final APMPMTradePayResult INSTANCE = new APMPMTradePayResult();

    private APMPMTradePayResult() {
    }

    @NotNull
    public final JSONObject jsonFor$feature_alipay_plus_nonsdk_release(@NotNull APMPMError error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectPut = new JSONObject().put("resultCode", Intrinsics.f(error.getCode(), "USER_CANCEL") ? "6001" : "4000");
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @NotNull
    public final JSONObject successJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("resultCode", "9000");
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }
}
