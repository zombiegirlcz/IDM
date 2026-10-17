package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b.I2(r4, r11) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r12 == r0) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 2
            r3 = 1
            com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b r4 = r11.v
            r5 = 3
            if (r1 == 0) goto L27
            if (r1 == r3) goto L23
            if (r1 == r2) goto L1e
            if (r1 != r5) goto L16
            yhm.o.b(r12)
            goto L9d
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            yhm.o.b(r12)
            goto Lae
        L23:
            yhm.o.b(r12)
            goto L6e
        L27:
            yhm.o.b(r12)
            jf1.a r12 = r4.o
            zfc.d r12 = (zfc.d) r12
            kotlinx.coroutines.flow.Flow r1 = r12.a()
            w4l.h r6 = w4l.h.f294642c
            java.lang.String r7 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            o7.b r6 = r12.f321922a
            zhm.h0 r7 = zhm.h0.f322473a
            zfc.a r8 = new zfc.a
            r9 = 0
            r8.<init>(r12, r9)
            kotlinx.coroutines.flow.Flow r12 = r6.r(r7, r8)
            t38.e r12 = zh9.u0.m(r1, r12)
            wvg.r1 r1 = new wvg.r1
            r6 = 7
            r1.<init>(r6)
            akg.n r12 = nim.a.v(r12, r1)
            r1 = 0
            jhi.b r12 = mo3.a.g(r12, r1, r1, r5)
            vge.f1 r6 = new vge.f1
            r8 = 28
            r6.<init>(r5, r8, r1)
            vkm.y r12 = rd0.e.e(r12, r7, r6)
            r11.u = r3
            java.lang.Object r12 = vkm.q.x(r12, r11)
            if (r12 != r0) goto L6e
            goto L9c
        L6e:
            com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$State r12 = (com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$State) r12
            qki.d r1 = r4.f73804t
            wvg.d0 r3 = new wvg.d0
            r6 = 7
            r3.<init>(r12, r6)
            r4.H2(r1, r3)
            java.util.Set r12 = r12.f73793b
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L8e
            r11.u = r2
            java.lang.Object r12 = com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b.I2(r4, r11)
            if (r12 != r0) goto Lae
            goto L9c
        L8e:
            gr6.p r12 = r4.f73801q
            ir6.f r1 = ir6.f.SHOPIFY
            r11.u = r5
            et6.x2 r12 = (et6.x2) r12
            java.lang.Object r12 = r12.g(r1, r11)
            if (r12 != r0) goto L9d
        L9c:
            return r0
        L9d:
            com.revolut.feature.product_article.api.models.ProductArticleParams r12 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r12
            yki.i r5 = r4.f73803s
            com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$Step$ShopifyProductArticle r6 = new com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$Step$ShopifyProductArticle
            r6.<init>(r12)
            r9 = 0
            r10 = 12
            r7 = 0
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
        Lae:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
