package nd3;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n8i.q0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.cashback.impl.ui.yourcashback.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.cashback.impl.ui.yourcashback.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.cashback.impl.ui.yourcashback.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = com.revolut.feature.cashback.impl.ui.yourcashback.b.O2(bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ProductArticleParams productArticleParams = (ProductArticleParams) obj2;
        if (productArticleParams != null) {
            bVar.f2(bVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new q0(26));
        }
        return Unit.f186387a;
    }
}
