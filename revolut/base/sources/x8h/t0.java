package x8h;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountBalance;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalance;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 implements tzg.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f303387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ael.t f303388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou5.b f303389c;
    public final p2b.j d;
    public final ybl.d e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f303390g;

    public t0(tzg.m wealthAccountsInteractor, ael.t portfolioBalanceInteractor, ou5.b commoditiesPortfolioBalanceInteractor, p2b.j cfdPerformanceInteractor, ybl.d portfolioInteractor, k displayCurrencyInteractor, l0 roboPortfolioBalanceInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(commoditiesPortfolioBalanceInteractor, "commoditiesPortfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceInteractor, "cfdPerformanceInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceInteractor, "roboPortfolioBalanceInteractor");
        this.f303387a = wealthAccountsInteractor;
        this.f303388b = portfolioBalanceInteractor;
        this.f303389c = commoditiesPortfolioBalanceInteractor;
        this.d = cfdPerformanceInteractor;
        this.e = portfolioInteractor;
        this.f = displayCurrencyInteractor;
        this.f303390g = roboPortfolioBalanceInteractor;
    }

    public static WealthAccountsBalance a(List list) {
        BigDecimal scale;
        List list2 = list;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i2 == 0 ? ((WealthAccountBalance) ((Pair) obj2).f186386b).f95257a : pyd.c.O(dVarO, ((WealthAccountBalance) ((Pair) obj2).f186386b).f95257a);
            i2 = i3;
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO2 = dj0.d.e;
        for (Object obj3 : list2) {
            int i5 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO2 = i == 0 ? ((WealthAccountBalance) ((Pair) obj3).f186386b).f95258b : pyd.c.O(dVarO2, ((WealthAccountBalance) ((Pair) obj3).f186386b).f95258b);
            i = i5;
        }
        dj0.d dVarH = pyd.c.H(dVarO, dVarO2);
        if (dVarH.f115082a != 0) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVarO2.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal scale2 = bigDecimalValueOf.setScale(8, roundingMode);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVarH.f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BigDecimal bigDecimalDivide = scale2.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
            scale = bigDecimalDivide.multiply(bigDecimalValueOf3).setScale(4, roundingMode);
        } else {
            scale = BigDecimal.ZERO;
        }
        Intrinsics.h(scale);
        return new WealthAccountsBalance(dVarO, dVarO2, scale);
    }

    public static WealthAccountBalance b(xi0.b bVar) {
        return new WealthAccountBalance(new dj0.d(0L, bVar), new dj0.d(0L, bVar));
    }

    public static Flow d(WealthAccount wealthAccount, xi0.b bVar, Function2 function2) {
        return (wealthAccount.Q2() || wealthAccount.H6()) ? rd0.e.b(zi0.c.G(ue0.e.p((efm.r) function2.invoke(wealthAccount, bVar), zhm.h0.f322473a), b(bVar))) : new go.g(zi0.c.P(b(bVar), false, null, 3), 2);
    }

    public static Flow e(t0 t0Var, Flow flow, q0 q0Var, n9l.b bVar, boolean z, int i) {
        Object hVar = q0Var;
        if ((i & 2) != 0) {
            hVar = new h(23);
        }
        Object obj2 = hVar;
        if ((i & 4) != 0) {
            bVar = n9l.b.SEC_3;
        }
        n9l.b bVar2 = bVar;
        if ((i & 8) != 0) {
            z = false;
        }
        return boh.f.e(zh9.u0.m(tzg.m.c(t0Var.f303387a, null, cfl.k.f23744a, 1), flow), new w43.b(obj2, t0Var, bVar2, z, 2));
    }

    public static efm.r f(t0 t0Var, String str, xi0.b bVar, n9l.b bVar2, boolean z) {
        if (str != null) {
            return ue0.e.E(nim.a.w(t0Var.f303388b.c(str, false, bVar2, bVar, true, null, z), new h(19)), zi0.c.P(b(bVar), false, null, 3));
        }
        t0Var.getClass();
        return zi0.c.j(b(bVar));
    }

    public final akg.n c(WealthAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return nim.a.v(e(this, this.f.b(), new q0(account, 1), null, false, 12), new h(this, 24));
    }
}
