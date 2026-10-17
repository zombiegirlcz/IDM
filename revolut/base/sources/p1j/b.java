package p1j;

import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f231943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BalanceSelector$InputData f231944b;

    public b(ang.f userInteractor, BalanceSelector$InputData inputData) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f231943a = userInteractor;
        this.f231944b = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p1j.a
            if (r0 == 0) goto L13
            r0 = r5
            p1j.a r0 = (p1j.a) r0
            int r1 = r0.f231942w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231942w = r1
            goto L18
        L13:
            p1j.a r0 = new p1j.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231942w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f231943a
            zmg.d r5 = r5.d
            efm.k r5 = r5.c()
            r0.f231942w = r3
            java.lang.Object r5 = nim.a.i(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            do3.n r5 = (do3.n) r5
            if (r5 != 0) goto L4a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4a:
            boolean r0 = te0.w.U(r5)
            if (r0 != 0) goto L58
            boolean r5 = te0.w.Z(r5)
            if (r5 == 0) goto L57
            goto L58
        L57:
            r3 = 0
        L58:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p1j.b.a(gim.c):java.lang.Object");
    }

    public final Object b(k1j.a aVar, gim.c cVar) {
        k1j.a aVar2 = k1j.a.SAVINGS;
        BalanceSelector$InputData balanceSelector$InputData = this.f231944b;
        if ((aVar != aVar2 || !balanceSelector$InputData.i.contains(BalanceSelector$ExtraConfiguration.ShowDisclaimerForSavings.f99378a)) && (aVar != k1j.a.TRADING_ACCOUNTS || !balanceSelector$InputData.i.contains(BalanceSelector$ExtraConfiguration.ShowDisclaimerForInvestCashHolding.f99377a))) {
            Set set = balanceSelector$InputData.i;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    if (((BalanceSelector$ExtraConfiguration) it8.next()) instanceof BalanceSelector$ExtraConfiguration.ShowDisclaimerForExchange) {
                    }
                }
            }
            return (balanceSelector$InputData.i.contains(BalanceSelector$ExtraConfiguration.ShowDisclaimerForCryptoAndCommodity.f99375a) && c.f231945a.contains(aVar)) ? a(cVar) : Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
