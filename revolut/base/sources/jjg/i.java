package jjg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TrustedMerchant.Approved f174950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a aVar, TrustedMerchant.Approved approved, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f174950w = approved;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f174950w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (skm.e0.o(r2, r20) == r1) goto L15;
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
            r3 = 2
            r4 = 1
            r5 = 0
            com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a r6 = r0.v
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r21)
            goto L44
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            yhm.o.b(r21)
            goto L34
        L21:
            yhm.o.b(r21)
            jjg.g r2 = new jjg.g
            com.revolut.feature.trusted_merchants.api.model.TrustedMerchant$Approved r7 = r0.f174950w
            r2.<init>(r6, r7, r5)
            r0.u = r4
            java.lang.Object r2 = do3.q.t(r6, r2, r0)
            if (r2 != r1) goto L34
            goto L43
        L34:
            jec.p r2 = new jec.p
            r4 = 11
            r2.<init>(r6, r5, r4)
            r0.u = r3
            java.lang.Object r2 = skm.e0.o(r2, r0)
            if (r2 != r1) goto L44
        L43:
            return r1
        L44:
            nii.y0 r1 = new nii.y0
            nii.j0 r7 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.trusted_merchants_decline_success_title
            r3 = 14
            r8.<init>(r2, r5, r5, r3)
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.cards_core.R$string.trusted_merchants_decline_success_description
            r9.<init>(r2, r5, r5, r3)
            r18 = 0
            r19 = 4076(0xfec, float:5.712E-42)
            r10 = 0
            r11 = 0
            nii.u1$b r12 = nii.u1.b.f216225a
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2 = 0
            r3 = 5
            r1.<init>(r5, r7, r2, r3)
            kotlinx.coroutines.flow.Flow r7 = r6.X1(r1)
            jij.h r10 = new jij.h
            r1 = 4
            r10.<init>(r6, r5, r1)
            r11 = 3
            r8 = 0
            r9 = 0
            yji.l.a1(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jjg.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
