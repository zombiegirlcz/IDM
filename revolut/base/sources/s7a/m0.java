package s7a;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.ProductStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlowContract$State;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f260620b;

    public /* synthetic */ m0(int i, Set set) {
        this.f260619a = i;
        this.f260620b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        StatementProductType statementProductType;
        int i = this.f260619a;
        boolean z = false;
        Set set = this.f260620b;
        switch (i) {
            case 0:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, null, a1.m(set, "PICKER_SELECT_ALL_ITEM_ID"), null, false, null, Constants.TAG_KSL_ID);
            case 1:
                r update2 = (r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r.a(update2, null, null, this.f260620b, null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 2:
                r update3 = (r) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return r.a(update3, null, null, a1.m(zhm.d0.i1(set), "PICKER_SELECT_ALL_ITEM_ID"), null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 3:
                k50.y update4 = (k50.y) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return k50.y.a(update4, null, set, null, Constants.TAG_FB_CHARGING_STATUS);
            case 4:
                return t73.q0.a((t73.q0) obj2, null, null, null, null, null, null, this.f260620b, null, null, null, null, null, null, null, null, null, false, 33546239);
            case 5:
                return t73.q0.a((t73.q0) obj2, null, null, null, null, null, null, null, null, this.f260620b, null, null, null, null, null, null, null, false, 33521663);
            case 6:
                return t73.q0.a((t73.q0) obj2, null, null, null, null, null, null, null, this.f260620b, null, null, null, null, null, null, null, null, false, 33538047);
            case 7:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : it8) {
                    if (set.contains(((io3.d) obj3).e)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 8:
                ChangeEmailFlowContract$State update5 = (ChangeEmailFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ChangeEmailFlowContract$State.a(update5, set, null, null, 6);
            case 9:
                v1g.e update6 = (v1g.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return v1g.e.a(update6, set, null, 2);
            case 10:
                return v4e.p.a((v4e.p) obj2, null, null, null, this.f260620b, null, null, 55);
            case 11:
                v4g.g update7 = (v4g.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return v4g.g.a(update7, null, set, 3);
            case 12:
                Set params = (Set) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                Set set2 = params;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it9 = set2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (set.contains((String) it9.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                Throwable error = ((Data) obj2).getError();
                if (error != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, set);
                }
                return Unit.f186387a;
            case 14:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, set);
                return Unit.f186387a;
            case 15:
                return vmh.g.a((vmh.g) obj2, null, (vmh.f) zhm.d0.a0(set), false, 5);
            case 16:
                List ratesDto = (List) obj2;
                Intrinsics.checkNotNullParameter(ratesDto, "ratesDto");
                List list = ratesDto;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(x5d.b.v((rpk.g) it10.next()));
                }
                if (arrayList2.size() != set.size()) {
                    int iB = zhm.q0.b(zhm.w.t(arrayList2, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj4 : arrayList2) {
                        qta.c cVar = (qta.c) obj4;
                        linkedHashMap.put(new Pair(cVar.f249046a, cVar.f249047b), obj4);
                    }
                    Set<Pair> set3 = set;
                    arrayList2 = new ArrayList(zhm.w.t(set3, 10));
                    for (Pair pair : set3) {
                        qta.c cVar2 = (qta.c) linkedHashMap.get(pair);
                        if (cVar2 == null) {
                            cVar2 = new qta.c((xi0.b) pair.f186385a, (xi0.b) pair.f186386b, vpk.w.f291272a, null);
                        }
                        arrayList2.add(cVar2);
                    }
                }
                return arrayList2;
            case 17:
                return Boolean.valueOf(set.contains(((nel.n) obj2).f214596b));
            case 18:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(!set.contains(it11));
            case 19:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : walletsWithPockets) {
                    if (set.contains(((fo3.c) ((Pair) obj5).f186385a).e())) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 20:
                return wyd.x.a((wyd.x) obj2, null, this.f260620b, null, null, null, 29);
            case 21:
                g0b.c update8 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return g0b.c.a(update8, null, null, null, null, null, this.f260620b, null, null, null, false, null, null, null, 2097023);
            case 22:
                g0b.c update9 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return g0b.c.a(update9, null, null, null, null, null, null, this.f260620b, null, null, false, null, null, null, 2096895);
            case 23:
                g0b.c update10 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return g0b.c.a(update10, null, null, null, null, null, null, this.f260620b, null, null, false, null, null, null, 2096895);
            case 24:
                return x18.q.a((x18.q) obj2, new Data(this.f260620b, null, false, 6, null), null, null, null, 14);
            case 25:
                return y7a.r.a((y7a.r) obj2, null, null, a1.m(set, "PICKER_SELECT_ALL_ITEM_ID"), null, false, false, false, null, 507);
            case 26:
                ab6.a it12 = (ab6.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(set.contains(it12.getId()));
            case 27:
                cfl.v productState = (cfl.v) obj2;
                Intrinsics.checkNotNullParameter(productState, "productState");
                return Boolean.valueOf(set.contains(productState));
            case 28:
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : events) {
                    if (set.contains(kotlin.jvm.internal.o0.f186429a.b(((iel.i) obj6).getClass()))) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            default:
                ProductStatementPeriods productStatementPeriods = (ProductStatementPeriods) obj2;
                Intrinsics.checkNotNullParameter(productStatementPeriods, "productStatementPeriods");
                List<ProductStatementPeriod> productPeriods = productStatementPeriods.getProductPeriods();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : productPeriods) {
                    Set set4 = set;
                    String type = ((ProductStatementPeriod) obj7).getType();
                    StatementProductType[] statementProductTypeArrValues = StatementProductType.values();
                    int length = statementProductTypeArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            statementProductType = statementProductTypeArrValues[i2];
                            if (!kotlin.text.a0.z(statementProductType.name(), type, true)) {
                                i2++;
                            }
                        } else {
                            statementProductType = null;
                        }
                    }
                    if (zhm.d0.T(set4, statementProductType)) {
                        arrayList5.add(obj7);
                    }
                }
                return ProductStatementPeriods.copy$default(productStatementPeriods, null, arrayList5, 1, null);
        }
    }

    public /* synthetic */ m0(vpk.v vVar, Set set) {
        this.f260619a = 16;
        this.f260620b = set;
    }
}
