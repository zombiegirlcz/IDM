package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import java.util.Set;
import qgk.k3;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutScreenContract$InputData f230043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f230044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f230045c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230047h;

    public c0(d0 d0Var, b0 b0Var, CheckoutScreenContract$InputData checkoutScreenContract$InputData) {
        this.f230044b = d0Var;
        this.f230045c = b0Var;
        this.f230043a = checkoutScreenContract$InputData;
        this.d = e4m.b.b(new ned.h(d0Var, b0Var, this, 1, 14));
        int i = 14;
        this.e = e4m.b.b(new ned.h(d0Var, b0Var, this, 2, i));
        this.f = e4m.b.b(new ned.h(d0Var, b0Var, this, 3, i));
        this.f230046g = e4m.b.b(new ned.h(d0Var, b0Var, this, 4, i));
        this.f230047h = e4m.b.b(new ned.h(d0Var, b0Var, this, 0, i));
    }

    public final ixe.m b() {
        ixe.i iVar = new ixe.i();
        d0 d0Var = this.f230044b;
        yik.h hVarB = ((k3) d0Var.f230063x).b();
        ixe.k kVar = new ixe.k();
        gte.a aVarB = d0Var.f230053j.b();
        vc.s.j(aVarB);
        return new ixe.m(iVar, hVarB, kVar, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        b0 b0Var = this.f230045c;
        return ImmutableSet.of((yji.n) b0Var.o.get(), (yji.n) b0Var.f230039p.get(), (yji.n) b0Var.f230038n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f230045c.f230041r.get());
    }
}
