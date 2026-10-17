package zag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zab.s;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsBookingAmendmentDatesPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsBookingAmendmentDatesPickerScreen travelHotelsBookingAmendmentDatesPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsBookingAmendmentDatesPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsBookingAmendmentDatesPickerScreen travelHotelsBookingAmendmentDatesPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) ((j) travelHotelsBookingAmendmentDatesPickerScreen.O.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) ((j) travelHotelsBookingAmendmentDatesPickerScreen.O.getValue());
                vim.d dVar = ((d) ((j2) aVar3.u.f22677a).getValue()).f320689c;
                if (dVar != null) {
                    aVar3.A1(new yv1.k(aVar3, dVar, null, 29), new s(1, aVar3, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 7));
                }
                break;
        }
        return Unit.f186387a;
    }
}
