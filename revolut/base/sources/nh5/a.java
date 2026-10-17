package nh5;

import e4m.e;
import mw5.l;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f215371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rtd.a f215372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f215373c;
    public final l d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f215374g;

    public a(usg.a aVar, ite.a aVar2, rtd.a aVar3, l lVar) {
        this.f215371a = aVar;
        this.f215372b = aVar3;
        this.f215373c = aVar2;
        this.d = lVar;
        int i = 28;
        this.e = e4m.b.b(new mil.a(this, 0, i));
        this.f = e4m.b.b(new mil.a(this, 1, i));
        this.f215374g = e4m.b.b(new mil.a(this, 2, i));
    }

    public final iy.b a() {
        gte.a aVarB = this.f215373c.b();
        s.j(aVarB);
        return new iy.b(aVarB);
    }
}
