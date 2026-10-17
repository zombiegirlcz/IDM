package ktl;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f189571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f189572c;
    public final a31.a d;

    public b(uhc.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f189571b = aVar;
        this.f189572c = aVar2;
        this.d = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        trl.a aVar = (trl.a) this.f189571b.get();
        ae9.a aVar2 = (ae9.a) ((phm.a) this.f189572c.f955b).get();
        h9h.a aVar3 = (h9h.a) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        return new a(aVar, aVar2, aVar3);
    }
}
