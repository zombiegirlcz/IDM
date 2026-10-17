package ct6;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductArticleParams f108625w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, ProductArticleParams productArticleParams, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f108625w = productArticleParams;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f108625w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r2 == r1) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 2
            r4 = 1
            ct6.m r5 = r0.v
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r17)
            goto L7d
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r17)
            r2 = r17
            goto L30
        L22:
            yhm.o.b(r17)
            nd1.b r2 = r5.f108633a
            r0.u = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L30
            goto L7c
        L30:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L63
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r8 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.acquiring.lite_pos.api.navigation.CatalogueManagementFlowDestination r10 = com.revolut.feature.acquiring.lite_pos.api.navigation.CatalogueManagementFlowDestination.f60697b
            r13 = 0
            r14 = 61
            r9 = 0
            r11 = 0
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7.<init>(r8)
            qka.c r1 = r5.f108637h
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r6 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r11 = 6
            r8 = 0
            r10 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            r14 = 0
            r15 = 120(0x78, float:1.68E-43)
            com.revolut.feature.product_article.api.models.ProductArticleParams r10 = r0.f108625w
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r11 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r13 = 0
            r9 = r1
            r12 = r6
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r1 = cka.b.a(r9, r10, r11, r12, r13, r14, r15)
            return r1
        L63:
            zja.a r2 = r5.f108636g
            r0.u = r3
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.models.ProductArticleParams r3 = r0.f108625w
            java.lang.String r3 = kka.h.b(r3)
            ska.e r2 = r2.f184564b
            java.lang.Object r2 = r2.a(r3, r0)
            if (r2 != r1) goto L78
            goto L7a
        L78:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L7a:
            if (r2 != r1) goto L7d
        L7c:
            return r1
        L7d:
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r3 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.acquiring.lite_pos.api.navigation.CatalogueManagementFlowDestination r5 = com.revolut.feature.acquiring.lite_pos.api.navigation.CatalogueManagementFlowDestination.f60697b
            r8 = 0
            r9 = 61
            r4 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ct6.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
