package f1g;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ a61.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FeatureCommand f131264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a61.a aVar, FeatureCommand featureCommand, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f131264w = featureCommand;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f131264w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        a61.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            d dVar = (d) aVar2.f1531b;
            this.u = 1;
            obj2 = dVar.a(this);
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
        FeatureCommand featureCommand = this.f131264w;
        if (productArticleParams == null) {
            return featureCommand;
        }
        return new FeatureCommand(cka.b.a((qka.c) aVar2.f1532c, productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, new ProductArticleCommandInterceptor(featureCommand, null, null, featureCommand, 6), null, null, SyslogConstants.LOG_CLOCK));
    }
}
