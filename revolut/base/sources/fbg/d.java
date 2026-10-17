package fbg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsCheckInInstructionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsCheckInInstructionsScreen travelHotelsCheckInInstructionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsCheckInInstructionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(model);
        l lVar = (l) hVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "PHONE_ITEM_ID") || Intrinsics.f(str, "EMAIL_ITEM_ID")) {
            Object obj3 = model.u;
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 != null) {
                lVar.f133556r.c(str2, str2, false, new es.e(lVar, 21));
            }
        }
        return Unit.f186387a;
    }
}
