package com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow;

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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b r4 = r6.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L65
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L30
        L1e:
            yhm.o.b(r7)
            fbj.a r7 = r4.f100056p
            efm.d0 r7 = r7.validateRestriction()
            r6.u = r3
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L30
            goto L64
        L30:
            wk5.n r7 = (wk5.n) r7
            if (r7 != 0) goto L36
            r7 = -1
            goto L3e
        L36:
            int[] r1 = xbj.d.f304084a
            int r7 = r7.ordinal()
            r7 = r1[r7]
        L3e:
            if (r7 == r3) goto L81
            if (r7 != r2) goto L7b
            com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput r7 = r4.o
            boolean r7 = r7.getE()
            if (r7 == 0) goto L77
            zja.a r7 = r4.f100058r
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r3 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.retail.feature.crypto_deposits.impl.navigation.CryptoReceiveProductArticleKey r5 = com.revolut.retail.feature.crypto_deposits.impl.navigation.CryptoReceiveProductArticleKey.RECEIVE
            r3.<init>(r5)
            r1.<init>(r3)
            r6.u = r2
            kka.h r7 = (kka.h) r7
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r7 = r7.e(r1, r2, r6)
            if (r7 != r0) goto L65
        L64:
            return r0
        L65:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L77
            yki.i r7 = r4.f100059s
            com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlowContract$Step$ProductArticle r0 = com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlowContract$Step.ProductArticle.f100054a
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r1 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r7, r0, r1)
            goto L8a
        L77:
            r4.I2()
            goto L8a
        L7b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L81:
            yki.i r7 = r4.f100059s
            com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlowContract$Step$Restricted r0 = com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlowContract$Step.Restricted.f100055a
            com.revolut.kompot.common.ModalDestination$Style$POPUP r1 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r7, r0, r1)
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
