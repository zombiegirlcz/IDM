package zkk;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;
import com.revolut.tracking.v3.PlansDashboardContext;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ymk.y;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanBillingPickerScreenContract$InputData f323088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hhk.b f323089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.j f323090c;
    public final com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a d;

    public u(PlanBillingPickerScreenContract$InputData input, hhk.b billingPickerMapper, zjh.j legalEntityDisclaimerMapper, com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a analyticsContextFactory) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(billingPickerMapper, "billingPickerMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(analyticsContextFactory, "analyticsContextFactory");
        this.f323088a = input;
        this.f323089b = billingPickerMapper;
        this.f323090c = legalEntityDisclaimerMapper;
        this.d = analyticsContextFactory;
    }

    public final w0 a(PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData, hha.d plan) {
        if (plan == null) {
            SelectedBillingPlan selectedBillingPlan = planBillingPickerScreenContract$InputData.f103477a;
            SelectedBillingPlan.Plan plan2 = selectedBillingPlan instanceof SelectedBillingPlan.Plan ? (SelectedBillingPlan.Plan) selectedBillingPlan : null;
            plan = plan2 != null ? plan2.f103314a : null;
        }
        com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a aVar = this.d;
        if (plan == null) {
            return aVar.a(planBillingPickerScreenContract$InputData.f103479c, planBillingPickerScreenContract$InputData.d);
        }
        PricingPlanAnalyticsSource source = planBillingPickerScreenContract$InputData.f103479c;
        xfa.a aVar2 = planBillingPickerScreenContract$InputData.d;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof PricingPlanAnalyticsSource.Predefined) {
            return aVar.c(plan, ((PricingPlanAnalyticsSource.Predefined) source).f102960a, aVar2);
        }
        if (!(source instanceof PricingPlanAnalyticsSource.Custom)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        PlansDashboardContext.a aVarNewBuilder = PlansDashboardContext.newBuilder();
        String str = plan.f152289c;
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setPlanName(str);
        String str2 = ((PricingPlanAnalyticsSource.Custom) source).f102959a;
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setSource(str2);
        boolean zI = vc.o.i(plan);
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsDiscount(zI);
        Intrinsics.checkNotNullParameter(plan, "<this>");
        boolean zK = vc.o.k(cp5.c.q(plan));
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsFreetrial(zK);
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsOnboarding(false);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setIsOnboarding(...)");
        com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a.d(aVarNewBuilder, aVar2);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = (TextClause) iii.c.f(domainState.f323069a, new zke.f(23), new zk1.p(8), new y5g.l(28));
        Data data = domainState.f323069a;
        return new n(textClause, (TextClause) iii.c.f(data, new zke.f(24), new zk1.p(9), new y5g.l(29)), ((AnalyticsContext) iii.c.f(data, new zhf.f(this, 19), new zba.a(this, 22), new y(this, 15))).f50296a, (List) iii.c.f(t1.t(data, domainState.f323070b), new zke.f(this, 25), new zk1.p(10), new zhl.l(this, domainState, 1)));
    }
}
