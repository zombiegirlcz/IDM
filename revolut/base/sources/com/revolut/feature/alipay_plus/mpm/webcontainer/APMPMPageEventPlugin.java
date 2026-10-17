package com.revolut.feature.alipay_plus.mpm.webcontainer;

import com.revolut.feature.alipay_plus.mpm.core.APMPMCoordinator;
import com.revolut.feature.alipay_plus.mpm.interception.APMPMURLHook;
import com.revolut.feature.alipay_plus.mpm.support.APMPMUrl;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMPageEventPlugin;", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPlugin;", "coordinator", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/core/APMPMCoordinator;)V", "actions", "", "", "interceptEvent", "", "event", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerEvent;", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMPageEventPlugin extends APMPMContainerPlugin {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final APMPMCoordinator coordinator;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMPageEventPlugin$Companion;", "", "<init>", "()V", "isStartupNavigation", "", "url", "", "startupUrl", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isStartupNavigation(@NotNull String url2, String startupUrl) {
            Intrinsics.checkNotNullParameter(url2, "url");
            return Intrinsics.f(startupUrl, url2);
        }

        private Companion() {
        }
    }

    public APMPMPageEventPlugin(@NotNull APMPMCoordinator coordinator) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        this.coordinator = coordinator;
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPlugin
    @NotNull
    public Set<String> actions() {
        return y0.b("h5PageShouldLoadUrl");
    }

    @Override // com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPlugin
    public boolean interceptEvent(@NotNull APMPMContainerEvent event) {
        String loadingUrl;
        String strForceHttps;
        Intrinsics.checkNotNullParameter(event, "event");
        APMPMWebContainerParams aPMPMWebContainerParamsParams = event.getPresenter().params();
        if (!Intrinsics.f(aPMPMWebContainerParamsParams.getBizScenario(), "ACCode")) {
            return false;
        }
        Object obj2 = event.getParams().get("url");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null || APMPMWebContainerErrorPage.INSTANCE.isDefaultErrorPageUrl(str) || INSTANCE.isStartupNavigation(str, aPMPMWebContainerParamsParams.getUrl())) {
            return false;
        }
        if (aPMPMWebContainerParamsParams.getForceHttps() && (strForceHttps = APMPMUrl.INSTANCE.forceHttps(str)) != null) {
            event.getPresenter().loadUrl(strForceHttps);
            return true;
        }
        APMPMURLHook aPMPMURLHookInspect = this.coordinator.getInterceptor().inspect(str, false);
        if (aPMPMURLHookInspect instanceof APMPMURLHook.None) {
            return false;
        }
        if ((aPMPMURLHookInspect instanceof APMPMURLHook.Decode) && (loadingUrl = ((APMPMURLHook.Decode) aPMPMURLHookInspect).getLoadingUrl()) != null) {
            event.getPresenter().loadUrl(loadingUrl);
        }
        this.coordinator.handleNavigationHook$feature_alipay_plus_nonsdk_release(aPMPMURLHookInspect, event.getPresenter(), null);
        return true;
    }
}
