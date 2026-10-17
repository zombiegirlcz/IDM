package z8k;

import com.revolut.feature.contacts.api.navigation.ContactFlowConfiguration;
import com.revolut.feature.contacts.api.navigation.ContactFlowFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PeerToPeerAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(PeerToPeerAmountScreen peerToPeerAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = peerToPeerAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.v, continuation, 0);
            case 1:
                return new q(this.v, continuation, 1);
            case 2:
                return new q(this.v, continuation, 2);
            case 3:
                return new q(this.v, continuation, 3);
            default:
                return new q(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        PeerToPeerAmountScreen peerToPeerAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) peerToPeerAmountScreen.T2()).H2(new z8h.b(6));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                peerToPeerAmountScreen.m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) peerToPeerAmountScreen.T2();
                if (!(((t) bVar.t2()).f320207a.f102270a instanceof zm3.p)) {
                    com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar4 = bVar.f102335r;
                    PeerToPeerRecipient recipient = ((t) bVar.t2()).f320207a;
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    bVar.C1(new BridgeDestination(new FeatureCommand(new ContactFlowFeatureConfig(new ContactFlowConfiguration(recipient.f102270a, null)))));
                }
                break;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar2 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) peerToPeerAmountScreen.T2();
                bVar2.E.Q();
                bVar2.l2(new m0(bVar2, continuation, 4), new yi5.b(26));
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar3 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) peerToPeerAmountScreen.T2();
                bVar3.E.Q();
                bVar3.N.f8426a.k(null);
                bVar3.l2(new m0(bVar3, continuation, 5), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
