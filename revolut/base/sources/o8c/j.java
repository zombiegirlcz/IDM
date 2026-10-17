package o8c;

import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l6c.b;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends n implements a6c.f, a6c.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b6c.a f223010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q7c.g f223011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nkl.b f223012n;
    public final xjl.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rdc.b f223013p;

    public j(b6c.a paymentsInteractor, q7c.g paymentMethodsInteractor, nkl.b revolutSsoFlowsFactory, xjl.i revolutSsoFlowConfigurationInteractor, rdc.b errorReasonToClauseMapper) {
        Intrinsics.checkNotNullParameter(paymentsInteractor, "paymentsInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(errorReasonToClauseMapper, "errorReasonToClauseMapper");
        this.f223010l = paymentsInteractor;
        this.f223011m = paymentMethodsInteractor;
        this.f223012n = revolutSsoFlowsFactory;
        this.o = revolutSsoFlowConfigurationInteractor;
        this.f223013p = errorReasonToClauseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o8c.b
            if (r0 == 0) goto L13
            r0 = r8
            o8c.b r0 = (o8c.b) r0
            int r1 = r0.f222994w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222994w = r1
            goto L18
        L13:
            o8c.b r0 = new o8c.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222994w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L53
        L29:
            r5 = move-exception
            goto L67
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            b6c.a r8 = r4.f223010l     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f222994w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            q7c.j r8 = (q7c.j) r8     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r8 = r8.a(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r8 != r1) goto L45
            return r1
        L45:
            g6c.a r8 = (g6c.a) r8     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            a6c.b r5 = new a6c.b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r6 = r8.f140916a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            q6c.n r7 = r8.f140917b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L59
        L53:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L59:
            java.lang.Throwable r6 = yhm.m.a(r5)
            if (r6 != 0) goto L60
            goto L66
        L60:
            a6c.c r5 = new a6c.c
            r6 = 0
            r5.<init>(r6)
        L66:
            return r5
        L67:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o8c.j.Z2(com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o8c.c
            if (r0 == 0) goto L13
            r0 = r6
            o8c.c r0 = (o8c.c) r0
            int r1 = r0.f222996x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222996x = r1
            goto L18
        L13:
            o8c.c r0 = new o8c.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222996x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.u
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L49
        L29:
            r6 = move-exception
            goto L4e
        L2b:
            r5 = move-exception
            goto L6d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            b6c.a r6 = r4.f223010l     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.u = r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f222996x = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            q7c.j r6 = (q7c.j) r6     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r6 = r6.b(r5, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L54
        L4e:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L54:
            java.lang.Throwable r6 = yhm.m.a(r6)
            if (r6 == 0) goto L6a
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Failed to report payment failure to server for paymentToken="
            java.lang.String r5 = j6.a.q(r2, r5)
            r2 = 0
            rd0.d.a(r1, r2, r5, r6, r0)
        L6a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L6d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o8c.j.b3(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object c3(l6c.b bVar, PaymentInitiationParams paymentInitiationParams, f fVar) {
        if ((bVar instanceof l6c.h) || (bVar instanceof b.a)) {
            return a6c.d.f1601a;
        }
        if (bVar instanceof l6c.e) {
            return new a6c.c(((l6c.e) bVar).f192391a);
        }
        if (bVar instanceof l6c.f) {
            return new a6c.c(((l6c.f) bVar).f192392a);
        }
        if (bVar instanceof l6c.g) {
            return Z2(new AcceptPaymentParams(((l6c.g) bVar).f192393a, k.d(paymentInitiationParams.f84327b), paymentInitiationParams.f, paymentInitiationParams.e), null, null, fVar);
        }
        if ((bVar instanceof l6c.k) || (bVar instanceof l6c.j) || (bVar instanceof l6c.d) || (bVar instanceof l6c.i)) {
            return new a6c.c(null);
        }
        if (bVar instanceof b.C1094b) {
            return a6c.a.f1597a;
        }
        if (!(bVar instanceof l6c.c)) {
            throw new NoWhenBranchMatchedException();
        }
        l6c.c cVar = (l6c.c) bVar;
        List list = cVar.f192388c;
        List list2 = list;
        return (list2 == null || list2.isEmpty() || cVar.d == null) ? new a6c.c(null) : d3(new AcceptPaymentParams(cVar.f192386a, k.d(paymentInitiationParams.f84327b), paymentInitiationParams.f, paymentInitiationParams.e), cVar.f192387b, list, cVar.d, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        if (b3(r12, r2) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
    
        if (b3(r12, r2) == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
    
        if (b3(r12, r2) == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams r20, java.lang.String r21, java.util.List r22, java.lang.String r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8c.j.d3(com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams, java.lang.String, java.util.List, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof o8c.f
            if (r0 == 0) goto L13
            r0 = r15
            o8c.f r0 = (o8c.f) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            o8c.f r0 = new o8c.f
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f223004y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            goto L7b
        L2b:
            r0 = move-exception
            r14 = r0
            goto L80
        L2e:
            r0 = move-exception
            r14 = r0
            goto Lb0
        L32:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3a:
            int r14 = r0.f223003x
            int r2 = r0.f223002w
            o8c.j r4 = r0.v
            com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams r6 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r12 = r2
            r2 = r14
            r14 = r6
            r6 = r4
            r4 = r12
            goto L68
        L4b:
            yhm.o.b(r15)
            yhm.m$a r15 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            b6c.a r15 = r13.f223010l     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.u = r14     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.v = r13     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r2 = 0
            r0.f223002w = r2     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.f223003x = r2     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.A = r4     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            q7c.j r15 = (q7c.j) r15     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            java.lang.Object r15 = r15.d(r14, r5, r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            if (r15 != r1) goto L66
            goto L7a
        L66:
            r6 = r13
            r4 = r2
        L68:
            l6c.b r15 = (l6c.b) r15     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.u = r5     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.v = r5     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.f223002w = r4     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.f223003x = r2     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r0.A = r3     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            java.lang.Object r15 = r6.c3(r15, r14, r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            if (r15 != r1) goto L7b
        L7a:
            return r1
        L7b:
            a6c.e r15 = (a6c.e) r15     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            goto L86
        L80:
            yhm.m$a r15 = yhm.m.INSTANCE
            yhm.n r15 = yhm.o.a(r14)
        L86:
            java.lang.Throwable r14 = yhm.m.a(r15)
            if (r14 != 0) goto L8d
            goto Laf
        L8d:
            java.lang.Class<o8c.j> r15 = o8c.j.class
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KClass r15 = r0.b(r15)
            java.lang.String r7 = r15.m()
            java.util.concurrent.CopyOnWriteArrayList r15 = rd0.d.f253311a
            rd0.c r6 = rd0.c.DEBUG
            java.lang.String r15 = "Failed to initiate the payment: "
            java.lang.String r8 = v1.c.u(r15, r14)
            r10 = 0
            r11 = 16
            r9 = 0
            rd0.d.b(r6, r7, r8, r9, r10, r11)
            a6c.c r15 = new a6c.c
            r15.<init>(r5)
        Laf:
            return r15
        Lb0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o8c.j.e3(com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r2 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.FullRevPointsPaymentInitiationParams r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o8c.j.f3(com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.FullRevPointsPaymentInitiationParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g3(java.lang.String r18, u6c.t r19, gim.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof o8c.i
            if (r2 == 0) goto L17
            r2 = r1
            o8c.i r2 = (o8c.i) r2
            int r3 = r2.f223009w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f223009w = r3
            goto L1c
        L17:
            o8c.i r2 = new o8c.i
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f223009w
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto L63
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            u6c.n r7 = new u6c.n
            r14 = 0
            r16 = 483(0x1e3, float:6.77E-43)
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = r18
            r10 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            q7c.g r1 = r0.f223011m
            akg.n r1 = r1.d(r7)
            a07.p r4 = new a07.p
            r7 = 27
            r4.<init>(r1, r7)
            r1 = 3
            jhi.b r1 = mo3.a.g(r4, r6, r6, r1)
            r2.f223009w = r5
            java.lang.Object r1 = vkm.q.x(r1, r2)
            if (r1 != r3) goto L63
            return r3
        L63:
            u6c.j0 r1 = (u6c.j0) r1
            java.util.List r2 = r1.f277565a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L72:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod r4 = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod) r4
            boolean r4 = r4 instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.RevolutAccount
            if (r4 == 0) goto L72
            goto L85
        L84:
            r3 = r6
        L85:
            boolean r2 = r3 instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.RevolutAccount
            if (r2 == 0) goto L8c
            r6 = r3
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$RevolutAccount r6 = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.RevolutAccount) r6
        L8c:
            if (r6 == 0) goto Lac
            java.lang.String r1 = r1.f277567c
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket r1 = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.c(r6, r1)
            if (r1 == 0) goto La4
            dj0.d r1 = r1.f84381j
            if (r1 == 0) goto La4
            xi0.b r1 = r1.f115083b
            if (r1 == 0) goto La4
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r6, r1)
            return r2
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Default Revolut account pocket is not available"
            r1.<init>(r2)
            throw r1
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Revolut account payment method is not available"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o8c.j.g3(java.lang.String, u6c.t, gim.c):java.io.Serializable");
    }
}
