package lmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rnb.w f196915l;

    public c(rnb.w savingsVaultInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        this.f196915l = savingsVaultInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lmb.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination.Bank r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lmb.a
            if (r0 == 0) goto L13
            r0 = r7
            lmb.a r0 = (lmb.a) r0
            int r1 = r0.f196910w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196910w = r1
            goto L18
        L13:
            lmb.a r0 = new lmb.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196910w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L5a
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            r0.f196910w = r3
            com.revolut.feature.vaults.common.SavingAccountType r7 = r6.f83227a
            boolean r2 = r7 instanceof com.revolut.feature.vaults.common.SavingAccountType.Joint
            if (r2 == 0) goto L40
            com.revolut.feature.vaults.common.SavingAccountType$Joint r7 = (com.revolut.feature.vaults.common.SavingAccountType.Joint) r7
            java.lang.String r7 = r7.f94738a
            goto L4e
        L40:
            boolean r2 = r7 instanceof com.revolut.feature.vaults.common.SavingAccountType.Junior
            if (r2 == 0) goto L49
            com.revolut.feature.vaults.common.SavingAccountType$Junior r7 = (com.revolut.feature.vaults.common.SavingAccountType.Junior) r7
            java.lang.String r7 = r7.f94739a
            goto L4e
        L49:
            boolean r7 = r7 instanceof com.revolut.feature.vaults.common.SavingAccountType.Personal
            if (r7 == 0) goto L62
            r7 = r4
        L4e:
            lmb.b r2 = new lmb.b
            r2.<init>(r5, r6, r7, r4)
            java.lang.Object r7 = do3.q.u(r5, r2, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            pcd.s r7 = (pcd.s) r7
            lmb.h r6 = new lmb.h
            r6.<init>(r7, r4)
            return r6
        L62:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lmb.c.Z2(com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination$Bank, gim.c):java.lang.Object");
    }
}
