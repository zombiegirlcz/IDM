package com.revolut.feature.alipay_plus.mpm.webcontainer;

import com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J,\u0010\u000f\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J,\u0010\u0010\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMTradePayPlugin;", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBaseJSPlugin;", "coordinator", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;)V", "tradePay", "", "params", "", "", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "context", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBridgeContext;", "crossPay", "handle", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMTradePayPlugin extends APMPMBaseJSPlugin {

    @NotNull
    private final APMPMCoordinator coordinator;

    public APMPMTradePayPlugin(@NotNull APMPMCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        this.coordinator = coordinator;
    }

    private final void handle(Map<String, String> params, APMPMContainerPresenter presenter, APMPMBridgeContext context) throws JSONException {
        String str = params.get("tradeNO");
        if (str != null && !d0.W(str)) {
            this.coordinator.handleTradePay(j6.a.q("CN_ORDER_", str), str, presenter, context);
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("resultCode", "4000");
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        context.sendBridgeResult(jSONObjectPut);
    }

    @APMPMJSAPI(api = "crossPay")
    public final void crossPay(@NotNull Map<String, String> params, @NotNull APMPMContainerPresenter presenter, @NotNull APMPMBridgeContext context) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(context, "context");
        handle(params, presenter, context);
    }

    @APMPMJSAPI(api = "tradePay")
    public final void tradePay(@NotNull Map<String, String> params, @NotNull APMPMContainerPresenter presenter, @NotNull APMPMBridgeContext context) throws JSONException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(context, "context");
        handle(params, presenter, context);
    }
}
