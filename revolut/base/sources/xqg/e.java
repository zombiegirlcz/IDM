package xqg;

import ccb.m0;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.with_result_navigation.WithdrawMoneyWithResultNavigationFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xif.k;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements b {
    public final WithdrawMoneyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f308173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f308174q;

    public e(WithdrawMoneyFlowContract$InputData inputData, m0 resultNavigationCommandProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(resultNavigationCommandProvider, "resultNavigationCommandProvider");
        this.o = inputData;
        this.f308173p = resultNavigationCommandProvider;
        k kVar = new k(this, 20);
        this.f308174q = cp5.d.a(this, WithdrawMoneyWithResultNavigationFlowContract$Step.f94790a, f0.f322471a, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(xqg.e r5, ccb.l.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof xqg.d
            if (r0 == 0) goto L13
            r0 = r7
            xqg.d r0 = (xqg.d) r0
            int r1 = r0.f308172w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308172w = r1
            goto L18
        L13:
            xqg.d r0 = new xqg.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f308172w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            ccb.m0 r7 = r5.f308173p
            boolean r2 = r6 instanceof ccb.m
            if (r2 == 0) goto L44
            ccb.g0 r2 = new ccb.g0
            ccb.m r6 = (ccb.m) r6
            java.lang.String r4 = r6.f23004a
            com.revolut.core.model.account.AccountId r6 = r6.f23005b
            r2.<init>(r6, r4)
            goto L58
        L44:
            boolean r2 = r6 instanceof ccb.n
            if (r2 == 0) goto L52
            ccb.h0 r2 = new ccb.h0
            ccb.n r6 = (ccb.n) r6
            java.lang.String r6 = r6.f23008a
            r2.<init>(r6)
            goto L58
        L52:
            boolean r6 = r6 instanceof ccb.l.a.C0143a
            if (r6 == 0) goto L6f
            ccb.f0$a r2 = ccb.f0.a.f22984a
        L58:
            r0.f308172w = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            if (r7 == 0) goto L6c
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r7)
            r5.C1(r6)
        L6c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L6f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xqg.e.I2(xqg.e, ccb.l$a, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f308174q;
    }
}
