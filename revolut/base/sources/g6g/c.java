package g6g;

import cli.y;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsItineraryPreviewScreen f140941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140941w = travelFlightsItineraryPreviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f140941w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f140941w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strE0;
        Integer numM;
        int iIntValue;
        int i = this.u;
        TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen = this.f140941w;
        switch (i) {
            case 0:
                ai aiVar = (ai) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) travelFlightsItineraryPreviewScreen.S.getValue();
                String tabId = aiVar.f53687a;
                y yVar = fVar.o;
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                if (!a0.H(tabId, "FLIGHTS_ITINERARY_PREVIEW_BOUND_", false)) {
                    tabId = null;
                }
                if (tabId != null && (strE0 = d0.e0(tabId, "FLIGHTS_ITINERARY_PREVIEW_BOUND_")) != null && (numM = z.m(strE0)) != null && (iIntValue = numM.intValue()) >= 0 && iIntValue < ((d) ((j2) yVar.f22677a).getValue()).f140942a.size()) {
                    fVar.H2(yVar, new a5g.i(iIntValue, 18));
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) travelFlightsItineraryPreviewScreen.S.getValue();
                Intrinsics.h(clickData);
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Intrinsics.f(clickData.f275445a, "SEPARATE_TICKETS_INFO_CLICK");
                break;
        }
        return Unit.f186387a;
    }
}
