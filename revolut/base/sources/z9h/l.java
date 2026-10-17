package z9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreenContract$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WithdrawScreenContract$Input f320461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vsb.a f320462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f320463c;
    public final k d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f320464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f320465h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f320466j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f320467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f320468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f320469n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f320470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f320471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f320472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f320473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f320474t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f320475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f320476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f320477y;
    public final e4m.e z;

    public l(d dVar, k kVar, vsb.a aVar, BaseScreen baseScreen, WithdrawScreenContract$Input withdrawScreenContract$Input) {
        this.f320463c = dVar;
        this.d = kVar;
        this.f320461a = withdrawScreenContract$Input;
        this.f320462b = aVar;
        this.e = e4m.b.b(e4m.c.a(baseScreen));
        int i = 1;
        this.f = e4m.b.b(new z52.q(dVar, kVar, this, 2, i));
        this.f320464g = e4m.b.b(new z52.q(dVar, kVar, this, 1, i));
        this.f320465h = e4m.b.b(new z52.q(dVar, kVar, this, 0, i));
        this.i = e4m.b.b(new z52.q(dVar, kVar, this, 4, i));
        this.f320466j = e4m.b.b(new z52.q(dVar, kVar, this, 3, i));
        this.k = e4m.b.b(new z52.q(dVar, kVar, this, 6, i));
        this.f320467l = e4m.b.b(new z52.q(dVar, kVar, this, 5, i));
        this.f320468m = e4m.b.b(new z52.q(dVar, kVar, this, 8, i));
        this.f320469n = e4m.b.b(new z52.q(dVar, kVar, this, 7, i));
        this.o = e4m.b.b(new z52.q(dVar, kVar, this, 10, i));
        this.f320470p = e4m.b.b(new z52.q(dVar, kVar, this, 9, i));
        this.f320471q = e4m.b.b(new z52.q(dVar, kVar, this, 11, i));
        this.f320472r = e4m.b.b(new z52.q(dVar, kVar, this, 14, i));
        this.f320473s = e4m.b.b(new z52.q(dVar, kVar, this, 13, i));
        this.f320474t = e4m.b.b(new z52.q(dVar, kVar, this, 17, i));
        this.u = e4m.b.b(new z52.q(dVar, kVar, this, 16, i));
        this.v = e4m.b.b(new z52.q(dVar, kVar, this, 18, i));
        this.f320475w = e4m.b.b(new z52.q(dVar, kVar, this, 19, i));
        this.f320476x = e4m.b.b(new z52.q(dVar, kVar, this, 15, i));
        this.f320477y = e4m.b.b(new z52.q(dVar, kVar, this, 20, i));
        this.z = e4m.b.b(new z52.q(dVar, kVar, this, 12, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f320467l.get(), (yji.n) this.f320469n.get(), (yji.n) this.f320470p.get(), (yji.n) this.f320471q.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f320465h.get(), (yji.d) this.f320466j.get());
    }
}
