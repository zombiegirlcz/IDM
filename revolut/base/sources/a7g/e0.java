package a7g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchContext;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.search_results.b f1885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1885w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f1885w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f1885w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(this.f1885w, continuation, 2);
                e0Var3.v = obj2;
                return e0Var3;
            default:
                e0 e0Var4 = new e0(this.f1885w, continuation, 3);
                e0Var4.v = obj2;
                return e0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e0) create((FlightSearchContext) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e0) create((FlightSearchFilterOptions) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((FlightSearchRequestFilters) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 4;
        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = this.f1885w;
        switch (i) {
            case 0:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(gVar);
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                lk0.e eVar = (lk0.e) zhm.d0.o0(gVar.f196174a);
                if (v04.b.h(eVar != null ? eVar.e : null)) {
                    bVar.f93426t.Z2(new a2g.a(bVar, i2));
                }
                bVar.H2(bVar.f93427w, new a3e.s(gVar, 1));
                break;
            case 1:
                FlightSearchContext flightSearchContext = (FlightSearchContext) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f93427w, new a7b.r(flightSearchContext, i2));
                break;
            case 2:
                FlightSearchFilterOptions flightSearchFilterOptions = (FlightSearchFilterOptions) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f93427w, new a7b.r(flightSearchFilterOptions, 5));
                break;
            default:
                FlightSearchRequestFilters flightSearchRequestFilters = (FlightSearchRequestFilters) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f93427w, new a7b.r(flightSearchRequestFilters, 6));
                break;
        }
        return Unit.f186387a;
    }
}
