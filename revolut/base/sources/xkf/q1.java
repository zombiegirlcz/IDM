package xkf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.core.transfertracker.PaymentTrackingHtmlClauseParcel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.x4;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 extends yji.n implements elf.s0 {
    public final lg0.b A;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f306753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f306754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c6k.e f306755n;
    public final h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w2j.a f306756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d2k.g f306757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f306758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bmf.b f306759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y1k.a f306760t;
    public final f01.a u;
    public final tqi.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sri.m f306761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pff.a f306762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kgm.i f306763y;
    public final uvl.c z;

    public q1(klf.h0 commonDataSource, klf.m1 juniorDataSource, c6k.e trackingFactory, h1 paymentsJointTransactionStateProvider, w2j.a beneficiaryInteractor, d2k.g paymentsBankTransferNaviCommandProvider, gte.a featureToggleInteractor, bmf.b modalFactory, y1k.a bankTransferInteractor, f01.a uiKitResources, tqi.g shareNaviCommandFactory, sri.m navigator, pff.a transactionTroubleshooterInteractor, kgm.i helpRouter, uvl.c paymentsTroubleshootersDelegate, lg0.b deeplinkHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(trackingFactory, "trackingFactory");
        Intrinsics.checkNotNullParameter(paymentsJointTransactionStateProvider, "paymentsJointTransactionStateProvider");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(transactionTroubleshooterInteractor, "transactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(helpRouter, "helpRouter");
        Intrinsics.checkNotNullParameter(paymentsTroubleshootersDelegate, "paymentsTroubleshootersDelegate");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f306753l = commonDataSource;
        this.f306754m = juniorDataSource;
        this.f306755n = trackingFactory;
        this.o = paymentsJointTransactionStateProvider;
        this.f306756p = beneficiaryInteractor;
        this.f306757q = paymentsBankTransferNaviCommandProvider;
        this.f306758r = featureToggleInteractor;
        this.f306759s = modalFactory;
        this.f306760t = bankTransferInteractor;
        this.u = uiKitResources;
        this.v = shareNaviCommandFactory;
        this.f306761w = navigator;
        this.f306762x = transactionTroubleshooterInteractor;
        this.f306763y = helpRouter;
        this.z = paymentsTroubleshootersDelegate;
        this.A = deeplinkHandler;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f306753l;
        return new cmf.p(ta6.a.g(h0Var.c(), h0Var.d(), h0Var.j(), this.f306754m.a(), new amf.g(5, this, q1.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/core/model/domain/user/User;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 3)), new c(10), zhm.u.c(this), "PaymentTrackingWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.core.ui_kit.models.TextLocalisedClause r27, com.revolut.core.ui_kit.models.TextLocalisedClause r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.q1.b3(com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit.models.TextLocalisedClause, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (Intrinsics.f(str, "ID_CLICKABLE_RESEND")) {
            return d3((gim.c) continuation);
        }
        if (Intrinsics.f(str, "ID_CLICKABLE_REFUND_DETAILS")) {
            return c3((gim.c) continuation);
        }
        c6k.c.Companion.getClass();
        return c6k.b.f21813b.f(str) ? b3(new TextLocalisedClause(R$string.bank_transfer_tracker_title_completed, null, null, 14), new TextLocalisedClause(R$string.transfer_tracker_completed_info_sheet_subtitle, null, null, 14), (gim.c) continuation) : c6k.b.f21814c.f(str) ? b3(new TextLocalisedClause(R$string.bank_transfer_tracker_should_arrived_title, null, null, 14), new TextLocalisedClause(R$string.bank_transfer_tracker_should_arrived_subtitle, null, null, 14), (gim.c) continuation) : obj2 instanceof x4 ? e3(((x4) obj2).f273159a, (gim.c) continuation) : obj2 instanceof PaymentTrackingHtmlClauseParcel ? lg0.b.x1(this.A, str, null, null, continuation, 6) : Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xkf.m1
            if (r0 == 0) goto L13
            r0 = r5
            xkf.m1 r0 = (xkf.m1) r0
            int r1 = r0.f306734w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306734w = r1
            goto L18
        L13:
            xkf.m1 r0 = new xkf.m1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306734w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            klf.h0 r5 = r4.f306753l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.c()
            r0.f306734w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            tof.t3 r5 = (tof.t3) r5
            if (r5 == 0) goto L5f
            tof.j4 r5 = r5.f273074r
            if (r5 == 0) goto L5f
            java.lang.String r5 = r5.f272846a
            if (r5 != 0) goto L4e
            goto L5f
        L4e:
            com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination r0 = new com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination
            r1 = 6
            r2 = 0
            k71.i r5 = qk.d.e(r1, r5, r2, r2)
            r0.<init>(r5, r2, r1)
            r4.A2(r0)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.q1.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.q1.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof xkf.o1
            if (r0 == 0) goto L13
            r0 = r13
            xkf.o1 r0 = (xkf.o1) r0
            int r1 = r0.f306744w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306744w = r1
            goto L18
        L13:
            xkf.o1 r0 = new xkf.o1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306744w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r13)
            goto L52
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            yhm.o.b(r13)
            r0.f306744w = r3
            y1k.a r13 = r11.f306760t
            q2k.e r13 = (q2k.e) r13
            q2k.f r13 = r13.f241738b
            l2k.g r13 = (l2k.g) r13
            r13.getClass()
            kq5.d r2 = new kq5.d
            r3 = 28
            r2.<init>(r13, r12, r4, r3)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r12, r2, r0)
            if (r13 != r1) goto L52
            return r1
        L52:
            kq2.j r13 = (kq2.j) r13
            java.lang.String r12 = r13.f188318a
            if (r12 != 0) goto L5b
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L5b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.transactions.impl.R$string.transfer_tracker_share_link
            java.util.List r12 = zhm.u.c(r12)
            r1 = 12
            r13.<init>(r0, r12, r4, r1)
            f01.a r12 = r11.u
            java.lang.CharSequence r13 = r12.b(r13)
            java.lang.String r7 = r13.toString()
            tqi.c r5 = new tqi.c
            r9 = 0
            r10 = 91
            r6 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.transactions.impl.R$string.transfer_tracker_share_link_title
            r1 = 14
            r13.<init>(r0, r4, r4, r1)
            java.lang.CharSequence r12 = r12.b(r13)
            java.lang.String r12 = r12.toString()
            tqi.g r13 = r11.v
            com.revolut.retail.core.navigation.ActivityNavigateCommand r12 = r13.g(r5, r12)
            sri.m r13 = r11.f306761w
            r13.c(r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xkf.q1.e3(java.lang.String, gim.c):java.lang.Object");
    }
}
