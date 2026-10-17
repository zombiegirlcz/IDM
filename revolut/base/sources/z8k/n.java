package z8k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PeerToPeerAmountScreen peerToPeerAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0VarJ3 = this.v.T2();
        String note = textData.f52598b.toString();
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) e0VarJ3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        bVar.x2(new yrk.e(bVar, 12, note, bVar.F2()));
        return Unit.f186387a;
    }
}
