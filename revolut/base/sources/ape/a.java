package ape;

import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ StampDutyAccount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f8184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StampDutyAccount stampDutyAccount, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = stampDutyAccount;
        this.f8184w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f8184w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r7 == r0) goto L28;
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
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r2 = r6.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            yhm.o.b(r7)
            goto L6b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L55
        L21:
            yhm.o.b(r7)
            goto L3e
        L25:
            yhm.o.b(r7)
            boolean r7 = r2 instanceof com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Joint
            ape.c r1 = r6.f8184w
            if (r7 == 0) goto L41
            com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService r7 = r1.f8186a
            r1 = r2
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount$Joint r1 = (com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Joint) r1
            java.lang.String r1 = r1.f89991a
            r6.u = r5
            java.lang.Object r7 = r7.getStampDutyToPay(r1, r6)
            if (r7 != r0) goto L3e
            goto L6a
        L3e:
            zoe.d r7 = (zoe.d) r7
            goto L6d
        L41:
            boolean r7 = r2 instanceof com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Personal
            if (r7 == 0) goto L58
            com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService r7 = r1.f8186a
            r1 = r2
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount$Personal r1 = (com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Personal) r1
            java.lang.String r1 = r1.f89992a
            r6.u = r4
            java.lang.Object r7 = r7.getStampDutyToPay(r1, r6)
            if (r7 != r0) goto L55
            goto L6a
        L55:
            zoe.d r7 = (zoe.d) r7
            goto L6d
        L58:
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount$Pro r7 = com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount.Pro.f89993a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r2, r7)
            if (r7 == 0) goto Laf
            com.revolut.feature.tax_residency.impl.stamp_duty.service.StampDutyService r7 = r1.f8186a
            r6.u = r3
            java.lang.Object r7 = r7.getProStampDutyToPay(r6)
            if (r7 != r0) goto L6b
        L6a:
            return r0
        L6b:
            zoe.d r7 = (zoe.d) r7
        L6d:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "account"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r7.f324048a
            java.lang.String r1 = "PAYMENT_REQUIRED"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r1 == 0) goto L93
            dne.a r0 = new dne.a
            dj0.d r7 = r7.f324049b
            if (r7 == 0) goto L8b
            r0.<init>(r2, r7)
            return r0
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r7.<init>(r0)
            throw r7
        L93:
            java.lang.String r1 = "NO_PAYMENT"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            dne.b r1 = dne.b.f116290a
            if (r0 == 0) goto L9e
            return r1
        L9e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.f324048a
            java.lang.String r2 = "Unsupported status: "
            java.lang.String r7 = j6.a.q(r2, r7)
            r0.<init>(r7)
            hx7.e.h(r0)
            return r1
        Laf:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ape.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
