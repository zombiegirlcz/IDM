package com.revolut.feature.revolutpay.management.impl.ui.management.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public ProductArticleParams u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f84583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f84583w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f84583w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.v
            r2 = 2
            r3 = 1
            com.revolut.feature.revolutpay.management.impl.ui.management.flow.b r4 = r5.f84583w
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = r5.u
            yhm.o.b(r6)
            goto L4a
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            yhm.o.b(r6)
            goto L35
        L20:
            yhm.o.b(r6)
            x9c.d r6 = r4.o
            r5.v = r3
            r6.getClass()
            com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r1 = com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey.IntroWithRevPoints
            com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey r3 = com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey.IntroWithoutRevPoints
            java.lang.Object r6 = r6.a(r1, r3, r5)
            if (r6 != r0) goto L35
            goto L47
        L35:
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r6
            zja.a r1 = r4.f84584p
            r5.u = r6
            r5.v = r2
            kka.h r1 = (kka.h) r1
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r1 = r1.e(r6, r2, r5)
            if (r1 != r0) goto L48
        L47:
            return r0
        L48:
            r0 = r6
            r6 = r1
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5e
            yki.a r6 = r4.f84585q
            com.revolut.feature.revolutpay.management.impl.ui.management.flow.RevolutPayManagementFlowContract$Step$ProductArticle r1 = new com.revolut.feature.revolutpay.management.impl.ui.management.flow.RevolutPayManagementFlowContract$Step$ProductArticle
            r1.<init>(r0)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r6, r1, r0)
        L5e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.management.impl.ui.management.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
