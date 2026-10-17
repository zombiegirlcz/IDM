package com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.J2(r5, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.J2(r5, r7) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b r5 = r7.v
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            yhm.o.b(r8)
            goto L6c
        L1e:
            yhm.o.b(r8)
            goto L48
        L22:
            yhm.o.b(r8)
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData r8 = r5.o
            boolean r8 = r8.getF100062a()
            if (r8 == 0) goto L63
            zja.a r8 = r5.v
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositProductArticleKey r6 = com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositProductArticleKey.f100066a
            r2.<init>(r6)
            r1.<init>(r2)
            r7.u = r4
            kka.h r8 = (kka.h) r8
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r8 = r8.e(r1, r2, r7)
            if (r8 != r0) goto L48
            goto L6b
        L48:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5a
            yki.i r8 = r5.z
            com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$Step$ProductArticle r0 = com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$Step.ProductArticle.f100065a
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r1 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r8, r0, r1)
            goto L6c
        L5a:
            r7.u = r3
            java.lang.Object r8 = com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.J2(r5, r7)
            if (r8 != r0) goto L6c
            goto L6b
        L63:
            r7.u = r2
            java.lang.Object r8 = com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b.J2(r5, r7)
            if (r8 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
