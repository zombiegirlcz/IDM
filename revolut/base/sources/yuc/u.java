package yuc;

import com.revolut.feature.security_hub.impl.ui.linked_wallets.tab.linked_wallets_tab_revamp.LinkedWalletsTabRevampScreenContract$InputData;
import h93.f0;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends oki.h implements n {
    public final LinkedWalletsTabRevampScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wtc.h f316995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.a f316996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f316997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f316998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tla.d f316999t;
    public Boolean u;
    public final Lazy v;

    public u(cli.n stateMapper, LinkedWalletsTabRevampScreenContract$InputData inputData, wtc.h linkedWalletsInteractor, l93.a cardsImageInteractor, zja.a productArticleInteractor, ang.f userInteractor, tla.d profileAppNavigationCommandsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(cardsImageInteractor, "cardsImageInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(profileAppNavigationCommandsProvider, "profileAppNavigationCommandsProvider");
        this.o = inputData;
        this.f316995p = linkedWalletsInteractor;
        this.f316996q = cardsImageInteractor;
        this.f316997r = productArticleInteractor;
        this.f316998s = userInteractor;
        this.f316999t = profileAppNavigationCommandsProvider;
        this.v = yhm.j.b(new yff.b(this, stateMapper, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum I2(yuc.u r4, com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof yuc.r
            if (r0 == 0) goto L13
            r0 = r6
            yuc.r r0 = (yuc.r) r0
            int r1 = r0.f316991x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316991x = r1
            goto L18
        L13:
            yuc.r r0 = new yuc.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f316991x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            zja.a r4 = r4.f316997r
            r0.u = r5
            r0.f316991x = r3
            kka.h r4 = (kka.h) r4
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4c
            return r5
        L4c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yuc.u.I2(yuc.u, com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(yuc.u r4, com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof yuc.t
            if (r0 == 0) goto L13
            r0 = r6
            yuc.t r0 = (yuc.t) r0
            int r1 = r0.f316994w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316994w = r1
            goto L18
        L13:
            yuc.t r0 = new yuc.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f316994w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            zja.a r4 = r4.f316997r
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = rwc.d.a(r5)
            r0.f316994w = r3
            kka.h r4 = (kka.h) r4
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r6 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r4.e(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yuc.u.J2(yuc.u, com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        f0 f0Var = this.o.f85626a;
        String str = f0Var != null ? f0Var.f150110a : null;
        if (str != null) {
            ((ja3.j) this.f316996q).a(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(yuc.q r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof yuc.s
            if (r0 == 0) goto L13
            r0 = r7
            yuc.s r0 = (yuc.s) r0
            int r1 = r0.f316993x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316993x = r1
            goto L18
        L13:
            yuc.s r0 = new yuc.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f316993x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yuc.i r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L51
        L29:
            r7 = move-exception
            goto L58
        L2b:
            r6 = move-exception
            goto L66
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            cli.g r7 = r5.getState()
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            yuc.i r7 = (yuc.i) r7
            r0.u = r7     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Throwable -> L54
            r0.f316993x = r3     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Throwable -> L54
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Throwable -> L54
            if (r6 != r1) goto L51
            return r1
        L51:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L54:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L58:
            cli.g r0 = r5.getState()
            yuc.p r1 = new yuc.p
            r2 = 0
            r1.<init>(r6, r2)
            r5.H2(r0, r1)
            throw r7
        L66:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yuc.u.K2(yuc.q, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Boolean bool = this.u;
        Continuation continuation = null;
        this.u = null;
        if (bool == null) {
            return;
        }
        n2(new yg6.v(this, bool, continuation, 28), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.v.getValue();
    }
}
