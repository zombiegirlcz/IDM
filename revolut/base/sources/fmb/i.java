package fmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReviewProductDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(ReviewProductDetailsScreen reviewProductDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reviewProductDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReviewProductDetailsScreen reviewProductDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) reviewProductDetailsScreen.f3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) reviewProductDetailsScreen.f3();
                bVar.getClass();
                bVar.l2(new x0(1, bVar, null), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) reviewProductDetailsScreen.f3()).N2();
                break;
        }
        return Unit.f186387a;
    }
}
