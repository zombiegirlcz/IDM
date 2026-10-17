package com.revolut.feature.alipay_plus.mpm.webcontainer;

import com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator;
import com.revolut.feature.alipay_plus.mpm.support.APMPMSystemInfoProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMSystemInfoPlugin;", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBaseJSPlugin;", "coordinator", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;)V", "getSystemInfo", "", "params", "", "", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "context", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBridgeContext;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMSystemInfoPlugin extends APMPMBaseJSPlugin {

    @NotNull
    private final APMPMCoordinator coordinator;

    public APMPMSystemInfoPlugin(@NotNull APMPMCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        this.coordinator = coordinator;
    }

    @APMPMJSAPI(api = "getSystemInfo")
    public final void getSystemInfo(@NotNull Map<String, String> params, @NotNull APMPMContainerPresenter presenter, @NotNull APMPMBridgeContext context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(context, "context");
        context.sendBridgeResult(APMPMSystemInfoProvider.INSTANCE.systemInfo(presenter.getContext(), this.coordinator.getConfiguration().getSiteName(), context.getWebView()));
    }
}
