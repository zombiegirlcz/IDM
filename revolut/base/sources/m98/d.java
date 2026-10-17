package m98;

import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardRequestReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CardRequestReviewScreen cardRequestReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardRequestReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        CardRequestReviewScreen cardRequestReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cardRequestReviewScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) cardRequestReviewScreen.f76728a0.getValue();
                pVar.getClass();
                pVar.l2(new lo.c(pVar, (Continuation) null, 26), new k(pVar, 0));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar2 = (p) cardRequestReviewScreen.f76728a0.getValue();
                jc8.a aVar4 = (jc8.a) ((f) pVar2.t2()).f203640c.getContent();
                if (aVar4 == null || (str = aVar4.f172748a) == null) {
                    throw new IllegalStateException("Cannot get card request id. Card request is null");
                }
                jc8.a aVar5 = (jc8.a) ((f) pVar2.t2()).f203640c.getContent();
                if (aVar5 == null) {
                    throw new IllegalStateException("Cannot get card designCode. Card request is null");
                }
                b93.b bVar = aVar5.f172750c;
                jc8.a aVar6 = (jc8.a) ((f) pVar2.t2()).f203640c.getContent();
                if (aVar6 == null) {
                    throw new IllegalStateException("Cannot get card virtual. Card request is null");
                }
                pVar2.l2(new ack.o(pVar2, aVar6.e, str, bVar, (Continuation) null, 15), new lrk.h(1, pVar2, p.class, "handleErrorFromApproveCardRequest", "handleErrorFromApproveCardRequest(Ljava/lang/Throwable;)Z", 0, 15));
                return Unit.f186387a;
        }
    }
}
