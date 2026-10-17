package c8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements w5i.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f22196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7i.p f22197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kye.e f22198c;
    public final t7i.b d;

    public f0(xua.a recurringPaymentInteractor, t7i.p savingsMoveMoneyDelegate, kye.e extraAttributesInteractor, t7i.b backgroundBalanceUpdateDelegate) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(savingsMoveMoneyDelegate, "savingsMoveMoneyDelegate");
        Intrinsics.checkNotNullParameter(extraAttributesInteractor, "extraAttributesInteractor");
        Intrinsics.checkNotNullParameter(backgroundBalanceUpdateDelegate, "backgroundBalanceUpdateDelegate");
        this.f22196a = recurringPaymentInteractor;
        this.f22197b = savingsMoveMoneyDelegate;
        this.f22198c = extraAttributesInteractor;
        this.d = backgroundBalanceUpdateDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.shared.recurring_payments.models.WalletAutomation r7, com.revolut.feature_move_money.api.model.AccountWrapper r8, com.revolut.feature_move_money.api.model.AccountWrapper r9, com.revolut.shared.feature.move_money.api.navigation.Action r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof c8i.b0
            if (r0 == 0) goto L13
            r0 = r11
            c8i.b0 r0 = (c8i.b0) r0
            int r1 = r0.f22177y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22177y = r1
            goto L18
        L13:
            c8i.b0 r0 = new c8i.b0
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f22175w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22177y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.u
            yhm.o.b(r11)
            goto La7
        L37:
            yhm.o.b(r11)
            boolean r11 = r10 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.EditScheduledAutomation
            java.lang.String r2 = "flatMap(...)"
            xua.a r5 = r6.f22196a
            if (r11 == 0) goto L78
            com.revolut.shared.feature.move_money.api.navigation.Action$EditScheduledAutomation r10 = (com.revolut.shared.feature.move_money.api.navigation.Action.EditScheduledAutomation) r10
            com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment r10 = r10.f104814a
            ibd.e r10 = r10.f104804a
            java.lang.String r10 = r10.f160150a
            r0.u = r8
            r0.v = r9
            r0.f22177y = r4
            yua.q r5 = (yua.q) r5
            ufm.b r11 = r5.m()
            yrk.e r3 = new yrk.e
            r4 = 4
            r3.<init>(r5, r4, r10, r7)
            yta.c r7 = new yta.c
            r10 = 25
            r7.<init>(r10, r3)
            ufm.i r10 = new ufm.i
            r3 = 0
            r10.<init>(r11, r7, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            java.lang.Object r7 = nim.a.b(r10, r0)
            if (r7 != r1) goto L73
            goto L75
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L75:
            if (r7 != r1) goto La7
            goto La6
        L78:
            r0.u = r8
            r0.v = r9
            r0.f22177y = r3
            yua.q r5 = (yua.q) r5
            ufm.b r10 = r5.m()
            yrb.i r11 = new yrb.i
            r3 = 15
            r11.<init>(r5, r7, r3)
            yta.c r7 = new yta.c
            r3 = 26
            r7.<init>(r3, r11)
            ufm.i r11 = new ufm.i
            r3 = 0
            r11.<init>(r10, r7, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.lang.Object r7 = nim.a.b(r11, r0)
            if (r7 != r1) goto La2
            goto La4
        La2:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        La4:
            if (r7 != r1) goto La7
        La6:
            return r1
        La7:
            t7i.b r7 = r6.d
            r7.a(r8, r9)
            x5i.c r7 = x5i.c.f302983a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.f0.a(com.revolut.feature.shared.recurring_payments.models.WalletAutomation, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.Action, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c4, code lost:
    
        if (nim.a.b(r1, r5) == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r79, xi0.b r80, long r81, com.revolut.feature_move_money.api.model.AccountWrapper r83, j8l.d r84, java.time.LocalDate r85, com.revolut.feature_move_money.api.model.AccountWrapper r86, java.lang.String r87, gim.c r88) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.f0.b(com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData, xi0.b, long, com.revolut.feature_move_money.api.model.AccountWrapper, j8l.d, java.time.LocalDate, com.revolut.feature_move_money.api.model.AccountWrapper, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        if (r1 == r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
    
        r1 = r2;
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        if (b(r22, r2, r3, r5, r21, r13, r8, r24, r10) == r12) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r17, com.revolut.feature_move_money.api.model.AccountWrapper r19, com.revolut.feature_move_money.api.model.AccountWrapper r20, j8l.d r21, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r22, com.revolut.shared.feature.move_money.api.navigation.Action r23, java.lang.String r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.f0.c(long, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, j8l.d, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData, com.revolut.shared.feature.move_money.api.navigation.Action, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x017b, code lost:
    
        if (nim.a.b(r1, r3) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment r76, long r77, com.revolut.feature_move_money.api.model.AccountWrapper r79, com.revolut.feature_move_money.api.model.AccountWrapper r80, j8l.d r81, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r82, xi0.b r83, java.time.LocalDate r84, java.lang.String r85, gim.c r86) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.f0.d(com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment, long, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, j8l.d, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData, xi0.b, java.time.LocalDate, java.lang.String, gim.c):java.lang.Object");
    }
}
