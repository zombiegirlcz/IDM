package lce;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListContract$Configuration;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import l9f.z;
import ty0.c;
import xoi.d;
import xpi.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f193870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f193871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SubscriptionListContract$Configuration f193872c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f193873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f193874h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f193875j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f193876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f193877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f193878n;
    public final e o;

    public a(b bVar, d dVar, f fVar, SubscriptionListContract$Configuration subscriptionListContract$Configuration) {
        this.f193870a = dVar;
        this.f193871b = fVar;
        this.f193872c = subscriptionListContract$Configuration;
        this.d = e4m.b.b(new z(bVar, this, 0, 9));
        this.e = e4m.b.b(new z(bVar, this, 1, 9));
        this.f = e4m.b.b(new z(bVar, this, 3, 9));
        this.f193873g = e4m.b.b(new z(bVar, this, 2, 9));
        this.f193874h = e4m.b.b(new z(bVar, this, 4, 9));
        this.i = e4m.b.b(new z(bVar, this, 5, 9));
        this.f193875j = e4m.b.b(new z(bVar, this, 7, 9));
        this.k = e4m.b.b(new z(bVar, this, 6, 9));
        this.f193876l = e4m.b.b(new z(bVar, this, 8, 9));
        this.f193877m = e4m.b.b(new z(bVar, this, 9, 9));
        this.f193878n = e4m.b.b(new z(bVar, this, 11, 9));
        this.o = e4m.b.b(new z(bVar, this, 10, 9));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f193870a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f193870a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f193870a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f193870a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f193870a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f193870a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f193870a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f193870a);
    }

    @Override // gsi.a
    public final c b0() {
        return i.g(this.f193870a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f193870a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f193870a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f193870a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(9);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f193870a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f193873g.get());
        builderBuilderWithExpectedSize.add(this.f193874h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f193876l.get());
        return j6.a.g(this.f193877m, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f193870a);
    }
}
