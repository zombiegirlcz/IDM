package ozj;

import bq.i;
import com.google.common.collect.ImmutableSet;
import e4m.e;
import fsi.g;
import gsi.h;
import java.util.Set;
import ove.w;
import xoi.d;
import yy0.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f231358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f231359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f231360c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f231361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f231362h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f231363j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f231364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f231365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f231366n;

    public a(b bVar, d dVar) {
        this.f231359b = bVar;
        this.f231358a = dVar;
        int i = 17;
        this.f231360c = e4m.b.b(new w(bVar, this, 1, i));
        this.d = e4m.b.b(new w(bVar, this, 0, i));
        this.e = e4m.b.b(new w(bVar, this, 2, i));
        this.f = e4m.b.b(new w(bVar, this, 3, i));
        this.f231361g = e4m.b.b(new w(bVar, this, 4, i));
        this.f231362h = e4m.b.b(new w(bVar, this, 5, i));
        this.i = e4m.b.b(new w(bVar, this, 6, i));
        this.f231363j = e4m.b.b(new w(bVar, this, 8, i));
        this.k = e4m.b.b(new w(bVar, this, 7, i));
        this.f231364l = e4m.b.b(new w(bVar, this, 11, i));
        this.f231365m = e4m.b.b(new w(bVar, this, 10, i));
        this.f231366n = e4m.b.b(new w(bVar, this, 9, i));
    }

    @Override // gsi.a
    public final f Q() {
        return i.j(this.f231358a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f231358a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f231358a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f231358a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f231358a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f231358a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f231358a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f231358a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f231358a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f231358a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f231358a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f231358a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(8);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f231358a));
        builderBuilderWithExpectedSize.add(this.d.get());
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f231361g.get());
        builderBuilderWithExpectedSize.add(this.f231362h.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f231358a);
    }
}
