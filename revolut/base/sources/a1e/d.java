package a1e;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0h.b f605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0h.a f606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f607c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f609h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f610j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f613n;
    public final e4m.e o;

    public d(b bVar, o0h.b bVar2, o0h.a aVar, BaseScreen baseScreen, i1e.l lVar) {
        this.f607c = bVar;
        this.f605a = bVar2;
        this.f606b = aVar;
        this.d = e4m.b.b(new c(bVar, this, 1, 0));
        this.e = e4m.b.b(e4m.c.a(lVar));
        this.f = e4m.b.b(new c(bVar, this, 0, 0));
        this.f608g = e4m.b.b(e4m.c.a(baseScreen));
        int i = 0;
        this.f609h = e4m.b.b(new c(bVar, this, 4, i));
        this.i = e4m.b.b(new c(bVar, this, 3, i));
        this.f610j = e4m.b.b(new c(bVar, this, 2, i));
        this.k = e4m.b.b(new c(bVar, this, 7, i));
        this.f611l = e4m.b.b(new c(bVar, this, 8, i));
        this.f612m = e4m.b.b(new c(bVar, this, 6, i));
        this.f613n = e4m.b.b(new c(bVar, this, 9, i));
        this.o = e4m.b.b(new c(bVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f610j.get());
    }
}
