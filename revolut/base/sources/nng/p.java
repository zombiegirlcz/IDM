package nng;

/* JADX INFO: loaded from: classes13.dex */
public final class p implements aog.b, tng.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f217673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf0.f f217674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oai.a f217675c;
    public final ite.a d;
    public final gvh.a e;
    public final co0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf0.a f217676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xp.a f217677h;
    public final oh1.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f217678j = this;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f217679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f217680m;

    public p(oh1.c cVar, xp.a aVar, l70.e eVar, cf0.f fVar, sd0.c cVar2, nf0.a aVar2, ite.a aVar3, co0.a aVar4, oai.a aVar5, gvh.a aVar6) {
        this.f217673a = eVar;
        this.f217674b = fVar;
        this.f217675c = aVar5;
        this.d = aVar3;
        this.e = aVar6;
        this.f = aVar4;
        this.f217676g = aVar2;
        this.f217677h = aVar;
        this.i = cVar;
        int i = 17;
        this.k = e4m.b.b(new mva.a(this, 1, i));
        this.f217679l = e4m.b.b(new mva.a(this, 0, i));
        this.f217680m = e4m.b.b(new mva.a(this, 2, i));
    }

    @Override // aog.b
    public final aog.a b() {
        return new h(this.f217678j);
    }

    @Override // tng.b
    public final tng.a q() {
        return new d(this.f217678j);
    }
}
