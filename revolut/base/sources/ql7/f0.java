package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditApplicationScreenContract$InputData f247294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247296c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247298h;
    public final e4m.e i;

    public f0(k0 k0Var, n nVar, BaseScreen baseScreen, EditApplicationScreenContract$InputData editApplicationScreenContract$InputData) {
        this.f247294a = editApplicationScreenContract$InputData;
        this.f247295b = e4m.b.b(e4m.c.a(baseScreen));
        this.f247296c = e4m.b.b(new l(k0Var, this, 3, 11));
        this.d = e4m.b.b(new l(k0Var, this, 2, 11));
        this.e = e4m.b.b(new l(k0Var, this, 1, 11));
        this.f = e4m.b.b(new l(k0Var, this, 0, 11));
        this.f247297g = e4m.b.b(new l(k0Var, this, 4, 11));
        this.f247298h = e4m.b.b(new l(k0Var, this, 6, 11));
        this.i = e4m.b.b(new l(k0Var, this, 5, 11));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247297g.get());
    }
}
