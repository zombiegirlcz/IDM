package hje;

import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cje.h, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f152754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f152755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc5.a f152756c;
    public final xh5.a d;
    public final yje.a e;
    public final qka.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FeatureCommand f152757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FeatureCommand f152758h;

    public n(sri.m navigator, hc5.a cryptoAccountInteractor, xh5.a cryptoFeatureEnabledInteractor, yje.a zeroCryptoFeesPromoArticleProvider, qka.c productArticleNavigationProvider, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(zeroCryptoFeesPromoArticleProvider, "zeroCryptoFeesPromoArticleProvider");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f152754a = cryptoNavigationInterceptor;
        this.f152755b = navigator;
        this.f152756c = cryptoAccountInteractor;
        this.d = cryptoFeatureEnabledInteractor;
        this.e = zeroCryptoFeesPromoArticleProvider;
        this.f = productArticleNavigationProvider;
        this.f152757g = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
        this.f152758h = new FeatureCommand(CryptoInvestFeatureConfig.Invest.f71500a);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "zerofeespromo");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f152754a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f152754a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f152754a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (r9 != r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r8 = r9 instanceof hje.m
            if (r8 == 0) goto L13
            r8 = r9
            hje.m r8 = (hje.m) r8
            int r0 = r8.f152753x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.f152753x = r0
            goto L1a
        L13:
            hje.m r8 = new hje.m
            gim.c r9 = (gim.c) r9
            r8.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r8.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.f152753x
            r2 = 1
            r3 = 3
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L43
            if (r1 == r2) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L31
            yhm.o.b(r9)
            goto Lae
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.time.Instant r1 = r8.u
            yhm.o.b(r9)
            goto L9e
        L3f:
            yhm.o.b(r9)
            goto L5b
        L43:
            yhm.o.b(r9)
            hc5.a r9 = r7.f152756c
            w4l.h r1 = w4l.h.f294642c
            vkm.d r9 = r9.a(r1)
            jhi.b r9 = mo3.a.g(r9, r5, r5, r3)
            r8.f152753x = r2
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r0) goto L5b
            goto Lad
        L5b:
            ec5.b r9 = (ec5.b) r9
            java.util.Set r9 = r9.f124431c
            if (r9 == 0) goto L88
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L67:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r9.next()
            r2 = r1
            ec5.e r2 = (ec5.e) r2
            java.lang.String r2 = r2.f124438a
            java.lang.String r6 = "CRYPTO_ZERO_FEE"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r6)
            if (r2 == 0) goto L67
            goto L80
        L7f:
            r1 = r5
        L80:
            ec5.e r1 = (ec5.e) r1
            if (r1 == 0) goto L88
            java.time.Instant r9 = r1.f124439b
            r1 = r9
            goto L89
        L88:
            r1 = r5
        L89:
            if (r1 == 0) goto Lb1
            xh5.a r9 = r7.d
            com.revolut.retail.core.navigation.FeatureCommand r2 = r7.f152758h
            efm.d0 r9 = xh5.a.a(r9, r2)
            r8.u = r1
            r8.f152753x = r4
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L9e
            goto Lad
        L9e:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            r8.u = r5
            r8.f152753x = r3
            java.lang.Object r9 = r7.g(r1, r9, r8)
            if (r9 != r0) goto Lae
        Lad:
            return r0
        Lae:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            goto Lb3
        Lb1:
            com.revolut.retail.core.navigation.FeatureCommand r9 = r7.f152757g
        Lb3:
            q06.h r8 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r9)
            r8.<init>(r0, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hje.n.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        e eVar = new e(new hg4.a(this, 10), 7);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.time.Instant r10, com.revolut.retail.core.navigation.NaviCommand r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof hje.l
            if (r0 == 0) goto L13
            r0 = r12
            hje.l r0 = (hje.l) r0
            int r1 = r0.f152751y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152751y = r1
            goto L18
        L13:
            hje.l r0 = new hje.l
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f152749w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152751y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            qka.c r10 = r0.v
            com.revolut.retail.core.navigation.NaviCommand r11 = r0.u
            yhm.o.b(r12)
            r2 = r10
        L2b:
            r4 = r11
            goto L4e
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r12)
            r0.u = r11
            qka.c r12 = r9.f
            r0.v = r12
            r0.f152751y = r3
            yje.a r2 = r9.e
            yje.e r2 = (yje.e) r2
            java.lang.Object r10 = r2.a(r10, r0)
            if (r10 != r1) goto L4b
            return r1
        L4b:
            r2 = r12
            r12 = r10
            goto L2b
        L4e:
            com.revolut.feature.product_article.api.models.ProductArticleParams r12 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r12
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r3 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r7 = 0
            r8 = 14
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            grl.k9 r10 = grl.k9.Crypto
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r11 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r11 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r6 = com.google.android.gms.internal.mlkit_vision_face.a.h(r10, r11, r10)
            r8 = 112(0x70, float:1.57E-43)
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$AlwaysShow r4 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.AlwaysShow.f81285a
            r5 = r3
            r3 = r12
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r10 = cka.b.a(r2, r3, r4, r5, r6, r7, r8)
            com.revolut.retail.core.navigation.FeatureCommand r11 = new com.revolut.retail.core.navigation.FeatureCommand
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hje.n.g(java.time.Instant, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }
}
