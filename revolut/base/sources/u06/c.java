package u06;

import l70.e;
import q06.l;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c51.c f276071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f276072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cri.a f276073c;
    public final poi.b d;
    public final e e;
    public final a16.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f276074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sse.a f276075h;
    public final e4m.e i;

    public c(poi.b bVar, cri.a aVar, e eVar, a aVar2, c51.a aVar3, a16.a aVar4, c51.c cVar) {
        this.f276071a = cVar;
        this.f276072b = aVar2;
        this.f276073c = aVar;
        this.d = bVar;
        this.e = eVar;
        this.f = aVar4;
        int i = 20;
        this.f276074g = e4m.b.b(new sse.a(this, 1, i));
        this.f276075h = new sse.a(this, 2, i);
        this.i = e4m.b.b(new sse.a(this, 0, i));
    }

    public final l a() {
        return (l) this.i.get();
    }
}
