package h6i;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 implements i1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f149709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7i.u f149710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f149711c;
    public final Long d;
    public final i1j.a e;

    public p0(o pocketInteractor, r7i.u balancePairEligibilityChecker, f filteringStrategy, Long l2, i1j.a additionalMoveMoneyBalancesInteractor) {
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(balancePairEligibilityChecker, "balancePairEligibilityChecker");
        Intrinsics.checkNotNullParameter(filteringStrategy, "filteringStrategy");
        Intrinsics.checkNotNullParameter(additionalMoveMoneyBalancesInteractor, "additionalMoveMoneyBalancesInteractor");
        this.f149709a = pocketInteractor;
        this.f149710b = balancePairEligibilityChecker;
        this.f149711c = filteringStrategy;
        this.d = l2;
        this.e = additionalMoveMoneyBalancesInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(h6i.p0 r7, com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r8, gim.c r9) {
        /*
            h6i.f r0 = r7.f149711c
            boolean r1 = r9 instanceof h6i.m0
            if (r1 == 0) goto L15
            r1 = r9
            h6i.m0 r1 = (h6i.m0) r1
            int r2 = r1.f149692w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f149692w = r2
            goto L1a
        L15:
            h6i.m0 r1 = new h6i.m0
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f149692w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L38
            goto L4e
        L38:
            r8 = move-exception
            goto L51
        L3a:
            yhm.o.b(r9)
            h6i.o r9 = r7.f149709a     // Catch: java.lang.Exception -> L38
            java.lang.String r3 = r8.f99404a     // Catch: java.lang.Exception -> L38
            k1j.a r8 = r8.getF99407g()     // Catch: java.lang.Exception -> L38
            r1.f149692w = r5     // Catch: java.lang.Exception -> L38
            java.lang.Object r9 = r9.d(r1, r3, r8)     // Catch: java.lang.Exception -> L38
            if (r9 != r2) goto L4e
            goto Lad
        L4e:
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = (com.revolut.feature_move_money.api.model.AccountWrapper) r9     // Catch: java.lang.Exception -> L38
            goto L5c
        L51:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            r6 = 0
            rd0.d.a(r3, r6, r6, r8, r9)
            r9 = r6
        L5c:
            if (r9 != 0) goto L61
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto Lad
        L61:
            boolean r8 = r0 instanceof h6i.e
            if (r8 == 0) goto L72
            h6i.e r0 = (h6i.e) r0
            b7i.c r7 = r0.f149660a
            boolean r7 = r7.a(r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            goto Lad
        L72:
            boolean r8 = r0 instanceof h6i.d
            if (r8 == 0) goto Lae
            h6i.d r0 = (h6i.d) r0
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.f149655a
            x5i.d r0 = r0.f149656b
            int[] r3 = h6i.l0.f149691a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r5) goto L94
            if (r0 != r4) goto L8e
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r9)
            goto L99
        L8e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L94:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r9, r8)
        L99:
            java.lang.Object r8 = r0.f186385a
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = (com.revolut.feature_move_money.api.model.AccountWrapper) r8
            java.lang.Object r9 = r0.f186386b
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = (com.revolut.feature_move_money.api.model.AccountWrapper) r9
            r7i.u r7 = r7.f149710b
            r1.f149692w = r4
            java.lang.Object r7 = r7.a(r8, r9, r1)
            if (r7 != r2) goto Lac
            goto Lad
        Lac:
            r2 = r7
        Lad:
            return r2
        Lae:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.p0.c(h6i.p0, com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper, gim.c):java.lang.Object");
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        Continuation continuation = null;
        return xam.a.h(new gul.n(this, continuation, 20), new v1(new o0(balanceGroupList, this, continuation, 1)));
    }
}
