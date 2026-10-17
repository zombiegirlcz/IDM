package asa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends xpa.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final csa.c f8890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xdk.g f8891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final osf.g f8892n;

    public d(csa.c pushToCardDialogProvider, xdk.g pocketExtension, osf.g transferReasonLauncherExtension) {
        Intrinsics.checkNotNullParameter(pushToCardDialogProvider, "pushToCardDialogProvider");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        this.f8890l = pushToCardDialogProvider;
        this.f8891m = pocketExtension;
        this.f8892n = transferReasonLauncherExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f8891m, null);
        w2(this.f8892n, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.f8892n);
        m2(this.f8891m);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xpa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.push_to_card.api.data.CardOwner r8, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof asa.a
            if (r0 == 0) goto L13
            r0 = r10
            asa.a r0 = (asa.a) r0
            int r1 = r0.f8886y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8886y = r1
            goto L18
        L13:
            asa.a r0 = new asa.a
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f8884w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8886y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r10)
            return r10
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r8 = r0.v
            com.revolut.feature.push_to_card.api.data.CardOwner r9 = r0.u
            yhm.o.b(r10)
            goto L76
        L3d:
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r9 = r0.v
            com.revolut.feature.push_to_card.api.data.CardOwner r8 = r0.u
            yhm.o.b(r10)
            goto L55
        L45:
            yhm.o.b(r10)
            r0.u = r8
            r0.v = r9
            r0.f8886y = r5
            java.lang.Object r10 = r7.b3(r8, r9, r0)
            if (r10 != r1) goto L55
            goto L8e
        L55:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L5e
            goto L7e
        L5e:
            r0.u = r8
            r0.v = r9
            r0.f8886y = r4
            com.revolut.core.model.account.AccountId r10 = r9.f
            xi0.b r2 = r9.d
            com.revolut.feature.transfer.core.models.FundingSource r4 = r9.e
            xdk.g r5 = r7.f8891m
            java.lang.Object r10 = r5.Z2(r10, r2, r4, r0)
            if (r10 != r1) goto L73
            goto L8e
        L73:
            r6 = r9
            r9 = r8
            r8 = r6
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L81
        L7e:
            xpa.b r8 = xpa.b.f307919a
            return r8
        L81:
            r10 = 0
            r0.u = r10
            r0.v = r10
            r0.f8886y = r3
            java.lang.Object r8 = r7.c3(r9, r8, r0)
            if (r8 != r1) goto L8f
        L8e:
            return r1
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: asa.d.Z2(com.revolut.feature.push_to_card.api.data.CardOwner, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.push_to_card.api.data.CardOwner r5, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof asa.b
            if (r0 == 0) goto L13
            r0 = r7
            asa.b r0 = (asa.b) r0
            int r1 = r0.f8887w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8887w = r1
            goto L18
        L13:
            asa.b r0 = new asa.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8887w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L65
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            xi0.b r7 = r6.f81529c
            java.lang.String r7 = r7.f306286a
            com.revolut.feature.push_to_card.api.data.Card r2 = r5.f81493g
            java.lang.String r2 = r2.f81486b
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L43
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L43:
            xi0.a r7 = xi0.b.Companion
            com.revolut.feature.push_to_card.api.data.Card r5 = r5.f81493g
            java.lang.String r5 = r5.f81486b
            r7.getClass()
            xi0.b r5 = xi0.a.a(r5)
            xi0.b r6 = r6.f81529c
            csa.c r7 = r4.f8890l
            nii.y0 r5 = r7.a(r5, r6)
            kotlinx.coroutines.flow.Flow r5 = r4.L2(r5)
            r0.f8887w = r3
            java.lang.Object r7 = vkm.q.x(r5, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            nii.n1 r7 = (nii.n1) r7
            boolean r5 = r7 instanceof nii.l1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: asa.d.b3(com.revolut.feature.push_to_card.api.data.CardOwner, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature.push_to_card.api.data.CardOwner r13, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof asa.c
            if (r0 == 0) goto L13
            r0 = r15
            asa.c r0 = (asa.c) r0
            int r1 = r0.f8889x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8889x = r1
            goto L18
        L13:
            asa.c r0 = new asa.c
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8889x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r14 = r0.u
            yhm.o.b(r15)
        L28:
            r2 = r14
            goto L50
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            yhm.o.b(r15)
            bsf.c r4 = new bsf.c
            long r5 = r14.f81528b
            xi0.b r7 = r14.f81529c
            com.revolut.feature.transfer.core.models.FundingSource r8 = r14.e
            rtf.c r9 = r14.f81531h
            r10 = r13
            r4.<init>(r5, r7, r8, r9, r10)
            r0.u = r14
            r0.f8889x = r3
            osf.g r13 = r12.f8892n
            java.lang.Object r15 = r13.Z2(r4, r0)
            if (r15 != r1) goto L28
            return r1
        L50:
            bsf.h r15 = (bsf.h) r15
            bsf.g r13 = bsf.g.f18201a
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r15, r13)
            if (r13 == 0) goto L5d
            xpa.b r13 = xpa.b.f307919a
            return r13
        L5d:
            boolean r13 = r15 instanceof bsf.f
            if (r13 == 0) goto L78
            xpa.c r13 = new xpa.c
            bsf.f r15 = (bsf.f) r15
            rtf.c r10 = r15.f18200a
            r11 = 383(0x17f, float:5.37E-43)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r14 = com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData.a(r2, r3, r5, r6, r7, r8, r9, r10, r11)
            r13.<init>(r14)
            return r13
        L78:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: asa.d.c3(com.revolut.feature.push_to_card.api.data.CardOwner, com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData, gim.c):java.lang.Object");
    }
}
