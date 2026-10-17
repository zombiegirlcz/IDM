package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EstimatedCarValuePickerScreenContract$InputData f247316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247318c = e4m.b.b(new t(this, 3, 5));
    public final e4m.e d = e4m.b.b(new t(this, 2, 5));
    public final e4m.e e = e4m.b.b(new t(this, 1, 5));
    public final e4m.e f = e4m.b.b(new t(this, 0, 5));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247319g = e4m.b.b(new t(this, 4, 5));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247320h = e4m.b.b(new t(this, 6, 5));
    public final e4m.e i = e4m.b.b(new t(this, 5, 5));

    public h0(k0 k0Var, q qVar, BaseScreen baseScreen, EstimatedCarValuePickerScreenContract$InputData estimatedCarValuePickerScreenContract$InputData) {
        this.f247316a = estimatedCarValuePickerScreenContract$InputData;
        this.f247317b = e4m.b.b(e4m.c.a(baseScreen));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247319g.get());
    }
}
