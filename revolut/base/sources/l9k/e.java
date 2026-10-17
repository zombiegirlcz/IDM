package l9k;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PeerToPeerReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PeerToPeerReviewScreen peerToPeerReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = peerToPeerReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar2 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) this.u.R2();
        aVar2.f102368r.x(((bqf.e) aVar2.f102370t).b());
        return Unit.f186387a;
    }
}
