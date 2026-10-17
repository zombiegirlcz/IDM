package sy2;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import e4m.e;
import fsi.g;
import java.util.Set;
import jy2.k;
import ty0.c;
import vc.s;
import xoi.d;
import xpi.f;
import ypi.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ky2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f266575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f266576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f266577c;
    public final b d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f266578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f266579h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f266580j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f266581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f266582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f266583n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f266584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f266585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f266586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f266587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f266588t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f266589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f266590x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f266591y;

    public a(b bVar, d dVar, f fVar, h hVar) {
        this.d = bVar;
        this.f266575a = dVar;
        this.f266576b = fVar;
        this.f266577c = hVar;
        int i = 29;
        this.e = e4m.b.b(new ryc.d(bVar, this, 2, i));
        this.f = e4m.b.b(new ryc.d(bVar, this, 1, i));
        this.f266578g = e4m.b.b(new ryc.d(bVar, this, 0, i));
        this.f266579h = e4m.b.b(new ryc.d(bVar, this, 3, i));
        this.i = e4m.b.b(new ryc.d(bVar, this, 4, i));
        this.f266580j = e4m.b.b(new ryc.d(bVar, this, 6, i));
        this.k = e4m.b.b(new ryc.d(bVar, this, 5, i));
        this.f266581l = e4m.b.b(new ryc.d(bVar, this, 7, i));
        this.f266582m = e4m.b.b(new ryc.d(bVar, this, 8, i));
        this.f266583n = e4m.b.b(new ryc.d(bVar, this, 10, i));
        this.o = e4m.b.b(new ryc.d(bVar, this, 9, i));
        this.f266584p = e4m.b.b(new ryc.d(bVar, this, 11, i));
        this.f266585q = e4m.b.b(new ryc.d(bVar, this, 12, i));
        this.f266586r = e4m.b.b(new ryc.d(bVar, this, 13, i));
        this.f266587s = e4m.b.b(new ryc.d(bVar, this, 14, i));
        this.f266588t = e4m.b.b(new ryc.d(bVar, this, 15, i));
        this.u = e4m.b.b(new ryc.d(bVar, this, 16, i));
        this.v = e4m.b.b(new ryc.d(bVar, this, 18, i));
        this.f266589w = e4m.b.b(new ryc.d(bVar, this, 19, i));
        this.f266590x = e4m.b.b(new ryc.d(bVar, this, 20, i));
        this.f266591y = e4m.b.b(new ryc.d(bVar, this, 17, i));
    }

    @Override // ky2.a
    public final void M(CardInputActivity cardInputActivity) {
        cardInputActivity.f64754t0 = (opi.b) this.f266584p.get();
        b bVar = this.d;
        cardInputActivity.u0 = (k) bVar.k.get();
        gte.a aVarB = bVar.f266595g.b();
        s.j(aVarB);
        cardInputActivity.f64755v0 = aVarB;
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f266575a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f266575a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f266575a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f266575a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f266575a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f266575a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f266575a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f266575a);
    }

    @Override // ky2.a
    public final jy2.i b() {
        return (jy2.i) this.f266591y.get();
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f266575a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f266575a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f266575a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f266575a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(14);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f266575a));
        builderBuilderWithExpectedSize.add(this.f266578g.get());
        builderBuilderWithExpectedSize.add(this.f266579h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f266581l.get());
        builderBuilderWithExpectedSize.add(this.f266582m.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f266584p.get());
        builderBuilderWithExpectedSize.add(this.f266585q.get());
        builderBuilderWithExpectedSize.add(this.f266586r.get());
        builderBuilderWithExpectedSize.add(this.f266587s.get());
        builderBuilderWithExpectedSize.add(this.f266588t.get());
        return j6.a.g(this.u, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f266575a);
    }
}
