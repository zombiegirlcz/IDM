package ycg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import y20.a1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsDatesPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsDatesPickerScreen;
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

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                travelHotelsDatesPickerScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a aVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a) ((g) travelHotelsDatesPickerScreen.O.getValue());
                vim.d dVar = ((d) ((j2) aVar3.f93955q.f22677a).getValue()).f312614b;
                if (dVar != null) {
                    aVar3.n2(new a1(aVar3, dVar, null, 21), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
