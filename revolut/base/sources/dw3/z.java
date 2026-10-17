package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BirthCountryScreenContract$InputData f120245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final afj.d f120247c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120249h;

    public z(c1 c1Var, a0 a0Var, BaseScreen baseScreen, BirthCountryScreenContract$InputData birthCountryScreenContract$InputData) {
        this.f120245a = birthCountryScreenContract$InputData;
        this.f120246b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 28;
        afj.d dVar = new afj.d(c1Var, a0Var, this, 1, i);
        this.f120247c = dVar;
        this.d = e4m.b.b(dVar);
        this.e = e4m.b.b(new afj.d(c1Var, a0Var, this, 0, i));
        this.f = e4m.b.b(this.f120247c);
        this.f120248g = e4m.b.b(new afj.d(c1Var, a0Var, this, 3, i));
        this.f120249h = e4m.b.b(new afj.d(c1Var, a0Var, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
