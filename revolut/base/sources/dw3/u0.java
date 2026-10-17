package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f119875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditAddressScreenContract$InputData f119876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119877c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119879h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119880j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119881l;

    public u0(c1 c1Var, t0 t0Var, BaseScreen baseScreen, CreditAddressScreenContract$InputData creditAddressScreenContract$InputData) {
        this.f119875a = baseScreen;
        this.f119876b = creditAddressScreenContract$InputData;
        this.f119877c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 3;
        e0 e0Var = new e0(c1Var, t0Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, t0Var, this, 0, i));
        this.f119878g = e4m.b.b(this.d);
        this.f119879h = e4m.b.b(new e0(c1Var, t0Var, this, 5, i));
        this.i = e4m.b.b(new e0(c1Var, t0Var, this, 6, i));
        this.f119880j = e4m.b.b(new e0(c1Var, t0Var, this, 4, i));
        this.k = e4m.b.b(new e0(c1Var, t0Var, this, 3, i));
        this.f119881l = e4m.b.b(new e0(c1Var, t0Var, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119878g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
