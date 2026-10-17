package jr4;

import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a f177934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AutoPayRequest f177935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f177936y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar, AutoPayRequest autoPayRequest, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = z;
        this.f177934w = aVar;
        this.f177935x = autoPayRequest;
        this.f177936y = str;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f177934w, this.f177935x, this.f177936y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        if (nim.a.a(r9, r8) == r2) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a r0 = r8.f177934w
            com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitFlowContract$InputData r1 = r0.v
            lb5.a r0 = r0.f69282t
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            yhm.o.b(r9)
            goto L86
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L44
        L22:
            yhm.o.b(r9)
            boolean r9 = r8.v
            if (r9 == 0) goto L44
            java.lang.String r9 = r1.f69276a
            java.lang.String r3 = "null cannot be cast to non-null type com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest.Setup"
            com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest r6 = r8.f177935x
            kotlin.jvm.internal.Intrinsics.i(r6, r3)
            com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest$Setup r6 = (com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest.Setup) r6
            r3 = r0
            qb5.b r3 = (qb5.b) r3
            pfm.a r9 = r3.b(r9, r6, r5)
            r8.u = r5
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r2) goto L44
            goto L85
        L44:
            java.lang.String r9 = r1.f69276a
            qb5.b r0 = (qb5.b) r0
            r0.getClass()
            java.lang.String r1 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r3 = r8.f177936y
            java.lang.String r5 = "bankIdentifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r6 = r8.z
            java.lang.String r7 = "accountNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            ob5.a r0 = r0.f244118a
            xb5.g r0 = (xb5.g) r0
            r0.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            com.revolut.feature.credit_card.autopay.impl.network.ApiService r0 = r0.f303997a
            ub5.k r1 = new ub5.k
            r1.<init>(r3, r6)
            efm.b r9 = r0.setDirectDebitMandate(r9, r1)
            pfm.r r9 = te0.w.g0(r9)
            r8.u = r4
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r2) goto L86
        L85:
            return r2
        L86:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jr4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
