package oah;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ DepositInfo.RecurringDeposit v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a f223645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DepositInfo.RecurringDeposit recurringDeposit, com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = recurringDeposit;
        this.f223645w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f223645w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r2 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r7 == r1) goto L19;
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
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r21)
            r7 = r21
            goto L7d
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            yhm.o.b(r21)
            r2 = r21
            goto L47
        L22:
            yhm.o.b(r21)
            com.revolut.feature.wealth.api.navigation.models.DepositInfo$RecurringDeposit r2 = r0.v
            java.lang.String r5 = r2.e
            r6 = 0
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r7 = r0.f223645w
            if (r5 != 0) goto L4a
            epc.h r3 = r7.f95558p
            oah.d r5 = r7.o
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r5 = r5.f223636a
            dj0.d r2 = r2.f95321a
            r0.u = r4
            r3.getClass()
            epc.f r4 = new epc.f
            r4.<init>(r3, r5, r2, r6)
            java.lang.Object r2 = r3.b(r5, r4, r0)
            if (r2 != r1) goto L47
            goto L7c
        L47:
            nii.m0 r2 = (nii.m0) r2
            return r2
        L4a:
            epc.h r2 = r7.f95558p
            oah.d r4 = r7.o
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r4 = r4.f223636a
            r0.u = r3
            nii.j0 r7 = new nii.j0
            nmc.a r2 = r2.f128155c
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.retail.wealth.resources.R$string.wealth_robo_recurring_transfer_update_success
            r3 = 14
            r8.<init>(r2, r6, r6, r3)
            grl.k9 r2 = grl.k9.RoboAdvisor
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r3 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r3 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r14 = com.google.android.gms.internal.mlkit_vision_face.a.h(r2, r3, r2)
            r18 = 0
            r19 = 4030(0xfbe, float:5.647E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            nii.m0 r7 = (nii.m0) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oah.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
