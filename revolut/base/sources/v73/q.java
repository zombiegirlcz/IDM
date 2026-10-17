package v73;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import v6l.b0;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        r rVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            x9c.d dVar = rVar.f286552l;
            this.u = 1;
            dVar.getClass();
            obj2 = dVar.a(RevolutPayArticleKey.InfoWithRevPoints, RevolutPayArticleKey.InfoWithoutRevPoints, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        yji.n.P2(rVar, rVar.o2(new ProductArticleDescriptor((ProductArticleParams) obj2, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60)), null, new b0(22), 1);
        return Unit.f186387a;
    }
}
