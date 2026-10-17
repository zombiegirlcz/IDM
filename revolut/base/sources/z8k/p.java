package z8k;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PeerToPeerAmountScreen peerToPeerAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0VarJ3 = this.v.T2();
        Object obj3 = suggestion.f53496h;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String suggestion2 = (String) obj3;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(suggestion2, "suggestion");
        bVar.x2(new j0(bVar, suggestion2, 1));
        return Unit.f186387a;
    }
}
