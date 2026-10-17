package com.revolut.feature.joint.impl.ui.invite_flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.joint.impl.ui.invite_flow.d r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r10)
            goto L4a
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            goto L34
        L1e:
            yhm.o.b(r10)
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData r10 = r2.o
            boolean r10 = r10.f76556a
            if (r10 == 0) goto L37
            k38.a r10 = r2.f76582x
            r9.u = r4
            com.revolut.feature.joint.impl.domain.a r10 = (com.revolut.feature.joint.impl.domain.a) r10
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L34
            goto L49
        L34:
            com.revolut.feature.product_article.api.models.ProductArticleParams r10 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r10
            goto L38
        L37:
            r10 = 0
        L38:
            if (r10 == 0) goto L41
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$WrapWithProductArticle r0 = new com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$WrapWithProductArticle
            r0.<init>(r10)
        L3f:
            r4 = r0
            goto L4e
        L41:
            r9.u = r3
            java.lang.Object r10 = com.revolut.feature.joint.impl.ui.invite_flow.d.I2(r2, r9)
            if (r10 != r0) goto L4a
        L49:
            return r0
        L4a:
            r0 = r10
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step r0 = (com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step) r0
            goto L3f
        L4e:
            yki.i r3 = r2.D
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.invite_flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
