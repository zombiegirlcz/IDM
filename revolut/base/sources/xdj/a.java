package xdj;

import ami.i;
import ami.l;
import ami.n;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import q06.f;
import r10.d;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c51.c f304479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cri.a f304480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u06.c f304481c;
    public final poi.b d;
    public final u06.a e;
    public final asi.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ux8.a f304482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bmi.a f304483h;
    public final jfa.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zvj.a f304484j;
    public final a16.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c51.a f304485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final th0.a f304486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f304487n;
    public final vy9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f304488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f304489q;

    public a(poi.b bVar, cri.a aVar, u06.a aVar2, bmi.a aVar3, c51.a aVar4, a16.a aVar5, u06.c cVar, c51.c cVar2, ux8.a aVar6, th0.a aVar7, jfa.a aVar8, asi.b bVar2, zvj.a aVar9) {
        this.f304479a = cVar2;
        this.f304480b = aVar;
        this.f304481c = cVar;
        this.d = bVar;
        this.e = aVar2;
        this.f = bVar2;
        this.f304482g = aVar6;
        this.f304483h = aVar3;
        this.i = aVar8;
        this.f304484j = aVar9;
        this.k = aVar5;
        this.f304485l = aVar4;
        this.f304486m = aVar7;
        int i = 24;
        this.f304487n = e4m.b.b(new vy9.a(this, 0, i));
        this.o = new vy9.a(this, 2, i);
        this.f304488p = e4m.b.b(new vy9.a(this, 1, i));
        this.f304489q = e4m.b.b(new vy9.a(this, 3, i));
    }

    public final d a() {
        com.revolut.analytics.tracking.v3.c deeplinkEventsTracker = this.d.e();
        l lVar = (l) this.f304488p.get();
        f fVar = (f) this.e.d.get();
        s.j(fVar);
        i templateProvider = new i(lVar, new t1j.b(fVar), new n(e4m.b.a(this.o), 0));
        Intrinsics.checkNotNullParameter(deeplinkEventsTracker, "deeplinkEventsTracker");
        Intrinsics.checkNotNullParameter(templateProvider, "templateProvider");
        d dVar = new d();
        dVar.f250818a = deeplinkEventsTracker;
        dVar.f250819b = templateProvider;
        return dVar;
    }
}
