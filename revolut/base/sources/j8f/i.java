package j8f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements b7f.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButtonDelegate f172193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f172194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManagedPortfoliosSimpleTemplateController f172195c;

    public i(ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController) {
        this.f172195c = managedPortfoliosSimpleTemplateController;
        this.f172193a = managedPortfoliosSimpleTemplateController.g0;
        this.f172194b = managedPortfoliosSimpleTemplateController.S;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.f172194b.f52371h.f121375b);
    }

    @Override // b7f.f
    public final void N(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f172195c.c3(new k(templateId));
    }

    @Override // b7f.f
    public final SmallActionButtonDelegate q() {
        return this.f172193a;
    }
}
