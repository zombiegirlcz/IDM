package uac;

import ish.a0;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f278586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vac.a f278587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hsh.b f278588c;

    public j(ite.a aVar, vac.a aVar2, hsh.b bVar) {
        this.f278586a = aVar;
        this.f278587b = aVar2;
        this.f278588c = bVar;
    }

    public final ou5.b a() {
        gte.a aVarB = this.f278586a.b();
        s.j(aVarB);
        usc.a aVar = new usc.a(this.f278587b.b());
        kbc.b bVar = new kbc.b();
        kbc.c cVar = new kbc.c();
        a0 a0VarC = this.f278588c.c();
        s.j(a0VarC);
        return new ou5.b(aVarB, aVar, bVar, cVar, a0VarC);
    }
}
