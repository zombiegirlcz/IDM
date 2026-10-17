package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g r5 = r6.v
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r7)
            goto L6e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L48
        L21:
            yhm.o.b(r7)
            goto L31
        L25:
            yhm.o.b(r7)
            r6.u = r4
            java.lang.Object r7 = r5.J2(r6)
            if (r7 != r0) goto L31
            goto L6d
        L31:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L57
            nd1.i r7 = r5.f60739q
            n1g.p r7 = r7.d()
            r6.u = r3
            java.lang.Object r7 = vkm.q.x(r7, r6)
            if (r7 != r0) goto L48
            goto L6d
        L48:
            xi0.b r7 = (xi0.b) r7
            com.revolut.kompot.navigable.vc.modal.a r0 = r5.C
            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$ModalStep$ChangeCurrency r1 = new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$ModalStep$ChangeCurrency
            r1.<init>(r7)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r0, r1, r7)
            goto L6e
        L57:
            r6.u = r2
            r5.getClass()
            com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.f r7 = new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.f
            r1 = 0
            r7.<init>(r5, r1)
            java.lang.Object r7 = r5.p2(r6, r7)
            if (r7 != r0) goto L69
            goto L6b
        L69:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L6b:
            if (r7 != r0) goto L6e
        L6d:
            return r0
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
