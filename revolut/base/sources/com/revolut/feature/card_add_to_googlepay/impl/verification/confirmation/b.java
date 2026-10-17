package com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation;

import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f64493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, f0 f0Var, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f64493w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f64493w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
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
            if (r1 == 0) goto L1a
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
            goto L89
        L1a:
            yhm.o.b(r7)
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e r7 = r6.v
            gw2.c r1 = r7.f64495q
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData r7 = r7.o
            boolean r4 = r7 instanceof com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.Confirmation
            if (r4 == 0) goto L5c
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData$Confirmation r7 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.Confirmation) r7
            java.lang.String r2 = r7.f64488a
            boolean r7 = r7.f64489b
            r6.u = r3
            gw2.a r7 = r1.a(r2, r7)
            if (r7 == 0) goto L54
            tg1.a r1 = r1.f147276a
            java.lang.String r2 = r7.f147274b
            java.lang.String r3 = r7.f147275c
            java.lang.String r7 = r7.f147273a
            jg1.a r4 = new jg1.a
            r5 = 24
            r4.<init>(r2, r7, r3, r5)
            pfm.r r7 = r1.a(r4)
            java.lang.Object r7 = nim.a.a(r7, r6)
            if (r7 != r0) goto L4f
            goto L51
        L4f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L51:
            if (r7 != r0) goto L89
            goto L88
        L54:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "params parsing error"
            r7.<init>(r0)
            throw r7
        L5c:
            boolean r3 = r7 instanceof com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.RevivalConfirmation
            if (r3 == 0) goto L94
            com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData$RevivalConfirmation r7 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) r7
            java.lang.String r7 = r7.f64490a
            r6.u = r2
            r1.getClass()
            h93.f0 r2 = r6.f64493w
            java.lang.String r2 = r2.f150115j
            if (r2 == 0) goto L8c
            tg1.a r1 = r1.f147276a
            jg1.a r3 = new jg1.a
            r4 = 0
            r5 = 8
            r3.<init>(r7, r2, r4, r5)
            pfm.r r7 = r1.a(r3)
            java.lang.Object r7 = nim.a.a(r7, r6)
            if (r7 != r0) goto L84
            goto L86
        L84:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L86:
            if (r7 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L8c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "last four is required"
            r7.<init>(r0)
            throw r7
        L94:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
