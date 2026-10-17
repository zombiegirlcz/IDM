package q4k;

import g4k.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends a2k.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f242192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f4h.a f242193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y1k.a f242194n;
    public final a0 o;

    public h(c transferDataBuilder, f4h.a errorStateProvider, y1k.a bankTransferInteractor, a0 checksExtension) {
        Intrinsics.checkNotNullParameter(transferDataBuilder, "transferDataBuilder");
        Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        this.f242192l = transferDataBuilder;
        this.f242193m = errorStateProvider;
        this.f242194n = bankTransferInteractor;
        this.o = checksExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(q4k.h r6, f5j.a r7, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r8, a2k.b r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof q4k.g
            if (r0 == 0) goto L13
            r0 = r10
            q4k.g r0 = (q4k.g) r0
            int r1 = r0.f242191x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242191x = r1
            goto L18
        L13:
            q4k.g r0 = new q4k.g
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242191x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a2k.b r9 = r0.u
            yhm.o.b(r10)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r10)
            g4k.a0 r6 = r6.o
            r0.u = r9
            r0.f242191x = r3
            java.lang.Object r10 = r6.Z2(r7, r8, r3, r0)
            if (r10 != r1) goto L41
            return r1
        L41:
            g4k.d0 r10 = (g4k.d0) r10
            boolean r6 = r10 instanceof g4k.c0
            if (r6 == 0) goto L62
            g4k.c0 r10 = (g4k.c0) r10
            f5j.a r1 = r10.f140540a
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r6 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint r2 = com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint.REGULAR_TRANSFER
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r4 = r10.f140541b
            a2k.a r6 = r9.d
            com.revolut.feature.transfer.models.tracking.TransferAppSource$AIR_WIDGET r3 = new com.revolut.feature.transfer.models.tracking.TransferAppSource$AIR_WIDGET
            java.lang.String r6 = r6.f888a
            r3.<init>(r6)
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData$ReviewOnly r0 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData$ReviewOnly
            r5 = 24
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L62:
            g4k.b0 r6 = g4k.b0.f140539a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r10, r6)
            if (r6 == 0) goto L72
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "Bank transfer launch was cancelled by a submit check"
            r6.<init>(r7)
            throw r6
        L72:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4k.h.b3(q4k.h, f5j.a, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, a2k.b, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        w2(this.o, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // a2k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(a2k.b r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof q4k.d
            if (r0 == 0) goto L13
            r0 = r12
            q4k.d r0 = (q4k.d) r0
            int r1 = r0.f242184y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242184y = r1
            goto L18
        L13:
            q4k.d r0 = new q4k.d
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f242182w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242184y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            return r12
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            f5j.a r11 = r0.v
            a2k.b r2 = r0.u
            yhm.o.b(r12)
            r7 = r11
            r6 = r2
            goto L53
        L3c:
            yhm.o.b(r12)
            f5j.a r12 = r11.f889a
            r0.u = r11
            r0.v = r12
            r0.f242184y = r4
            q4k.c r2 = r10.f242192l
            java.lang.Object r2 = r2.a(r11, r0)
            if (r2 != r1) goto L50
            goto L6a
        L50:
            r6 = r11
            r7 = r12
            r12 = r2
        L53:
            r8 = r12
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r8 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData) r8
            q4k.f r4 = new q4k.f
            r9 = 0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 0
            r0.u = r11
            r0.v = r11
            r0.f242184y = r3
            java.lang.Object r11 = skm.e0.o(r4, r0)
            if (r11 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q4k.h.Z2(a2k.b, gim.c):java.lang.Object");
    }
}
