package dmc;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zdl.f f115919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9h.a f115920c;
    public final ite.a d;
    public final c e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ika.f f115921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wvh.a f115922h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f115923j;
    public final e4m.e k;

    public b(a aVar, c cVar, h9h.a aVar2, ite.a aVar3, zdl.f fVar, nkh.a aVar4, ika.f fVar2, wvh.a aVar5, Context context) {
        this.f115918a = context;
        this.f115919b = fVar;
        this.f115920c = aVar2;
        this.d = aVar3;
        this.e = cVar;
        this.f = aVar;
        this.f115921g = fVar2;
        this.f115922h = aVar5;
        int i = 22;
        this.i = e4m.b.b(new cbb.b(this, 0, i));
        this.f115923j = e4m.b.b(new cbb.b(this, 1, i));
        this.k = e4m.b.b(new cbb.b(this, 2, i));
    }

    public final clc.b a() {
        return (clc.b) this.f115923j.get();
    }

    public final xkc.a b() {
        return (xkc.a) this.k.get();
    }

    public final fmc.v c() {
        tzg.m mVarT = this.f115920c.t();
        vc.s.j(mVarT);
        return new fmc.v(mVarT);
    }
}
