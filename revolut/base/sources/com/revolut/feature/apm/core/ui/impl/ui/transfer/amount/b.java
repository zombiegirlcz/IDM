package com.revolut.feature.apm.core.ui.impl.ui.transfer.amount;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import h52.e;
import kotlin.jvm.internal.Intrinsics;
import opf.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferAmountContract$InputData f62438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferContract$InputData f62439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x02.b f62440c;
    public final e d;
    public final x02.a e;
    public final vo9.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f62441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f01.c f62442h;

    public b(TransferAmountContract$InputData inputData, ApmTransferContract$InputData flowInputData, x02.b quoteInteractor, e transferValidator, x02.a pocketInteractor, vo9.a pocketMapper, c0 transferSuggestedAmountsInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f62438a = inputData;
        this.f62439b = flowInputData;
        this.f62440c = quoteInteractor;
        this.d = transferValidator;
        this.e = pocketInteractor;
        this.f = pocketMapper;
        this.f62441g = transferSuggestedAmountsInteractor;
        this.f62442h = uiKitResources;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData.NewTransfer r19, gim.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.a
            if (r3 == 0) goto L19
            r3 = r2
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.a r3 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.a) r3
            int r4 = r3.f62437y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f62437y = r4
            goto L1e
        L19:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.a r3 = new com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f62435w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f62437y
            r6 = 0
            r8 = 1
            if (r5 == 0) goto L3c
            if (r5 != r8) goto L34
            long r4 = r3.v
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData$NewTransfer r1 = r3.u
            yhm.o.b(r2)
            r10 = r4
            goto L75
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r2)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r2 = r1.f62427g
            dj0.d r2 = r2.f92261a
            if (r2 == 0) goto L48
            long r9 = r2.f115082a
            goto L49
        L48:
            r9 = r6
        L49:
            if (r2 == 0) goto L4f
            xi0.b r2 = r2.f115083b
            if (r2 != 0) goto L61
        L4f:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData r2 = r0.f62438a
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r2 = r2.getF62429a()
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient r2 = r2.t0()
            com.revolut.feature.apm.core.api.product.ApmProduct r2 = k12.b.a(r2)
            xi0.b r2 = r2.b()
        L61:
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r5 = r1.f62427g
            r3.u = r1
            r3.v = r9
            r3.f62437y = r8
            x02.a r8 = r0.e
            q12.d r8 = (q12.d) r8
            java.lang.Object r2 = r8.b(r5, r2, r3)
            if (r2 != r4) goto L74
            return r4
        L74:
            r10 = r9
        L75:
            r9 = r2
            com.revolut.feature.transfer.core.models.FundingSource r9 = (com.revolut.feature.transfer.core.models.FundingSource) r9
            com.revolut.core.ui_kit.models.Clause r2 = r1.f62428h
            if (r2 == 0) goto L88
            f01.c r3 = r0.f62442h
            java.lang.CharSequence r2 = r3.b(r2)
            java.lang.String r2 = r2.toString()
        L86:
            r14 = r2
            goto L90
        L88:
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r2)
            java.lang.String r2 = ""
            goto L86
        L90:
            xi0.b r12 = r9.f92241b
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r2 = new com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData
            r3 = 7
            r4 = 0
            r2.<init>(r6, r4, r3)
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r1 = r1.f62424a
            boolean r3 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Incoming
            if (r3 == 0) goto La5
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$Incoming r1 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Incoming) r1
            com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings r4 = r1.d
        La3:
            r15 = r4
            goto Lb4
        La5:
            boolean r3 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Outgoing
            if (r3 == 0) goto Laa
        La9:
            goto La3
        Laa:
            boolean r3 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.AcceptMoneyRequest
            if (r3 == 0) goto Laf
            goto La9
        Laf:
            boolean r1 = r1 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Draft
            if (r1 == 0) goto Lc0
            goto La9
        Lb4:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r8 = new com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData
            r17 = 0
            com.revolut.core.model.account.AccountId$Personal r13 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r16 = r2
            r8.<init>(r9, r10, r12, r13, r14, r15, r16, r17)
            return r8
        Lc0:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.b.a(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData$NewTransfer, gim.c):java.lang.Object");
    }
}
