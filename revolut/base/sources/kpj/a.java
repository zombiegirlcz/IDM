package kpj;

import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$State;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.pricing_plans.shared.models.Conditions;
import com.revolut.feature.pricing_plans.shared.models.Fee;
import com.revolut.feature.pricing_plans.shared.models.PricingRule;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopPaymentAccountSection;
import com.revolut.feature.revolut_shop.api.domain.model.pricing_rule.RevolutShopPricingRule;
import com.revolut.feature.revolut_shop.api.domain.model.pricing_rule.RevolutShopPricingRuleMappingPayload;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$Step;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import d3c.l0;
import do3.n;
import foh.i;
import io3.k;
import io3.l;
import ip0.pb0;
import ip0.u20;
import ip0.w20;
import ir2.d;
import ir2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mb5.j;
import nkm.y;
import tof.a3;
import yhm.r;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zr6.g;
import zr6.h;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188253a;

    public /* synthetic */ a(int i) {
        this.f188253a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yfa.c cVar;
        io3.d dVar;
        boolean z = false;
        z = false;
        int i = 10;
        dVarE = null;
        dj0.d dVarE = null;
        Object objC = null;
        switch (this.f188253a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar2 = (fo3.c) pair.f186385a;
                List list = (List) pair.f186386b;
                String str = cVar2.d.f306286a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    io3.d dVar2 = (io3.d) obj3;
                    if (dVar2.f == k.ACTIVE && Intrinsics.f(dVar2.f163147c, str)) {
                        arrayList.add(obj3);
                    }
                }
                RevolutShopPaymentAccountSection[] elements = {b0.j(arrayList, l0.PRO, l.MERCHANT), b0.j(arrayList, l0.PERSONAL, l.CURRENT)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 1:
                List sections = (List) obj2;
                Intrinsics.checkNotNullParameter(sections, "sections");
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = sections.iterator();
                while (it8.hasNext()) {
                    a0.x(((RevolutShopPaymentAccountSection) it8.next()).f84202b, arrayList2);
                }
                return arrayList2;
            case 2:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return v.l(user.k);
            case 3:
                zr6.a plan = (zr6.a) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                List items = plan.getItems();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : items) {
                    if (((zr6.f) obj4).f324611a == zr6.e.CUSTOMER_PRESENT) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList<g> arrayList4 = new ArrayList();
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    a0.x(((zr6.f) it9.next()).f324612b, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                for (g gVar : arrayList4) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    RevolutShopPricingRuleMappingPayload revolutShopPricingRuleMappingPayload = new RevolutShopPricingRuleMappingPayload(gVar.f324617b.f324609a);
                    zr6.c cVar3 = gVar.f324616a;
                    Boolean bool = cVar3 != null ? cVar3.f324606a : null;
                    h hVar = cVar3 != null ? cVar3.f324607b : null;
                    int i2 = hVar == null ? -1 : lpj.a.f199143a[hVar.ordinal()];
                    if (i2 == -1) {
                        cVar = null;
                    } else if (i2 == 1) {
                        cVar = yfa.c.DOMESTIC;
                    } else if (i2 == 2) {
                        cVar = yfa.c.REGIONAL;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = yfa.c.INTERNATIONAL;
                    }
                    Conditions conditions = new Conditions(cVar, bool, 28);
                    zr6.d dVar3 = gVar.f324617b;
                    double d = dVar3.f324609a;
                    dj0.d dVar4 = dVar3.f324610b;
                    arrayList5.add(new RevolutShopPricingRule(new PricingRule(conditions, (d == 0.0d && dVar4 == null) ? Fee.Free.f80956a : (d != 0.0d || dVar4 == null) ? (d <= 0.0d || dVar4 != null) ? (d <= 0.0d || dVar4 == null) ? Fee.Undefined.f80959a : new Fee.Combined(dVar4, (float) d) : new Fee.Percent((float) d) : new Fee.MoneyFee(dVar4), null, null), revolutShopPricingRuleMappingPayload));
                }
                return arrayList5;
            case 4:
                IncomeSorterFlowContract$Step it10 = (IncomeSorterFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 instanceof IncomeSorterFlowContract$Step.IncomeSorterDetails);
            case 5:
                IncomeSorterFlowContract$Step it11 = (IncomeSorterFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 instanceof IncomeSorterFlowContract$Step.IncomeSortersList);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                EnumEntries enumEntriesA = zel.f.a();
                ArrayList arrayList6 = new ArrayList(w.t(enumEntriesA, 10));
                Iterator<E> it12 = enumEntriesA.iterator();
                while (it12.hasNext()) {
                    arrayList6.add(new u20(((zel.f) it12.next()).name(), w20.ICON_60DP));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                return arrayList6;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 8:
                mb5.l it13 = (mb5.l) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return y.J(y.x(y.n(d0.Q(it13.f204146b), new a(9)), new a(i)));
            case 9:
                mb5.k source = (mb5.k) obj2;
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.f204144c == j.ACTIVE && !source.f204143b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                mb5.k source2 = (mb5.k) obj2;
                Intrinsics.checkNotNullParameter(source2, "source");
                return new dz4.a(source2.f204142a, source2.e, source2.d, source2.f);
            case 11:
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                ArrayList arrayList7 = new ArrayList();
                Iterator it14 = entities.iterator();
                while (it14.hasNext()) {
                    qzi.a aVarB = boh.f.B((arj.a) it14.next());
                    if (aVarB != null) {
                        arrayList7.add(aVarB);
                    }
                }
                return arrayList7;
            case 12:
                arj.a entity = (arj.a) obj2;
                Intrinsics.checkNotNullParameter(entity, "entity");
                qzi.a aVarB2 = boh.f.B(entity);
                if (aVarB2 != null) {
                    return aVarB2;
                }
                throw new IllegalArgumentException("Inconsistent wallet budget created");
            case 13:
                jrj.c it15 = (jrj.c) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return i.E(it15);
            case 14:
                jrj.c it16 = (jrj.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return i.E(it16);
            case 15:
                arj.a entity2 = (arj.a) obj2;
                Intrinsics.checkNotNullParameter(entity2, "entity");
                qzi.a aVarB3 = boh.f.B(entity2);
                if (aVarB3 != null) {
                    return aVarB3;
                }
                throw new IllegalArgumentException("Inconsistent wallet budget updated");
            case 16:
                List walletBudgetDtoList = (List) obj2;
                Intrinsics.checkNotNullParameter(walletBudgetDtoList, "walletBudgetDtoList");
                List list2 = walletBudgetDtoList;
                ArrayList arrayList8 = new ArrayList(w.t(list2, 10));
                Iterator it17 = list2.iterator();
                while (it17.hasNext()) {
                    arrayList8.add(i.E((jrj.c) it17.next()));
                }
                return arrayList8;
            case 17:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return "?";
            case 18:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return "?";
            case 19:
                BiometricVerificationActiveLivenessStepFlowContract$State update = (BiometricVerificationActiveLivenessStepFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                f0 mediaKeys = f0.f322471a;
                update.getClass();
                Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
                return new BiometricVerificationActiveLivenessStepFlowContract$State(mediaKeys);
            case 20:
                BiometricVerificationActiveLivenessStepFlowContract$State update2 = (BiometricVerificationActiveLivenessStepFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ArrayList mediaKeys2 = d0.A0(update2.f50498a, "ACTIVE_LIVENESS_MEDIA_KEY_YUV_DATA");
                Intrinsics.checkNotNullParameter(mediaKeys2, "mediaKeys");
                return new BiometricVerificationActiveLivenessStepFlowContract$State(mediaKeys2);
            case 21:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (a3) d0.b0(it18);
            case 22:
                fo3.c it19 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.d;
            case 23:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                RevPointsPocketState revPointsPocketState = (RevPointsPocketState) rVar.f314201a;
                xi0.b bVar = (xi0.b) rVar.f314202b;
                Set set = (Set) rVar.f314203c;
                if (revPointsPocketState instanceof RevPointsPocketState.Active) {
                    RevPointsPocketInfo revPointsPocketInfo = ((RevPointsPocketState.Active) revPointsPocketState).f97790b;
                    return new Pair(v.l(set.contains(revPointsPocketInfo.f97784a) ? null : revPointsPocketInfo), bVar);
                }
                if (revPointsPocketState instanceof RevPointsPocketState.Inactive) {
                    return new Pair(f0.f322471a, bVar);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PocketsNetWorthProductsLoader", v1.c.u("error in rev points ", it20), null, h0Var);
                return f0.f322471a;
            case 25:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PocketsNetWorthProductsLoader", v1.c.u("error in cashback ", it21), null, h0Var2);
                return f0.f322471a;
            case 26:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List list3 = (List) hVar2.f288433a;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) hVar2.f288434b;
                CashbackCurrency cashbackCurrency = (CashbackCurrency) hVar2.f288435c;
                xi0.b bVar2 = (xi0.b) hVar2.d;
                xi0.b bVar3 = cashbackCurrency.f65687a;
                if (bVar3 != null) {
                    uc3.a aVar = (uc3.a) d0.d0(list3);
                    if (aVar != null && (dVar = aVar.f278974b) != null) {
                        dVarE = io3.h.e(dVar);
                    }
                    dj0.d dVar5 = new dj0.d(0L, bVar3);
                    if (dVarE == null) {
                        dVarE = dVar5;
                    }
                    objC = u.c(new lsd.a(dVarE, pricingPlanSubscription));
                }
                if (objC == null) {
                    objC = f0.f322471a;
                }
                return new Pair(objC, bVar2);
            case 27:
                uc3.f it22 = (uc3.f) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f278979a;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return uc3.e.TERMINATED;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayList9 = new ArrayList(6);
                for (int i3 = 0; i3 < 6; i3++) {
                    arrayList9.add(new pb0(a0.d.n("loadingRow", i3)));
                }
                yp0.b.k(arrayList9, 0, 0, 0, 0, 31);
                return new ir2.c(h.a.f167992a, arrayList9, d.a.f167986a, null);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f188253a = i;
    }
}
