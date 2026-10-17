package t7e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f268654a;

    public k(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f268654a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig.ResolveBySubaccountType r6, java.util.Set r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof t7e.j
            if (r0 == 0) goto L13
            r0 = r8
            t7e.j r0 = (t7e.j) r0
            int r1 = r0.f268653y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268653y = r1
            goto L18
        L13:
            t7e.j r0 = new t7e.j
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f268651w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268653y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Set r6 = r0.v
            r7 = r6
            java.util.Set r7 = (java.util.Set) r7
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$ResolveBySubaccountType r6 = r0.u
            yhm.o.b(r8)
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r8)
            if (r7 == 0) goto Lba
            int r8 = r7.size()
            if (r8 != r3) goto Lba
            ang.f r8 = r5.f268654a
            r2 = 0
            efm.d0 r8 = r8.f(r2)
            r0.u = r6
            r2 = r7
            java.util.Set r2 = (java.util.Set) r2
            r0.v = r2
            r0.f268653y = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            do3.n r8 = (do3.n) r8
            wi0.b r8 = do3.q.y(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = zhm.d0.a0(r7)
            com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType r7 = (com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType) r7
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.O
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto La5
            boolean r8 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.Personal
            if (r8 == 0) goto L80
            com.revolut.feature.subaccount.impl.ui.create.flow.main.SubaccountProductArticleConfigResolver$PocketsProductArticleKey r7 = com.revolut.feature.subaccount.impl.ui.create.flow.main.SubaccountProductArticleConfigResolver$PocketsProductArticleKey.PERSONAL_POCKETS_CO
            goto La6
        L80:
            boolean r8 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.Group
            if (r8 == 0) goto L87
            com.revolut.feature.subaccount.impl.ui.create.flow.main.SubaccountProductArticleConfigResolver$PocketsProductArticleKey r7 = com.revolut.feature.subaccount.impl.ui.create.flow.main.SubaccountProductArticleConfigResolver$PocketsProductArticleKey.GROUP_POCKETS_CO
            goto La6
        L87:
            boolean r8 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.Joint
            if (r8 == 0) goto L8e
            com.revolut.feature.subaccount.impl.ui.create.flow.main.SubaccountProductArticleConfigResolver$PocketsProductArticleKey r7 = com.revolut.feature.subaccount.impl.ui.create.flow.main.SubaccountProductArticleConfigResolver$PocketsProductArticleKey.JOINT_POCKETS_CO
            goto La6
        L8e:
            boolean r8 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.RevPoints
            if (r8 != 0) goto La5
            boolean r8 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.Pro
            if (r8 != 0) goto La5
            boolean r8 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.ProTax
            if (r8 != 0) goto La5
            boolean r7 = r7 instanceof com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType.Junior
            if (r7 == 0) goto L9f
            goto La5
        L9f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        La5:
            r7 = r4
        La6:
            if (r7 == 0) goto Lba
            com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$Config r8 = new com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$Config
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r1.<init>(r7)
            r0.<init>(r1)
            boolean r6 = r6.f88930a
            r8.<init>(r0, r6)
            return r8
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t7e.k.a(com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig$ResolveBySubaccountType, java.util.Set, gim.c):java.lang.Object");
    }
}
