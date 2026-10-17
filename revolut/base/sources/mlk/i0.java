package mlk;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final slk.b f207017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.b f207018b;

    public i0(slk.b planCancellationFeaturesItemMapper, d familyBannerItemsMapper, e navBarItemsMapper, yik.b animatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(planCancellationFeaturesItemMapper, "planCancellationFeaturesItemMapper");
        Intrinsics.checkNotNullParameter(familyBannerItemsMapper, "familyBannerItemsMapper");
        Intrinsics.checkNotNullParameter(navBarItemsMapper, "navBarItemsMapper");
        Intrinsics.checkNotNullParameter(animatedBackgroundTypeMapper, "animatedBackgroundTypeMapper");
        this.f207017a = planCancellationFeaturesItemMapper;
        this.f207018b = animatedBackgroundTypeMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause textClause;
        hha.d dVar;
        Clause textClause2;
        Clause textLocalisedClause;
        v domainState = (v) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f207028b;
        Data data2 = domainState.d;
        Data data3 = domainState.f;
        List list = (List) iii.c.f(t1.u(data, data2, data3), new ml3.y(domainState, this), new mh1.e(17), new m88.c(this, domainState, 10));
        PlanCancelFeatures$CancelReason planCancelFeatures$CancelReason = domainState.f207027a;
        PlanCancelFeatures$CancelReason.CloseAccount closeAccount = PlanCancelFeatures$CancelReason.CloseAccount.f102909a;
        boolean zF = Intrinsics.f(planCancelFeatures$CancelReason, closeAccount);
        PlanCancelFeatures$CancelReason.StandardPlan standardPlan = PlanCancelFeatures$CancelReason.StandardPlan.f102912a;
        if (zF) {
            textClause = new TextLocalisedClause(R$string.plan_downgrade_voluntary_offboarding_main_action, null, null, 14);
        } else {
            if (!(planCancelFeatures$CancelReason instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan) && !Intrinsics.f(planCancelFeatures$CancelReason, standardPlan)) {
                throw new NoWhenBranchMatchedException();
            }
            PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) data.getContent();
            textClause = (pricingPlanSubscription == null || (dVar = pricingPlanSubscription.f81129a) == null) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.plan_cancellation_confirmation_keep_my_plan, zhm.u.c(dok.g.d(dVar, null)), null, 12);
        }
        if (Intrinsics.f(planCancelFeatures$CancelReason, closeAccount)) {
            textLocalisedClause = new TextLocalisedClause(R$string.plan_downgrade_voluntary_offboarding_secondary_action, null, null, 14);
        } else {
            if (!(planCancelFeatures$CancelReason instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan) && !Intrinsics.f(planCancelFeatures$CancelReason, standardPlan)) {
                throw new NoWhenBranchMatchedException();
            }
            od0.i iVar = (od0.i) domainState.f207029c.getContent();
            if (iVar != null) {
                hha.d dVar2 = (hha.d) iVar.f224257a;
                textClause2 = dVar2 == null ? new TextLocalisedClause(R$string.plan_cancellation_features_proceed, null, null, 14) : new TextLocalisedClause(R$string.plan_cancellation_features_proceed_with_plan, zhm.u.c(dok.g.d(dVar2, null)), null, 12);
            } else {
                textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            textLocalisedClause = textClause2;
        }
        return new z(list, textClause, textLocalisedClause, (Clause) iii.c.f(t1.t(domainState.e, data), new a0(8), new mh1.e(16), new mig.a(3)), (Clause) iii.c.f(t1.u(data, data2, data3), new a0(7), new mh1.e(19), new mig.a(this, 4)), (AnimatedBackgroundType) iii.c.f(data, new a0(6), new mh1.e(18), new mgh.i(this, 2)));
    }
}
