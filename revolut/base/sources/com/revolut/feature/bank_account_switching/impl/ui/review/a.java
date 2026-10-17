package com.revolut.feature.bank_account_switching.impl.ui.review;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.u
            r2 = 1
            com.revolut.feature.bank_account_switching.impl.ui.review.b r3 = r4.v
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            yhm.o.b(r5)
            goto L2b
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            yhm.o.b(r5)
            l61.a r5 = r3.f63969r
            ang.b r5 = (ang.b) r5
            efm.d0 r5 = r5.a()
            r4.u = r2
            java.lang.Object r5 = nim.a.b(r5, r4)
            if (r5 != r0) goto L2b
            return r0
        L2b:
            l71.d r5 = (l71.d) r5
            cli.y r0 = r3.f63971t
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            zo2.d r0 = (zo2.d) r0
            mn2.a r0 = r0.f323860c
            mn2.a r1 = mn2.a.CASS
            if (r0 != r1) goto L52
            kotlin.jvm.internal.Intrinsics.h(r5)
            boolean r5 = l71.f.c(r5)
            if (r5 != 0) goto L52
            com.revolut.kompot.navigable.vc.modal.a r5 = r3.u
            com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$ModalStep$LtdConfirmation r0 = com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$ModalStep.LtdConfirmation.f63965a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r5, r0, r1)
            goto L55
        L52:
            r3.I2()
        L55:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.bank_account_switching.impl.ui.review.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
