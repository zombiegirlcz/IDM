package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditForbearanceAgreementsContract$Step f69937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, CreditForbearanceAgreementsContract$Step creditForbearanceAgreementsContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f69937w = creditForbearanceAgreementsContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f69937w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 0
            com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step r4 = r0.f69937w
            r5 = 2
            r6 = 1
            com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c r7 = r0.v
            if (r2 == 0) goto L27
            if (r2 == r6) goto L21
            if (r2 != r5) goto L19
            yhm.o.b(r24)
            r2 = r24
            goto L66
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            yhm.o.b(r24)
            r2 = r24
            goto L3e
        L27:
            yhm.o.b(r24)
            zz4.d r2 = r7.f69940q
            java.lang.String r8 = r7.I2()
            r9 = r4
            com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step$Documents r9 = (com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step.Documents) r9
            java.lang.String r9 = r9.f69934a
            r0.u = r6
            java.lang.Object r2 = r2.c(r8, r9, r0)
            if (r2 != r1) goto L3e
            goto L65
        L3e:
            lz4.a r2 = (lz4.a) r2
            it3.f r8 = r2.f200935b
            int[] r9 = yz4.d.f318034a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            r9 = 3
            if (r8 == r6) goto L77
            if (r8 == r5) goto L77
            if (r8 == r9) goto L77
            mz4.a r6 = r7.f69939p
            com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step$Documents r4 = (com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step.Documents) r4
            wi0.b r4 = r4.f69935b
            sz4.b r6 = (sz4.b) r6
            efm.k r2 = r6.a(r2)
            r0.u = r5
            java.lang.Object r2 = nim.a.h(r2, r0)
            if (r2 != r1) goto L66
        L65:
            return r1
        L66:
            com.revolut.retail.core.navigation.NaviCommand r2 = (com.revolut.retail.core.navigation.NaviCommand) r2
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r4 = 7
            com.revolut.retail.core.navigation.CompositeCommand r2 = r6.b.g(r3, r3, r3, r4, r2)
            r1.<init>(r2)
            aii.n r1 = r7.C1(r1)
            return r1
        L77:
            nii.y0 r1 = new nii.y0
            nii.j0 r10 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.credit.core.R$string.credit_forbearance_result_success_title
            r4 = 14
            r11.<init>(r2, r3, r3, r4)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.credit.core.R$string.credit_forbearance_result_success_subtitle
            r12.<init>(r2, r3, r3, r4)
            r21 = 0
            r22 = 4092(0xffc, float:5.734E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r4 = 5
            r1.<init>(r3, r10, r2, r4)
            kotlinx.coroutines.flow.Flow r1 = r7.X1(r1)
            yz4.e r2 = new yz4.e
            r4 = 2
            r2.<init>(r7, r3, r4)
            yji.l.b1(r7, r1, r3, r2, r9)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
