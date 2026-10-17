package com.revolut.feature.apm.bizum.impl.ui.transfer.amount;

import kotlin.jvm.internal.Intrinsics;
import opf.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferAmountContract$InputData f61616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final st1.b f61617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f61618c;
    public final x02.b d;
    public final x02.a e;
    public final vo9.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f61619g;

    public b(BizumTransferAmountContract$InputData inputData, st1.b validator, c0 transferSuggestedAmountsInteractor, x02.b quoteInteractor, x02.a apmPocketInteractor, vo9.a pocketMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(apmPocketInteractor, "apmPocketInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f61616a = inputData;
        this.f61617b = validator;
        this.f61618c = transferSuggestedAmountsInteractor;
        this.d = quoteInteractor;
        this.e = apmPocketInteractor;
        this.f = pocketMapper;
        this.f61619g = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData.NewTransfer r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.revolut.feature.apm.bizum.impl.ui.transfer.amount.a
            if (r0 == 0) goto L13
            r0 = r13
            com.revolut.feature.apm.bizum.impl.ui.transfer.amount.a r0 = (com.revolut.feature.apm.bizum.impl.ui.transfer.amount.a) r0
            int r1 = r0.f61615y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61615y = r1
            goto L18
        L13:
            com.revolut.feature.apm.bizum.impl.ui.transfer.amount.a r0 = new com.revolut.feature.apm.bizum.impl.ui.transfer.amount.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f61613w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f61615y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r1 = r0.v
            com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData$NewTransfer r12 = r0.u
            yhm.o.b(r13)
            r6 = r1
            goto L56
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            yhm.o.b(r13)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r13 = r12.f61603c
            dj0.d r2 = r13.f92261a
            if (r2 == 0) goto L40
            long r4 = r2.f115082a
            goto L42
        L40:
            r4 = 0
        L42:
            xi0.b r2 = gs1.b.f146272a
            r0.u = r12
            r0.v = r4
            r0.f61615y = r3
            x02.a r6 = r11.e
            q12.d r6 = (q12.d) r6
            java.lang.Object r13 = r6.b(r13, r2, r0)
            if (r13 != r1) goto L55
            return r1
        L55:
            r6 = r4
        L56:
            r5 = r13
            com.revolut.feature.transfer.core.models.FundingSource r5 = (com.revolut.feature.transfer.core.models.FundingSource) r5
            com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection r12 = r12.k7()
            boolean r12 = r12.a()
            if (r12 == 0) goto L71
            com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2Any r12 = com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2Any.f61787c
            gte.a r13 = r11.f61619g
            jte.d r13 = (jte.d) r13
            boolean r12 = r13.c(r12)
            if (r12 == 0) goto L71
        L6f:
            r10 = r3
            goto L73
        L71:
            r3 = 0
            goto L6f
        L73:
            kotlin.jvm.internal.t0 r12 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r12)
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r4 = new com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            java.lang.String r9 = ""
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b.a(com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData$NewTransfer, gim.c):java.lang.Object");
    }
}
