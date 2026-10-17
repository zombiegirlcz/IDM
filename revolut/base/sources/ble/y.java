package ble;

import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$State;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.v7;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f f16615b;

    public /* synthetic */ y(com.revolut.feature.tab.invest.impl.ui.home.f fVar, int i) {
        this.f16614a = i;
        this.f16615b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16614a) {
            case 0:
                TabInvestControllerContract$State update = (TabInvestControllerContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return TabInvestControllerContract$State.c(update, null, null, null, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, (p) this.f16615b.i0.getValue(), 1073741823);
            case 1:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List<WealthAccount> list = accounts;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (WealthAccount wealthAccount : list) {
                        if (wealthAccount.Q2() || wealthAccount.H6()) {
                            zke.g gVar = this.f16615b.o;
                            return nim.a.v(nim.a.v(nim.a.v(zh9.u0.m(nim.a.A(rd0.e.n(nim.a.v(boh.f.e(zh9.u0.m(ybl.k.k(gVar.f322949h, null, null, cfl.k.f23744a, 3), ((x8h.v0) gVar.i).f()), new zke.e(gVar, 0)), new zke.e(gVar, 1)), zhm.h0.f322473a), new zke.e(gVar, 2)), ybl.l.d(gVar.f322948g)), new zke.f(2)), new zke.f(1)), new zke.f(0));
                        }
                    }
                }
                return zi0.c.i(zhm.f0.f322471a);
            case 2:
                com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.f16615b;
                ybl.l lVar = fVar.f89879t;
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List list2 = accounts2;
                boolean z = list2 instanceof Collection;
                if (!z || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (((WealthAccount) it8.next()).Q2()) {
                            return v7.y("TabInvestControllerModel", "observeOnboardedHeaderState", boh.f.e(ybl.l.d(lVar), new y(fVar, 5)));
                        }
                    }
                }
                if (!z || !list2.isEmpty()) {
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        if (((WealthAccount) it9.next()).H6()) {
                            return boh.f.e(com.revolut.data.database.models.openbanking.d.x("TabInvestControllerModel", "observePendingHeaderState", ybl.l.d(lVar)), new y(fVar, 4));
                        }
                    }
                }
                return nim.a.u(new com.revolut.feature.tab.invest.impl.ui.home.d(2, null), zh9.u0.i(fVar.K2(false), ybl.l.d(lVar), ybl.k.k(fVar.H, null, null, null, 7)));
            case 3:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                tul.b bVar = this.f16615b.U;
                bVar.getClass();
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                vrl.o oVar = (vrl.o) bVar.f274637b;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                prl.j jVar = oVar.f291665a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(xam.a.h(new u29.c(baseCurrency, oVar, (Continuation) null, 22), jVar.d.b(Unit.f186387a, loadingStrategy)), new xub.e(19));
            case 4:
                TradingLegalEntityInformation tradingLegalEntity = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(tradingLegalEntity, "tradingLegalEntity");
                com.revolut.feature.tab.invest.impl.ui.home.f fVar2 = this.f16615b;
                vkm.q0 q0VarJ2 = fVar2.J2();
                akg.n nVarK2 = fVar2.K2(false);
                vkm.q0 q0VarL2 = fVar2.L2(tradingLegalEntity.f105106a);
                return nim.a.u(new p0(null, tradingLegalEntity, 1), zh9.u0.m(zh9.u0.i(q0VarJ2, nVarK2, q0VarL2), nim.a.v(fVar2.f89872d0.a(com.revolut.feature.tab.invest.impl.ui.home.f.j0), new z(7))));
            default:
                TradingLegalEntityInformation tradingLegalEntity2 = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(tradingLegalEntity2, "tradingLegalEntity");
                com.revolut.feature.tab.invest.impl.ui.home.f fVar3 = this.f16615b;
                vkm.q0 q0VarJ22 = fVar3.J2();
                kwg.l lVar2 = fVar3.f89880w;
                List analyticsProductTypes = zhm.v.k(iwg.a.SECURITY, iwg.a.COMMODITY, iwg.a.ROBO);
                eel.c timeSpan = eel.c.ONE_WEEK;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                efm.r map = ue0.e.p(lVar2.f(new kwg.h(lVar2, analyticsProductTypes, timeSpan, 2)), zhm.y0.b(new Pair("TabInvestControllerModel", "observeCombinedTotalValueChart"))).map(new bjg.d(17, new z(9)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return nim.a.u(new p0(null, tradingLegalEntity2, 0), zh9.u0.m(zh9.u0.i(q0VarJ22, rd0.e.b(map), fVar3.K2(true)), zh9.u0.m(fVar3.L2(tradingLegalEntity2.f105106a), nim.a.v(fVar3.f89872d0.a(com.revolut.feature.tab.invest.impl.ui.home.f.j0), new z(7)))));
        }
    }
}
