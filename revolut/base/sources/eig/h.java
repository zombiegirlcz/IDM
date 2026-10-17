package eig;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesMainScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelMilesMainScreen travelMilesMainScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesMainScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) lVarD3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        if (iHashCode != -2115518642) {
            if (iHashCode != 1246412532) {
                if (iHashCode == 2097956334 && str.equals("TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID")) {
                    eVar.C2(b.a.C0578b.f94369a);
                }
            } else if (str.equals("AIRLINE_INFO_CONFIRMATION_BUTTON_ITEM_ID")) {
                eVar.u.Z2(new com.revolut.feature.travel.miles.impl.ui.screen.main.c(eVar, model, null));
            }
        } else if (str.equals("AIRLINES_SEE_ALL_BUTTON_ITEM_ID")) {
            eVar.H2(eVar.D, new efb.i(27));
        }
        return Unit.f186387a;
    }
}
