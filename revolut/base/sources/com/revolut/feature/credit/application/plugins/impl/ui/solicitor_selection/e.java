package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails f68398w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails partnerSolicitorDetails, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f68398w = partnerSolicitorDetails;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f68398w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r2.p2(r11, r1) == r0) goto L19;
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
            com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.h r2 = r11.v
            r9 = 2
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1c
            if (r1 != r9) goto L14
            yhm.o.b(r12)
            r7 = r11
            goto L5b
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            yhm.o.b(r12)
            r7 = r11
            goto L3e
        L21:
            yhm.o.b(r12)
            an1.d r5 = new an1.d
            r12 = 5
            com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step$PartnerSolicitorDetails r1 = r11.f68398w
            r5.<init>(r1, r12)
            com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.d r6 = new com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.d
            r6.<init>(r2, r1, r10)
            r11.u = r3
            r3 = 0
            r4 = 0
            r8 = 3
            r7 = r11
            java.lang.Object r12 = n14.k.V(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L3e
            goto L5a
        L3e:
            nii.h r12 = (nii.h) r12
            boolean r1 = r12 instanceof nii.g
            if (r1 == 0) goto L5b
            nii.g r12 = (nii.g) r12
            nii.n1 r1 = r12.f216153b
            boolean r1 = r1 instanceof nii.k1
            if (r1 == 0) goto L5b
            bi4.d r1 = new bi4.d
            r3 = 1
            r1.<init>(r2, r12, r10, r3)
            r7.u = r9
            java.lang.Object r12 = r2.p2(r11, r1)
            if (r12 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
