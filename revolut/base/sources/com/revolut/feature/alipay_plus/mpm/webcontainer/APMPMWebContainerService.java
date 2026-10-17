package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.content.Context;
import com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerService;", "", "<init>", "()V", "startContainer", "", "context", "Landroid/content/Context;", "params", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerParams;", "listener", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerListener;", "registerPlugin", "plugin", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPlugin;", "registerJSPlugin", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBaseJSPlugin;", "registerMPMPlugins", "coordinator", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMWebContainerService {
    private final void registerJSPlugin(APMPMBaseJSPlugin plugin) {
        APMPMWebContainerRuntime.INSTANCE.registerJSPlugin$feature_alipay_plus_nonsdk_release(plugin);
    }

    private final void registerPlugin(APMPMContainerPlugin plugin) {
        APMPMWebContainerRuntime.INSTANCE.registerPlugin$feature_alipay_plus_nonsdk_release(plugin);
    }

    public static /* synthetic */ void startContainer$default(APMPMWebContainerService aPMPMWebContainerService, Context context, APMPMWebContainerParams aPMPMWebContainerParams, APMPMWebContainerListener aPMPMWebContainerListener, int i, Object obj2) {
        if ((i & 4) != 0) {
            aPMPMWebContainerListener = null;
        }
        aPMPMWebContainerService.startContainer(context, aPMPMWebContainerParams, aPMPMWebContainerListener);
    }

    public final void registerMPMPlugins(@NotNull APMPMCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        registerPlugin(new APMPMPageEventPlugin(coordinator));
        registerJSPlugin(new APMPMGetAuthCodePlugin(coordinator));
        registerJSPlugin(new APMPMTradePayPlugin(coordinator));
        registerJSPlugin(new APMPMSystemInfoPlugin(coordinator));
    }

    public final void startContainer(@NotNull Context context, @NotNull APMPMWebContainerParams params, APMPMWebContainerListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        APMPMWebContainerRuntime.INSTANCE.startContainer(context, params, listener);
    }
}
