package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarSearchScreenContract$InputData f247419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247421c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247423h;
    public final e4m.e i;

    public p(k0 k0Var, q qVar, BaseScreen baseScreen, CarSearchScreenContract$InputData carSearchScreenContract$InputData) {
        this.f247419a = carSearchScreenContract$InputData;
        this.f247420b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 3;
        this.f247421c = e4m.b.b(new l(k0Var, this, 3, i));
        this.d = e4m.b.b(new l(k0Var, this, 2, i));
        this.e = e4m.b.b(new l(k0Var, this, 1, i));
        this.f = e4m.b.b(new l(k0Var, this, 0, i));
        this.f247422g = e4m.b.b(new l(k0Var, this, 4, i));
        this.f247423h = e4m.b.b(new l(k0Var, this, 6, i));
        this.i = e4m.b.b(new l(k0Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247422g.get());
    }
}
