package gc1;

import com.revolut.feature.acquiring.card_reader.order.api.navigation.CardReaderOrderFlowDestination;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.card_reader_settings.CardReaderSettingsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardReaderSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CardReaderSettingsScreen cardReaderSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardReaderSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarG3 = this.v.T2();
        String actionItemId = yVar.f167226b.f58316a;
        q controllerModel = (q) lVarG3;
        controllerModel.getClass();
        Intrinsics.checkNotNullParameter(actionItemId, "actionItemId");
        int iHashCode = actionItemId.hashCode();
        if (iHashCode != -1592173178) {
            if (iHashCode != -538844613) {
                if (iHashCode == 2062291115 && actionItemId.equals("ACTION_ITEM_ORDER")) {
                    controllerModel.f142308q.getClass();
                    Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                    controllerModel.C1(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) CardReaderOrderFlowDestination.f60589a, false, (Integer) null, 0, 61))));
                }
            } else if (actionItemId.equals("ACTION_ITEM_LOCATIONS")) {
                controllerModel.n2(new p(controllerModel, null, 0), new whi.b(6));
            }
        } else if (actionItemId.equals("ACTION_ITEM_SETTINGS")) {
            controllerModel.v2(k.f142304a);
        }
        return Unit.f186387a;
    }
}
