package t45;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import k35.u;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f267907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l35.b f267908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m35.c f267909c;
    public final y45.i d;
    public final y45.h e;
    public final r35.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wie.a f267910g;

    public k(m navigator, l35.b loanInteractor, m35.c loanAutopayAccountMapper, y45.i loanProductInteractor, y45.h loanProductFeatureTogglesInteractor, r35.e repaymentNavigationHelper, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(repaymentNavigationHelper, "repaymentNavigationHelper");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f267907a = navigator;
        this.f267908b = loanInteractor;
        this.f267909c = loanAutopayAccountMapper;
        this.d = loanProductInteractor;
        this.e = loanProductFeatureTogglesInteractor;
        this.f = repaymentNavigationHelper;
        this.f267910g = creditAccountDestinationResolver;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        u.Companion.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return k35.i.a(deeplink.f173629c) != null;
    }

    public final d0 b(String str) {
        d0 d0VarFirstOrError = m70.a.g(nim.a.w(((y45.f) this.f267908b).l(str, w4l.j.f294644c), new sef.j(str, 22)), null, new szb.f(20), 1).cast(NaviCommand.class).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final d0 c(String str) {
        d0 d0VarFirstOrError = m70.a.g(this.d.b(str, w4l.i.f294643c), null, new szb.f(18), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t45.f
            if (r0 == 0) goto L13
            r0 = r8
            t45.f r0 = (t45.f) r0
            int r1 = r0.f267900x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267900x = r1
            goto L18
        L13:
            t45.f r0 = new t45.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267900x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            l35.b r8 = r6.f267908b
            efm.r r8 = l35.b.f(r8, r7)
            szb.f r2 = new szb.f
            r5 = 19
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r4, r2, r3)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f267900x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard r8 = (com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard) r8
            q06.h r0 = new q06.h
            com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$SelectBackupCardFlowNavigationDestination r1 = new com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$SelectBackupCardFlowNavigationDestination
            kotlin.jvm.internal.Intrinsics.h(r8)
            r2 = 0
            r1.<init>(r7, r8, r2)
            r0.<init>(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t45.k.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x022b, code lost:
    
        if (r7 == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r7 == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        if (r7 == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        if (r7 == r1) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t45.k.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(this.e.j(), null, new szb.f(17), 1), kotlin.coroutines.g.f186406a).firstOrError();
        sx4.c cVar = new sx4.c(new pud.b((Object) this, deeplink, z, 15), 28);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, cVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t45.g
            if (r0 == 0) goto L13
            r0 = r8
            t45.g r0 = (t45.g) r0
            int r1 = r0.f267901w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267901w = r1
            goto L18
        L13:
            t45.g r0 = new t45.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267901w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L80
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L5f
        L37:
            yhm.o.b(r8)
            w4l.h r8 = w4l.h.f294642c
            y45.i r2 = r7.d
            efm.r r8 = r2.d(r8)
            szb.f r2 = new szb.f
            r6 = 23
            r2.<init>(r6)
            efm.r r8 = m70.a.g(r8, r5, r2, r4)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f267901w = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5f
            goto L7f
        L5f:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Object r2 = zhm.d0.M0(r8)
            com.revolut.feature.credit.loan.api.models.rev10.Loan r2 = (com.revolut.feature.credit.loan.api.models.rev10.Loan) r2
            if (r2 == 0) goto L88
            com.revolut.feature.credit.models.CreditAccountType$Loan r8 = new com.revolut.feature.credit.models.CreditAccountType$Loan
            java.lang.String r2 = r2.f70108a
            r8.<init>(r2)
            r0.f267901w = r3
            rie.a r2 = rie.b.Companion
            wie.a r2 = r7.f267910g
            java.lang.Object r8 = r2.c(r8, r5, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            com.revolut.kompot.common.ParcelableDestination r8 = (com.revolut.kompot.common.ParcelableDestination) r8
            q06.h r0 = new q06.h
            r0.<init>(r8, r5)
            return r0
        L88:
            int r8 = r8.size()
            if (r8 <= r4) goto L96
            q06.h r8 = new q06.h
            com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$LoansListNavigationDestination r0 = com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig.LoansListNavigationDestination.f70233a
            r8.<init>(r0, r5)
            return r8
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t45.k.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof t45.h
            if (r0 == 0) goto L13
            r0 = r10
            t45.h r0 = (t45.h) r0
            int r1 = r0.f267902w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267902w = r1
            goto L18
        L13:
            t45.h r0 = new t45.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267902w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L3f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            efm.d0 r9 = r8.c(r9)
            r0.f267902w = r3
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r10 = (com.revolut.feature.credit.loan.api.models.rev10.LoanDetails) r10
            com.revolut.feature.credit.loan.api.models.rev10.Loan r9 = r10.f70144a
            com.revolut.feature.credit.loan.api.models.rev10.LoanState r0 = r9.getI()
            boolean r0 = r0 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Repaid
            r1 = 0
            if (r0 != 0) goto L63
            com.revolut.feature.credit.loan.api.models.rev10.LoanState r9 = r9.getI()
            boolean r9 = r9 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Planned
            if (r9 == 0) goto L55
            goto L63
        L55:
            q06.h r9 = new q06.h
            r35.e r0 = r8.f
            g55.c r0 = (g55.c) r0
            com.revolut.feature.credit.loan.api.navigation.LoanKompotDestination r10 = r0.b(r10, r1)
            r9.<init>(r10, r1)
            return r9
        L63:
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r2 = rd0.c.WARNING
            com.revolut.feature.credit.loan.api.models.rev10.Loan r9 = r10.f70144a
            com.revolut.feature.credit.loan.api.models.rev10.LoanState r9 = r9.i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Partial repayment - unrepayable state: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            r6 = 0
            r7 = 16
            java.lang.String r3 = "LoanActionPerformerImpl"
            r5 = 0
            rd0.d.b(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t45.k.h(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t45.i
            if (r0 == 0) goto L13
            r0 = r7
            t45.i r0 = (t45.i) r0
            int r1 = r0.f267904x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267904x = r1
            goto L18
        L13:
            t45.i r0 = new t45.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267904x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r6 = r0.u
            yhm.o.b(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            efm.d0 r6 = r5.c(r6)
            r0.f267904x = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L48
            goto L5c
        L48:
            r6 = r7
            com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r6 = (com.revolut.feature.credit.loan.api.models.rev10.LoanDetails) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            r0.u = r6
            r0.f267904x = r4
            m35.c r7 = r5.f267909c
            c55.g r7 = (c55.g) r7
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            x35.e r7 = (x35.e) r7
            q06.h r0 = new q06.h
            com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$SetupSepaDirectDebitDestination r1 = new com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$SetupSepaDirectDebitDestination
            kotlin.jvm.internal.Intrinsics.h(r6)
            r1.<init>(r6, r7)
            r6 = 0
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t45.k.i(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t45.j
            if (r0 == 0) goto L13
            r0 = r8
            t45.j r0 = (t45.j) r0
            int r1 = r0.f267906x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267906x = r1
            goto L18
        L13:
            t45.j r0 = new t45.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267906x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            y45.i r8 = r6.d
            w4l.h r2 = w4l.h.f294642c
            efm.r r8 = r8.a(r7, r2)
            szb.f r2 = new szb.f
            r5 = 22
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r4, r2, r3)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f267906x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            com.revolut.feature.credit.loan.api.models.rev10.Loan r8 = (com.revolut.feature.credit.loan.api.models.rev10.Loan) r8
            q35.h r0 = r8.f
            q35.g r0 = r0.f241820c
            int[] r1 = t45.c.f267895a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L88
            r1 = 2
            if (r0 == r1) goto L79
            r1 = 3
            if (r0 != r1) goto L73
            goto L79
        L73:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L79:
            q06.h r0 = new q06.h
            com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$StatementsNavigationDestination r1 = new com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig$StatementsNavigationDestination
            q35.h r8 = r8.f
            q35.g r8 = r8.f241820c
            r1.<init>(r7, r8)
            r0.<init>(r1, r4)
            return r0
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t45.k.j(java.lang.String, gim.c):java.lang.Object");
    }
}
