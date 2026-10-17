package k8g;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelTransfersHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelHotelTransfersHomeScreen travelHotelTransfersHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelTransfersHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar2 = (com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f51822a;
        if (Intrinsics.f(str2, "FAQ_LOYALTY_PROGRAMME_ITEM_ID")) {
            str = "31907aa8-5916-404a-9d76-9f19342c6e0e";
        } else {
            if (!Intrinsics.f(str2, "FAQ_ACCOUNT_LINKING_ITEM_ID")) {
                throw new RuntimeException(j6.a.q("Unexpected click on item: ", str2));
            }
            str = "0a26263f-408e-47dd-980f-3f7f31694147";
        }
        aVar2.C1(u0.c(new FaqFeatureConfig.Starter(str, 2)));
        return Unit.f186387a;
    }
}
