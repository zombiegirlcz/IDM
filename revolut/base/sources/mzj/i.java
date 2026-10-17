package mzj;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.kyc.api.navigation.ConfirmAddressDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import efm.d0;
import hha.s;
import hha.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mzj.e;
import nzj.p;
import rp0.p0;
import rp0.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f210796b;

    public /* synthetic */ i(n nVar, int i) {
        this.f210795a = i;
        this.f210796b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b bVarB;
        switch (this.f210795a) {
            case 0:
                u0 model = (u0) obj2;
                cqi.h hVar = this.f210796b.f210802h;
                Intrinsics.h(model);
                cqi.j jVar = (cqi.j) hVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                jVar.i.g(model);
                return Unit.f186387a;
            case 1:
                d it8 = (d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f210796b.f210805m.getClass();
                return g.a(it8);
            case 2:
                d it9 = (d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f210796b.f210805m.getClass();
                return g.b(it9);
            case 3:
                e eVar = (e) obj2;
                n nVar = this.f210796b;
                efm.b bVarC = ((cqi.j) nVar.f210802h).i.f256147a.c();
                Intrinsics.h(eVar);
                nzj.c cVar = nVar.k;
                if (eVar.equals(e.a.f210780a)) {
                    p pVar = (p) cVar;
                    pVar.getClass();
                    bVarB = pVar.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))));
                } else if (eVar.equals(e.b.f210781a)) {
                    p pVar2 = (p) cVar;
                    pVar2.getClass();
                    bVarB = pVar2.b(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ConfirmAddressDestination(null, 7), false, (Integer) null, 0, 61)));
                } else if (eVar.equals(e.c.f210782a)) {
                    p pVar3 = (p) cVar;
                    bVarB = pVar3.b(zj2.a.b(pVar3.f221088b));
                } else if (eVar.equals(e.d.f210783a)) {
                    bVarB = ((p) cVar).a();
                } else if (eVar.equals(e.C1189e.f210784a)) {
                    p pVar4 = (p) cVar;
                    bVarB = pVar4.b(((jte.d) pVar4.f221089c).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMovedPlans.f97189c) ? zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(StartUpPocket.FiatAccountsAll.f104847a, (com.revolut.shared.feature.move_money.api.navigation.a) null, 6), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.Default(0)));
                } else if (eVar.equals(e.f.f210785a)) {
                    pfm.m mVar = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    bVarB = mVar;
                } else if (eVar.equals(e.g.f210786a)) {
                    p pVar5 = (p) cVar;
                    pVar5.getClass();
                    bVarB = pVar5.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6))));
                } else {
                    if (!(eVar instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f fVar = (f) eVar;
                    u feature = fVar.f210787a;
                    xfa.b startedFrom = fVar.f210788b;
                    List plans = fVar.f210789c;
                    if (plans != null && plans.size() == 1 && s.p((hha.d) plans.get(0))) {
                        p pVar6 = (p) cVar;
                        pVar6.getClass();
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        bVarB = pVar6.b(new FeatureCommand(new PricingPlanFeatureConfig.UltraDashboard(feature)));
                    } else {
                        if (plans == null) {
                            plans = f0.f322471a;
                        }
                        p pVar7 = (p) cVar;
                        pVar7.getClass();
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        Intrinsics.checkNotNullParameter(plans, "plans");
                        Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
                        List list = plans;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList.add(((hha.d) it10.next()).f152287a);
                        }
                        bVarB = pVar7.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(feature, arrayList, null, null, false, startedFrom, 188)));
                    }
                }
                pfm.a aVarE = bVarC.e(bVarB);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 4:
                Intrinsics.checkNotNullParameter((c) obj2, "it");
                return ((cqi.j) this.f210796b.f210802h).i.f256147a.c();
            case 5:
                p0.a clickData = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f256150a;
                d dVar = obj3 instanceof d ? (d) obj3 : null;
                String faqKey = dVar != null ? dVar.f210779c : null;
                if (faqKey == null) {
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                p pVar8 = (p) this.f210796b.k;
                pVar8.getClass();
                Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                return pVar8.b(new FeatureCommand(new FaqFeatureConfig.Starter(faqKey, 2)));
            case 6:
                czj.d limitType = (czj.d) obj2;
                Intrinsics.checkNotNullParameter(limitType, "limitType");
                n nVar2 = this.f210796b;
                return nVar2.f210804l.v0(limitType, nVar2.f210803j.getAccountId());
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                n nVar3 = this.f210796b;
                d0 d0VarFirstOrError = nVar3.o.firstOrError();
                j jVar2 = new j(new i(nVar3, 6), 4);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, jVar2, 0);
        }
    }
}
