package l9k;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PeerToPeerReviewScreen peerToPeerReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        SuggestionsBarDelegate.Suggestion item = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(item);
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar2 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        vrf.h hVar = aVar2.f102372x;
        xrf.b bVar = (xrf.b) hVar;
        bVar.b(item.f53496h, item.f53492a);
        return Unit.f186387a;
    }
}
