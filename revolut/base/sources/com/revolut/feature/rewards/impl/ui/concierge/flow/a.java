package com.revolut.feature.rewards.impl.ui.concierge.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rewards.impl.ui.concierge.flow.ConciergeAlbertineFlowContract$Step;
import gim.i;
import kka.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f84909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f84909w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f84909w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.f84909w;
        String str = this.v;
        if (i == 0) {
            o.b(obj2);
            ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(str));
            zja.a aVar2 = bVar.f84910p;
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
            oki.h.u2(bVar, bVar.f84911q, new ConciergeAlbertineFlowContract$Step.ProductArticle(str), null, 6);
        } else {
            oki.h.u2(bVar, bVar.f84911q, ConciergeAlbertineFlowContract$Step.Details.f84907a, null, 6);
        }
        return Unit.f186387a;
    }
}
