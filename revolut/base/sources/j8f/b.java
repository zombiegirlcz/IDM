package j8f;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements t6f.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellDetailsChevronDelegate f172179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f172180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlainTextDelegate f172181c;
    public final SmallActionButtonDelegate d;
    public final /* synthetic */ ManagedPortfoliosSimpleTemplateController e;

    public b(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.e = managedPortfoliosSimpleTemplateController;
        this.f172179a = managedPortfoliosSimpleTemplateController.Q;
        this.f172180b = managedPortfoliosSimpleTemplateController.S;
        this.f172181c = managedPortfoliosSimpleTemplateController.U;
        this.d = managedPortfoliosSimpleTemplateController.g0;
    }

    @Override // t6f.l
    public final CellDetailsChevronDelegate D() {
        return this.f172179a;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f172180b.f52371h.f121375b);
    }

    @Override // t6f.l
    public final PlainTextDelegate M() {
        return this.f172181c;
    }

    @Override // t6f.l
    public final void V1(String investorUpdateId) {
        Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
        this.e.c3(new l(investorUpdateId));
    }

    @Override // t6f.l
    public final SmallActionButtonDelegate q() {
        return this.d;
    }
}
