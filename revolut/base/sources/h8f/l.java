package h8f;

import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreenContent;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$TemplateIntroPage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements i {

    @NotNull
    private static final k Companion = new k();
    public final PortfolioRevealIntroScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f150040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f150041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f150042r;

    public l(PortfolioRevealIntroScreenContract$InputData inputData, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        ArrayList arrayList = inputData.f91466a;
        ArrayList arrayList2 = inputData.f91466a;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Portfolio reveal intro requires at least one page");
        }
        this.f150042r = mra.d.b(this, new g(((PortfolioRevealIntroScreenContract$TemplateIntroPage) arrayList2.get(0)).f91467a, ((PortfolioRevealIntroScreenContract$TemplateIntroPage) arrayList2.get(0)).f91468b, null), stateMapper, null, false, 12);
    }

    public final void I2(int i) {
        l lVar;
        this.f150040p = i;
        a2 a2Var = this.f150041q;
        a2 a2VarB1 = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        PortfolioRevealIntroScreenContract$TemplateIntroPage portfolioRevealIntroScreenContract$TemplateIntroPage = (PortfolioRevealIntroScreenContract$TemplateIntroPage) this.o.f91466a.get(i);
        H2(this.f150042r, new h56.a(this, portfolioRevealIntroScreenContract$TemplateIntroPage, 7));
        TemplateIntroScreenContent templateIntroScreenContent = portfolioRevealIntroScreenContract$TemplateIntroPage.f91469c;
        if (templateIntroScreenContent instanceof TemplateIntroScreenContent.PieChart) {
            lVar = this;
        } else {
            if (!(templateIntroScreenContent instanceof TemplateIntroScreenContent.AnimatedComponent)) {
                throw new NoWhenBranchMatchedException();
            }
            List listK = v.k(new d(216.0f, 52.72f, 30.61f, 8.5f), new d(166.0f, 73.5f, 39.0f, 8.5f), new d(179.0f, 63.0f, 43.0f, 17.5f), new d(151.0f, 74.0f, 32.0f, 24.0f), new d(187.0f, 38.0f, 16.0f, 11.0f));
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f186409a = listK.iterator();
            lVar = this;
            a2VarB1 = yji.l.b1(this, ta6.a.I(800L, TimeUnit.MILLISECONDS), null, new f23.y(ref$ObjectRef, listK, lVar, a2VarB1, 18), 3);
        }
        lVar.f150041q = a2VarB1;
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2(this.f150040p);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150042r;
    }
}
