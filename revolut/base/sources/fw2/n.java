package fw2;

import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da3.j f138567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final og1.j f138568b;

    public n(da3.j jVar, og1.j jVar2) {
        this.f138567a = jVar;
        this.f138568b = jVar2;
    }

    public final lw2.a a() {
        da3.j jVar = this.f138567a;
        m93.a aVarA = jVar.a();
        s.j(aVarA);
        l93.f fVarJ = jVar.j();
        s.j(fVarJ);
        return new lw2.a(aVarA, fVarJ);
    }

    public final k7i.i b() {
        l93.f fVarJ = this.f138567a.j();
        s.j(fVarJ);
        tg1.a aVarA = this.f138568b.a();
        s.j(aVarA);
        return new k7i.i(fVarJ, aVarA);
    }
}
