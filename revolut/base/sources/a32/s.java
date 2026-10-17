package a32;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (((sh2.f) r8).Z2(r3, r1, r7) == r0) goto L25;
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
            r2 = 2
            r3 = 1
            a32.a0 r4 = r7.v
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r8)
            goto Laf
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto L4d
        L1f:
            yhm.o.b(r8)
            r7.u = r3
            cli.y r8 = r4.f1012t
            java.lang.Object r8 = r8.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            a32.m r8 = (a32.m) r8
            com.revolut.data.model.Data r8 = r8.e
            java.lang.Object r8 = r8.getContent()
            if (r8 == 0) goto Lb7
            a32.n r8 = (a32.n) r8
            g32.b r1 = r4.f1010r
            z22.a r3 = r4.K2()
            com.revolut.feature.apm.core.models.transfers.payments.ApmQuote r8 = r8.f1031a
            et6.u1 r8 = r1.Z2(r3, r8)
            java.lang.Object r8 = vkm.q.x(r8, r7)
            if (r8 != r0) goto L4d
            goto Lae
        L4d:
            hrf.h r8 = (hrf.h) r8
            boolean r1 = r8.b()
            if (r1 != 0) goto L98
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.List r1 = r8.f154817a
            int r1 = r1.size()
            java.util.List r2 = r8.f154818b
            int r2 = r2.size()
            yqi.b r8 = r8.f154819c
            r3 = 0
            if (r8 == 0) goto L71
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            goto L72
        L71:
            r8 = r3
        L72:
            java.lang.String r4 = ", balanceErrorsCount="
            java.lang.String r5 = ", userErrorType="
            java.lang.String r6 = "transferErrorsCount="
            java.lang.StringBuilder r1 = com.google.android.gms.internal.mlkit_vision_face.a.w(r6, r1, r2, r4, r5)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "User tried to confirm APM Pending PaymentAuth, but has errors: "
            java.lang.String r8 = j6.a.q(r1, r8)
            r0.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r0, r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L98:
            f12.a r8 = r4.f1009q
            z22.a r1 = r4.K2()
            com.revolut.feature.transfer.core.models.FundingSource r1 = r1.f318942a
            com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData r3 = r4.o
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r3 = r3.f62317c
            r7.u = r2
            sh2.f r8 = (sh2.f) r8
            java.lang.Object r8 = r8.Z2(r3, r1, r7)
            if (r8 != r0) goto Laf
        Lae:
            return r0
        Laf:
            a32.o$a r8 = a32.o.a.f1034a
            r4.C2(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lb7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
