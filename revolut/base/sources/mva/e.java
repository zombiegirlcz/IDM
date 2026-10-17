package mva;

import vc.s;
import whf.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f209208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djf.c f209209b;

    public e(l70.e eVar, djf.c cVar) {
        this.f209208a = eVar;
        this.f209209b = cVar;
    }

    public final qva.e a() {
        l70.e eVar = this.f209208a;
        t70.g gVarO = eVar.o();
        s.j(gVarO);
        qva.c cVar = new qva.c(gVarO);
        qva.a aVar = new qva.a();
        qva.f fVar = new qva.f();
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        n nVarB = this.f209209b.b();
        s.j(nVarB);
        return new qva.e(cVar, aVar, fVar, eVarH, nVarB);
    }
}
