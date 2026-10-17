package hm3;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.retail.feature.plan_gifting.api.articles.PlanGiftingArticleKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function1 {
    public ProductArticleParams u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f153531w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Continuation continuation) {
        super(1, continuation);
        this.f153531w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f153531w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductArticleParams productArticleParams;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        SkipShownArticleBehaviour.SkipIfWasAlreadyShown skipIfWasAlreadyShown = SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a;
        j jVar = this.f153531w;
        if (i == 0) {
            o.b(obj2);
            ProductArticleParams productArticleParams2 = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PlanGiftingArticleKey.SENDER_INTRO_PROFILE));
            zja.a aVar2 = jVar.f153533l;
            this.u = productArticleParams2;
            this.v = 1;
            Object objE = ((kka.h) aVar2).e(productArticleParams2, skipIfWasAlreadyShown, this);
            if (objE == aVar) {
                return aVar;
            }
            productArticleParams = productArticleParams2;
            obj2 = objE;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductArticleParams productArticleParams3 = this.u;
            o.b(obj2);
            productArticleParams = productArticleParams3;
        }
        if (((Boolean) obj2).booleanValue()) {
            return jVar.o2(new ProductArticleDescriptor(productArticleParams, skipIfWasAlreadyShown, false, null, null, false, 56));
        }
        return null;
    }
}
