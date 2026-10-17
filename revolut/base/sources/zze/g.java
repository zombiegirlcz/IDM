package zze;

import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.google_pay.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xze.d f326712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GooglePayFee f326713x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, xze.d dVar, GooglePayFee googlePayFee, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f326712w = dVar;
        this.f326713x = googlePayFee;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f326712w, this.f326713x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (com.revolut.feature.topup_screen.impl.google_pay.flow.b.K2(r1, r7, r5, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r1.M2(r7, r5, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            yhm.o.b(r7)
            goto L44
        L19:
            yhm.o.b(r7)
            xze.d r7 = r6.f326712w
            com.revolut.feature.topup_screen.impl.google_pay.flow.b r1 = r6.v
            ute.a r7 = com.revolut.feature.topup_screen.impl.google_pay.flow.b.J2(r1, r7)
            gte.a r4 = r1.f91042w
            com.revolut.feature.topup_screen.api.TopupApi$Toggles$TopUpCardOwnerVerification r5 = com.revolut.feature.topup_screen.api.TopupApi$Toggles.TopUpCardOwnerVerification.f90471c
            jte.d r4 = (jte.d) r4
            boolean r4 = r4.c(r5)
            com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee r5 = r6.f326713x
            if (r4 == 0) goto L3b
            r6.u = r3
            java.lang.Object r7 = com.revolut.feature.topup_screen.impl.google_pay.flow.b.K2(r1, r7, r5, r6)
            if (r7 != r0) goto L44
            goto L43
        L3b:
            r6.u = r2
            java.lang.Object r7 = r1.M2(r7, r5, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zze.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
