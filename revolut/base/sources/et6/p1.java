package et6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdateItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.i f129297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au6.v0 f129298b;

    public p1(gr6.i freelancerCurrencyInteractor, au6.v0 repository) {
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f129297a = freelancerCurrencyInteractor;
        this.f129298b = repository;
    }

    public final pfm.r a(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        au6.k1 k1Var = (au6.k1) this.f129298b;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        pfm.t tVarL = k1Var.f9546a.deleteInvoice(invoiceId).l(new a08.l(k1Var, invoiceId, 7));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return te0.w.g0(tVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.l1
            if (r0 == 0) goto L13
            r0 = r6
            et6.l1 r0 = (et6.l1) r0
            int r1 = r0.f129266w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129266w = r1
            goto L18
        L13:
            et6.l1 r0 = new et6.l1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129266w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            efm.r r5 = r4.e(r5)
            r6 = 3
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            r0.f129266w = r3
            java.lang.Object r6 = nim.a.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.p1.b(boolean, gim.c):java.lang.Object");
    }

    public final akg.n c(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w4l.i iVar = w4l.i.f294643c;
        return nim.a.v(zh9.u0.i(rd0.e.b(d(invoiceId, loadingStrategy.equals(iVar))), rd0.e.b(e(loadingStrategy.equals(iVar))), ((a1) this.f129297a).b()), new w(27));
    }

    public final efm.r d(String invoiceId, boolean z) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        au6.k1 k1Var = (au6.k1) this.f129298b;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return te0.w.f0(nim.a.w(k1Var.f9550h.f(new au6.f1(invoiceId), z), new ak7.g(invoiceId, 15)));
    }

    public final efm.r e(boolean z) {
        return ((au6.k1) this.f129298b).i.f(Unit.f186387a, z);
    }

    public final ufm.n f(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        au6.k1 k1Var = (au6.k1) this.f129298b;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        efm.d0<qt6.b> d0VarResendInvoice = k1Var.f9546a.resendInvoice(invoiceId);
        atg.n nVar = new atg.n(28, new au0.j0(16));
        d0VarResendInvoice.getClass();
        ufm.i iVar = new ufm.i(d0VarResendInvoice, nVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(k1Var.d(iVar));
    }

    public final ufm.n g(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        au6.k1 k1Var = (au6.k1) this.f129298b;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        efm.d0<qt6.b> d0VarSendInvoice = k1Var.f9546a.sendInvoice(invoiceId);
        atg.n nVar = new atg.n(25, new au0.j0(14));
        d0VarSendInvoice.getClass();
        ufm.i iVar = new ufm.i(d0VarSendInvoice, nVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(k1Var.d(iVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (nim.a.b(r1, r3) == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData r22, gim.c r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof et6.n1
            if (r3 == 0) goto L19
            r3 = r2
            et6.n1 r3 = (et6.n1) r3
            int r4 = r3.f129279x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f129279x = r4
            goto L1e
        L19:
            et6.n1 r3 = new et6.n1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f129279x
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L3e
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            yhm.o.b(r2)
            goto L87
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData r1 = r3.u
            yhm.o.b(r2)
            goto L53
        L3e:
            yhm.o.b(r2)
            boolean r2 = r1.f73400c
            if (r2 != 0) goto L48
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L48:
            r3.u = r1
            r3.f129279x = r7
            java.lang.Object r2 = r0.b(r7, r3)
            if (r2 != r4) goto L53
            goto L86
        L53:
            r7 = r2
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r7 = (com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings) r7
            java.lang.String r2 = r1.f73398a
            java.lang.Integer r15 = kotlin.text.z.m(r2)
            java.lang.String r1 = r1.f73399b
            if (r1 != 0) goto L62
            java.lang.String r1 = ""
        L62:
            r14 = r1
            r19 = 0
            r20 = 15999(0x3e7f, float:2.242E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r1 = com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            ufm.n r1 = r0.k(r1)
            r2 = 0
            r3.u = r2
            r3.f129279x = r6
            java.lang.Object r1 = nim.a.b(r1, r3)
            if (r1 != r4) goto L87
        L86:
            return r4
        L87:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.p1.h(com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData, gim.c):java.lang.Object");
    }

    public final ufm.n i(String invoiceId, FreelancerInvoiceUpdate payload) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        au6.k1 k1Var = (au6.k1) this.f129298b;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        ufm.i iVarD = ue0.e.D(k1Var.f9546a.updateInvoice(invoiceId, ft6.h.j(payload)), new au6.x0(k1Var, 2));
        au6.j1 j1Var = au6.j1.f;
        ufm.i iVar = new ufm.i(iVarD, new a0.b(17), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(k1Var.d(iVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r2 != r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r19, com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData r20, gim.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof et6.o1
            if (r3 == 0) goto L19
            r3 = r2
            et6.o1 r3 = (et6.o1) r3
            int r4 = r3.f129288y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f129288y = r4
            goto L1e
        L19:
            et6.o1 r3 = new et6.o1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f129286w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f129288y
            r6 = 2
            r7 = 1
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L4f
            if (r5 == r7) goto L46
            if (r5 == r6) goto L3d
            if (r5 != r8) goto L35
            yhm.o.b(r2)
            goto La3
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData r1 = r3.v
            java.lang.String r5 = r3.u
            yhm.o.b(r2)
        L44:
            r15 = r1
            goto L7b
        L46:
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData r1 = r3.v
            java.lang.String r5 = r3.u
            yhm.o.b(r2)
            r2 = r5
            goto L61
        L4f:
            yhm.o.b(r2)
            r2 = r19
            r3.u = r2
            r3.v = r1
            r3.f129288y = r7
            java.lang.Object r5 = r0.h(r1, r3)
            if (r5 != r4) goto L61
            goto La2
        L61:
            r5 = 0
            efm.r r5 = r0.d(r2, r5)
            efm.r r5 = m70.a.g(r5, r9, r9, r8)
            r3.u = r2
            r3.v = r1
            r3.f129288y = r6
            java.lang.Object r5 = nim.a.c(r5, r3)
            if (r5 != r4) goto L77
            goto La2
        L77:
            r15 = r5
            r5 = r2
            r2 = r15
            goto L44
        L7b:
            java.lang.String r1 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r2 = (com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice) r2
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate r10 = mif.e0.L(r2)
            r16 = 0
            r17 = 31743(0x7bff, float:4.4481E-41)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate r1 = com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate.a(r10, r11, r12, r13, r14, r15, r16, r17)
            ufm.n r1 = r0.i(r5, r1)
            r3.u = r9
            r3.v = r9
            r3.f129288y = r8
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto La3
        La2:
            return r4
        La3:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.p1.j(java.lang.String, com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ufm.n k(com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r21) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.p1.k(com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings):ufm.n");
    }

    public final ufm.n l(String invoiceId, String itemId, FreelancerInvoiceUpdateItem payload) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        au6.k1 k1Var = (au6.k1) this.f129298b;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        efm.d0<qt6.b> d0VarUpdateItemInInvoice = k1Var.f9546a.updateItemInInvoice(invoiceId, itemId, ft6.h.k(payload));
        atg.n nVar = new atg.n(21, new au0.j0(9));
        d0VarUpdateItemInInvoice.getClass();
        ufm.i iVar = new ufm.i(d0VarUpdateItemInInvoice, nVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(k1Var.d(iVar));
    }
}
