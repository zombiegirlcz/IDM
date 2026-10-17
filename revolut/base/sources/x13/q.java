package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.CardOrderFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements qji.a, j13.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f302172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOrderFlowContract$InputData f302173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f302174c;
    public final q d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f302175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f302176h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f302177j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f302178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f302179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f302180n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f302181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f302182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f302183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f302184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f302185t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f302186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f302187x;

    public q(p pVar, agk.a aVar, BaseFlow baseFlow, CardOrderFlowContract$InputData cardOrderFlowContract$InputData) {
        this.f302174c = pVar;
        this.f302172a = aVar;
        this.f302173b = cardOrderFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(baseFlow));
        int i = 19;
        this.f = e4m.b.b(new whc.t(pVar, this, 2, i));
        this.f302175g = e4m.b.b(new whc.t(pVar, this, 1, i));
        this.f302176h = e4m.b.b(new whc.t(pVar, this, 0, i));
        this.i = e4m.b.b(new whc.t(pVar, this, 5, i));
        this.f302177j = e4m.b.b(new whc.t(pVar, this, 6, i));
        this.k = e4m.b.b(new whc.t(pVar, this, 7, i));
        this.f302178l = e4m.b.b(new whc.t(pVar, this, 4, i));
        this.f302179m = e4m.b.b(new whc.t(pVar, this, 8, i));
        this.f302180n = e4m.b.b(new whc.t(pVar, this, 3, i));
        this.o = e4m.b.b(new whc.t(pVar, this, 10, i));
        this.f302181p = e4m.b.b(new whc.t(pVar, this, 11, i));
        this.f302182q = e4m.b.b(new whc.t(pVar, this, 9, i));
        this.f302183r = e4m.b.b(new whc.t(pVar, this, 12, i));
        this.f302184s = e4m.b.b(new whc.t(pVar, this, 14, i));
        this.f302185t = e4m.b.b(new whc.t(pVar, this, 15, i));
        this.u = e4m.b.b(new whc.t(pVar, this, 16, i));
        this.v = e4m.b.b(new whc.t(pVar, this, 13, i));
        this.f302186w = e4m.b.b(new whc.t(pVar, this, 17, i));
        this.f302187x = e4m.b.b(new whc.t(pVar, this, 18, i));
    }

    @Override // j13.a
    public final tz2.p b() {
        return new tz2.p(this.f302174c, this.d, 1);
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new eyd.u(this.f302174c, this.d, 17);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f302180n.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f302176h.get());
    }
}
