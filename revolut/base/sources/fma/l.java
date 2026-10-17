package fma;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cri.b f136202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8l.a f136203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cri.a f136204c;

    public l(p8l.a aVar, cri.b bVar, cri.a aVar2) {
        this.f136202a = bVar;
        this.f136203b = aVar;
        this.f136204c = aVar2;
    }

    public final jma.f a() {
        wli.x xVarD = ((s41.a) this.f136202a).d();
        u79.a aVar = (u79.a) ((s79.b) ((t8l.a) this.f136203b).f268903a).f260594g.get();
        vc.s.j(aVar);
        sri.m mVarD = ((g8b.a) this.f136204c).d();
        vc.s.j(mVarD);
        return new jma.f(xVarD, aVar, mVarD);
    }
}
