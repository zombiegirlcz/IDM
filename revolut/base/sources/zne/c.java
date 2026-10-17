package zne;

import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$State;
import com.revolut.feature.tax_residency.impl.flows.list.TaxResidenciesListFlowContract$Step;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koe.i;
import koe.j;
import koe.k;
import koe.l;
import koe.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.flows.list.b f323810b;

    public /* synthetic */ c(com.revolut.feature.tax_residency.impl.flows.list.b bVar, int i) {
        this.f323809a = i;
        this.f323810b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323809a) {
            case 0:
                m result = (m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof i;
                com.revolut.feature.tax_residency.impl.flows.list.b bVar = this.f323810b;
                if (z) {
                    bVar.L2(TaxResidenciesListFlowContract$State.a((TaxResidenciesListFlowContract$State) bVar.A2().f98429a, ((i) result).f186317a));
                    bVar.O2(null);
                } else if (result instanceof l) {
                    bVar.O2(((l) result).f186322a);
                } else if (result instanceof k) {
                    bVar.L2(TaxResidenciesListFlowContract$State.a((TaxResidenciesListFlowContract$State) bVar.A2().f98429a, ((k) result).f186321a));
                    wi0.b bVar2 = ((TaxResidenciesListFlowContract$State) bVar.A2().f98429a).f90029a;
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    List list = ((TaxResidenciesListFlowContract$State) bVar.A2().f98429a).f90030b;
                    if (list == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    List list2 = ((TaxResidenciesListFlowContract$State) bVar.A2().f98429a).f90031c;
                    if (list2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    bVar.G2(new b(bVar2, list, list2));
                } else {
                    if (!(result instanceof j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TaxResidenciesListFlowContract$State taxResidenciesListFlowContract$State = (TaxResidenciesListFlowContract$State) bVar.A2().f98429a;
                    j jVar = (j) result;
                    wi0.b bVar3 = jVar.f186318a;
                    List list3 = jVar.f186319b;
                    List list4 = jVar.f186320c;
                    taxResidenciesListFlowContract$State.getClass();
                    bVar.L2(new TaxResidenciesListFlowContract$State(bVar3, list3, list4));
                    if (bVar.f90035t.e) {
                        bVar.n2(new com.revolut.feature.tax_residency.impl.flows.list.a(bVar, null), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            default:
                goe.b result2 = (goe.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z3 = result2.f145154c;
                com.revolut.feature.tax_residency.impl.flows.list.b bVar4 = this.f323810b;
                if (z3) {
                    bVar4.I2();
                } else {
                    int i = 0;
                    if (result2.f145153b) {
                        TaxResidenciesListFlowContract$InputData taxResidenciesListFlowContract$InputData = bVar4.f90035t;
                        bVar4.E2(new TaxResidenciesListFlowContract$Step.TaxResidenciesList(null, taxResidenciesListFlowContract$InputData.f90022c, taxResidenciesListFlowContract$InputData.d, taxResidenciesListFlowContract$InputData.f90020a), false, null, false);
                    } else {
                        f fVar = result2.f145152a;
                        List list5 = ((TaxResidenciesListFlowContract$State) bVar4.A2().f98429a).f90030b;
                        if (list5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        int size = list5.size();
                        ArrayList arrayListF1 = d0.f1(list5);
                        Iterator it8 = arrayListF1.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                i = -1;
                            } else if (!Intrinsics.f(((f) it8.next()).f323482a, fVar.f323482a)) {
                                i++;
                            }
                        }
                        if (i >= 0) {
                            arrayListF1.set(i, fVar);
                        } else {
                            arrayListF1.add(size, fVar);
                        }
                        bVar4.L2(TaxResidenciesListFlowContract$State.a((TaxResidenciesListFlowContract$State) bVar4.A2().f98429a, arrayListF1));
                        bVar4.u.onNext(arrayListF1);
                        bVar4.v.onNext(Unit.f186387a);
                    }
                }
                return Unit.f186387a;
        }
    }
}
