package a9i;

import bq.i;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_news_api.NewsInfoFeatureConfig;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NewsInfoFeatureConfig f2659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2660c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f2661g;

    public a(c cVar, d dVar, NewsInfoFeatureConfig newsInfoFeatureConfig) {
        this.f2660c = cVar;
        this.f2658a = dVar;
        this.f2659b = newsInfoFeatureConfig;
        int i = 2;
        this.d = e4m.b.b(new a1e.c(cVar, this, 0, i));
        this.e = e4m.b.b(new a1e.c(cVar, this, 2, i));
        this.f = e4m.b.b(new a1e.c(cVar, this, 1, i));
        this.f2661g = e4m.b.b(new a1e.c(cVar, this, 3, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f2658a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f2658a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f2658a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f2658a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f2658a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f2658a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f2658a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f2658a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f2658a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f2658a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f2658a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f2658a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f2658a));
        builderBuilderWithExpectedSize.add(this.d.get());
        return j6.a.g(this.f, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f2658a);
    }
}
