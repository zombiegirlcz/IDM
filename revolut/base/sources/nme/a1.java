package nme;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f u;
    public final /* synthetic */ ProductArticleParams v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, ProductArticleParams productArticleParams, Continuation continuation) {
        super(2, continuation);
        this.u = fVar;
        this.v = productArticleParams;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a1(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ProductArticleDescriptor productArticleDescriptor = new ProductArticleDescriptor(this.v, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60);
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = this.u;
        yji.l.j2(fVar, fVar.e1(productArticleDescriptor), null, null, 3);
        return Unit.f186387a;
    }
}
