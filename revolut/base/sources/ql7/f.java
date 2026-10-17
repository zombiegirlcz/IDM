package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressPickerScreenContract$InputData f247289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247291c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247293h;

    public f(k0 k0Var, n nVar, BaseScreen baseScreen, AddressPickerScreenContract$InputData addressPickerScreenContract$InputData) {
        this.f247289a = addressPickerScreenContract$InputData;
        this.f247290b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 27;
        this.f247291c = e4m.b.b(new qgk.p1(k0Var, this, 2, i));
        this.d = e4m.b.b(new qgk.p1(k0Var, this, 1, i));
        this.e = e4m.b.b(new qgk.p1(k0Var, this, 0, i));
        this.f = e4m.b.b(new qgk.p1(k0Var, this, 4, i));
        this.f247292g = e4m.b.b(new qgk.p1(k0Var, this, 5, i));
        this.f247293h = e4m.b.b(new qgk.p1(k0Var, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
