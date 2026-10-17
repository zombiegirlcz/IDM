package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPageBottomSheetContract$InputData f246238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246240c;
    public final e4m.e d;
    public final e4m.e e;

    public t0(i0 i0Var, PlanPageBottomSheetContract$InputData planPageBottomSheetContract$InputData) {
        this.f246239b = i0Var;
        this.f246238a = planPageBottomSheetContract$InputData;
        this.f246240c = e4m.b.b(new m(i0Var, this, 2, 16));
        this.d = e4m.b.b(new m(i0Var, this, 1, 16));
        this.e = e4m.b.b(new m(i0Var, this, 0, 16));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
