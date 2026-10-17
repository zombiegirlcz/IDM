package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qce.t0 f127368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oce.h f127369n;
    public final ur2.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xua.a f127370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f127371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public skm.a2 f127372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public skm.a2 f127373s;

    public m(klf.h0 commonDataSource, qce.t0 unblockSubscriptionDialogProvider, oce.h unblockMerchantDialogProvider, ur2.c blockedMerchantsInteractor, xua.a recurringPaymentInteractor, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(unblockSubscriptionDialogProvider, "unblockSubscriptionDialogProvider");
        Intrinsics.checkNotNullParameter(unblockMerchantDialogProvider, "unblockMerchantDialogProvider");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f127367l = commonDataSource;
        this.f127368m = unblockSubscriptionDialogProvider;
        this.f127369n = unblockMerchantDialogProvider;
        this.o = blockedMerchantsInteractor;
        this.f127370p = recurringPaymentInteractor;
        this.f127371q = bottomDialogExtension;
    }

    public final void Z2() {
        j60.a.v(this.f127371q, false, null, 2);
        skm.a2 a2Var = this.f127372r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        skm.a2 a2Var2 = this.f127373s;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        this.f127372r = null;
        this.f127373s = null;
    }

    public final void b3() {
        skm.a2 a2Var = this.f127373s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f127373s = yji.n.j2(this, rd0.e.b(this.f127371q.E()), null, new ec8.c(this, continuation, 13), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r3, java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r2 = this;
            int r0 = r4.hashCode()
            r1 = 1
            switch(r0) {
                case -1104156306: goto L73;
                case 105355698: goto L63;
                case 815566508: goto L30;
                case 1778746639: goto L20;
                case 1847599715: goto L13;
                case 2086174325: goto La;
                default: goto L8;
            }
        L8:
            goto L7b
        La:
            java.lang.String r3 = "CANCEL_UNBLOCK_MERCHANT_LIST_ID"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L1c
            goto L7b
        L13:
            java.lang.String r3 = "BUTTON_CANCEL_UNBLOCK_FUTURE_PAYMENTS_LIST_ID"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L1c
            goto L7b
        L1c:
            r2.Z2()
            goto L7c
        L20:
            java.lang.String r0 = "CONFIRM_UNBLOCK_MERCHANT_LIST_ID"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L29
            goto L7b
        L29:
            gim.c r5 = (gim.c) r5
            java.lang.Object r3 = r2.d3(r3, r5)
            return r3
        L30:
            java.lang.String r5 = "ID_UNBLOCK_SUBSCRIPTION"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L39
            goto L7b
        L39:
            java.lang.String r4 = "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            qua.p r3 = (qua.p) r3
            skm.a2 r4 = r2.f127372r
            r5 = 0
            if (r4 == 0) goto L48
            r4.f(r5)
        L48:
            qce.t0 r4 = r2.f127368m
            efm.r r3 = r4.c(r3, r5)
            vkm.d r3 = rd0.e.b(r3)
            elf.i r4 = new elf.i
            r0 = 1
            r4.<init>(r2, r5, r0)
            r0 = 3
            skm.a2 r3 = yji.n.j2(r2, r3, r5, r4, r0)
            r2.f127372r = r3
            r2.b3()
            goto L7c
        L63:
            java.lang.String r0 = "LIST_ID_UNBLOCK_WIDGET"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L6c
            goto L7b
        L6c:
            gim.c r5 = (gim.c) r5
            java.lang.Object r3 = r2.c3(r3, r5)
            return r3
        L73:
            java.lang.String r0 = "BUTTON_UNBLOCK_FUTURE_PAYMENTS_LIST_ID"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L81
        L7b:
            r1 = 0
        L7c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L81:
            gim.c r5 = (gim.c) r5
            java.lang.Object r3 = r2.e3(r3, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.m.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.Object r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof elf.h
            if (r0 == 0) goto L13
            r0 = r10
            elf.h r0 = (elf.h) r0
            int r1 = r0.f127335x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127335x = r1
            goto L18
        L13:
            elf.h r0 = new elf.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127335x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nr2.b r9 = r0.u
            yhm.o.b(r10)
            goto L4c
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            java.lang.String r10 = "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.api.provider.BlockedMerchantWidgetProvider.BlockedMerchantWidgetParcel"
            kotlin.jvm.internal.Intrinsics.i(r9, r10)
            nr2.b r9 = (nr2.b) r9
            klf.h0 r10 = r8.f127367l
            kotlinx.coroutines.flow.SharedFlow r10 = r10.d()
            r0.u = r9
            r0.f127335x = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            tof.a3 r10 = (tof.a3) r10
            skm.a2 r0 = r8.f127372r
            r1 = 0
            if (r0 == 0) goto L56
            r0.f(r1)
        L56:
            java.lang.String r3 = r9.f218522a
            java.lang.String r4 = k71.k.N(r10)
            com.revolut.feature.blocked_merchants.api.presentation.UnblockTransactionMerchantData r5 = new com.revolut.feature.blocked_merchants.api.presentation.UnblockTransactionMerchantData
            java.lang.String r0 = r10.f272581b
            java.lang.String r2 = r9.f218522a
            tof.h3 r10 = r10.A
            tof.j5 r10 = r10.f272779a
            java.lang.String r10 = r10.d
            r5.<init>(r0, r2, r10)
            java.lang.String r6 = r9.f218524c
            r7 = 8
            oce.h r2 = r8.f127369n
            efm.r r9 = oce.h.c(r2, r3, r4, r5, r6, r7)
            vkm.d r9 = rd0.e.b(r9)
            elf.i r10 = new elf.i
            r0 = 0
            r10.<init>(r8, r1, r0)
            r0 = 3
            skm.a2 r9 = yji.n.j2(r8, r9, r1, r10, r0)
            r8.f127372r = r9
            r8.b3()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.m.c3(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(java.lang.Object r10, gim.c r11) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof elf.j
            if (r0 == 0) goto L13
            r0 = r11
            elf.j r0 = (elf.j) r0
            int r1 = r0.f127351w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127351w = r1
            goto L18
        L13:
            elf.j r0 = new elf.j
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127351w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L55
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r11)
            java.lang.String r11 = "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.api.presentation.UnblockTransactionMerchantData"
            kotlin.jvm.internal.Intrinsics.i(r10, r11)
            com.revolut.feature.blocked_merchants.api.presentation.UnblockTransactionMerchantData r10 = (com.revolut.feature.blocked_merchants.api.presentation.UnblockTransactionMerchantData) r10
            java.lang.String r11 = r10.f64221b
            boolean r2 = kotlin.text.d0.W(r11)
            if (r2 != 0) goto L71
            r9.Z2()
            ur2.c r2 = r9.o
            java.lang.String r10 = r10.f64220a
            pfm.a r10 = r2.d(r11, r10)
            r0.f127351w = r3
            java.lang.Object r10 = nim.a.a(r10, r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            mii.k r2 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.subscriptionscommon.impl.R$string.merchants_block_unblock_success_title_toast
            r11 = 14
            r0 = 0
            r4.<init>(r10, r0, r0, r11)
            r7 = 0
            r8 = 28
            java.lang.String r3 = "unblock_merchant_success"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.L2(r2)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L71:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "blocked merchant id cannot be blank"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.m.d3(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.Object r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof elf.k
            if (r0 == 0) goto L13
            r0 = r13
            elf.k r0 = (elf.k) r0
            int r1 = r0.f127358x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127358x = r1
            goto L18
        L13:
            elf.k r0 = new elf.k
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127358x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            qua.p r12 = r0.u
            yhm.o.b(r13)
            goto L50
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            java.lang.String r13 = "null cannot be cast to non-null type com.revolut.feature.recurring_payments.api.data.models.RecurringPayment"
            kotlin.jvm.internal.Intrinsics.i(r12, r13)
            qua.p r12 = (qua.p) r12
            r11.Z2()
            eg4.b r13 = new eg4.b
            r2 = 6
            r13.<init>(r12, r11, r3, r2)
            r0.u = r12
            r0.f127358x = r4
            java.lang.Object r13 = do3.q.u(r11, r13, r0)
            if (r13 != r1) goto L50
            return r1
        L50:
            nii.y0 r13 = new nii.y0
            qce.t0 r0 = r11.f127368m
            r0.getClass()
            java.lang.String r1 = "subscription"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            f01.c r1 = r0.d
            t70.b r0 = r0.e
            java.lang.String r12 = mae.h.a(r12, r1, r0)
            com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Success r4 = new com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Success
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.subscriptionscommon.impl.R$string.subscription_unblock_success
            java.util.List r12 = zhm.u.c(r12)
            r1 = 12
            r6.<init>(r0, r12, r3, r1)
            r9 = 0
            r10 = 2044(0x7fc, float:2.864E-42)
            java.lang.String r5 = "STATUS_VIEW_UNBLOCK_SUBSCRIPTION_SUCCESS"
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            nii.m0 r12 = com.revolut.retail.operation_status.modal_status.a.a(r4)
            r0 = 0
            r1 = 4
            java.lang.String r2 = "unblock_subscription_success"
            r13.<init>(r2, r12, r0, r1)
            r11.L2(r13)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.m.e3(java.lang.Object, gim.c):java.lang.Object");
    }
}
