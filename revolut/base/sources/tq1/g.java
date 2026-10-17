package tq1;

import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f273494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f273495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f273496c;

    public g(d dVar, h hVar, int i) {
        this.f273494a = dVar;
        this.f273495b = hVar;
        this.f273496c = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f273494a;
        int i = this.f273496c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            vq1.e eVar = (vq1.e) dVar.f273484a.f.get();
            s.j(eVar);
            return new cr1.a(eVar);
        }
        h hVar = this.f273495b;
        PagoPAFlowDestination.InputData inputData = hVar.f273497a;
        ar1.b bVar = (ar1.b) hVar.d.get();
        sf0.h hVarB = dVar.f273485b.b();
        s.j(hVarB);
        return new com.revolut.feature.apm.bills.pagopa.impl.ui.flow.a(inputData, bVar, hVarB);
    }
}
