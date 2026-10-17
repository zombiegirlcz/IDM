package lr1;

import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.bills.postal_check.impl.ui.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PostalCheckQrScanResult.TermsRequired f199373w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar, PostalCheckQrScanResult.TermsRequired termsRequired, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f199373w = termsRequired;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f199373w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (com.revolut.feature.apm.bills.postal_check.impl.ui.b.I2(r3, r7, r6) == r0) goto L15;
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
            com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult$TermsRequired r2 = r6.f199373w
            com.revolut.feature.apm.bills.postal_check.impl.ui.b r3 = r6.v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r7)
            goto L3d
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L32
        L20:
            yhm.o.b(r7)
            jr1.e r7 = r3.f61526s
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms r1 = r2.f61506a
            java.util.ArrayList r1 = r1.f61979c
            r6.u = r5
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 != r0) goto L32
            goto L3c
        L32:
            java.lang.String r7 = r2.f61507b
            r6.u = r4
            java.lang.Object r7 = com.revolut.feature.apm.bills.postal_check.impl.ui.b.I2(r3, r7, r6)
            if (r7 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
