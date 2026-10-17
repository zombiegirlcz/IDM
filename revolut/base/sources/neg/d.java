package neg;

import aw0.f4;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreen;
import ip0.r70;
import ip0.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsFiltersScreen f214513w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelHotelsFiltersScreen travelHotelsFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f214513w = travelHotelsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f214513w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f214513w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f214513w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f214513w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsFiltersScreen travelHotelsFiltersScreen = this.f214513w;
        switch (i) {
            case 0:
                f4 focusData = (f4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = travelHotelsFiltersScreen.R2();
                Intrinsics.h(focusData);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) nVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                if (Intrinsics.f(focusData.f10303a, "SMART_FILTERS_INPUT") && !focusData.f10304b) {
                    cVar.H2(cVar.f94039x, new p(cVar, 0));
                }
                break;
            case 1:
                Pair modelToRange = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = travelHotelsFiltersScreen.R2();
                Intrinsics.h(modelToRange);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) nVarE32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(modelToRange, "modelToRange");
                r70 r70Var = (r70) modelToRange.f186385a;
                Pair pair = (Pair) modelToRange.f186386b;
                Object obj3 = r70Var.f166134j;
                zfi.o oVar = obj3 instanceof zfi.o ? (zfi.o) obj3 : null;
                if (oVar != null) {
                    zfi.p pVar = oVar.f321987c;
                    dj0.d dVar = pVar.f321990c;
                    int iIntValue = ((Number) pair.f186385a).intValue();
                    int iIntValue2 = ((Number) pair.f186386b).intValue();
                    String str = oVar.f321985a;
                    xi0.b currency = dVar.f115083b;
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    dj0.d dVar2 = new dj0.d(cp5.d.k(currency) * ((long) iIntValue), currency);
                    xi0.b currency2 = dVar.f115083b;
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    cVar2.K2(new meg.e(str, new zfi.q(pVar, dVar2, new dj0.d(cp5.d.k(currency2) * ((long) iIntValue2), currency2))));
                }
                break;
            case 2:
                y clickData = (y) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE33 = travelHotelsFiltersScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) nVarE33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.f167226b.f58324n;
                meg.g gVar = obj4 instanceof meg.g ? (meg.g) obj4 : null;
                if (gVar != null) {
                    cVar3.K2(gVar);
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE34 = travelHotelsFiltersScreen.R2();
                Intrinsics.h(id10);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) nVarE34;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("MENU_ITEM_ID_CLEAR")) {
                    cVar4.H2(cVar4.f94039x, new nd8.i(7));
                }
                break;
        }
        return Unit.f186387a;
    }
}
