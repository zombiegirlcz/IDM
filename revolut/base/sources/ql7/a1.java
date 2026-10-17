package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotorPlanSelectorScreenContract$InputData f247227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247229c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247231h;
    public final e4m.e i;

    public a1(k0 k0Var, n nVar, BaseScreen baseScreen, MotorPlanSelectorScreenContract$InputData motorPlanSelectorScreenContract$InputData) {
        this.f247227a = motorPlanSelectorScreenContract$InputData;
        this.f247228b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 19;
        this.f247229c = e4m.b.b(new l(k0Var, this, 2, i));
        this.d = e4m.b.b(new l(k0Var, this, 1, i));
        this.e = e4m.b.b(new l(k0Var, this, 0, i));
        this.f = e4m.b.b(new l(k0Var, this, 4, i));
        this.f247230g = e4m.b.b(new l(k0Var, this, 3, i));
        this.f247231h = e4m.b.b(new l(k0Var, this, 6, i));
        this.i = e4m.b.b(new l(k0Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f247230g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
