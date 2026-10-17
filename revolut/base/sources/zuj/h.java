package zuj;

import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.InitialMessage;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelItineraryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelItineraryScreen travelItineraryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelItineraryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar2 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) uVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof l) {
            puj.e eVar = (puj.e) ((n) ((j2) aVar2.z.f22677a).getValue()).f325497a.getContent();
            if (eVar != null && (str = eVar.f239915g) != null) {
                String message = !kotlin.text.d0.W(str) ? str : null;
                if (message != null) {
                    InitialMessage.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    aVar2.C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Assistant(null, new InitialMessage("tip", message, null, null, null), false, 5), null, new ChatEntryPoint("travel_itinerary"), 2), true));
                }
            }
        } else if (obj3 instanceof puj.b) {
            aVar2.J2((puj.b) obj3);
        }
        return Unit.f186387a;
    }
}
