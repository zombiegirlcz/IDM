package ede;

import android.content.Context;
import com.revolut.feature.support.impl.data.network.service.SupportService;
import da3.j;
import ne0.n;
import vc.s;
import wf0.x;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c21.e f124986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg0.d f124987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f124988c;
    public final an0.c d;
    public final Context e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final usg.a f124989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xmg.a f124990h;
    public final ite.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efk.a f124991j;
    public final pqi.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f124992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f124993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f124994n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f124995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f124996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f124997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f124998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f124999t;
    public final e4m.e u;
    public final e4m.e v;

    public b(j jVar, c21.e eVar, xmg.a aVar, pqi.a aVar2, gg0.d dVar, ite.a aVar3, ee0.a aVar4, an0.c cVar, usg.a aVar5, efk.a aVar6, Context context) {
        this.f124986a = eVar;
        this.f124987b = dVar;
        this.f124988c = aVar4;
        this.d = cVar;
        this.e = context;
        this.f = jVar;
        this.f124989g = aVar5;
        this.f124990h = aVar;
        this.i = aVar3;
        this.f124991j = aVar6;
        this.k = aVar2;
        int i = 0;
        this.f124992l = e4m.b.b(new a(this, 2, i));
        this.f124993m = e4m.b.b(new a(this, 1, i));
        this.f124994n = e4m.b.b(new a(this, 0, i));
        this.o = e4m.b.b(new a(this, 3, i));
        this.f124995p = e4m.b.b(new a(this, 4, i));
        this.f124996q = e4m.b.b(new a(this, 6, i));
        this.f124997r = e4m.b.b(new a(this, 5, i));
        this.f124998s = e4m.b.b(new a(this, 7, i));
        this.f124999t = e4m.b.b(new a(this, 8, i));
        this.u = e4m.b.b(new a(this, 9, i));
        this.v = e4m.b.b(new a(this, 10, i));
    }

    public final yf.c a() {
        return new yf.c(b());
    }

    public final xce.f b() {
        SupportService supportService = (SupportService) this.f124994n.get();
        x xVar = (x) this.f124987b.f143583n.get();
        s.j(xVar);
        return new xce.f(supportService, new cpi.g(xVar), (ue0.c) this.o.get(), (n) this.f124995p.get());
    }
}
