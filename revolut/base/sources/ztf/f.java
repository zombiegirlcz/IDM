package ztf;

import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n5k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferInputData f325113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final luf.a f325114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final guf.b f325115c;

    public f(ManualTransferInputData inputData, luf.a transferDataObservable, guf.b flowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        this.f325113a = inputData;
        this.f325114b = transferDataObservable;
        this.f325115c = flowInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ztf.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ztf.e
            if (r0 == 0) goto L13
            r0 = r5
            ztf.e r0 = (ztf.e) r0
            int r1 = r0.f325112w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325112w = r1
            goto L18
        L13:
            ztf.e r0 = new ztf.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325112w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            luf.a r5 = r4.f325114b
            ihm.j r5 = r5.f255130a
            r0.f325112w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r5 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData) r5
            xi0.b r5 = r5.f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ztf.f.b(gim.c):java.lang.Object");
    }

    @Override // n5k.a
    public final Object c(gim.c cVar) {
        return this.f325113a.f79597a.getF92449a().f115083b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ztf.d
            if (r0 == 0) goto L13
            r0 = r7
            ztf.d r0 = (ztf.d) r0
            int r1 = r0.f325111x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325111x = r1
            goto L18
        L13:
            ztf.d r0 = new ztf.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325111x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r2 = r0.u
            yhm.o.b(r7)
            goto L64
        L3b:
            yhm.o.b(r7)
            goto L4f
        L3f:
            yhm.o.b(r7)
            luf.a r7 = r6.f325114b
            ihm.j r7 = r7.f255130a
            r0.f325111x = r5
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L4f
            goto L8b
        L4f:
            r2 = r7
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r2 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData) r2
            kotlin.jvm.internal.Intrinsics.h(r2)
            r0.u = r2
            r0.f325111x = r4
            guf.b r7 = r6.f325115c
            guf.m r7 = (guf.m) r7
            java.lang.Object r7 = r7.e(r2, r0)
            if (r7 != r1) goto L64
            goto L8b
        L64:
            hrf.c r7 = (hrf.c) r7
            if (r7 == 0) goto L93
            kotlin.jvm.internal.Intrinsics.h(r2)
            r4 = 0
            r0.u = r4
            r0.f325111x = r3
            boolean r3 = r7 instanceof hrf.a
            if (r3 == 0) goto L7d
            hrf.a r7 = (hrf.a) r7
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r7 = r7.f154810a
            java.lang.Object r7 = r6.f(r7, r2, r0)
            goto L89
        L7d:
            boolean r3 = r7 instanceof hrf.b
            if (r3 == 0) goto L8d
            hrf.b r7 = (hrf.b) r7
            nrf.c r7 = r7.f154811a
            java.lang.Object r7 = r6.g(r7, r2, r0)
        L89:
            if (r7 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r7
        L8d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L93:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "OrderQuote cannot be null when requiring PaymentBreakdownAction"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ztf.f.d(gim.c):java.lang.Object");
    }

    @Override // n5k.a
    public final Object e(Continuation continuation) {
        throw new IllegalStateException("FeeBreakdownAction Dialog not supported in P2P");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r18, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ztf.f.f(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(nrf.c r26, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ztf.f.g(nrf.c, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData, gim.c):java.lang.Object");
    }
}
