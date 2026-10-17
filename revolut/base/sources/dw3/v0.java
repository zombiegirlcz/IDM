package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditAddressSearchScreenContract$InputData f119959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119961c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119963h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119964j;

    public v0(c1 c1Var, t0 t0Var, BaseScreen baseScreen, CreditAddressSearchScreenContract$InputData creditAddressSearchScreenContract$InputData) {
        this.f119959a = creditAddressSearchScreenContract$InputData;
        this.f119960b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 4;
        e0 e0Var = new e0(c1Var, t0Var, this, 1, i);
        this.f119961c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, t0Var, this, 0, i));
        this.f = e4m.b.b(this.f119961c);
        this.f119962g = e4m.b.b(new e0(c1Var, t0Var, this, 3, i));
        this.f119963h = e4m.b.b(new e0(c1Var, t0Var, this, 5, i));
        this.i = e4m.b.b(new e0(c1Var, t0Var, this, 4, i));
        this.f119964j = e4m.b.b(new e0(c1Var, t0Var, this, 2, i));
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
