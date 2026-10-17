package x5f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.models.portfolio_metrics.TopHoldingSubclassAllocation;
import dfl.i0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import tof.a3;
import xzg.t;
import xzg.u;
import xzg.y;
import xzg.z;
import zhm.a0;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f302973b;

    public /* synthetic */ m(int i, Object obj2, List list) {
        this.f302972a = i;
        this.f302973b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object tVar;
        Object next2;
        switch (this.f302972a) {
            case 0:
                List allInstruments = (List) obj2;
                Intrinsics.checkNotNullParameter(allInstruments, "allInstruments");
                List<TopHoldingSubclassAllocation> list = this.f302973b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((TopHoldingSubclassAllocation) it8.next()).f95695a);
                }
                Set setI1 = d0.i1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : allInstruments) {
                    if (setI1.contains(((nel.n) obj3).f214596b)) {
                        arrayList2.add(obj3);
                    }
                }
                int iB = q0.b(w.t(arrayList2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : arrayList2) {
                    linkedHashMap.put(((nel.n) obj4).f214596b, obj4);
                }
                ArrayList arrayList3 = new ArrayList();
                for (TopHoldingSubclassAllocation topHoldingSubclassAllocation : list) {
                    nel.n nVar = (nel.n) linkedHashMap.get(topHoldingSubclassAllocation.f95695a);
                    a6f.j jVar = nVar != null ? new a6f.j(nVar.e, nVar.f214596b, nVar.d, nVar.o, topHoldingSubclassAllocation.f95696b) : null;
                    if (jVar != null) {
                        arrayList3.add(jVar);
                    }
                }
                return arrayList3;
            case 1:
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = currencies.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    List list2 = this.f302973b;
                    if (!zHasNext) {
                        return d0.P0(arrayList4, new b83.a(list2, 7));
                    }
                    Object next3 = it9.next();
                    if (list2.contains(((xi0.b) next3).f306286a)) {
                        arrayList4.add(next3);
                    }
                }
                break;
            case 2:
                nel.n it10 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(this.f302973b.contains(it10.f214596b));
            case 3:
                List collectionsByCurrencies = (List) obj2;
                Intrinsics.checkNotNullParameter(collectionsByCurrencies, "collectionsByCurrencies");
                List list3 = this.f302973b;
                ArrayList arrayList5 = new ArrayList();
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    a0.x(((xzg.k) it11.next()).a(), arrayList5);
                }
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                Iterator it12 = arrayList5.iterator();
                while (it12.hasNext()) {
                    arrayList6.add(((xzg.d) it12.next()).f309976a);
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : collectionsByCurrencies) {
                    xzg.k kVar = (xzg.k) obj5;
                    if (!arrayList6.isEmpty()) {
                        Iterator it13 = arrayList6.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                            }
                            if (Intrinsics.f((String) it13.next(), kVar.d())) {
                                arrayList7.add(obj5);
                            }
                            break;
                        }
                    }
                }
                return arrayList7;
            case 4:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                ArrayList arrayListU = w.u(transactions);
                int iB2 = q0.b(w.t(arrayListU, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj6 : arrayListU) {
                    linkedHashMap2.put(((InvestTransaction) obj6).getF82285a().getId(), obj6);
                }
                List list4 = this.f302973b;
                ArrayList arrayList8 = new ArrayList();
                Iterator it14 = list4.iterator();
                while (it14.hasNext()) {
                    InvestTransaction investTransaction = (InvestTransaction) linkedHashMap2.get(((i0) it14.next()).getId());
                    if (investTransaction != null) {
                        arrayList8.add(investTransaction);
                    }
                }
                return arrayList8;
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list5 = (List) pair.f186385a;
                List list6 = (List) pair.f186386b;
                List<xzg.a0> list7 = this.f302973b;
                ArrayList arrayList9 = new ArrayList();
                for (xzg.a0 a0Var : list7) {
                    z zVar = a0Var.f309970b;
                    String str = a0Var.f309969a;
                    Object obj7 = null;
                    if (zVar instanceof y) {
                        Iterator it15 = list5.iterator();
                        while (true) {
                            if (it15.hasNext()) {
                                next2 = it15.next();
                                if (Intrinsics.f(str, ((nel.n) next2).f214596b)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        nel.n nVar2 = (nel.n) next2;
                        if (nVar2 != null) {
                            tVar = new u(a0Var, nVar2, null);
                            obj7 = tVar;
                        }
                    } else {
                        if (!zVar.equals(xzg.w.f310036a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator it16 = list6.iterator();
                        while (true) {
                            if (it16.hasNext()) {
                                next = it16.next();
                                xi0.b.Companion.getClass();
                                if (Intrinsics.f(xi0.a.a(str).f306286a, ((xi0.b) next).f306286a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        xi0.b bVar = (xi0.b) next;
                        if (bVar != null) {
                            tVar = new t(a0Var, bVar, null, null);
                            obj7 = tVar;
                        }
                    }
                    if (obj7 != null) {
                        arrayList9.add(obj7);
                    }
                }
                return arrayList9;
            case 6:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Map map = (Map) pair2.f186385a;
                Map map2 = (Map) pair2.f186386b;
                List<Pair> list8 = this.f302973b;
                ArrayList arrayList10 = new ArrayList();
                for (Pair pair3 : list8) {
                    BigDecimal bigDecimal = (BigDecimal) map.get(pair3);
                    BigDecimal bigDecimal2 = (BigDecimal) map2.get(pair3);
                    Intrinsics.checkNotNullParameter(pair3, "pair");
                    vel.a aVar = null;
                    if (bigDecimal != null && bigDecimal2 != null && !Intrinsics.f(bigDecimal.unscaledValue(), BigDecimal.ZERO.unscaledValue())) {
                        xi0.b bVar2 = (xi0.b) pair3.f186385a;
                        xi0.b bVar3 = (xi0.b) pair3.f186386b;
                        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimalValueOf);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimal, RoundingMode.HALF_EVEN);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                        aVar = new vel.a(bVar2, bVar3, bigDecimalDivide, bigDecimal2);
                    }
                    if (aVar != null) {
                        arrayList10.add(aVar);
                    }
                }
                return arrayList10;
            case 7:
                List disclaimers = (List) obj2;
                Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
                ArrayList arrayList11 = new ArrayList();
                for (Object obj8 : disclaimers) {
                    if (this.f302973b.contains(((rdh.a) obj8).f253457a)) {
                        arrayList11.add(obj8);
                    }
                }
                return arrayList11;
            case 8:
                xgd.m update = (xgd.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return xgd.m.a(update, null, this.f302973b, null, 5);
            case 9:
                xp8.e eVar = (xp8.e) obj2;
                List list9 = this.f302973b;
                ArrayList arrayList12 = new ArrayList(w.t(list9, 10));
                Iterator it17 = list9.iterator();
                while (it17.hasNext()) {
                    arrayList12.add(new bw0.d(6, new MoneyClause(((dp8.f) it17.next()).f116842a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), (Clause) null));
                }
                return xp8.e.a(eVar, null, arrayList12, 1);
            case 10:
                return xpk.h.a((xpk.h) obj2, false, false, false, this.f302973b, null, null, false, 479);
            case 11:
                dj0.d it18 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Pair(it18, this.f302973b);
            case 12:
                SotFlowContract$FlowState update2 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List list10 = this.f302973b;
                return SotFlowContract$FlowState.a(update2, false, null, null, list10, (DocumentType) d0.b0(list10), null, null, null, null, null, null, null, null, false, 16359);
            case 13:
                List trendsPreview = (List) obj2;
                Intrinsics.checkNotNullParameter(trendsPreview, "trendsPreview");
                return d0.P0(trendsPreview, new b83.a(this.f302973b, 14));
            case 14:
                return ybh.n.a((ybh.n) obj2, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, this.f302973b, false, 98303);
            case 15:
                return yed.o.a((yed.o) obj2, null, null, null, null, false, false, null, null, null, this.f302973b, false, null, false, null, null, null, 1046527);
            case 16:
                return yf1.m.a((yf1.m) obj2, this.f302973b, null, null, null, null, null, 62);
            case 17:
                return yfd.m.a((yfd.m) obj2, null, null, null, false, this.f302973b, 31);
            case 18:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<iel.a> list11 = this.f302973b;
                ArrayList arrayList13 = new ArrayList(w.t(list11, 10));
                for (iel.a aVar2 : list11) {
                    LinkedHashSet linkedHashSetB = yhl.b.b(aVar2);
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj9 : instruments) {
                        if (linkedHashSetB.contains(((nel.n) obj9).f214596b)) {
                            arrayList14.add(obj9);
                        }
                    }
                    arrayList13.add(new ugl.a(aVar2, arrayList14));
                }
                return arrayList13;
            case 19:
                return yic.e.a((yic.e) obj2, null, null, null, null, null, null, new Data(this.f302973b, null, false, 6, null), null, 191);
            case 20:
                yj7.e updateState = (yj7.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yj7.e.a(updateState, this.f302973b);
            case 21:
                ((ymf.d) obj2).getClass();
                List receipts = this.f302973b;
                Intrinsics.checkNotNullParameter(receipts, "receipts");
                return new ymf.d(receipts);
            case 22:
                List list12 = this.f302973b;
                Intrinsics.h(list12);
                return yna.a.a((yna.a) obj2, null, null, null, list12, null, null, null, false, false, null, false, null, null, null, null, 65519);
            case 23:
                Map charities = (Map) obj2;
                Intrinsics.checkNotNullParameter(charities, "charities");
                List<qua.p> list13 = this.f302973b;
                ArrayList arrayList15 = new ArrayList(w.t(list13, 10));
                for (qua.p pVarH : list13) {
                    if (tsk.t.f(pVarH)) {
                        pVarH = tsk.t.h(pVarH, charities);
                    }
                    arrayList15.add(pVarH);
                }
                return arrayList15;
            case 24:
                List cardTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(cardTransactions, "cardTransactions");
                List list14 = cardTransactions;
                ArrayList arrayList16 = new ArrayList(w.t(list14, 10));
                Iterator it19 = list14.iterator();
                while (it19.hasNext()) {
                    arrayList16.add(((a3) it19.next()).f272581b);
                }
                List list15 = this.f302973b;
                ArrayList arrayList17 = new ArrayList();
                for (Object obj10 : list15) {
                    Set set = ((qua.p) obj10).G;
                    if (set != null) {
                        Set set2 = set;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            Iterator it20 = set2.iterator();
                            while (true) {
                                if (!it20.hasNext()) {
                                }
                                if (arrayList16.contains((String) it20.next())) {
                                    arrayList17.add(obj10);
                                }
                                break;
                            }
                        }
                    }
                }
                return zi0.c.P(arrayList17, false, null, 3);
            case 25:
                z66.b update3 = (z66.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return z66.b.a(update3, null, null, null, null, null, false, null, this.f302973b, CertificateBody.profileType);
            case 26:
                zfd.h updateState2 = (zfd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return zfd.h.a(updateState2, null, null, this.f302973b, null, 11);
            case 27:
                return TabCryptoFlowV2Contract$FlowState.a((TabCryptoFlowV2Contract$FlowState) obj2, null, this.f302973b, 1);
            case 28:
                return zjh.q.c((zjh.q) obj2, null, null, null, null, null, null, this.f302973b, null, null, null, null, null, null, 8127);
            default:
                return zjh.q.c((zjh.q) obj2, null, null, null, null, null, this.f302973b, null, null, null, null, null, null, null, 8159);
        }
    }

    public /* synthetic */ m(List list, int i) {
        this.f302972a = i;
        this.f302973b = list;
    }
}
