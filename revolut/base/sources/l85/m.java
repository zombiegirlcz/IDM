package l85;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f192798w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f192798w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f192798w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (l85.n.I2(r8, r24) == r3) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            l85.f r1 = r0.f192798w
            q35.h0 r2 = r1.f192787a
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.u
            r5 = 2
            r6 = 1
            r7 = 0
            l85.n r8 = r0.v
            if (r4 == 0) goto L26
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            yhm.o.b(r25)
            goto L9d
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            yhm.o.b(r25)
            goto L51
        L26:
            yhm.o.b(r25)
            skm.a2 r4 = r8.f192803t
            if (r4 == 0) goto L30
            r4.f(r7)
        L30:
            y45.j r9 = r8.f192800q
            com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData r4 = r8.o
            java.lang.String r10 = r4.f70573a
            java.lang.String r11 = r2.f241823a
            dj0.d r12 = r4.f70574b
            long r12 = r12.f115082a
            q35.g0 r14 = r4.f70575c
            com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension$RepaymentAccountState r1 = r1.f192788b
            java.lang.String r15 = r1.a()
            pfm.a r1 = r9.a(r10, r11, r12, r14, r15)
            r0.u = r6
            java.lang.Object r1 = nim.a.a(r1, r0)
            if (r1 != r3) goto L51
            goto L9c
        L51:
            java.lang.String r10 = r2.e
            if (r10 == 0) goto L94
            nii.y0 r1 = new nii.y0
            nii.j0 r2 = new nii.j0
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r22 = 0
            r23 = 4094(0xffe, float:5.737E-42)
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11 = r2
            r12 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            r3 = 4
            java.lang.String r4 = "repayment_success_status_dialog"
            r1.<init>(r4, r11, r2, r3)
            kotlinx.coroutines.flow.Flow r9 = r8.X1(r1)
            l85.l r12 = new l85.l
            r1 = 0
            r12.<init>(r8, r7, r1)
            r13 = 3
            r10 = 0
            r11 = 0
            skm.a2 r1 = yji.l.a1(r8, r9, r10, r11, r12, r13)
            return r1
        L94:
            r0.u = r5
            java.lang.Object r1 = l85.n.I2(r8, r0)
            if (r1 != r3) goto L9d
        L9c:
            return r3
        L9d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l85.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
