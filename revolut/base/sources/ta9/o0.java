package ta9;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f269262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f269263c;
    public final a31.a d;
    public final a31.a e;
    public final phm.a f;

    public o0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, sse.a aVar5) {
        this.f269262b = aVar;
        this.f269263c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        ore.b bVar = (ore.b) ((phm.a) this.f269262b.f955b).get();
        q8b.a aVar = (q8b.a) ((phm.a) this.f269263c.f955b).get();
        ite.a aVar2 = (ite.a) ((phm.a) this.d.f955b).get();
        jk3.c cVar = (jk3.c) ((phm.a) this.e.f955b).get();
        e0 e0Var = (e0) this.f.get();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        e0Var.getClass();
        return new b0(bVar, aVar, aVar2, cVar, e0Var);
    }
}
