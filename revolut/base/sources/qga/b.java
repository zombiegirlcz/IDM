package qga;

import p8a.c0;
import pak.h;
import rga.q;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f245714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cri.b f245715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f245716c;
    public final ee0.a d;
    public final e4m.e e;
    public final e4m.e f;

    public b(l70.e eVar, ee0.a aVar, cri.b bVar, ite.a aVar2, an0.c cVar) {
        this.f245714a = aVar2;
        this.f245715b = bVar;
        this.f245716c = cVar;
        this.d = aVar;
        int i = 20;
        this.e = e4m.b.b(new c0(this, 0, i));
        this.f = e4m.b.b(new c0(this, 1, i));
    }

    public final h a() {
        return new h((rga.c) this.e.get());
    }

    public final rga.c b() {
        return (rga.c) this.e.get();
    }

    public final k18.c c() {
        p56.a aVar = new p56.a(new q(new sga.a()));
        gte.a aVarB = this.f245714a.b();
        s.j(aVarB);
        return new k18.c(aVar, aVarB, ((s41.a) this.f245715b).d());
    }
}
