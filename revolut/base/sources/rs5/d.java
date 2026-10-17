package rs5;

import kotlin.jvm.internal.Intrinsics;
import r2d.p;
import r2d.r;
import r2d.t;
import r2d.u;
import r7d.o;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f256986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f256987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f256988c;
    public final o d;
    public final o e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f256989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f256990h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f256991j;
    public final o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f256992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f256993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f256994n;
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f256995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f256996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f256997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f256998s;

    public d(c cVar, b bVar, k39.b bVar2) {
        this.f256987b = cVar;
        this.f256986a = bVar2;
        int i = 23;
        this.f256988c = new o(cVar, this, 0, i);
        this.d = new o(cVar, this, 1, i);
        this.e = new o(cVar, this, 2, i);
        this.f = new o(cVar, this, 3, i);
        this.f256989g = new o(cVar, this, 4, i);
        this.f256990h = new o(cVar, this, 5, i);
        this.i = new o(cVar, this, 6, i);
        this.f256991j = new o(cVar, this, 7, i);
        this.k = new o(cVar, this, 8, i);
        this.f256992l = new o(cVar, this, 9, i);
        this.f256993m = new o(cVar, this, 10, i);
        this.f256994n = new o(cVar, this, 11, i);
        this.o = new o(cVar, this, 12, i);
        this.f256995p = new o(cVar, this, 13, i);
        this.f256996q = new o(cVar, this, 14, i);
        this.f256997r = new o(cVar, this, 15, i);
        this.f256998s = new o(cVar, this, 16, i);
    }

    public final r a() {
        t factory = (t) this.f256987b.f256981s.f180472h.get();
        s.j(factory);
        ms5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        k39.b navigationDispatcher = this.f256986a;
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        return new r(factory.f251121a, new u(navigationDispatcher), new p(factory.f251122b), factory.f251123c);
    }
}
