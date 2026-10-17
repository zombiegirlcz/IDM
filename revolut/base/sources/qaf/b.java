package qaf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zja.a f244030a;

    public b(zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.f244030a = productArticleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qaf.a
            if (r0 == 0) goto L13
            r0 = r7
            qaf.a r0 = (qaf.a) r0
            int r1 = r0.f244029x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244029x = r1
            goto L18
        L13:
            qaf.a r0 = new qaf.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f244029x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.feature.product_article.api.models.ProductArticleKey r6 = r0.u
            yhm.o.b(r7)
            goto L9b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.Isa
            r2 = 0
            if (r7 == 0) goto L41
            com.revolut.feature.trading.transfer.investments.impl.comms.IsaIncomingTransfersArticleKey r6 = new com.revolut.feature.trading.transfer.investments.impl.comms.IsaIncomingTransfersArticleKey
            r6.<init>(r2)
            goto L7d
        L41:
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa.Personal
            if (r7 == 0) goto L4b
            com.revolut.feature.trading.transfer.investments.impl.comms.PersonalJisaIncomingTransfersArticleKey r6 = new com.revolut.feature.trading.transfer.investments.impl.comms.PersonalJisaIncomingTransfersArticleKey
            r6.<init>(r2)
            goto L7d
        L4b:
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa.Custodian
            if (r7 == 0) goto L55
            com.revolut.feature.trading.transfer.investments.impl.comms.CustodianJisaIncomingTransfersArticleKey r6 = new com.revolut.feature.trading.transfer.investments.impl.comms.CustodianJisaIncomingTransfersArticleKey
            r6.<init>(r2)
            goto L7d
        L55:
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.Pea
            if (r7 != 0) goto L7c
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA
            if (r7 != 0) goto L7c
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Margin
            if (r7 != 0) goto L7c
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.MoneyMarketFunds
            if (r7 != 0) goto L7c
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo
            if (r7 != 0) goto L7c
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.Unknown
            if (r7 != 0) goto L7c
            boolean r7 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.PaperTrading
            if (r7 != 0) goto L7c
            boolean r6 = r6 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Unknown
            if (r6 == 0) goto L76
            goto L7c
        L76:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L7c:
            r6 = r4
        L7d:
            if (r6 != 0) goto L80
            goto La4
        L80:
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r2.<init>(r6)
            r7.<init>(r2)
            r0.u = r6
            r0.f244029x = r3
            zja.a r2 = r5.f244030a
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r7 = r2.e(r7, r3, r0)
            if (r7 != r1) goto L9b
            return r1
        L9b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La4
            return r6
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qaf.b.a(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, gim.c):java.lang.Object");
    }
}
