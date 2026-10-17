package q97;

import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class h3 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cha.c f243706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f243707c;
    public final t97.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(t97.c productCellProvider, cha.c studentPlanInteractor, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f243706b = studentPlanInteractor;
        this.f243707c = featureToggleInteractor;
        this.d = t97.d.STUDENT_PLAN;
    }

    @Override // r97.b
    public final Flow d() {
        if (!((jte.d) this.f243707c).c(PricingPlansApi$Toggles.StudentPlans.f81004c)) {
            return new go.g(Boolean.FALSE, 2);
        }
        return rd0.e.e(new g3(mo3.a.g(cha.c.a(this.f243706b), null, new q2(6), 1), 0), zhm.h0.f322473a, new otd.a(3, 24, null));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.d;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(new KompotPricingPlanFeatureConfig.Student(0)));
    }
}
