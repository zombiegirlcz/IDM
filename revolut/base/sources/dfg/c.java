package dfg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsTravellerInformationEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsTravellerInformationEditScreen travelHotelsTravellerInformationEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsTravellerInformationEditScreen;
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
        afi.a aVar;
        int i = this.u;
        TravelHotelsTravellerInformationEditScreen travelHotelsTravellerInformationEditScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                travelHotelsTravellerInformationEditScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c cVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c) ((g) travelHotelsTravellerInformationEditScreen.P.getValue());
                TravelHotelsTravellerInformationEditScreenContract$InputData travelHotelsTravellerInformationEditScreenContract$InputData = cVar.o;
                if (travelHotelsTravellerInformationEditScreenContract$InputData instanceof TravelHotelsTravellerInformationEditScreenContract$InputData.Booking) {
                    cVar.B2();
                } else {
                    if (!(travelHotelsTravellerInformationEditScreenContract$InputData instanceof TravelHotelsTravellerInformationEditScreenContract$InputData.Draft)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y yVar = cVar.f94076s;
                    if (Intrinsics.f(((e) ((j2) yVar.f22677a).getValue()).d, Boolean.TRUE) && (aVar = ((e) ((j2) yVar.f22677a).getValue()).f113892a) != null) {
                        cVar.l2(new d3i.g(cVar, aVar, null, 21), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }
}
