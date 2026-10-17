package fmb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class w0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar = this.v;
            SavingsProduct.Campaign campaign = ((r) ((j2) bVar.L.f22677a).getValue()).c().f214169a.f86683a.o;
            if (campaign == null || (str = campaign.f) == null) {
                return null;
            }
            this.u = 1;
            if (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b.J2(bVar, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
