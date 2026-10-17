package jfa;

import da3.j;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import pfa.l;
import pfa.m;
import qgk.i3;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f173731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f173732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efk.a f173733c;
    public final nj0.a d;
    public final hcb.a e;
    public final zia.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w9k.a f173734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ite.a f173735h;
    public final xmg.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m41.c f173736j;
    public final l70.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f173737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zvj.a f173738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jxj.a f173739n;
    public final nf0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jk3.c f173740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f173741q = this;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f173742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f173743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f173744t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f173745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f173746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ix5.b f173747y;
    public final ix5.b z;

    public a(j jVar, jk3.c cVar, l70.e eVar, ee0.a aVar, nf0.a aVar2, nj0.a aVar3, m41.c cVar2, ite.a aVar4, w9k.a aVar5, kfa.a aVar6, efk.a aVar7, i3 i3Var, zia.a aVar8, hcb.a aVar9, an0.c cVar3, xmg.a aVar10, zvj.a aVar11, jxj.a aVar12) {
        this.f173731a = aVar;
        this.f173732b = cVar3;
        this.f173733c = aVar7;
        this.d = aVar3;
        this.e = aVar9;
        this.f = aVar8;
        this.f173734g = aVar5;
        this.f173735h = aVar4;
        this.i = aVar10;
        this.f173736j = cVar2;
        this.k = eVar;
        this.f173737l = jVar;
        this.f173738m = aVar11;
        this.f173739n = aVar12;
        this.o = aVar2;
        this.f173740p = cVar;
        int i = 15;
        this.f173742r = e4m.b.b(new ix5.b(this, 0, i));
        this.f173743s = e4m.b.b(new ix5.b(this, 3, i));
        this.f173744t = e4m.b.b(new ix5.b(this, 2, i));
        this.u = e4m.b.b(new ix5.b(this, 1, i));
        this.v = e4m.b.b(new ix5.b(this, 5, i));
        this.f173745w = e4m.b.b(new ix5.b(this, 6, i));
        this.f173746x = e4m.b.b(new ix5.b(this, 4, i));
        this.f173747y = new ix5.b(this, 7, i);
        this.z = new ix5.b(this, 8, i);
    }

    public final lfa.b a() {
        t tVarF = this.f173733c.f();
        s.j(tVarF);
        return new lfa.b(tVarF, (qfa.e) this.f173746x.get(), c(), d());
    }

    public final onh.b b() {
        kfa.d.Companion.getClass();
        joe.e factory = new joe.e(13);
        onh.b defaultProvider = new onh.b(d());
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        return defaultProvider;
    }

    public final l c() {
        onh.b bVarB = b();
        uia.a aVar = (uia.a) this.f.i.get();
        s.j(aVar);
        return new l(bVarB, aVar, new pfa.a(new ogk.f()), new m());
    }

    public final mfa.b d() {
        gte.a aVarB = this.f173735h.b();
        s.j(aVarB);
        return new mfa.b(this.f173747y, this.z, aVarB);
    }
}
