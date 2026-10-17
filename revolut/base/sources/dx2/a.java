package dx2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaScreenContract$Configuration;
import dw3.v7;
import e4m.e;
import gsi.h;
import hqi.i;
import iqi.g;
import java.util.Set;
import ty0.c;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f120520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f120521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f120522c;
    public final RevolutCardResetScaScreenContract$Configuration d;
    public final b e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f120523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f120524h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f120525j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f120526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f120527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f120528n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f120529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f120530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f120531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f120532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f120533t;

    public a(b bVar, d dVar, i iVar, g gVar, RevolutCardResetScaScreenContract$Configuration revolutCardResetScaScreenContract$Configuration) {
        this.e = bVar;
        this.f120520a = dVar;
        this.f120521b = gVar;
        this.f120522c = iVar;
        this.d = revolutCardResetScaScreenContract$Configuration;
        this.f = e4m.b.b(new v7(bVar, this, 0, 14));
        this.f120523g = e4m.b.b(new v7(bVar, this, 1, 14));
        this.f120524h = e4m.b.b(new v7(bVar, this, 3, 14));
        this.i = e4m.b.b(new v7(bVar, this, 2, 14));
        this.f120525j = e4m.b.b(new v7(bVar, this, 4, 14));
        this.k = e4m.b.b(new v7(bVar, this, 5, 14));
        this.f120526l = e4m.b.b(new v7(bVar, this, 7, 14));
        this.f120527m = e4m.b.b(new v7(bVar, this, 6, 14));
        this.f120528n = e4m.b.b(new v7(bVar, this, 8, 14));
        this.o = e4m.b.b(new v7(bVar, this, 9, 14));
        this.f120529p = e4m.b.b(new v7(bVar, this, 10, 14));
        this.f120530q = e4m.b.b(new v7(bVar, this, 11, 14));
        this.f120531r = e4m.b.b(new v7(bVar, this, 12, 14));
        this.f120532s = e4m.b.b(new v7(bVar, this, 14, 14));
        this.f120533t = e4m.b.b(new v7(bVar, this, 13, 14));
    }

    @Override // gsi.a
    public final f Q() {
        return bq.i.j(this.f120520a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f120520a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f120520a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f120520a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f120520a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f120520a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f120520a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f120520a);
    }

    @Override // gsi.a
    public final c b0() {
        return bq.i.g(this.f120520a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f120520a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f120520a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f120520a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(12);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f120520a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f120523g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f120525j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f120527m.get());
        builderBuilderWithExpectedSize.add(this.f120528n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f120529p.get());
        builderBuilderWithExpectedSize.add(this.f120530q.get());
        return j6.a.g(this.f120531r, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f120520a);
    }
}
