package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f176259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardCashbackDetailsScreenContract$InputData f176260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f176261c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176263h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176264j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f176265l;

    public q0(a3 a3Var, ViewController viewController, CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData, mkd.g gVar) {
        this.f176261c = a3Var;
        this.f176259a = gVar;
        this.f176260b = creditCardCashbackDetailsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new jdi.i(a3Var, this, 2, 24));
        this.f = e4m.b.b(new jdi.i(a3Var, this, 1, 24));
        this.f176262g = e4m.b.b(new jdi.i(a3Var, this, 0, 24));
        this.f176263h = e4m.b.b(new jdi.i(a3Var, this, 5, 24));
        this.i = e4m.b.b(new jdi.i(a3Var, this, 4, 24));
        this.f176264j = e4m.b.b(new jdi.i(a3Var, this, 3, 24));
        this.k = e4m.b.b(new jdi.i(a3Var, this, 6, 24));
        this.f176265l = e4m.b.b(new jdi.i(a3Var, this, 7, 24));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f176264j.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f176262g.get());
    }
}
