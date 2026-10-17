package y9a;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public ProductArticleParams u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f311823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SkipShownArticleBehaviour f311824x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, SkipShownArticleBehaviour skipShownArticleBehaviour, Continuation continuation) {
        super(2, continuation);
        this.f311823w = rVar;
        this.f311824x = skipShownArticleBehaviour;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.f311823w, this.f311824x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductArticleParams productArticleParams;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        r rVar = this.f311823w;
        if (i == 0) {
            yhm.o.b(obj2);
            ProductArticleParams productArticleParamsA = aaa.a.ONBOARDING.a();
            zja.a aVar2 = rVar.o;
            this.u = productArticleParamsA;
            this.v = 1;
            Object objE = ((kka.h) aVar2).e(productArticleParamsA, this.f311824x, this);
            if (objE == aVar) {
                return aVar;
            }
            productArticleParams = productArticleParamsA;
            obj2 = objE;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductArticleParams productArticleParams2 = this.u;
            yhm.o.b(obj2);
            productArticleParams = productArticleParams2;
        }
        if (((Boolean) obj2).booleanValue()) {
            yji.l.j2(rVar, rVar.e1(new ProductArticleDescriptor(productArticleParams, this.f311824x, false, null, null, false, 60)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
        }
        return Unit.f186387a;
    }
}
