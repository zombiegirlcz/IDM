package ekf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationDestination;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f127069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d2k.g f127070n;
    public final mjf.u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zv9.a f127071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final co9.b f127072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fkf.i f127073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mkf.f f127074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w0 f127075t;

    public f(klf.h0 commonDataSource, m1 juniorDataSource, d2k.g paymentsBankTransferNaviCommandProvider, mjf.u recallableInteractor, zv9.a paymentsProductFeatureChecker, co9.b paymentCounterpartyInteractor, fkf.i mapper, mkf.f dataResolver, w0 recipientChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dataResolver, "dataResolver");
        Intrinsics.checkNotNullParameter(recipientChecker, "recipientChecker");
        this.f127068l = commonDataSource;
        this.f127069m = juniorDataSource;
        this.f127070n = paymentsBankTransferNaviCommandProvider;
        this.o = recallableInteractor;
        this.f127071p = paymentsProductFeatureChecker;
        this.f127072q = paymentCounterpartyInteractor;
        this.f127073r = mapper;
        this.f127074s = dataResolver;
        this.f127075t = recipientChecker;
    }

    public final cmf.f Z2() {
        klf.h0 h0Var = this.f127068l;
        SharedFlow sharedFlowD = h0Var.d();
        SharedFlow sharedFlowC = h0Var.c();
        Flow flowJ = h0Var.j();
        cw9.d dVar = (cw9.d) this.f127071p;
        return new cmf.f(ta6.a.d(sharedFlowD, sharedFlowC, flowJ, dVar.b(), dVar.f109573b.A("TRANSFER.scheduled"), this.f127069m.a(), new d(this, null)), zhm.u.c(this), "BankTransferActions");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ekf.a
            if (r0 == 0) goto L13
            r0 = r5
            ekf.a r0 = (ekf.a) r0
            int r1 = r0.f127042w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127042w = r1
            goto L18
        L13:
            ekf.a r0 = new ekf.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127042w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            klf.h0 r5 = r4.f127068l
            java.lang.String r5 = r5.f185494j
            mjf.u r2 = r4.o
            pfm.r r5 = r2.a(r5)
            r0.f127042w = r3
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.f.b3(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (a10.b.B(v1.Companion, t1.CONFIRM_CANCEL_BANK_TRANSFER, str)) {
            A2(new TransferCancellationDestination(this.f127068l.f185494j));
            z = true;
        } else {
            if (Intrinsics.f(str, u1.a(t1.SEND_AGAIN))) {
                return c3(m1l.a.SCHEDULE_ENABLED, (gim.c) continuation);
            }
            if (Intrinsics.f(str, u1.a(t1.SEND_AGAIN_UPI))) {
                return d3((gim.c) continuation);
            }
            if (Intrinsics.f(str, u1.a(t1.RECALL))) {
                return b3((gim.c) continuation);
            }
            if (Intrinsics.f(str, u1.a(t1.RECURRING))) {
                return c3(m1l.a.SCHEDULE_REQUIRED, (gim.c) continuation);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        if (e3(r8, r2, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(m1l.a r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ekf.b
            if (r0 == 0) goto L13
            r0 = r9
            ekf.b r0 = (ekf.b) r0
            int r1 = r0.f127047y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127047y = r1
            goto L18
        L13:
            ekf.b r0 = new ekf.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f127045w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127047y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r9)
            goto L9e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            tof.a3 r8 = r0.v
            m1l.a r2 = r0.u
            yhm.o.b(r9)
            goto L6d
        L3e:
            m1l.a r8 = r0.u
            yhm.o.b(r9)
            goto L58
        L44:
            yhm.o.b(r9)
            klf.h0 r9 = r7.f127068l
            kotlinx.coroutines.flow.SharedFlow r9 = r9.d()
            r0.u = r8
            r0.f127047y = r5
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L58
            goto L9d
        L58:
            tof.a3 r9 = (tof.a3) r9
            r0.u = r8
            r0.v = r9
            r0.f127047y = r4
            ekf.w0 r2 = r7.f127075t
            java.lang.Object r2 = r2.a(r9, r0)
            if (r2 != r1) goto L69
            goto L9d
        L69:
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L6d:
            ekf.s0 r9 = (ekf.s0) r9
            boolean r4 = r9 instanceof ekf.t0
            r5 = 0
            if (r4 == 0) goto L89
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r8 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            ekf.t0 r9 = (ekf.t0) r9
            com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousRecipientWarningDestination r9 = r9.f127127a
            yhi.b r0 = yhi.b.BOTTOM_DIALOG
            r1 = 12
            r8.<init>(r9, r0, r5, r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.c(r8)
            r7.A2(r8)
            goto L9e
        L89:
            ekf.s0$a r4 = ekf.s0.a.f127125a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r4)
            if (r9 == 0) goto La1
            r0.u = r5
            r0.v = r5
            r0.f127047y = r3
            java.lang.Object r8 = r7.e3(r8, r2, r0)
            if (r8 != r1) goto L9e
        L9d:
            return r1
        L9e:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        La1:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.f.c3(m1l.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ekf.c
            if (r0 == 0) goto L13
            r0 = r10
            ekf.c r0 = (ekf.c) r0
            int r1 = r0.f127052w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127052w = r1
            goto L18
        L13:
            ekf.c r0 = new ekf.c
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127052w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L6e
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            yhm.o.b(r10)
            goto L48
        L36:
            yhm.o.b(r10)
            klf.h0 r10 = r9.f127068l
            kotlinx.coroutines.flow.SharedFlow r10 = r10.d()
            r0.f127052w = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L48
            goto L6d
        L48:
            tof.a3 r10 = (tof.a3) r10
            tof.u1 r10 = r10.f272598k1
            if (r10 == 0) goto L96
            java.lang.String r10 = r10.f273097a
            if (r10 != 0) goto L53
            goto L96
        L53:
            co9.b r2 = r9.f127072q
            kotlinx.coroutines.flow.Flow r10 = r2.d(r10)
            ej9.t r2 = new ej9.t
            r5 = 11
            r2.<init>(r5)
            r5 = 0
            jhi.b r10 = mo3.a.g(r10, r5, r2, r4)
            r0.f127052w = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r1 = r10
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r1 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r1
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer r10 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToAlias r0 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToAlias
            java.lang.String r2 = "UPI_ID"
            java.lang.String r2 = r1.a(r2)
            if (r2 != 0) goto L7f
            java.lang.String r2 = ""
        L7f:
            r7 = 0
            r8 = 252(0xfc, float:3.53E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r7 = 14
            r2 = r10
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r9.A2(r2)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L96:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.f.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(tof.a3 r18, m1l.a r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.f.e3(tof.a3, m1l.a, gim.c):java.lang.Object");
    }
}
