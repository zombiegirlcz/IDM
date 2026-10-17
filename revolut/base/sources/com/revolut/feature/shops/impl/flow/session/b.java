package com.revolut.feature.shops.impl.flow.session;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f87117w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f87117w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f87117w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r3.J2(r2, true, r20) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r3.J2(r2, true, r20) == r1) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            com.revolut.feature.shops.impl.flow.session.c r3 = r0.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L27
            if (r2 == r6) goto L21
            if (r2 == r5) goto L1c
            if (r2 != r4) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r21)
            goto Lba
        L21:
            yhm.o.b(r21)
            r2 = r21
            goto L37
        L27:
            yhm.o.b(r21)
            eub.e r2 = r3.f87119q
            r0.u = r6
            nyb.f r2 = (nyb.f) r2
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L37
            goto L64
        L37:
            eub.d r2 = (eub.d) r2
            boolean r7 = r2 instanceof eub.d.a
            java.lang.String r8 = r0.f87117w
            if (r7 == 0) goto L4d
            com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$Home r2 = new com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$Home
            r2.<init>(r8)
            r0.u = r5
            java.lang.Object r2 = r3.J2(r2, r6, r0)
            if (r2 != r1) goto Lba
            goto L64
        L4d:
            boolean r5 = r2 instanceof eub.c
            if (r5 == 0) goto L75
            eub.c r2 = (eub.c) r2
            boolean r2 = r2.f129540a
            if (r2 == 0) goto L65
            com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$Home r2 = new com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$Home
            r2.<init>(r8)
            r0.u = r4
            java.lang.Object r2 = r3.J2(r2, r6, r0)
            if (r2 != r1) goto Lba
        L64:
            return r1
        L65:
            yki.i r4 = r3.f87121s
            com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$OptIn r5 = new com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$OptIn
            r5.<init>(r8)
            r8 = 0
            r9 = 12
            r6 = 0
            r7 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            goto Lba
        L75:
            boolean r1 = r2 instanceof eub.b
            if (r1 == 0) goto Lbd
            nii.y0 r1 = new nii.y0
            nii.z r4 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.kompot.common.R$string.common_error_state_title
            r6 = 0
            r7 = 14
            r5.<init>(r2, r6, r6, r7)
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r8 = com.revolut.kompot.common.R$string.common_error_state_description
            r2.<init>(r8, r6, r6, r7)
            r17 = 0
            r18 = 32764(0x7ffc, float:4.5912E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = r6
            r6 = r2
            r2 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5 = 0
            r6 = 5
            r1.<init>(r2, r4, r5, r6)
            kotlinx.coroutines.flow.Flow r4 = r3.X1(r1)
            iaf.d r7 = new iaf.d
            r1 = 6
            r7.<init>(r3, r2, r1)
            r8 = 3
            r5 = 0
            r6 = 0
            yji.l.a1(r3, r4, r5, r6, r7, r8)
        Lba:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lbd:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.flow.session.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
