package ymk;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$InputData;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPageScreenContract$InputData f315026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.g f315027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dnk.k f315028c;
    public final dnk.a d;
    public final dnk.m e;
    public final com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c90.c f315029g;

    public b0(PlanPageScreenContract$InputData inputData, mmk.e loadingStateMapper, dnk.g headerMapper, dnk.k highlightedBenefitsMapper, dnk.a benefitCategoriesMapper, dnk.m perksMapper, com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a analyticsContextFactory, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loadingStateMapper, "loadingStateMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(highlightedBenefitsMapper, "highlightedBenefitsMapper");
        Intrinsics.checkNotNullParameter(benefitCategoriesMapper, "benefitCategoriesMapper");
        Intrinsics.checkNotNullParameter(perksMapper, "perksMapper");
        Intrinsics.checkNotNullParameter(analyticsContextFactory, "analyticsContextFactory");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f315026a = inputData;
        this.f315027b = headerMapper;
        this.f315028c = highlightedBenefitsMapper;
        this.d = benefitCategoriesMapper;
        this.e = perksMapper;
        this.f = analyticsContextFactory;
        this.f315029g = uiResources;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f315035b, new yjj.j(this, 12), new yjh.b0(10), new y66.q(this, domainState, 11));
        AnalyticsContext analyticsContext = (AnalyticsContext) iii.c.f(domainState.f315034a, new yjj.j(13), new yjh.b0(8), new y(this, 0));
        c90.c cVar = this.f315029g;
        final int iK = kli.a.k(cVar.f22265a, 152.0f);
        final int iK2 = kli.a.k(cVar.f22265a, 88.0f);
        Data data = domainState.f315035b;
        return new q(list, analyticsContext, ((Number) iii.c.f(data, new wk4.k(iK, 8), new g6f.f(iK, 2), new Function3() { // from class: ymk.z
            /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                /*
                    r0 = this;
                    ggk.g1 r1 = (ggk.g1) r1
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    r2.booleanValue()
                    java.lang.Throwable r3 = (java.lang.Throwable) r3
                    java.lang.String r2 = "planLayout"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                    com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms r2 = r1.f143724l
                    if (r2 == 0) goto L13
                    goto L22
                L13:
                    com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions r1 = r1.k
                    if (r1 == 0) goto L1a
                    ggk.v0 r1 = r1.f102755a
                    goto L1b
                L1a:
                    r1 = 0
                L1b:
                    ggk.v0 r2 = ggk.v0.TWO_STEP
                    if (r1 != r2) goto L22
                    int r1 = r2
                    goto L24
                L22:
                    int r1 = r1
                L24:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ymk.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        })).intValue(), (p) iii.c.f(data, new yjj.j(11), new yjh.b0(9), new y5g.l(9)));
    }
}
