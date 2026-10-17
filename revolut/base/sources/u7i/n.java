package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f277856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoveMoneyReviewScreenContract$InputData f277857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f277858c;
    public final m d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277860h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f277861j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f277862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f277863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f277864n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f277865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f277866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f277867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f277868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f277869t;
    public final e4m.e u;

    public n(l lVar, m mVar, BaseScreen baseScreen, MoveMoneyReviewScreenContract$InputData moveMoneyReviewScreenContract$InputData) {
        this.f277858c = lVar;
        this.d = mVar;
        this.f277856a = baseScreen;
        this.f277857b = moveMoneyReviewScreenContract$InputData;
        this.e = e4m.b.b(e4m.c.a(baseScreen));
        int i = 12;
        this.f = e4m.b.b(new r7d.w(lVar, mVar, this, 1, i));
        this.f277859g = e4m.b.b(new r7d.w(lVar, mVar, this, 3, i));
        this.f277860h = e4m.b.b(new r7d.w(lVar, mVar, this, 2, i));
        this.i = e4m.b.b(new r7d.w(lVar, mVar, this, 4, i));
        this.f277861j = e4m.b.b(new r7d.w(lVar, mVar, this, 0, i));
        this.k = e4m.b.b(new r7d.w(lVar, mVar, this, 5, i));
        this.f277862l = e4m.b.b(new r7d.w(lVar, mVar, this, 6, i));
        this.f277863m = e4m.b.b(new r7d.w(lVar, mVar, this, 7, i));
        this.f277864n = e4m.g.a(new r7d.w(lVar, mVar, this, 8, i));
        this.o = e4m.g.a(new r7d.w(lVar, mVar, this, 10, i));
        this.f277865p = e4m.g.a(new r7d.w(lVar, mVar, this, 9, i));
        this.f277866q = e4m.b.b(new r7d.w(lVar, mVar, this, 12, i));
        this.f277867r = e4m.b.b(new r7d.w(lVar, mVar, this, 11, i));
        this.f277868s = e4m.b.b(new r7d.w(lVar, mVar, this, 14, i));
        this.f277869t = e4m.b.b(new r7d.w(lVar, mVar, this, 15, i));
        this.u = e4m.b.b(new r7d.w(lVar, mVar, this, 13, i));
    }

    @Override // sji.b
    public final Set f() {
        yji.n nVar = (yji.n) this.f277863m.get();
        zrf.m provider = (zrf.m) this.f277864n.get();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        zrf.c provider2 = (zrf.c) this.f277865p.get();
        Intrinsics.checkNotNullParameter(provider2, "provider");
        vc.s.k(provider2);
        return ImmutableSet.of(nVar, provider, provider2, (yji.n) this.f277867r.get(), (yji.n) this.f277860h.get(), (yji.n) this.f277862l.get(), new yji.n[0]);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((l8i.f) this.f277861j.get(), new l8i.f((l8i.c) this.k.get(), (l8i.b) this.f277862l.get()));
    }
}
