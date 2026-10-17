package wak;

import ccb.m0;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.feature.retail.slot_manager.impl.network.RetailSlotManagerChecklistService;
import com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import ecm.q;
import ggb.g;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;
import sf0.h;
import t29.j;
import ulm.a1;
import ulm.b1;
import vc.s;
import vjc.i;
import wfb.o;
import wfb.r;
import wpg.l;
import x13.y;
import xb1.p;
import xf6.d2;
import xf6.e1;
import xf6.e3;
import xf6.q0;
import xf6.t;
import xf6.w2;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f295962b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f295961a = i;
        this.f295962b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f295961a) {
            case 0:
                xak.a aVar = new xak.a();
                e eVar = (e) this.f295962b;
                f fVar = eVar.f295965c;
                h hVarB = fVar.f295966a.b();
                s.j(hVarB);
                v60.e eVarA = fVar.f295967b.a();
                s.j(eVarA);
                return new com.revolut.retail.feature.pending_payments.impl.ui.a(aVar, new abk.c(hVarB, eVarA, 0), eVar.f295963a);
            case 1:
                wdj.a aVar2 = (wdj.a) this.f295962b;
                q qVar = aVar2.f296564a;
                return new j(aVar2.f296565b, aVar2.f296566c, aVar2.d, aVar2.e, aVar2.f, aVar2.f296567g, aVar2.f296568h, aVar2.i, aVar2.f296569j, aVar2.f296570l, aVar2.f296571m, aVar2.f296572n, qVar, aVar2.k);
            case 2:
                return new ggb.e(new g(((wfb.e) this.f295962b).f297030a));
            case 3:
                return new ngb.d(new ngb.h(((o) this.f295962b).f297067a));
            case 4:
                return new com.revolut.feature.retail.salary_account.impl.work_email.flow.a(((r) this.f295962b).f297073a);
            case 5:
                bgc.d dVarB = ((whc.c) this.f295962b).f297506a.b();
                s.j(dVarB);
                return new vgc.a(dVarB);
            case 6:
                return new vjc.e(new i(((whc.g) this.f295962b).f297531a, new sic.a()));
            case 7:
                mhc.b bVarA = ((whc.s) this.f295962b).f297568b.a();
                s.j(bVarA);
                return new tic.d(new ugc.a(bVarA), new tic.e());
            case 8:
                whc.q qVar2 = (whc.q) this.f295962b;
                RewardBottomSheetContract$InputData rewardBottomSheetContract$InputData = qVar2.f297562a;
                return new com.revolut.feature.rewards.impl.ui.details.bottomsheet.a(rewardBottomSheetContract$InputData, new com.revolut.feature.rewards.impl.ui.details.bottomsheet.b(qVar2.f297563b.d(), rewardBottomSheetContract$InputData));
            case 9:
                wi5.a aVar3 = (wi5.a) this.f295962b;
                return new vub.j(aVar3.f297799a, aVar3.f297800b, aVar3.f297801c, 2);
            case 10:
                wmg.a aVar4 = (wmg.a) this.f295962b;
                return new vub.j(aVar4.f298654a, aVar4.f298655b, aVar4.f298656c, 4);
            case 11:
                wmi.a aVar5 = (wmi.a) this.f295962b;
                return new ee7.e(aVar5.f298676a, aVar5.f298677b, aVar5.f298678c, aVar5.d, aVar5.e, aVar5.f, 2);
            case 12:
                wp6.a aVar6 = (wp6.a) this.f295962b;
                return new a16.b(aVar6.f299165a, aVar6.f299166b, 23);
            case 13:
                return new com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.a(((wpg.c) this.f295962b).f299242a);
            case 14:
                wpg.e eVar2 = (wpg.e) this.f295962b;
                AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = eVar2.f299253a;
                l lVar = eVar2.f299254b;
                return new oqg.b(addMoneyFlowContract$FlowInput, new m0((ppg.b) lVar.H.get(), lVar.f299279c.b()));
            case 15:
                Retrofit retrofit = ((wqb.a) this.f295962b).g();
                Json json = fe0.d.a();
                wqb.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(json, "json");
                Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
                listConverterFactories.clear();
                b1.Companion.getClass();
                listConverterFactories.add(ek.b.a(json, a1.a("application/json")));
                Retrofit retrofitBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(RetailSlotManagerChecklistService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                RetailSlotManagerChecklistService retailSlotManagerChecklistService = (RetailSlotManagerChecklistService) objCreate;
                s.k(retailSlotManagerChecklistService);
                return retailSlotManagerChecklistService;
            case 16:
                return new n8j.a(((wyj.a) this.f295962b).f301300a, 24);
            case 17:
                return new h33.g(new h33.q(), ((y) this.f295962b).f302215a);
            case 18:
                return new n8j.a(((x2d.b) this.f295962b).f302542a, 25);
            case 19:
                gte.a aVarB = ((x3l.a) this.f295962b).f302758a.b();
                s.j(aVarB);
                return new ddk.b(Collections.singleton(new y3l.a(aVarB)));
            case 20:
                x41.b bVar = (x41.b) this.f295962b;
                return new afh.f(bVar.f302767a, bVar.f302768b, bVar.f302769c, bVar.d, bVar.e, bVar.f, bVar.f302770g, bVar.f302771h, 6);
            case 21:
                x96.b bVar2 = (x96.b) this.f295962b;
                return new xpi.c(bVar2.f303582b, bq.i.b(bVar2.f303581a));
            case 22:
                ja8.d dVar = ((x98.f) this.f295962b).f303612a;
                return new ja8.g(new ja8.i(dVar), dVar);
            case 23:
                lc1.e eVar3 = new lc1.e();
                cfc.b bVarA2 = ((p) this.f295962b).f303955a.a();
                s.j(bVarA2);
                return new lc1.d(eVar3, bVarA2);
            case 24:
                e3 e3Var = (e3) this.f295962b;
                BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = e3Var.f304839b;
                u80.o oVar = new u80.o();
                w80.b bVarJ = ((t) e3Var.f304840c).f305066h.j();
                s.j(bVarJ);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a(brPaymentLimitsUpdateScreenContract$InputData, new wj6.h(oVar, bVarJ, new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.a()));
            case 25:
                return new com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.a(((q0) this.f295962b).f304996a);
            case 26:
                return new bo6.e(new bo6.f(), ((e1) this.f295962b).f304833b);
            case 27:
                return new bo6.e(new bo6.f(), ((e1) this.f295962b).f304833b);
            case 28:
                return new jk6.h(new jk6.j(((d2) this.f295962b).f304822a));
            default:
                e3 e3Var2 = (e3) this.f295962b;
                BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData2 = e3Var2.f304839b;
                u80.o oVar2 = new u80.o();
                w80.b bVarJ2 = ((w2) e3Var2.f304840c).e.j();
                s.j(bVarJ2);
                return new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a(brPaymentLimitsUpdateScreenContract$InputData2, new wj6.h(oVar2, bVarJ2, new com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.a()));
        }
    }
}
