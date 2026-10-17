package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount;

import guf.b;
import kotlin.jvm.internal.Intrinsics;
import r10.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferContract$InputData f92470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f92471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f92472c;
    public final vv9.b d;
    public final vo9.a e;

    public a(ManualTransferContract$InputData inputData, b flowInteractor, q validator, vv9.b moneyRequestCheckInteractor, vo9.a pocketMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(moneyRequestCheckInteractor, "moneyRequestCheckInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        this.f92470a = inputData;
        this.f92471b = flowInteractor;
        this.f92472c = validator;
        this.d = moneyRequestCheckInteractor;
        this.e = pocketMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.transfer.models.transfer.TransferTrustData r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof buf.o
            if (r0 == 0) goto L13
            r0 = r6
            buf.o r0 = (buf.o) r0
            int r1 = r0.f18821x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18821x = r1
            goto L18
        L13:
            buf.o r0 = new buf.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18821x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.transfer.models.transfer.TransferTrustData r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f18821x = r3
            guf.b r6 = r4.f92471b
            guf.m r6 = (guf.m) r6
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            prf.g r6 = (prf.g) r6
            boolean r6 = com.google.crypto.tink.shaded.protobuf.t1.q(r6)
            if (r6 != 0) goto L59
            boolean r6 = r5.f92304a
            if (r6 == 0) goto L59
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r5 = r5.f92305b
            boolean r5 = com.revolut.feature.transfer.models.transfer.a.a(r5)
            if (r5 == 0) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a.a(com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }
}
