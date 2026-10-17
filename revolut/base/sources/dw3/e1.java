package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e1 implements h84.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardOfferFlowContract$InputData f118608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118609c;
    public final e1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118611h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118612j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118615n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118620t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f118622x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f118623y;
    public final e4m.e z;

    public e1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditCardOfferFlowContract$InputData creditCardOfferFlowContract$InputData) {
        this.f118609c = c1Var;
        this.f118607a = aVar;
        this.f118608b = creditCardOfferFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118610g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118611h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditCardOfferFlowContract$InputData));
        int i2 = 29;
        this.f118612j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118613l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118614m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118615n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118616p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118617q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118618r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118619s = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.f118620t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f118621w = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.f118622x = e4m.b.b(new dmc.b0(c1Var, this, 17, i2));
        this.f118623y = e4m.b.b(new dmc.b0(c1Var, this, 19, i2));
        this.z = e4m.b.b(new dmc.b0(c1Var, this, 18, i2));
        this.A = e4m.b.b(new dmc.b0(c1Var, this, 20, i2));
        this.B = e4m.b.b(new dmc.b0(c1Var, this, 21, i2));
        this.C = e4m.b.b(new dmc.b0(c1Var, this, 23, i2));
        this.D = e4m.b.b(new dmc.b0(c1Var, this, 22, i2));
    }

    @Override // vf4.a
    public final c9 D() {
        return new c9(this.f118609c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(7);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f118621w.get());
        builderBuilderWithExpectedSize.add(this.f118622x.get());
        builderBuilderWithExpectedSize.add(this.z.get());
        builderBuilderWithExpectedSize.add(this.A.get());
        builderBuilderWithExpectedSize.add(this.B.get());
        builderBuilderWithExpectedSize.add(this.f118616p.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118611h.get(), (yji.d) this.f118618r.get(), (yji.d) this.u.get());
    }

    @Override // w94.a
    public final i8 j() {
        return new i8(this.f118609c, this.d, 0);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118609c, this.d, 13);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f118609c, this.d, 6);
    }
}
