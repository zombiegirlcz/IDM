package ibh;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f160179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f160180c;
    public final a31.a d;

    public c(r5a.b bVar, r5a.b bVar2, a31.a aVar) {
        this.f160179b = bVar;
        this.f160180c = bVar2;
        this.d = aVar;
    }

    @Override // b60.a
    public final Object a() {
        yah.a aVar = (yah.a) this.f160179b.get();
        h9h.a aVar2 = (h9h.a) this.f160180c.get();
        c4f.a aVar3 = (c4f.a) ((phm.a) this.d.f955b).get();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        return new b(aVar, aVar2, aVar3);
    }
}
