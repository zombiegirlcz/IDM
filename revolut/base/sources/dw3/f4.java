package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f4 implements xki.c, iq3.d, rf4.a, tf4.a, vf4.a, of4.a, f54.a, w94.a, ef4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MortgageOfferFlowContract$InputData f118716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118717c;
    public final f4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118719h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118720j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118723n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118728t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118729w;

    public f4(c1 c1Var, iq3.a aVar, ViewController viewController, MortgageOfferFlowContract$InputData mortgageOfferFlowContract$InputData) {
        this.f118717c = c1Var;
        this.f118715a = aVar;
        this.f118716b = mortgageOfferFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118718g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f118719h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(mortgageOfferFlowContract$InputData));
        int i2 = 13;
        this.f118720j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118721l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118722m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f118723n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118724p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118725q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118726r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118727s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f118728t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 16, i2));
        this.f118729w = e4m.b.b(new g3(c1Var, this, 15, i2));
    }

    @Override // tf4.a
    public final a9 A() {
        return new a9(this.f118717c, this.d, 0);
    }

    @Override // vf4.a
    public final c9 D() {
        return new c9(this.f118717c, this.d, 1);
    }

    @Override // rf4.a
    public final u8 G() {
        return new u8(this.f118717c, this.d, 0);
    }

    @Override // of4.a
    public final w8 b() {
        return new w8(this.f118717c, this.d, 0);
    }

    @Override // ef4.a
    public final s8 c() {
        return new s8(this.f118717c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118727s.get(), (yji.n) this.f118728t.get(), (yji.n) this.f118724p.get(), (yji.n) this.k.get(), (yji.n) this.u.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118719h.get(), (yji.d) this.f118726r.get());
    }

    @Override // w94.a
    public final i8 j() {
        return new i8(this.f118717c, this.d, 1);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118717c, this.d, 15);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f118717c, this.d, 7);
    }
}
