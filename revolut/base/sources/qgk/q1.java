package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class q1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanInfoBottomSheetScreenContract$InputData f246203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246205c;
    public final e4m.e d;

    public q1(i0 i0Var, PricingPlanInfoBottomSheetScreenContract$InputData pricingPlanInfoBottomSheetScreenContract$InputData) {
        this.f246204b = i0Var;
        this.f246203a = pricingPlanInfoBottomSheetScreenContract$InputData;
        int i = 0;
        this.f246205c = e4m.b.b(new p1(i0Var, this, 0, i));
        this.d = e4m.b.b(new p1(i0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f246205c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
