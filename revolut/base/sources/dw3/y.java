package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BirthCityScreenContract$InputData f120183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dmc.b0 f120185c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120187h;

    public y(c1 c1Var, a0 a0Var, BaseScreen baseScreen, BirthCityScreenContract$InputData birthCityScreenContract$InputData) {
        this.f120183a = birthCityScreenContract$InputData;
        this.f120184b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        dmc.b0 b0Var = new dmc.b0(a0Var, this, 1, i);
        this.f120185c = b0Var;
        this.d = e4m.b.b(b0Var);
        this.e = e4m.b.b(new dmc.b0(a0Var, this, 0, i));
        this.f = e4m.b.b(this.f120185c);
        this.f120186g = e4m.b.b(new dmc.b0(a0Var, this, 3, i));
        this.f120187h = e4m.b.b(new dmc.b0(a0Var, this, 2, i));
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
