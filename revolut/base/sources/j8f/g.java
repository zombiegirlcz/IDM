package j8f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements r6f.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenStateDelegate f172189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f172190b;

    public g(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.f172189a = managedPortfoliosSimpleTemplateController.S;
        this.f172190b = managedPortfoliosSimpleTemplateController.V;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f172189a.f52371h.f121375b);
    }

    @Override // r6f.h
    public final ListSubheaderDelegate j0() {
        return this.f172190b;
    }
}
