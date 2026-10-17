package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalDriverListScreenContract$InputData f247277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247279c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247281h;
    public final e4m.e i;

    public e(k0 k0Var, n nVar, BaseScreen baseScreen, AdditionalDriverListScreenContract$InputData additionalDriverListScreenContract$InputData) {
        this.f247277a = additionalDriverListScreenContract$InputData;
        this.f247278b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 26;
        this.f247279c = e4m.b.b(new qgk.p1(k0Var, this, 3, i));
        this.d = e4m.b.b(new qgk.p1(k0Var, this, 2, i));
        this.e = e4m.b.b(new qgk.p1(k0Var, this, 1, i));
        this.f = e4m.b.b(new qgk.p1(k0Var, this, 0, i));
        this.f247280g = e4m.b.b(new qgk.p1(k0Var, this, 4, i));
        this.f247281h = e4m.b.b(new qgk.p1(k0Var, this, 6, i));
        this.i = e4m.b.b(new qgk.p1(k0Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247280g.get());
    }
}
