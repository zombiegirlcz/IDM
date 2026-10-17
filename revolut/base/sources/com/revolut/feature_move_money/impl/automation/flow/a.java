package com.revolut.feature_move_money.impl.automation.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlowContract$Step;
import gim.i;
import kka.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public ProductArticleParams u;
    public SkipShownArticleBehaviour.SkipIfWasAlreadyShown v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f97318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f97319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f97319x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f97319x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductArticleParams productArticleParams;
        SkipShownArticleBehaviour.SkipIfWasAlreadyShown skipIfWasAlreadyShown;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f97318w;
        b bVar = this.f97319x;
        if (i == 0) {
            o.b(obj2);
            productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("move-money-automations"));
            zja.a aVar2 = bVar.f97320p;
            this.u = productArticleParams;
            SkipShownArticleBehaviour.SkipIfWasAlreadyShown skipIfWasAlreadyShown2 = SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a;
            this.v = skipIfWasAlreadyShown2;
            this.f97318w = 1;
            obj2 = ((h) aVar2).e(productArticleParams, skipIfWasAlreadyShown2, this);
            if (obj2 == aVar) {
                return aVar;
            }
            skipIfWasAlreadyShown = skipIfWasAlreadyShown2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            skipIfWasAlreadyShown = this.v;
            productArticleParams = this.u;
            o.b(obj2);
        }
        oki.h.t2(bVar, bVar.f97321q, ((Boolean) obj2).booleanValue() ? new MoveMoneyAutomationFlowContract$Step.ProductArticleScreen(productArticleParams, skipIfWasAlreadyShown) : MoveMoneyAutomationFlowContract$Step.AutomationScreen.f97315a, false, null, false, 14);
        return Unit.f186387a;
    }
}
