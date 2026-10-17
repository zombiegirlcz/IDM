package w9i;

import com.revolut.feature_restricted_access_malware.impl.flow.MaliciousSoftwarePromptFlowContract$InputData;
import cpi.g;
import h30.n;
import rf3.l;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f295738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f295739b;

    public b(a aVar, c cVar) {
        this.f295738a = aVar;
        this.f295739b = cVar;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f295739b;
        MaliciousSoftwarePromptFlowContract$InputData.Default r110 = cVar.f295740a;
        a aVar = this.f295738a;
        th0.a aVar2 = aVar.d;
        ih0.b bVarF = aVar2.f();
        s.j(bVarF);
        g gVarH = aVar2.h();
        f01.a aVar3 = (f01.a) aVar.f295737g.get();
        l lVar = (l) ((n) cVar.f295741b.e).f148906b.f224702x.get();
        s.j(lVar);
        return new com.revolut.feature_restricted_access_malware.impl.flow.a(r110, bVarF, gVarH, aVar3, new x9i.a(new fnc.s(lVar)));
    }
}
