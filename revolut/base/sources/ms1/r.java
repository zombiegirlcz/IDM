package ms1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferAmountContract$InputData f208571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f208572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f208573c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f208574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f208575h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f208576j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f208577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f208578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f208579n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f208580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f208581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f208582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f208583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f208584t;
    public final e4m.e u;

    public r(j jVar, t tVar, BaseScreen baseScreen, BizumTransferAmountContract$InputData bizumTransferAmountContract$InputData) {
        this.f208572b = jVar;
        this.f208573c = tVar;
        this.f208571a = bizumTransferAmountContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 25;
        this.e = e4m.b.b(new ld1.q(jVar, tVar, this, 1, i));
        this.f = e4m.b.b(new ld1.q(jVar, tVar, this, 0, i));
        this.f208574g = e4m.b.b(new ld1.q(jVar, tVar, this, 3, i));
        this.f208575h = e4m.b.b(new ld1.q(jVar, tVar, this, 2, i));
        this.i = e4m.b.b(new ld1.q(jVar, tVar, this, 6, i));
        this.f208576j = e4m.b.b(new ld1.q(jVar, tVar, this, 5, i));
        this.k = e4m.b.b(new ld1.q(jVar, tVar, this, 4, i));
        this.f208577l = e4m.b.b(new ld1.q(jVar, tVar, this, 8, i));
        this.f208578m = e4m.b.b(new ld1.q(jVar, tVar, this, 7, i));
        this.f208579n = e4m.b.b(new ld1.q(jVar, tVar, this, 11, i));
        this.o = e4m.b.b(new ld1.q(jVar, tVar, this, 10, i));
        this.f208580p = e4m.b.b(new ld1.q(jVar, tVar, this, 9, i));
        this.f208581q = e4m.b.b(new ld1.q(jVar, tVar, this, 13, i));
        this.f208582r = e4m.b.b(new ld1.q(jVar, tVar, this, 14, i));
        this.f208583s = e4m.b.b(new ld1.q(jVar, tVar, this, 16, i));
        this.f208584t = e4m.b.b(new ld1.q(jVar, tVar, this, 15, i));
        this.u = e4m.b.b(new ld1.q(jVar, tVar, this, 12, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f208578m.get(), (yji.n) this.f208580p.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f208575h.get(), (yji.d) this.k.get());
    }
}
