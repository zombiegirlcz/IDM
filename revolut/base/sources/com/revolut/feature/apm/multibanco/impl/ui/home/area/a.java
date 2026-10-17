package com.revolut.feature.apm.multibanco.impl.ui.home.area;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(r7, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(r7, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(r7, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        return r0;
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
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            yhm.o.b(r7)
            goto L68
        L1c:
            yhm.o.b(r7)
            com.revolut.feature.apm.multibanco.impl.ui.home.area.b r7 = r6.v
            m72.a r1 = r7.f62603q
            m72.k r1 = (m72.k) r1
            vkm.j2 r1 = r1.f203297g
            java.lang.Object r1 = r1.getValue()
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            boolean r5 = r1.getLoading()
            if (r5 == 0) goto L3c
            r6.u = r4
            java.lang.Object r7 = com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(r7, r6)
            if (r7 != r0) goto L68
            goto L67
        L3c:
            java.lang.Object r1 = r1.getContent()
            z92.j r1 = (z92.j) r1
            boolean r4 = r1 instanceof z92.i
            if (r4 == 0) goto L50
            com.revolut.kompot.navigable.vc.modal.a r7 = r7.z
            com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep$PayFlow r0 = com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$ModalStep.PayFlow.f62597a
            com.revolut.kompot.common.ModalDestination$Style$POPUP r1 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r7, r0, r1)
            goto L68
        L50:
            boolean r4 = r1 instanceof z92.h
            if (r4 == 0) goto L5d
            r6.u = r3
            java.lang.Object r7 = com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(r7, r6)
            if (r7 != r0) goto L68
            goto L67
        L5d:
            if (r1 != 0) goto L6b
            r6.u = r2
            java.lang.Object r7 = com.revolut.feature.apm.multibanco.impl.ui.home.area.b.I2(r7, r6)
            if (r7 != r0) goto L68
        L67:
            return r0
        L68:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.multibanco.impl.ui.home.area.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
