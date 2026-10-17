package com.revolut.feature.apm.payid.impl.screen.area;

import com.revolut.feature.apm.payid.impl.screen.area.AreaScreenContract$ModalStep;
import com.revolut.feature.apm.payid.impl.screen.area.intro.PayIdIntroArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kka.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            zja.a aVar2 = cVar.f62718t;
            ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PayIdIntroArticleKey.f62719a));
            this.u = 1;
            obj2 = ((h) aVar2).e(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            oki.h.v2(cVar.v, AreaScreenContract$ModalStep.Intro.f62709a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
