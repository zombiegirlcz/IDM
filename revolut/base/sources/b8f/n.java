package b8f;

import com.revolut.data.model.Data;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends oki.h implements dli.b {
    public final PortfolioRevealLoadingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.d f13242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final emc.e f13243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f13244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f13246t;

    public n(PortfolioRevealLoadingScreenContract$InputData inputData, o7.d interactor, emc.e templatesInteractor, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f13242p = interactor;
        this.f13243q = templatesInteractor;
        this.f13244r = new vii.b();
        this.f13246t = mra.d.b(this, new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    public final void I2() {
        TemplateIntro templateIntro;
        RiskMetrics riskMetrics;
        if (this.f13245s) {
            return;
        }
        cli.y yVar = this.f13246t;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (!((h) j2Var.getValue()).f13233c || (templateIntro = (TemplateIntro) ((h) j2Var2.getValue()).f13231a.getContent()) == null || (riskMetrics = (RiskMetrics) ((h) j2Var2.getValue()).f13232b.getContent()) == null) {
            return;
        }
        this.f13245s = true;
        C2(new i(templateIntro, riskMetrics));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l lVar = new l(0, this, continuation);
        vii.b bVar = this.f13244r;
        yji.l.b1(this, vkm.q.Q(bVar, lVar), null, new m(0, this, continuation), 3);
        int i = 1;
        yji.l.b1(this, vkm.q.Q(bVar, new l(i, this, continuation)), null, new m(i, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f13246t;
    }
}
