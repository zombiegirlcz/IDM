package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartDrivingScreenContract$InputData f247332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247334c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247336h;

    public i1(k0 k0Var, h1 h1Var, BaseScreen baseScreen, SmartDrivingScreenContract$InputData smartDrivingScreenContract$InputData) {
        this.f247332a = smartDrivingScreenContract$InputData;
        this.f247333b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 23;
        this.f247334c = e4m.b.b(new l(k0Var, this, 2, i));
        this.d = e4m.b.b(new l(k0Var, this, 1, i));
        this.e = e4m.b.b(new l(k0Var, this, 0, i));
        this.f = e4m.b.b(new l(k0Var, this, 4, i));
        this.f247335g = e4m.b.b(new l(k0Var, this, 5, i));
        this.f247336h = e4m.b.b(new l(k0Var, this, 3, i));
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
