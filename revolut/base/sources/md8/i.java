package md8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r9 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r1.a(r9, r5, r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r1.b(r5, r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            yhm.o.b(r9)
            goto L69
        L1c:
            yhm.o.b(r9)
            md8.q r9 = r8.v
            kd8.e r1 = r9.f204517r
            md8.d r5 = r9.o
            com.revolut.feature.junior_consent.api.navigation.ConsentTypeId r6 = r5.f204505b
            java.lang.String r5 = r5.f204504a
            boolean r7 = r6 instanceof com.revolut.feature.junior_consent.api.navigation.ConsentTypeId.ConsentRequestId
            if (r7 == 0) goto L45
            kd8.x r9 = r9.f204516q
            com.revolut.feature.junior_consent.api.navigation.ConsentTypeId$ConsentRequestId r6 = (com.revolut.feature.junior_consent.api.navigation.ConsentTypeId.ConsentRequestId) r6
            java.lang.String r1 = r6.f76861a
            r8.u = r4
            gd8.q r9 = r9.f182859a
            gd8.x r9 = (gd8.x) r9
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L40
            goto L42
        L40:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L42:
            if (r9 != r0) goto L69
            goto L68
        L45:
            boolean r9 = r6 instanceof com.revolut.feature.junior_consent.api.navigation.ConsentTypeId.DataManagementConsentId
            if (r9 == 0) goto L58
            com.revolut.feature.junior_consent.api.navigation.ConsentTypeId$DataManagementConsentId r6 = (com.revolut.feature.junior_consent.api.navigation.ConsentTypeId.DataManagementConsentId) r6
            java.lang.String r9 = r6.f76863a
            v6d.a r2 = v6d.a.PERSONAL_DATA_PROCESSING
            r8.u = r3
            java.lang.Object r9 = r1.a(r9, r5, r2, r8)
            if (r9 != r0) goto L69
            goto L68
        L58:
            boolean r9 = r6 instanceof com.revolut.feature.junior_consent.api.navigation.ConsentTypeId.ConsentName
            if (r9 == 0) goto L6c
            com.revolut.feature.junior_consent.api.navigation.ConsentTypeId$ConsentName r6 = (com.revolut.feature.junior_consent.api.navigation.ConsentTypeId.ConsentName) r6
            v6d.a r9 = r6.f76860a
            r8.u = r2
            java.lang.Object r9 = r1.b(r5, r9, r8)
            if (r9 != r0) goto L69
        L68:
            return r0
        L69:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: md8.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
