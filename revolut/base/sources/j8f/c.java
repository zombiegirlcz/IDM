package j8f;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j6f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f172182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabsDelegate f172183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDelegate f172184c;
    public final /* synthetic */ ManagedPortfoliosSimpleTemplateController d;

    public c(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.d = managedPortfoliosSimpleTemplateController;
        this.f172182a = managedPortfoliosSimpleTemplateController.T;
        this.f172183b = managedPortfoliosSimpleTemplateController.O;
        this.f172184c = managedPortfoliosSimpleTemplateController.P;
    }

    @Override // j6f.d
    public final TextDelegate A() {
        return this.f172184c;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.d.S.f52371h.f121375b);
    }

    @Override // j6f.d
    public final RowDelegate c() {
        return this.f172182a;
    }

    @Override // j6f.d
    public final FixedTabsDelegate p() {
        return this.f172183b;
    }
}
