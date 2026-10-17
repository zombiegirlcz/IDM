package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDetailsScreenContract$InputData f176374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176376c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176378h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176379j;
    public final e4m.e k;

    public u0(a3 a3Var, CreditCardDetailsScreenContract$InputData creditCardDetailsScreenContract$InputData) {
        this.f176375b = a3Var;
        this.f176374a = creditCardDetailsScreenContract$InputData;
        this.f176376c = e4m.b.b(new jdi.i(a3Var, this, 1, 27));
        this.d = e4m.b.b(new jdi.i(a3Var, this, 0, 27));
        this.e = e4m.b.b(new jdi.i(a3Var, this, 4, 27));
        this.f = e4m.b.b(new jdi.i(a3Var, this, 5, 27));
        this.f176377g = e4m.b.b(new jdi.i(a3Var, this, 6, 27));
        this.f176378h = e4m.b.b(new jdi.i(a3Var, this, 7, 27));
        this.i = e4m.b.b(new jdi.i(a3Var, this, 8, 27));
        this.f176379j = e4m.b.b(new jdi.i(a3Var, this, 3, 27));
        this.k = e4m.b.b(new jdi.i(a3Var, this, 2, 27));
    }

    public final nr4.b b() {
        a3 a3Var = this.f176375b;
        bn2.p pVarB = a3Var.J.b();
        vc.s.j(pVarB);
        om4.k3 k3Var = (om4.k3) a3Var.f175965b.u.get();
        vc.s.j(k3Var);
        return new nr4.b(pVarB, k3Var);
    }

    public final lal.a c() {
        a3 a3Var = this.f176375b;
        dp4.w wVar = (dp4.w) a3Var.f175974k0.get();
        gte.a aVarB = a3Var.f175982r.b();
        vc.s.j(aVarB);
        return new lal.a(wVar, aVarB, a3Var.B.e(), a3Var.f175965b.a());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
