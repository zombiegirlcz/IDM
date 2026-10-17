package j8f;

import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements d1h.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfoliosSimpleTemplateController f172188a;

    public f(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.f172188a = managedPortfoliosSimpleTemplateController;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0 */
    public final FooterTextDelegate getZ() {
        return this.f172188a.f91473e0;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q */
    public final FullScreenStateDelegate getU() {
        return this.f172188a.S;
    }
}
