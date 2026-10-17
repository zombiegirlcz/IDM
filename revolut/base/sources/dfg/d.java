package dfg;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreen;
import dcl.m0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsTravellerInformationEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsTravellerInformationEditScreen travelHotelsTravellerInformationEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsTravellerInformationEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        Intrinsics.h(textData);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c cVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c) gVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        cVar.H2(cVar.f94076s, new m0(cVar, textData, 12));
        return Unit.f186387a;
    }
}
