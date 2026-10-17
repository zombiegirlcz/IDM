package j8f;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements v6f.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsDelegate f172191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfoliosSimpleTemplateController f172192b;

    public h(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.f172192b = managedPortfoliosSimpleTemplateController;
        this.f172191a = managedPortfoliosSimpleTemplateController.W;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f172192b.S.f52371h.f121375b);
    }

    @Override // v6f.h
    public final CellDetailsDelegate j() {
        return this.f172191a;
    }
}
