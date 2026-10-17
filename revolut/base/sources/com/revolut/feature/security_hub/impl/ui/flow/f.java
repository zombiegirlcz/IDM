package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public ProductArticleParams u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f85560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, Continuation continuation) {
        super(2, continuation);
        this.f85560w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.f85560w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 0
            com.revolut.feature.security_hub.impl.ui.flow.m r3 = r10.f85560w
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = r10.u
            yhm.o.b(r11)
            r5 = r0
            goto L60
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            yhm.o.b(r11)
            goto L4b
        L22:
            yhm.o.b(r11)
            com.revolut.feature.security_hub.api.navigation.SecurityHubInputData r11 = r3.o
            boolean r1 = r11.f85463b
            if (r1 == 0) goto L32
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$SecurityHub r11 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$SecurityHub
            r11.<init>(r2)
        L30:
            r5 = r11
            goto L7e
        L32:
            java.lang.String r11 = r11.f85464c
            if (r11 == 0) goto L42
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id r5 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Id
            r5.<init>(r11)
            r1.<init>(r5)
            r11 = r1
            goto L4d
        L42:
            r10.v = r5
            java.lang.Object r11 = com.revolut.feature.security_hub.impl.ui.flow.m.J2(r3, r10)
            if (r11 != r0) goto L4b
            goto L5d
        L4b:
            com.revolut.feature.product_article.api.models.ProductArticleParams r11 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r11
        L4d:
            zja.a r1 = r3.f85570p
            r10.u = r11
            r10.v = r4
            kka.h r1 = (kka.h) r1
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r4 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r1 = r1.e(r11, r4, r10)
            if (r1 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r5 = r11
            r11 = r1
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L78
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$ProductArticle r4 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$ProductArticle
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$SecurityHub r6 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$SecurityHub
            r6.<init>(r2)
            r8 = 0
            r9 = 12
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r5 = r4
            goto L7e
        L78:
            com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$SecurityHub r11 = new com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step$SecurityHub
            r11.<init>(r2)
            goto L30
        L7e:
            yki.a r4 = r3.N
            com.revolut.kompot.navigable.TransitionAnimation$FADE r7 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r8 = 0
            r9 = 8
            r6 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.flow.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
