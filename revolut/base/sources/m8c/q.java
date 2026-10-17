package m8c;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y7c.a f203483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f203484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f203485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DeferredPaymentScreenContract$InputData f203486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wsg.n f203487t;
    public final k u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y7c.a deferredPaymentRepository, i bottomDialogItemProvider, j60.a bottomExpandableDialogControllerExtension, jki.p stateMapper, DeferredPaymentScreenContract$InputData inputData, wsg.n walletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(deferredPaymentRepository, "deferredPaymentRepository");
        Intrinsics.checkNotNullParameter(bottomDialogItemProvider, "bottomDialogItemProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f203483p = deferredPaymentRepository;
        this.f203484q = bottomDialogItemProvider;
        this.f203485r = bottomExpandableDialogControllerExtension;
        this.f203486s = inputData;
        this.f203487t = walletInteractor;
        this.u = new k(new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable y2(m8c.q r12, xi0.b r13, gim.c r14) {
        /*
            boolean r0 = r14 instanceof m8c.n
            if (r0 == 0) goto L13
            r0 = r14
            m8c.n r0 = (m8c.n) r0
            int r1 = r0.f203479w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203479w = r1
            goto L18
        L13:
            m8c.n r0 = new m8c.n
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203479w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L28
            goto L62
        L28:
            r0 = move-exception
            r12 = r0
            goto L70
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r14)
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            wsg.n r5 = r12.f203487t     // Catch: java.lang.Throwable -> L28
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            efm.r r12 = osg.b.o(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L28
            m56.g r13 = new m56.g     // Catch: java.lang.Throwable -> L28
            r14 = 15
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L28
            efm.r r12 = m70.a.g(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L28
            efm.d0 r12 = r12.firstOrError()     // Catch: java.lang.Throwable -> L28
            java.lang.String r13 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)     // Catch: java.lang.Throwable -> L28
            r0.f203479w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r14 = nim.a.b(r12, r0)     // Catch: java.lang.Throwable -> L28
            if (r14 != r1) goto L62
            return r1
        L62:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r12)     // Catch: java.lang.Throwable -> L28
            io3.d r14 = (io3.d) r14     // Catch: java.lang.Throwable -> L28
            dj0.d r12 = z92.f.j(r14)     // Catch: java.lang.Throwable -> L28
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L76
        L70:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L76:
            boolean r13 = r12 instanceof yhm.n
            if (r13 == 0) goto L7b
            goto L7c
        L7b:
            r4 = r12
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m8c.q.y2(m8c.q, xi0.b, gim.c):java.io.Serializable");
    }

    @Override // yji.l
    public final void T1(long j2) {
        z2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void z2() {
        DeferredPaymentScreenContract$InputData deferredPaymentScreenContract$InputData = this.f203486s;
        String paymentId = deferredPaymentScreenContract$InputData.f84474a;
        k7c.h hVar = (k7c.h) this.f203483p;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        efm.r rVarF = hVar.e.f(paymentId, true);
        String paymentId2 = deferredPaymentScreenContract$InputData.f84474a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
        yji.l.b1(this, rd0.e.b(nim.a.w(kli.a.h(rVarF, hVar.f.f(paymentId2, true)), new m62.l(8))), null, new m75.i(this, null, 3), 3);
    }
}
