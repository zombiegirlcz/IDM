package dce;

import android.content.Context;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$Step;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import com.revolut.retail.feature.esim.api.model.EsimProfileScope;
import com.revolut.retail.feature.esim.api.model.EsimProfileSummary;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.FeatureTagData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState;
import dej.d3;
import dej.f3;
import dej.g3;
import dej.l3;
import dej.m3;
import dej.p3;
import dej.t1;
import dfj.b5;
import dfj.d1;
import dfj.w2;
import dfj.x1;
import dfj.x2;
import dfj.y1;
import dfj.z1;
import io.reactivex.rxjava3.disposables.Disposable;
import ip0.di;
import ip0.fi;
import ip0.pb0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m1c.f1;
import tof.i1;
import tof.r9;
import tof.s9;
import wfk.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112874b;

    public /* synthetic */ l0(Object obj2, int i) {
        this.f112873a = i;
        this.f112874b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        EsimCoverage global;
        Object next;
        RentAndBillsLinkedPayments.Category category;
        RentAndBillsLinkedPayments.Category category2;
        switch (this.f112873a) {
            case 0:
                com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f112874b;
                hce.c subscriptionContent = (hce.c) obj2;
                Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
                cVar.H2(cVar.N, new k0(subscriptionContent, 0));
                abe.a aVarK2 = cVar.K2(subscriptionContent);
                Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
                efm.r map = aVarK2.c(subscriptionContent).map(new a9j.j(new a7b.r(aVarK2, 13), 10));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                efm.r rVarDistinctUntilChanged = map.distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                vkm.d dVarB = rd0.e.b(rVarDistinctUntilChanged);
                efm.r rVarDistinctUntilChanged2 = cVar.K2(subscriptionContent).d(subscriptionContent).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                return yh5.b.d(dVarB, rd0.e.b(rVarDistinctUntilChanged2));
            case 1:
                com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b bVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.b) this.f112874b;
                yki.i iVar = bVar.f100111r;
                vj5.g outputData = (vj5.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof vj5.f;
                CryptoDepositsOverviewFlowContract$InputData.Source.CeFi ceFi = CryptoDepositsOverviewFlowContract$InputData.Source.CeFi.f100099a;
                if (z) {
                    String str2 = ((vj5.f) outputData).f289654a;
                    xi0.b.Companion.getClass();
                    oki.h.u2(bVar, iVar, new CryptoDepositsOverviewFlowContract$Step.Overview(xi0.a.a(str2), true, ceFi), null, 6);
                } else if (outputData instanceof vj5.e) {
                    String str3 = ((vj5.e) outputData).f289653a;
                    xi0.b.Companion.getClass();
                    oki.h.u2(bVar, iVar, new CryptoDepositsOverviewFlowContract$Step.Overview(xi0.a.a(str3), true, ceFi), null, 6);
                } else {
                    if (!Intrinsics.f(outputData, vj5.d.f289652a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            case 2:
                ((dcl.y0) this.f112874b).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM portfolioSettings LIMIT 1");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolioId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stockBuyBlockState");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stockBuyBlockDeactivationTime");
                    ocl.a aVar = null;
                    Long lValueOf = null;
                    if (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String json = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        Intrinsics.checkNotNullParameter(json, "json");
                        kg.o oVarA = zbl.a.a();
                        Type type = new TypeToken<ocl.b>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.StockBuyBlockStateTypeConverter$toStockBuyBlockStatusEntity$$inlined$fromJson$1
                        }.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        Object objD = oVarA.d(json, type);
                        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                        ocl.b bVar2 = (ocl.b) objD;
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                            lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                        }
                        aVar = new ocl.a(text, bVar2, lValueOf);
                    }
                    return aVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 3:
                de9.h hVar = (de9.h) this.f112874b;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new de9.q(new de9.p(Integer.valueOf(hVar.f113322a.length())), null, hVar.e, 2);
            case 4:
                deb.j jVar = (deb.j) this.f112874b;
                deb.h update = (deb.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return deb.h.a(update, null, null, jVar, null, null, 27);
            case 5:
                com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a) this.f112874b;
                s7a.a0 output = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                s7a.c0 c0Var = output.f260599a;
                c8a.a aVar3 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                if (aVar3 == null || (str = aVar3.f22154a) == null) {
                    return Unit.f186387a;
                }
                aVar2.H2(aVar2.f82846r, new dcl.m0(aVar2, str, 11));
                return Unit.f186387a;
            case 6:
                cd1.e shoppingCart = (cd1.e) this.f112874b;
                ((df1.h) obj2).getClass();
                Intrinsics.checkNotNullParameter(shoppingCart, "shoppingCart");
                return new df1.h(shoppingCart);
            case 7:
                dfg.e eVar = (dfg.e) this.f112874b;
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new dfg.h(zhm.f0.f322471a, new dfg.f(new TextLocalisedClause(R$string.hotels_common_action_done, null, null, 14), Intrinsics.f(eVar.d, Boolean.TRUE)));
            case 8:
                r10.r rVar = (r10.r) this.f112874b;
                List subscriptionTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptionTransactions, "subscriptionTransactions");
                if (subscriptionTransactions.isEmpty()) {
                    return hb9.b.j(zhm.f0.f322471a);
                }
                rVar.getClass();
                List<l3> list = subscriptionTransactions;
                ArrayList arrayList = new ArrayList();
                Iterator it10 = list.iterator();
                while (true) {
                    String str4 = null;
                    if (!it10.hasNext()) {
                        akg.n nVarV = nim.a.v(rd0.e.b(whf.b.a((whf.b) rVar.f250853c, te0.w.h(new s9(zhm.d0.i1(arrayList))), null, Integer.valueOf(arrayList.size()), null, 10)), new dee.x(15));
                        ArrayList arrayList2 = new ArrayList();
                        for (l3 l3Var : list) {
                            m3 m3Var = l3Var.f113591b;
                            String str5 = l3Var.f113590a;
                            int i = m3Var == null ? -1 : d1.f113938a[m3Var.ordinal()];
                            if (i == -1 || i == 1 || i == 2) {
                                str5 = null;
                            } else if (i != 3 && i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (str5 != null) {
                                arrayList2.add(str5);
                            }
                        }
                        return nim.a.v(zh9.u0.m(nVarV, nim.a.v(rd0.e.b(((nyb.m0) rVar.f250852b).c(new RevPointsTransactionPageParams(arrayList2.size(), null, null, null, f1.ESIM, null, null, arrayList2, null, 366))), new dee.x(16))), new dee.x(13));
                    }
                    l3 l3Var2 = (l3) it10.next();
                    m3 m3Var2 = l3Var2.f113591b;
                    String str6 = l3Var2.f113590a;
                    int i2 = m3Var2 == null ? -1 : d1.f113938a[m3Var2.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1 || i2 == 2) {
                            str4 = str6;
                        } else if (i2 != 3 && i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                }
                break;
            case 9:
                z1 z1Var = (z1) this.f112874b;
                List<EsimDataPlan> plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                aim.f builder = new aim.f();
                for (EsimDataPlan esimDataPlan : plans) {
                    z1Var.getClass();
                    dej.m mVar = esimDataPlan.f100214c;
                    if (mVar == null) {
                        mVar = dej.m.DATA_PLAN;
                    }
                    EsimCoverage esimCoverage = esimDataPlan.f100221p;
                    Intrinsics.checkNotNullParameter(esimCoverage, "<this>");
                    if (!(esimCoverage instanceof EsimCoverage.Country) && !(esimCoverage instanceof EsimCoverage.Undefined)) {
                        if (esimCoverage instanceof EsimCoverage.Regional) {
                            EsimCoverage.Regional regional = (EsimCoverage.Regional) esimCoverage;
                            zhm.f0 countries = zhm.f0.f322471a;
                            EsimDataPlanCoverageCode regionCode = regional.f100209b;
                            String str7 = regional.f100210c;
                            Intrinsics.checkNotNullParameter(countries, "countries");
                            Intrinsics.checkNotNullParameter(regionCode, "regionCode");
                            global = new EsimCoverage.Regional(countries, regionCode, str7);
                        } else {
                            if (!(esimCoverage instanceof EsimCoverage.Global)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zhm.f0 countries2 = zhm.f0.f322471a;
                            String str8 = ((EsimCoverage.Global) esimCoverage).f100207b;
                            Intrinsics.checkNotNullParameter(countries2, "countries");
                            global = new EsimCoverage.Global(countries2, str8);
                        }
                        esimCoverage = global;
                    }
                    if (esimCoverage.equals(EsimCoverage.Undefined.f100211a)) {
                        esimCoverage = null;
                    }
                    x1 x1Var = esimCoverage != null ? new x1(mVar, esimCoverage) : null;
                    if (x1Var != null) {
                        Object obj3 = builder.get(x1Var);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            ArrayList arrayList3 = new ArrayList();
                            builder.put(x1Var, arrayList3);
                            obj4 = arrayList3;
                        }
                        ((List) obj4).add(esimDataPlan);
                    }
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                aim.f fVarB = builder.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(fVarB.i));
                Object it11 = ((aim.k) fVarB.entrySet()).iterator();
                while (((aim.i) it11).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((aim.g) it11).next();
                    linkedHashMap.put(entry.getKey(), new y1(zhm.d0.P0((List) entry.getValue(), iij.a.f161623a)));
                }
                return linkedHashMap;
            case 10:
                x2 x2Var = (x2) this.f112874b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                List<EsimProfile> list3 = (List) pair.f186386b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                for (EsimProfile esimProfile : list3) {
                    x2Var.getClass();
                    Iterator it12 = list2.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next = it12.next();
                            if (Intrinsics.f(((UserDevice) next).f71914a, esimProfile.d)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    UserDevice userDevice = (UserDevice) next;
                    String str9 = esimProfile.f100423a;
                    EsimProfileLock esimProfileLock = esimProfile.k;
                    boolean zJ = pd.b.j(esimProfileLock != null ? Boolean.valueOf(esimProfileLock.f100448b) : null);
                    String str10 = userDevice != null ? userDevice.e : null;
                    EsimProfileScope esimProfileScope = esimProfile.f100428j;
                    arrayList4.add(new EsimProfileSummary(str9, str10, esimProfileScope != null ? esimProfileScope.f100452c : null, zJ, userDevice != null && userDevice.f71921m));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayList4) {
                    EsimProfileSummary esimProfileSummary = (EsimProfileSummary) obj5;
                    if (esimProfileSummary.e || esimProfileSummary.f100456b) {
                        arrayList5.add(obj5);
                    }
                }
                return zhm.d0.P0(arrayList5, new w2());
            case 11:
                b5 b5Var = (b5) this.f112874b;
                p3 response = (p3) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List list4 = response.f113617a;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list4) {
                    t1 t1Var = ((d3) obj6).f113523a;
                    g3 g3Var = t1Var.f113663t;
                    b5Var.getClass();
                    dej.m mVar2 = t1Var.f113653g;
                    if (mVar2 == dej.m.DATA_PLAN || mVar2 == null) {
                        Intrinsics.checkNotNullParameter(t1Var, "<this>");
                        if ((g3Var != null ? g3Var.f113541a : null) != f3.ELIGIBLE) {
                            Intrinsics.checkNotNullParameter(t1Var, "<this>");
                            if ((g3Var != null ? g3Var.f113541a : null) != f3.PENDING) {
                                Intrinsics.checkNotNullParameter(t1Var, "<this>");
                                if ((g3Var != null ? g3Var.f113541a : null) == f3.NON_ELIGIBLE) {
                                }
                            }
                        }
                        arrayList6.add(obj6);
                    }
                }
                return p3.a(response, zhm.d0.P0(arrayList6, ynj.u.f315492a));
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a aVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a) this.f112874b;
                bg4.u outputData2 = (bg4.u) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                Continuation continuation = null;
                if (outputData2 instanceof bg4.s) {
                    c84.t.J2(aVar4, false, null, null, 7);
                } else {
                    if (!(outputData2 instanceof bg4.t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.l2(new d3i.g(aVar4, outputData2, continuation, 23), new yi5.b(26));
                }
                return Unit.f186387a;
            case 13:
                jeg.g gVar = (jeg.g) this.f112874b;
                a.AbstractC1639a it13 = (a.AbstractC1639a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                gVar.invoke(it13);
                return Unit.f186387a;
            case 14:
                ((dhk.e) this.f112874b).f114828m.k((a.AbstractC1639a) obj2);
                return Unit.f186387a;
            case 15:
                di7.e eVar2 = (di7.e) this.f112874b;
                di7.a it14 = (di7.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (List) eVar2.f114940a.get(it14.a());
            case 16:
                djc.b0 b0Var = (djc.b0) this.f112874b;
                djc.i it15 = (djc.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                int i3 = djc.v.f115317a[b0Var.o.f84980a.ordinal()];
                if (i3 == 1) {
                    RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) it15.f115301c.getContent();
                    if (rentAndBillsLinkedPayments != null && (category = rentAndBillsLinkedPayments.f84786a) != null) {
                        return category.f84790b;
                    }
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RentAndBillsLinkedPayments rentAndBillsLinkedPayments2 = (RentAndBillsLinkedPayments) it15.f115301c.getContent();
                    if (rentAndBillsLinkedPayments2 != null && (category2 = rentAndBillsLinkedPayments2.f84787b) != null) {
                        return category2.f84790b;
                    }
                }
                return null;
            case 17:
                dk9.a0 a0Var = (dk9.a0) this.f112874b;
                zh9.r0 plan = (zh9.r0) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                return nim.a.w(n14.k.r(com.revolut.domain.interactors.transactions.a.d(a0Var.f115466t, new r9(plan.f322328c), zhm.u.c(i1.f272794a), 1, null, null, 24), zhm.f0.f322471a), new dk9.t(plan, 0));
            case 18:
                r10.t tVar = (r10.t) this.f112874b;
                Context it16 = (Context) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (lki.r) tVar.f250857a;
            case 19:
                CompositeClause compositeClauseA = gej.a.a((gej.a) ((r10.v) this.f112874b).f250863b, ((Long) obj2).longValue(), null, 6);
                hha.u.Companion.getClass();
                return new PlanFeatureResource(hha.u.p0, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_free_esim_data_title, zhm.u.c(compositeClauseA), null, 12), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_free_esim_data_subtitle, null, null, 14), R$drawable.uikit_icn_24_sim_card, (FeatureTagData) null, 34);
            case 20:
                dkk.w wVar = (dkk.w) this.f112874b;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                if (!te0.w.S(user, wi0.b.f297770q3)) {
                    return nim.a.w(nim.a.w(si7.a.a(wVar.f115627b), new dkk.m(10)), new dkk.m(9));
                }
                hha.u.Companion.getClass();
                return zi0.c.j(new PlanFeatureResource(hha.u.Q, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_return_protection_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_return_protection_subtitle, null, null, 14), R$drawable.uikit_icn_24_revert_left, (FeatureTagData) null, 34));
            case 21:
                dkk.c0 c0Var2 = (dkk.c0) this.f112874b;
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                wi0.b.Companion.getClass();
                if (!te0.w.S(user2, wi0.b.f297770q3)) {
                    return nim.a.w(nim.a.w(si7.a.a(c0Var2.f115589b), new dkk.m(15)), new dkk.m(14));
                }
                hha.u.Companion.getClass();
                return zi0.c.j(new PlanFeatureResource(hha.u.R, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_event_ticket_protection_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_event_ticket_protection_subtitle, null, null, 14), R$drawable.uikit_icn_24_voucher, (FeatureTagData) null, 34));
            case 22:
                mp.p pVar = (mp.p) this.f112874b;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                SavingsProductData savingsProductData = (SavingsProductData) pair2.f186385a;
                do3.n nVar = (do3.n) pair2.f186386b;
                hha.u.Companion.getClass();
                hha.u uVar = hha.u.B;
                int i5 = R$drawable.uikit_icn_24_savings_vault;
                dcd.b bVar3 = (dcd.b) pVar.d;
                wi0.b.Companion.getClass();
                wi0.b bVar4 = wi0.b.p0;
                TextLocalisedClause textLocalisedClause = te0.w.S(nVar, bVar4) ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_savings_title, zhm.u.c(bVar3.k(savingsProductData, null)), null, 12) : te0.w.S(nVar, wi0.b.f297770q3) ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_savings_vaults_title_us, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_savings_title, zhm.u.c(bVar3.k(savingsProductData, null)), null, 12);
                PercentageClause percentageClauseK = bVar3.k(savingsProductData, null);
                return new PlanFeatureResource(uVar, textLocalisedClause, te0.w.S(nVar, bVar4) ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_savings_updated_subtitle, zhm.u.c(percentageClauseK), null, 12) : te0.w.S(nVar, wi0.b.f297770q3) ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_restructured_feature_savings_vaults_subtitle1_us, zhm.u.c(percentageClauseK), null, 12) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_feature_savings_subtitle, zhm.u.c(percentageClauseK), null, 12), i5, (FeatureTagData) null, 34);
            case 23:
                dli.e eVar3 = (dli.e) this.f112874b;
                cli.p it17 = (cli.p) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                eVar3.f.c(it17.c());
                return Unit.f186387a;
            case 24:
                yji.o controller = (dli.a) this.f112874b;
                Context it18 = (Context) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Intrinsics.checkNotNullParameter(controller, "controller");
                UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(((ViewController) controller).m2());
                uIKitLinearLayoutManager.f98539c = true;
                return uIKitLinearLayoutManager;
            case 25:
                olk.f fVar = (olk.f) this.f112874b;
                PlanCancelFlowContract$DomainState update2 = (PlanCancelFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return PlanCancelFlowContract$DomainState.a(update2, null, ((olk.g) fVar).f226442a, 1);
            case 26:
                ilk.f fVar2 = (ilk.f) this.f112874b;
                PlanCancelFlowContract$DomainState update3 = (PlanCancelFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return PlanCancelFlowContract$DomainState.a(update3, ((ilk.e) fVar2).f162254a, null, 2);
            case 27:
                ((Disposable) this.f112874b).dispose();
                return Unit.f186387a;
            case 28:
                dmb.p pVar2 = (dmb.p) this.f112874b;
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                List listC = zhm.u.c(new pb0("LOADING_STATE_ID"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new dmb.l(null, listC, dmb.p.a(pVar2, false, null, 3), null, 19);
            default:
                dme.d dVar = (dme.d) this.f112874b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                dVar.getClass();
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList7 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it20 = intRange.iterator();
                while (it20.f289625c) {
                    di diVar = new di(a0.d.n("FEED_LOADING_ID", it20.nextInt()), fi.SQUARE);
                    yp0.b.l(diVar, 0, 0, 0, 0, null, false, 63);
                    arrayList7.add(diVar);
                }
                return arrayList7;
        }
    }
}
