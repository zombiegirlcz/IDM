package k1b;

import android.content.Context;
import jqa.m;
import l1b.d;
import l1b.i;
import l70.e;
import uli.f;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f180190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cri.b f180191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f180192c;
    public final jm0.a d;
    public final bmi.a e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ee0.a f180193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cri.a f180194h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f180195j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f180196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f180197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f180198n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f180199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f180200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f180201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f180202s;

    public c(e eVar, bmi.a aVar, cri.b bVar, jm0.a aVar2, xmg.a aVar3, ee0.a aVar4, cri.a aVar5, Context context) {
        this.f180190a = context;
        this.f180191b = bVar;
        this.f180192c = eVar;
        this.d = aVar2;
        this.e = aVar;
        this.f = aVar3;
        this.f180193g = aVar4;
        this.f180194h = aVar5;
        int i = 9;
        this.i = e4m.b.b(new m(this, 1, i));
        this.f180195j = new m(this, 2, i);
        this.k = e4m.b.b(new m(this, 3, i));
        this.f180196l = e4m.b.b(new m(this, 4, i));
        this.f180197m = e4m.b.b(new m(this, 6, i));
        this.f180198n = e4m.b.b(new m(this, 7, i));
        this.o = e4m.b.b(new m(this, 5, i));
        this.f180199p = e4m.b.b(new m(this, 0, i));
        this.f180200q = e4m.b.b(new m(this, 9, i));
        this.f180201r = e4m.b.b(new m(this, 8, i));
        e4m.b.b(new m(this, 10, i));
        this.f180202s = e4m.b.b(new m(this, 11, i));
    }

    public final i a() {
        d dVar = (d) this.k.get();
        f80.a aVarX = this.f180192c.x();
        s.j(aVarX);
        f fVar = (f) this.e.f16836b.get();
        s.j(fVar);
        return new i(dVar, aVarX, fVar);
    }
}
