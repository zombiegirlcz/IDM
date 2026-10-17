package lig;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lk0.h;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ TravelMilesFlightLocationPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelMilesFlightLocationPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.d();
        lk0.g gVar = ((g) ((j2) pVar.f195525t.f22677a).getValue()).f195510c;
        if (gVar != null) {
            if (gVar.f196174a.size() == 1) {
                a2 a2Var = pVar.f195524s;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                pVar.f195524s = pVar.l2(new kze.h(pVar, null, 19), new yi5.b(26));
            } else {
                pVar.f195522q.f288625b.onNext(h.b.f196176a);
            }
        }
        return Unit.f186387a;
    }
}
