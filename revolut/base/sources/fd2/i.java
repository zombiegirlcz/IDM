package fd2;

import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f133875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f133876b;

    public i(g gVar, j jVar) {
        this.f133875a = gVar;
        this.f133876b = jVar;
    }

    @Override // phm.a
    public final Object get() {
        IDealFlowDestination.InputData inputData = this.f133876b.f133877a;
        g gVar = this.f133875a;
        f80.a aVarX = gVar.f133868a.x();
        s.j(aVarX);
        q06.d dVarA = gVar.f133869b.a();
        s.j(dVarA);
        return new com.revolut.feature.apm.services.ideal.impl.ui.flow.a(inputData, aVarX, dVarA);
    }
}
