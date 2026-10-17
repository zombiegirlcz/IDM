package j8f;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements o6f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FixedTabsDelegate f172185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrendViewDelegate f172186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FullScreenStateDelegate f172187c;

    public e(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.f172185a = managedPortfoliosSimpleTemplateController.O;
        this.f172186b = managedPortfoliosSimpleTemplateController.R;
        this.f172187c = managedPortfoliosSimpleTemplateController.S;
    }

    @Override // o6f.d
    public final TrendViewDelegate L() {
        return this.f172186b;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f172187c.f52371h.f121375b);
    }

    @Override // o6f.d
    public final FixedTabsDelegate p() {
        return this.f172185a;
    }
}
