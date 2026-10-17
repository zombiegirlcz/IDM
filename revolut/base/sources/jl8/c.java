package jl8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f175640a;

    public c(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f175640a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof jl8.a
            if (r0 == 0) goto L13
            r0 = r5
            jl8.a r0 = (jl8.a) r0
            int r1 = r0.f175637w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175637w = r1
            goto L18
        L13:
            jl8.a r0 = new jl8.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175637w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L50
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ang.f r5 = r4.f175640a     // Catch: java.lang.Exception -> L27
            r2 = 0
            efm.d0 r5 = r5.f(r2)     // Catch: java.lang.Exception -> L27
            r0.f175637w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = nim.a.b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Exception -> L27
            do3.n r5 = (do3.n) r5     // Catch: java.lang.Exception -> L27
            wi0.b r5 = do3.q.y(r5)     // Catch: java.lang.Exception -> L27
            return r5
        L50:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jl8.c.a(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jl8.b
            if (r0 == 0) goto L13
            r0 = r6
            jl8.b r0 = (jl8.b) r0
            int r1 = r0.f175639x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175639x = r1
            goto L18
        L13:
            jl8.b r0 = new jl8.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f175639x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f175639x = r3
            java.io.Serializable r6 = r4.a(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            wi0.b r6 = (wi0.b) r6
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.X0
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r6 == 0) goto L51
            com.revolut.feature.junior_remote_login.impl.navigation.JuniorInvitationProductArticleKey r6 = com.revolut.feature.junior_remote_login.impl.navigation.JuniorInvitationProductArticleKey.SHARING_JP
            goto L53
        L51:
            com.revolut.feature.junior_remote_login.impl.navigation.JuniorInvitationProductArticleKey r6 = com.revolut.feature.junior_remote_login.impl.navigation.JuniorInvitationProductArticleKey.SHARING
        L53:
            r6.getClass()
            java.lang.String r0 = "juniorId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r1.<init>(r6)
            java.lang.String r6 = "youthId"
            java.util.Map r5 = a0.d.x(r6, r5)
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jl8.c.b(java.lang.String, gim.c):java.lang.Object");
    }
}
