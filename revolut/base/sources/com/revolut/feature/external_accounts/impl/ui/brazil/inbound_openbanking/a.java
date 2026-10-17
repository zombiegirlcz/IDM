package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking;

import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.BrazilInboundOpenbankingFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kka.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            if (!bVar.o.f72249a) {
                zja.a aVar2 = bVar.f72596p;
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("pix-add-money-with-a-tap-standalone"));
                this.u = 1;
                obj2 = ((h) aVar2).e(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            oki.h.t2(bVar, bVar.f72599s, flowStep, false, null, false, 12);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        FlowStep flowStep = ((Boolean) obj2).booleanValue() ? BrazilInboundOpenbankingFlowContract$Step.PixSmartTransferProductArticle.f72595a : BrazilInboundOpenbankingFlowContract$Step.BankSelection.f72589a;
        oki.h.t2(bVar, bVar.f72599s, flowStep, false, null, false, 12);
        return Unit.f186387a;
    }
}
