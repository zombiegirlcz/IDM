package ape;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ dne.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f8185w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dne.a aVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f8185w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f8185w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r2.payStampDuty(r1, r8, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r2.payStampDuty(r1, r8, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r1.payProStampDuty(r8, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            yhm.o.b(r8)
            goto L6a
        L1c:
            yhm.o.b(r8)
            dne.a r8 = r7.v
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r1 = r8.f116288a
            boolean r5 = r1 instanceof com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Joint
            ape.c r6 = r7.f8185w
            if (r5 == 0) goto L3c
            com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService r2 = r6.f8186a
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount$Joint r1 = (com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Joint) r1
            java.lang.String r1 = r1.f89991a
            zoe.a r8 = io3.h.Q(r8)
            r7.u = r4
            java.lang.Object r8 = r2.payStampDuty(r1, r8, r7)
            if (r8 != r0) goto L6a
            goto L69
        L3c:
            boolean r4 = r1 instanceof com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Personal
            if (r4 == 0) goto L53
            com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService r2 = r6.f8186a
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount$Personal r1 = (com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Personal) r1
            java.lang.String r1 = r1.f89992a
            zoe.a r8 = io3.h.Q(r8)
            r7.u = r3
            java.lang.Object r8 = r2.payStampDuty(r1, r8, r7)
            if (r8 != r0) goto L6a
            goto L69
        L53:
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount$Pro r3 = com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Pro.f89993a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 == 0) goto L6d
            com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService r1 = r6.f8186a
            zoe.a r8 = io3.h.Q(r8)
            r7.u = r2
            java.lang.Object r8 = r1.payProStampDuty(r8, r7)
            if (r8 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L6d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ape.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
