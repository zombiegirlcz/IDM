package gig;

import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreen;
import hfg.z;
import ip0.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesRecommendedFlightsScreen f144188w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelMilesRecommendedFlightsScreen travelMilesRecommendedFlightsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144188w = travelMilesRecommendedFlightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f144188w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f144188w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = null;
        hfg.y yVar = null;
        TravelMilesRecommendedFlightsScreen travelMilesRecommendedFlightsScreen = this.f144188w;
        switch (i) {
            case 0:
                y clickData = (y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = travelMilesRecommendedFlightsScreen.d();
                Intrinsics.h(clickData);
                s sVar = (s) oVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.f167226b.f58324n;
                if (obj4 instanceof iig.j) {
                    String str = ((iig.j) obj4).f161617a;
                    hfg.y yVar2 = ((g) ((j2) sVar.f144211t.f22677a).getValue()).f144191c;
                    sVar.C2(new m(str, yVar2 != null ? yVar2.f151900c : null));
                } else if (obj4 instanceof iig.a) {
                    sVar.l2(new r(sVar, obj4, null), new yi5.b(26));
                }
                break;
            default:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(list);
                koi.j item = (koi.j) d0.d0(list);
                if (item != null) {
                    s sVar2 = (s) travelMilesRecommendedFlightsScreen.d();
                    cli.y yVar3 = sVar2.f144211t;
                    Intrinsics.checkNotNullParameter(item, "item");
                    if (item instanceof TripDetailsDelegate.Model) {
                        String strE0 = kotlin.text.d0.e0(((TripDetailsDelegate.Model) item).f53563a, "RECOMMENDED_FLIGHTS_LOADING_ITEM_ID");
                        z zVar = (z) ((g) ((j2) yVar3.f22677a).getValue()).f144189a.getContent();
                        if (zVar != null) {
                            Iterator it8 = zVar.f151909h.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    Object next = it8.next();
                                    if (Intrinsics.f(((hfg.y) next).f151898a, strE0)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            yVar = (hfg.y) obj3;
                        }
                        if (yVar != null) {
                            sVar2.H2(yVar3, new gd3.i(yVar, 20));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
