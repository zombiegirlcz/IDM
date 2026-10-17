package pw7;

import elm.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kw7.e;
import skm.e0;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements hw7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f240341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f240342b;

    public c(m navigator, e insuranceHomeLayoutInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(insuranceHomeLayoutInteractor, "insuranceHomeLayoutInteractor");
        this.f240341a = navigator;
        this.f240342b = insuranceHomeLayoutInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(pw7.c r13, gim.c r14) {
        /*
            boolean r0 = r14 instanceof pw7.b
            if (r0 == 0) goto L13
            r0 = r14
            pw7.b r0 = (pw7.b) r0
            int r1 = r0.f240340w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240340w = r1
            goto L18
        L13:
            pw7.b r0 = new pw7.b
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240340w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L45
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            kw7.e r13 = r13.f240342b
            kotlinx.coroutines.flow.Flow r13 = kw7.e.a(r13)
            zfd.e r13 = zi0.c.w(r13)
            r0.f240340w = r3
            java.lang.Object r14 = vkm.q.x(r13, r0)
            if (r14 != r1) goto L45
            return r1
        L45:
            com.revolut.data.model.Data r14 = (com.revolut.data.model.Data) r14
            java.lang.Object r13 = r14.getContent()
            com.revolut.feature.insurance_home.impl.data.model.f r13 = (com.revolut.feature.insurance_home.impl.data.model.f) r13
            r14 = 0
            if (r13 == 0) goto L59
            boolean r0 = r13.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L5a
        L59:
            r0 = r14
        L5a:
            boolean r0 = pd.b.j(r0)
            if (r0 != 0) goto L61
            return r14
        L61:
            com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home r3 = com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home.f76154a
            if (r13 == 0) goto La9
            java.lang.String r13 = r13.f76211a
            if (r13 == 0) goto La9
            com.revolut.feature.product_article.api.navigation.ProductArticleDestination r14 = new com.revolut.feature.product_article.api.navigation.ProductArticleDestination
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            r1.<init>(r13)
            r0.<init>(r1)
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r13 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.<init>(r1)
            r9 = r8
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.<init>(r1)
            r5 = r9
            r9 = 6
            r6 = 0
            r7 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 0
            r12 = 248(0xf8, float:3.48E-43)
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r6 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r0
            r7 = r4
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pw7.c.b(pw7.c, gim.c):java.lang.Object");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "insurance") && d0.W(cVar.e(2));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, new a(this, cVar, null, 1), continuation);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p0 p0Var = p0.f264001a;
        return w.o0(f.f127540b, new a(this, deeplink, null, 0));
    }
}
