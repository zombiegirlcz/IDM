package nhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a;
import hfg.i0;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f f215460b;

    public /* synthetic */ b0(com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar, int i) {
        this.f215459a = i;
        this.f215460b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f215459a) {
            case 0:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b domainState = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a aVar = domainState.f94326h;
                boolean z3 = !this.f215460b.J2() || ((aVar instanceof r) || (aVar instanceof a.d) || (aVar instanceof a.C0575a));
                lk0.g gVar = domainState.d;
                if (gVar != null) {
                    List list = gVar.f196174a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        lk0.e eVar = (lk0.e) list.get(i);
                        if (eVar.f196173c || !eVar.f196171a.isEmpty()) {
                            z = false;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 1:
                whg.c output = (whg.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                i0 i0Var = output.f297651a;
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = this.f215460b;
                cli.y yVar = fVar.u;
                if (i0Var != ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).e) {
                    fVar.H2(yVar, new nfj.l(output.f297651a, 11));
                    fVar.M2(a.b.f94319a);
                }
                break;
            case 2:
                rhg.k output2 = (rhg.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = output2.f254454a;
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar2 = this.f215460b;
                cli.y yVar2 = fVar2.u;
                if (!Intrinsics.f(travelMilesSearchAppliedFilters, ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar2.f22677a).getValue()).f)) {
                    fVar2.H2(yVar2, new l3d.f(output2.f254454a, output2.f254455b, 11));
                    fVar2.M2(a.b.f94319a);
                }
                break;
            case 3:
                lig.k outputData = (lig.k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar3 = this.f215460b;
                fVar3.H2(fVar3.u, new ghg.o(fVar3, outputData, 3));
                fVar3.M2(a.b.f94319a);
                break;
            case 4:
                lig.k outputData2 = (lig.k) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar4 = this.f215460b;
                fVar4.H2(fVar4.u, new ghg.o(fVar4, outputData2, 2));
                fVar4.M2(a.b.f94319a);
                break;
            default:
                ehg.e outputData3 = (ehg.e) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                LocalDate localDate = outputData3.f126188a;
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar5 = this.f215460b;
                fVar5.H2(fVar5.u, new a15.l(18, localDate));
                fVar5.M2(a.b.f94319a);
                break;
        }
        return Unit.f186387a;
    }
}
