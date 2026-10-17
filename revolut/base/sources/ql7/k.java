package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarConfirmationScreenContract$InputData f247346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247348c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247350h;
    public final e4m.e i;

    public k(k0 k0Var, q qVar, BaseScreen baseScreen, CarConfirmationScreenContract$InputData carConfirmationScreenContract$InputData) {
        this.f247346a = carConfirmationScreenContract$InputData;
        this.f247347b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 27;
        this.f247348c = e4m.b.b(new prk.u(this, 3, i));
        this.d = e4m.b.b(new prk.u(this, 2, i));
        this.e = e4m.b.b(new prk.u(this, 1, i));
        this.f = e4m.b.b(new prk.u(this, 0, i));
        this.f247349g = e4m.b.b(new prk.u(this, 4, i));
        this.f247350h = e4m.b.b(new prk.u(this, 6, i));
        this.i = e4m.b.b(new prk.u(this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247349g.get());
    }
}
