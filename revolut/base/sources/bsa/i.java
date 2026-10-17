package bsa;

import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import opf.z;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferAmountScreenContract$InputData f18152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final opf.b f18153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f18154c;
    public final opf.i d;
    public final z70.a e;
    public final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iz9.c f18155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final opf.c f18156h;

    public i(PushToCardTransferAmountScreenContract$InputData inputData, opf.b paymentsPocketInteractor, fk3.a configurationInteractor, opf.i referenceDataInteractor, z70.a contextProvider, z transferFundingSourceInteractor, iz9.c chatTransactionsInteractor, opf.c paymentsSourceAccountInteractor, c pushToCardTargetMoneyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(referenceDataInteractor, "referenceDataInteractor");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(chatTransactionsInteractor, "chatTransactionsInteractor");
        Intrinsics.checkNotNullParameter(paymentsSourceAccountInteractor, "paymentsSourceAccountInteractor");
        Intrinsics.checkNotNullParameter(pushToCardTargetMoneyInteractor, "pushToCardTargetMoneyInteractor");
        this.f18152a = inputData;
        this.f18153b = paymentsPocketInteractor;
        this.f18154c = configurationInteractor;
        this.d = referenceDataInteractor;
        this.e = contextProvider;
        this.f = transferFundingSourceInteractor;
        this.f18155g = chatTransactionsInteractor;
        this.f18156h = paymentsSourceAccountInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.model.account.AccountId r7, java.lang.String r8, java.lang.String r9, k1j.a r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof bsa.d
            if (r0 == 0) goto L13
            r0 = r11
            bsa.d r0 = (bsa.d) r0
            int r1 = r0.f18145y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18145y = r1
            goto L18
        L13:
            bsa.d r0 = new bsa.d
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f18143w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18145y
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
            r0.f18145y = r4
            opf.z r11 = r6.f
            java.lang.Object r11 = r11.d(r7, r0, r8, r10)
            if (r11 != r1) goto L4f
            goto L5f
        L4f:
            com.revolut.feature.transfer.core.models.FundingSource r11 = (com.revolut.feature.transfer.core.models.FundingSource) r11
            if (r11 != 0) goto L68
            r0.u = r7
            r0.v = r5
            r0.f18145y = r3
            java.lang.Object r11 = r6.c(r9, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: bsa.i.a(com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, k1j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData.NewTransfer r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsa.i.b(com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData$NewTransfer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof bsa.g
            if (r0 == 0) goto L13
            r0 = r10
            bsa.g r0 = (bsa.g) r0
            int r1 = r0.f18150x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18150x = r1
            goto L18
        L13:
            bsa.g r0 = new bsa.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18150x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r10)
            goto Lb1
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L5e
        L3a:
            yhm.o.b(r10)
            fk3.a r10 = r8.f18154c
            ik3.c r10 = (ik3.c) r10
            efm.r r10 = r10.n()
            r2 = 3
            efm.r r10 = m70.a.g(r10, r3, r3, r2)
            efm.d0 r10 = r10.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            r0.u = r9
            r0.f18150x = r5
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L5e
            goto Lb0
        L5e:
            java.util.Set r10 = (java.util.Set) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L6e:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r10.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            xi0.a r7 = xi0.b.Companion
            r7.getClass()
            xi0.b r6 = xi0.a.a(r6)
            boolean r7 = cp5.d.A(r6)
            if (r7 != 0) goto L90
            boolean r6 = cp5.d.z(r6)
            if (r6 == 0) goto L6e
        L90:
            r2.add(r5)
            goto L6e
        L94:
            java.util.Set r10 = zhm.d0.i1(r2)
            java.util.List r9 = zhm.v.l(r9)
            io3.l r2 = io3.l.CURRENT
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            opf.b r6 = r8.f18153b
            ufm.i r9 = r6.b(r10, r9, r2, r5)
            r0.u = r3
            r0.f18150x = r4
            java.lang.Object r10 = nim.a.b(r9, r0)
            if (r10 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            java.lang.String r9 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bsa.i.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof bsa.h
            if (r0 == 0) goto L13
            r0 = r10
            bsa.h r0 = (bsa.h) r0
            int r1 = r0.f18151w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18151w = r1
            goto L18
        L13:
            bsa.h r0 = new bsa.h
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18151w
            r3 = 1
            com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData r4 = r9.f18152a
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r10)
            goto L61
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            yhm.o.b(r10)
            jq9.w r10 = new jq9.w
            com.revolut.feature.push_to_card.api.data.CardOwnerWithStats r2 = new com.revolut.feature.push_to_card.api.data.CardOwnerWithStats
            com.revolut.feature.push_to_card.api.data.CardOwner r5 = r4.getF81599a()
            r6 = 0
            r7 = 0
            r2.<init>(r5, r6, r7)
            r10.<init>(r2)
            z70.a r2 = r9.e
            android.content.Context r2 = r2.getContext()
            int r5 = com.revolut.feature.transfer.core.R$string.payments_bank_transfer_amount_reference_default_value
            java.lang.String r2 = r2.getString(r5)
            java.lang.String r5 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.f18151w = r3
            opf.i r3 = r9.d
            java.lang.Object r10 = r3.a(r10, r2, r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            com.revolut.feature.transfer.core.api.interactor.ReferenceData r10 = (com.revolut.feature.transfer.core.api.interactor.ReferenceData) r10
            boolean r0 = r4 instanceof com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData.NewTransfer
            if (r0 == 0) goto L68
            return r10
        L68:
            boolean r0 = r4 instanceof com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData.WithTransferData
            if (r0 == 0) goto L7a
            com.revolut.feature.transfer.core.api.interactor.ReferenceData r0 = new com.revolut.feature.transfer.core.api.interactor.ReferenceData
            com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData$WithTransferData r4 = (com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData.WithTransferData) r4
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r1 = r4.f81600b
            java.lang.String r1 = r1.f81530g
            java.util.Set r10 = r10.f92121b
            r0.<init>(r1, r10)
            return r0
        L7a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bsa.i.d(gim.c):java.lang.Object");
    }
}
