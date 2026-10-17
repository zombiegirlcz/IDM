package h4k;

import android.content.Context;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import opf.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f149389n = R$string.payments_bank_transfer_amount_reference_default_value;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferAmountScreenContract$InputData f149390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4k.g f149391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final opf.b f149392c;
    public final fk3.a d;
    public final y1k.a e;
    public final opf.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ty0.c f149393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f149394h;
    public final ypf.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f149395j;
    public final iz9.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final opf.c f149396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h30.q f149397m;

    public k(BankTransferAmountScreenContract$InputData inputData, p4k.g flowInteractor, opf.b paymentsPocketInteractor, fk3.a configurationInteractor, y1k.a bankTransferInteractor, wsg.n walletInteractor, opf.i referenceDataInteractor, ty0.c clauseDisplayer, Context context, ypf.b scheduleAvailabilityInteractor, z fundingSourceInteractor, iz9.c chatTransactionsInteractor, opf.c paymentsSourceAccountInteractor, h30.q brazilianBankTransferAmountInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(referenceDataInteractor, "referenceDataInteractor");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduleAvailabilityInteractor, "scheduleAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(fundingSourceInteractor, "fundingSourceInteractor");
        Intrinsics.checkNotNullParameter(chatTransactionsInteractor, "chatTransactionsInteractor");
        Intrinsics.checkNotNullParameter(paymentsSourceAccountInteractor, "paymentsSourceAccountInteractor");
        Intrinsics.checkNotNullParameter(brazilianBankTransferAmountInteractor, "brazilianBankTransferAmountInteractor");
        this.f149390a = inputData;
        this.f149391b = flowInteractor;
        this.f149392c = paymentsPocketInteractor;
        this.d = configurationInteractor;
        this.e = bankTransferInteractor;
        this.f = referenceDataInteractor;
        this.f149393g = clauseDisplayer;
        this.f149394h = context;
        this.i = scheduleAvailabilityInteractor;
        this.f149395j = fundingSourceInteractor;
        this.k = chatTransactionsInteractor;
        this.f149396l = paymentsSourceAccountInteractor;
        this.f149397m = brazilianBankTransferAmountInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof h4k.b
            if (r0 == 0) goto L13
            r0 = r12
            h4k.b r0 = (h4k.b) r0
            int r1 = r0.f149374w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149374w = r1
            goto L18
        L13:
            h4k.b r0 = new h4k.b
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149374w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L58
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            xi0.b r5 = r11.f101925b
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData r12 = r10.f149390a
            f5j.a r2 = r12.getF102077a()
            wi0.b r6 = f5j.c.e(r2)
            long r7 = r11.f101924a
            f5j.a r11 = r12.getF102077a()
            java.lang.String r9 = r11.f132329a
            y1k.a r11 = r10.e
            r4 = r11
            q2k.e r4 = (q2k.e) r4
            efm.d0 r11 = r4.b(r5, r6, r7, r9)
            r0.f149374w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L58
            return r1
        L58:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.a(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h4k.c
            if (r0 == 0) goto L13
            r0 = r6
            h4k.c r0 = (h4k.c) r0
            int r1 = r0.f149375w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149375w = r1
            goto L18
        L13:
            h4k.c r0 = new h4k.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149375w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            r0.f149375w = r4
            h30.q r6 = r5.f149397m
            java.lang.Object r6 = r6.A0(r0)
            if (r6 != r1) goto L44
            goto L67
        L44:
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L6f
            fk3.a r6 = r5.d
            ik3.c r6 = (ik3.c) r6
            efm.r r6 = r6.n()
            r2 = 3
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r4, r2)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f149375w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.util.Set r6 = (java.util.Set) r6
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h4k.d
            if (r0 == 0) goto L13
            r0 = r6
            h4k.d r0 = (h4k.d) r0
            int r1 = r0.f149376w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149376w = r1
            goto L18
        L13:
            h4k.d r0 = new h4k.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149376w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferExtraConfiguration$NoCurrencyPicker r6 = com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferExtraConfiguration.NoCurrencyPicker.f101939a
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L3d
            e4k.t r5 = e4k.t.f122637a
            return r5
        L3d:
            r0.f149376w = r3
            h30.q r5 = r4.f149397m
            java.lang.Object r6 = r5.R0(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L53
            e4k.v r5 = e4k.v.f122642a
            return r5
        L53:
            e4k.u r5 = e4k.u.f122640a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.c(java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.core.model.account.AccountId r7, java.lang.String r8, java.lang.String r9, k1j.a r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof h4k.e
            if (r0 == 0) goto L13
            r0 = r11
            h4k.e r0 = (h4k.e) r0
            int r1 = r0.f149379y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149379y = r1
            goto L18
        L13:
            h4k.e r0 = new h4k.e
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f149377w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149379y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.core.model.account.AccountId r7 = r0.u
            yhm.o.b(r11)
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r9 = r0.v
            com.revolut.core.model.account.AccountId r7 = r0.u
            yhm.o.b(r11)
            goto L4f
        L3d:
            yhm.o.b(r11)
            r0.u = r7
            r0.v = r9
            r0.f149379y = r4
            opf.z r11 = r6.f149395j
            java.lang.Object r11 = r11.d(r7, r0, r8, r10)
            if (r11 != r1) goto L4f
            goto L5f
        L4f:
            com.revolut.feature.transfer.core.models.FundingSource r11 = (com.revolut.feature.transfer.core.models.FundingSource) r11
            if (r11 != 0) goto L68
            r0.u = r7
            r0.v = r5
            r0.f149379y = r3
            java.lang.Object r11 = r6.f(r7, r0, r9)
            if (r11 != r1) goto L60
        L5f:
            return r1
        L60:
            io3.d r11 = (io3.d) r11
            com.revolut.feature.transfer.core.models.PocketSource r8 = new com.revolut.feature.transfer.core.models.PocketSource
            r8.<init>(r11, r7, r5)
            return r8
        L68:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.d(com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, k1j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData.NewTransfer r38, java.lang.String r39, gim.c r40) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.e(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData$NewTransfer, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.core.model.account.AccountId r7, gim.c r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof h4k.h
            if (r0 == 0) goto L13
            r0 = r8
            h4k.h r0 = (h4k.h) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            h4k.h r0 = new h4k.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f149385x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L70
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            opf.b r7 = r0.f149384w
            java.lang.String r9 = r0.v
            com.revolut.core.model.account.AccountId r2 = r0.u
            yhm.o.b(r8)
            goto L54
        L3c:
            yhm.o.b(r8)
            r0.u = r7
            r0.v = r9
            opf.b r8 = r6.f149392c
            r0.f149384w = r8
            r0.z = r4
            java.lang.Object r2 = r6.b(r0)
            if (r2 != r1) goto L50
            goto L6f
        L50:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L54:
            java.util.Set r8 = (java.util.Set) r8
            java.util.List r9 = zhm.v.l(r9)
            io3.l r4 = io3.l.CURRENT
            ufm.i r7 = r7.b(r8, r9, r4, r2)
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f149384w = r8
            r0.z = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.f(com.revolut.core.model.account.AccountId, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h4k.i
            if (r0 == 0) goto L13
            r0 = r7
            h4k.i r0 = (h4k.i) r0
            int r1 = r0.f149387w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149387w = r1
            goto L18
        L13:
            h4k.i r0 = new h4k.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149387w
            com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData r3 = r6.f149390a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            jq9.v r7 = new jq9.v
            f5j.a r2 = r3.getF102077a()
            r7.<init>(r2)
            android.content.Context r2 = r6.f149394h
            int r5 = h4k.k.f149389n
            java.lang.String r2 = r2.getString(r5)
            r0.f149387w = r4
            opf.i r4 = r6.f
            java.lang.Object r7 = r4.a(r7, r2, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            com.revolut.feature.transfer.core.api.interactor.ReferenceData r7 = (com.revolut.feature.transfer.core.api.interactor.ReferenceData) r7
            boolean r0 = r3 instanceof com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData.NewTransfer
            if (r0 == 0) goto L57
            return r7
        L57:
            boolean r0 = r3 instanceof com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData.WithTransferData
            if (r0 == 0) goto L64
            com.revolut.feature.transfer.core.api.interactor.ReferenceData r0 = new com.revolut.feature.transfer.core.api.interactor.ReferenceData
            r1 = 0
            java.util.Set r7 = r7.f92121b
            r0.<init>(r1, r7)
            return r0
        L64:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h4k.k.g(gim.c):java.lang.Object");
    }
}
