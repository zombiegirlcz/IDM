package com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wa7.m;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements ob7.b {
    public final CreateSecretPhraseFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f74684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final za7.b f74685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f74686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f74687s;

    public c(CreateSecretPhraseFlowContract$InputData inputData, m hiddenAccountsInteractor, za7.b hiddenAccountsDialogProvider, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsDialogProvider, "hiddenAccountsDialogProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f74684p = hiddenAccountsInteractor;
        this.f74685q = hiddenAccountsDialogProvider;
        this.f74686r = productArticleInteractor;
        this.f74687s = d.a(this, new oa4.c(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ob7.d
            if (r0 == 0) goto L13
            r0 = r6
            ob7.d r0 = (ob7.d) r0
            int r1 = r0.f223890w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223890w = r1
            goto L18
        L13:
            ob7.d r0 = new ob7.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223890w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            zja.a r5 = r5.f74686r
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey r4 = com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey.SECRET_ACCOUNTS
            r2.<init>(r4)
            r6.<init>(r2)
            r0.f223890w = r3
            kka.h r5 = (kka.h) r5
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r5.e(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c.I2(com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74687s;
    }
}
