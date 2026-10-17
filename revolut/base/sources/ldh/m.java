package ldh;

import ack.o;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import km2.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lb0.b0;
import nel.q0;
import nel.t0;
import nel.u0;
import nel.v0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gdh.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f194126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f194127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f194128n;

    public m(LinkedHashMap instrumentTradeActionEventInterceptors, i tradeCommandBuilder, f onboardingCommandBuilder) {
        Intrinsics.checkNotNullParameter(instrumentTradeActionEventInterceptors, "instrumentTradeActionEventInterceptors");
        Intrinsics.checkNotNullParameter(tradeCommandBuilder, "tradeCommandBuilder");
        Intrinsics.checkNotNullParameter(onboardingCommandBuilder, "onboardingCommandBuilder");
        this.f194126l = instrumentTradeActionEventInterceptors;
        this.f194127m = tradeCommandBuilder;
        this.f194128n = onboardingCommandBuilder;
    }

    public static final Object c3(m mVar, d dVar) {
        if (dVar instanceof a) {
            return mVar.A2(((a) dVar).f194105a);
        }
        if (dVar instanceof c) {
            return mVar.L2(((c) dVar).f194107a);
        }
        if (Intrinsics.f(dVar, b.f194106a)) {
            return Unit.f186387a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // gdh.a
    public final Set Z2() {
        return d0.i1(this.f194126l.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    @Override // gdh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b3(bfl.g r10, hdh.e r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ldh.m.b3(bfl.g, hdh.e, boolean):void");
    }

    public final void d3(bfl.g gVar, v0 v0Var, boolean z) {
        hdh.h hVar = new hdh.h(gVar, v0Var, z);
        hdh.f fVar = (hdh.f) this.f194126l.get(v0Var.n().f214597c);
        if (fVar != null) {
            fVar.Z2(hVar, new kul.b(this, v0Var, gVar, z, 1));
        } else {
            e3(gVar, v0Var, z);
        }
    }

    public final void e3(bfl.g gVar, v0 v0Var, boolean z) {
        if (!(v0Var instanceof u0)) {
            if (!(v0Var instanceof t0)) {
                V2(new o(this, v0Var, gVar, z, (Continuation) null, 13), new yi5.b(29));
                return;
            }
            t0 t0Var = (t0) v0Var;
            ArrayList arrayList = t0Var.f214623c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((TradingProduct) it8.next()).f105281b);
            }
            V2(new b0(this, t0Var, arrayList2, (Continuation) null, 3), new yi5.b(29));
            return;
        }
        if ((gVar == bfl.g.SELL && ((u0) v0Var).d) || (gVar == bfl.g.BUY && ((u0) v0Var).f214628c)) {
            V2(new o(this, v0Var, gVar, z, (Continuation) null, 13), new yi5.b(29));
            return;
        }
        u0 u0Var = (u0) v0Var;
        ArrayList arrayList3 = u0Var.f214626a;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((TradingProduct) it9.next()).f105281b);
        }
        V2(new n(13, this, u0Var, gVar, arrayList4, (Continuation) null), new yi5.b(29));
    }

    public final void f3(q0 q0Var, bfl.g gVar) {
        TradingAccountType tradingAccountTypeW;
        TradingOnboardingFeatureConfig.TradingAccountOrType withAvailableAccountIdAndProducts;
        Object obj2 = q0Var.f214613c;
        TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = q0Var.f214611a;
        TradingAccount tradingAccount = q0Var.f214612b;
        Iterable iterable = (Iterable) obj2;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(((TradingProduct) it8.next()).f105281b);
        }
        if (tradingAccount != null) {
            tradingAccountTypeW = tradingAccount.W();
        } else if (tradingAccountAvailableToOnboard != null) {
            tradingAccountTypeW = tradingAccountAvailableToOnboard.d;
        } else {
            r6.b.D("Either createdAccount or accountToOnboard needs to be specified in OnboardingRequired.");
            tradingAccountTypeW = TradingAccountType.Gia.f105270a;
        }
        TradingAccountType tradingAccountType = tradingAccountTypeW;
        String str = tradingAccountAvailableToOnboard != null ? tradingAccountAvailableToOnboard.f105265a : null;
        if (tradingAccount != null) {
            withAvailableAccountIdAndProducts = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts(tradingAccount, arrayList);
        } else {
            if (tradingAccountAvailableToOnboard == null || str == null) {
                r6.b.D("Onboarding account identity is missing.");
                return;
            }
            withAvailableAccountIdAndProducts = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts(str, tradingAccountAvailableToOnboard.f105269h.f105175a.toString(), arrayList);
        }
        V2(new l(this, tradingAccountType, withAvailableAccountIdAndProducts, q0Var, gVar, null), new yi5.b(29));
    }
}
