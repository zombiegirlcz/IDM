package l9k;

import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PeerToPeerReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PeerToPeerReviewScreen peerToPeerReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = peerToPeerReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PeerToPeerReviewScreen peerToPeerReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                peerToPeerReviewScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                peerToPeerReviewScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar4 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) peerToPeerReviewScreen.R2();
                aVar4.getClass();
                aVar4.l2(new s(aVar4, null, 1), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
