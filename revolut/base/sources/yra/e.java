package yra;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardRecipientDetailsFeatureConfig;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PushToCardTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PushToCardTransferAmountScreen pushToCardTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pushToCardTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PushToCardTransferAmountScreen pushToCardTransferAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pushToCardTransferAmountScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) pushToCardTransferAmountScreen.T2();
                a aVar3 = xVar.f316201r;
                CardOwner recipient = ((j) xVar.t2()).f316175a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                xVar.C1(new BridgeDestination(new FeatureCommand(new PushToCardRecipientDetailsFeatureConfig(recipient))));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar2 = (x) pushToCardTransferAmountScreen.T2();
                xVar2.getClass();
                xVar2.l2(new u(xVar2, null, 2), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
