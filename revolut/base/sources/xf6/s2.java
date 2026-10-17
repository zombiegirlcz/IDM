package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements gj6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f305051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OpenBankingAuthPaymentScreenContract$InputData f305052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2 f305053c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305055h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f305056j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f305057l;

    public s2(w2 w2Var, r2 r2Var, OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData, mkd.g gVar) {
        this.f305053c = w2Var;
        this.f305051a = gVar;
        this.f305052b = openBankingAuthPaymentScreenContract$InputData;
        this.d = e4m.b.b(new wpg.g(w2Var, r2Var, this, 0, 11));
        this.e = e4m.b.b(new wpg.g(w2Var, r2Var, this, 2, 11));
        this.f = e4m.b.b(new wpg.g(w2Var, r2Var, this, 3, 11));
        this.f305054g = e4m.b.b(new wpg.g(w2Var, r2Var, this, 4, 11));
        this.f305055h = e4m.b.b(new wpg.g(w2Var, r2Var, this, 5, 11));
        this.i = e4m.b.b(new wpg.g(w2Var, r2Var, this, 6, 11));
        this.f305056j = e4m.b.b(new wpg.g(w2Var, r2Var, this, 7, 11));
        this.k = e4m.b.b(new wpg.g(w2Var, r2Var, this, 8, 11));
        this.f305057l = e4m.b.b(new wpg.g(w2Var, r2Var, this, 1, 11));
    }

    public final ti6.d b() {
        w2 w2Var = this.f305053c;
        h5i.g gVarB = w2Var.k.b();
        gte.a aVarB = w2Var.f305145p.b();
        vc.s.j(aVarB);
        return new ti6.d(gVarB, aVarB);
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
