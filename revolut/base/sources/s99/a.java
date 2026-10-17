package s99;

import t99.k;
import zu8.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements l89.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f261127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ila.b f261128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ore.b f261129c;
    public final ika.f d;
    public final sja.a e;
    public final qth.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f261130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f261131h = this;
    public final e4m.e i = e4m.b.b(new a2d.b(0, 8));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f261132j = e4m.b.b(new a2d.b(1, 8));

    public a(ika.f fVar, ila.b bVar, ore.b bVar2, xmg.a aVar, sja.a aVar2, qth.g gVar, c0 c0Var) {
        this.f261127a = aVar;
        this.f261128b = bVar;
        this.f261129c = bVar2;
        this.d = fVar;
        this.e = aVar2;
        this.f = gVar;
        this.f261130g = c0Var;
    }

    public final k a() {
        return (k) this.i.get();
    }

    public final i b() {
        ang.f fVarE = this.f261127a.e();
        ila.b bVar = this.f261128b;
        return new i(fVarE, bVar.b(), bVar.a(), new j());
    }
}
