package psa;

import asa.m;
import kotlin.jvm.internal.Intrinsics;
import xpa.g;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f239462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f239463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final asa.d f239464n;

    public e(b transferDataBuilder, m errorStateProvider, asa.d checksExtension) {
        Intrinsics.checkNotNullParameter(transferDataBuilder, "transferDataBuilder");
        Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        this.f239462l = transferDataBuilder;
        this.f239463m = errorStateProvider;
        this.f239464n = checksExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f239464n, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.f239464n);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xpa.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(xpa.f r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof psa.c
            if (r0 == 0) goto L13
            r0 = r14
            psa.c r0 = (psa.c) r0
            int r1 = r0.f239459y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239459y = r1
            goto L18
        L13:
            psa.c r0 = new psa.c
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f239457w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239459y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r13 = r0.v
            xpa.f r2 = r0.u
            yhm.o.b(r14)
            goto L6c
        L3d:
            xpa.f r13 = r0.u
            yhm.o.b(r14)
            goto L53
        L43:
            yhm.o.b(r14)
            r0.u = r13
            r0.f239459y = r5
            psa.b r14 = r12.f239462l
            java.lang.Object r14 = r14.a(r13, r0)
            if (r14 != r1) goto L53
            goto La6
        L53:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r14 = (com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData) r14
            asa.m r2 = r12.f239463m
            wkm.l r2 = r2.c(r14)
            r0.u = r13
            r0.v = r14
            r0.f239459y = r4
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto L68
            goto La6
        L68:
            r11 = r2
            r2 = r13
            r13 = r14
            r14 = r11
        L6c:
            hrf.h r14 = (hrf.h) r14
            boolean r14 = r14.b()
            if (r14 != 0) goto L97
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$NewTransfer r4 = new com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$NewTransfer
            com.revolut.feature.push_to_card.api.data.CardOwner r5 = r2.f307922a
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r6 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            dj0.d r13 = r2.f307923b
            com.revolut.feature.transfer.core.models.SourceAccount r14 = r2.f307924c
            if (r14 != 0) goto L82
            com.revolut.feature.transfer.core.models.SourceAccount$Default r14 = com.revolut.feature.transfer.core.models.SourceAccount.Default.f92247a
        L82:
            r6.<init>(r13, r14)
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r7 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            xpa.e r13 = r2.d
            com.revolut.feature.transfer.models.tracking.TransferAppSource$AIR_WIDGET r9 = new com.revolut.feature.transfer.models.tracking.TransferAppSource$AIR_WIDGET
            java.lang.String r13 = r13.f307921a
            r9.<init>(r13)
            r10 = 24
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L97:
            com.revolut.feature.push_to_card.api.data.CardOwner r14 = r2.f307922a
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f239459y = r3
            java.lang.Object r13 = r12.b3(r14, r13, r0)
            if (r13 != r1) goto La7
        La6:
            return r1
        La7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: psa.e.Z2(xpa.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.push_to_card.api.data.CardOwner r5, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof psa.d
            if (r0 == 0) goto L13
            r0 = r7
            psa.d r0 = (psa.d) r0
            int r1 = r0.f239461x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239461x = r1
            goto L18
        L13:
            psa.d r0 = new psa.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239461x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.push_to_card.api.data.CardOwner r5 = r0.u
            yhm.o.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r5
            r0.f239461x = r3
            asa.d r7 = r4.f239464n
            java.lang.Object r7 = r7.Z2(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            xpa.d r7 = (xpa.d) r7
            boolean r6 = r7 instanceof xpa.c
            if (r6 == 0) goto L54
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$ReviewOnly r6 = new com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$ReviewOnly
            xpa.c r7 = (xpa.c) r7
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r7 = r7.f307920a
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r0 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            r1 = 0
            r6.<init>(r5, r7, r0, r1)
            return r6
        L54:
            xpa.b r5 = xpa.b.f307919a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r7, r5)
            if (r5 == 0) goto L64
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r6 = "Push-to-card transfer launch was cancelled by a submit check"
            r5.<init>(r6)
            throw r5
        L64:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: psa.e.b3(com.revolut.feature.push_to_card.api.data.CardOwner, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData, gim.c):java.lang.Object");
    }
}
