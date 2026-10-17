package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f306692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5k.x f306693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tsk.t f306694c;
    public final jlf.f d;

    public e(klf.h0 commonDataSource, p5k.x transferBreakdownMapper, tsk.t inputResolver, jlf.f paymentBreakdownClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transferBreakdownMapper, "transferBreakdownMapper");
        Intrinsics.checkNotNullParameter(inputResolver, "inputResolver");
        Intrinsics.checkNotNullParameter(paymentBreakdownClickHandler, "paymentBreakdownClickHandler");
        this.f306692a = commonDataSource;
        this.f306693b = transferBreakdownMapper;
        this.f306694c = inputResolver;
        this.d = paymentBreakdownClickHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(xkf.e r21, tof.a3 r22, tof.t3 r23, do3.n r24, gim.c r25) {
        /*
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof xkf.d
            if (r2 == 0) goto L17
            r2 = r1
            xkf.d r2 = (xkf.d) r2
            int r3 = r2.f306690w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f306690w = r3
            goto L1c
        L17:
            xkf.d r2 = new xkf.d
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f306690w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L47
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            yhm.o.b(r1)
            tsk.t r1 = r0.f306694c
            r2.f306690w = r5
            r4 = r22
            r5 = r23
            r6 = r24
            java.lang.Object r1 = r1.i(r4, r5, r6, r2)
            if (r1 != r3) goto L47
            goto L76
        L47:
            xkf.f r1 = (xkf.f) r1
            if (r1 != 0) goto L4e
            zhm.f0 r3 = zhm.f0.f322471a
            goto L76
        L4e:
            p5k.x r4 = r0.f306693b
            dj0.d r5 = r1.f306698a
            p5k.v r6 = r1.f306699b
            dj0.d r7 = r1.f306700c
            dj0.d r8 = r1.d
            tof.f3 r9 = r1.e
            prf.g r10 = r1.f
            z3l.a r11 = r1.f306701g
            dj0.d r12 = r1.f306702h
            z3l.a r13 = r1.i
            p5k.o r14 = r1.f306703j
            java.util.List r15 = r4.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r19 = 0
            r20 = 31
            r16 = 0
            r17 = 0
            r18 = 0
            yp0.b.k(r15, r16, r17, r18, r19, r20)
            r3 = r15
        L76:
            java.io.Serializable r3 = (java.io.Serializable) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.e.a(xkf.e, tof.a3, tof.t3, do3.n, gim.c):java.io.Serializable");
    }

    public final cmf.p b() {
        klf.h0 h0Var = this.f306692a;
        return new cmf.p(ta6.a.h(h0Var.d(), h0Var.c(), h0Var.j(), new dlf.g(this, null, 2)), new c(0), zhm.u.c(this.d), "BankTransferPaymentBreakdown");
    }
}
