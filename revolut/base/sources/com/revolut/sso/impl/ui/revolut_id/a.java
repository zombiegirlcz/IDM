package com.revolut.sso.impl.ui.revolut_id;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (com.revolut.sso.impl.ui.revolut_id.c.I2(r4, r5) == r0) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            com.revolut.sso.impl.ui.revolut_id.c r4 = r5.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r6)
            goto L52
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L37
        L1e:
            yhm.o.b(r6)
            zja.a r6 = r4.f106712q
            qpl.b r1 = qpl.d.Companion
            r1.getClass()
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = qpl.b.f248440b
            r5.u = r3
            kka.h r6 = (kka.h) r6
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r6.e(r1, r3, r5)
            if (r6 != r0) goto L37
            goto L51
        L37:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L49
            yki.a r6 = r4.v
            com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step$DocumentsPrompt r0 = com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step.DocumentsPrompt.f106704a
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r1 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r6, r0, r1)
            goto L52
        L49:
            r5.u = r2
            java.lang.Object r6 = com.revolut.sso.impl.ui.revolut_id.c.I2(r4, r5)
            if (r6 != r0) goto L52
        L51:
            return r0
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.revolut_id.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
