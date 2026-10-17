package ekf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f127097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127097w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f127097w, continuation, 0);
            default:
                return new k(this.f127097w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.u
            r1 = 0
            ekf.m r2 = r14.f127097w
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L30;
                default: goto Lb;
            }
        Lb:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r5 = r14.v
            if (r5 == 0) goto L1d
            if (r5 != r4) goto L17
            yhm.o.b(r15)
            goto L2f
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r3)
            throw r15
        L1d:
            yhm.o.b(r15)
            ekf.k r15 = new ekf.k
            r3 = 0
            r15.<init>(r2, r1, r3)
            r14.v = r4
            java.lang.Object r15 = r2.Y2(r14, r15)
            if (r15 != r0) goto L2f
            r15 = r0
        L2f:
            return r15
        L30:
            com.revolut.domain.interactors.transactions.a r0 = r2.f127102n
            klf.h0 r5 = r2.f127100l
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r7 = r14.v
            r8 = 3
            r9 = 2
            if (r7 == 0) goto L54
            if (r7 == r4) goto L50
            if (r7 == r9) goto L4c
            if (r7 != r8) goto L46
            yhm.o.b(r15)
            goto L92
        L46:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r3)
            throw r15
        L4c:
            yhm.o.b(r15)
            goto L84
        L50:
            yhm.o.b(r15)
            goto L64
        L54:
            yhm.o.b(r15)
            kotlinx.coroutines.flow.SharedFlow r15 = r5.d()
            r14.v = r4
            java.lang.Object r15 = vkm.q.x(r15, r14)
            if (r15 != r6) goto L64
            goto Lab
        L64:
            tof.a3 r15 = (tof.a3) r15
            java.lang.String r15 = r15.f272581b
            r14.v = r9
            r3 = r0
            mjf.b0 r3 = (mjf.b0) r3
            x71.e r3 = r3.f205982a
            xif.s r3 = (xif.s) r3
            r3.getClass()
            xif.r r7 = new xif.r
            r7.<init>(r3, r15, r1, r4)
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r15, r7, r14)
            if (r15 != r6) goto L84
            goto Lab
        L84:
            java.lang.String r15 = (java.lang.String) r15
            r5.k()
            r14.v = r8
            java.lang.Object r15 = com.revolut.domain.interactors.transactions.a.a(r0, r15, r14)
            if (r15 != r6) goto L92
            goto Lab
        L92:
            mii.k r7 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r15 = com.revolut.feature.transactions.impl.R$string.recurring_payment_details_action_refund_direct_debit_request_success
            r0 = 14
            r9.<init>(r15, r1, r1, r0)
            r12 = 0
            r13 = 28
            java.lang.String r8 = "ID_SHOT_DIALOG_SUCCESS"
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            kotlinx.coroutines.flow.Flow r6 = r2.L2(r7)
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
