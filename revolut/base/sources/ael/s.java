package ael;

import androidx.content.NavBackStackEntry;
import androidx.content.internal.NavControllerImpl;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.k9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderResult;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.Flow;
import kye.p3;
import le.u1;
import org.jmrtd.PassportService;
import pjd.b;
import t73.r1;
import t73.s1;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3655c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s(int i, Serializable serializable, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f3653a = i;
        this.f3655c = obj2;
        this.d = serializable;
        this.e = obj3;
        this.f3654b = z;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v25, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r7v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r map;
        efm.r rVarA;
        Pair pair;
        ?? C;
        ?? C2;
        ?? arrayList;
        PaymentGroup paymentGroup;
        List listB;
        PaymentGroup paymentGroup2;
        Flow flowV;
        List listA;
        switch (this.f3653a) {
            case 0:
                t tVar = (t) this.f3655c;
                xi0.b bVar = (xi0.b) this.d;
                n9l.b period = (n9l.b) this.e;
                del.f fVar = (del.f) this.f;
                List holdings = (List) obj2;
                Intrinsics.checkNotNullParameter(holdings, "holdings");
                ArrayList arrayListB = t.b(holdings);
                ArrayList currencyPairs = t.a(holdings, bVar);
                ybl.b bVar2 = tVar.f;
                if (period != null) {
                    map = ((k) bVar2).i(arrayListB, period).map(new aed.f(new a83.c0(arrayListB, tVar), 4));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                } else {
                    map = ((k) bVar2).n(arrayListB, w4l.h.f294642c).map(new aed.f(new a83.c0(arrayListB, tVar), 4));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                }
                k9l.a aVar = tVar.e;
                if (period != null) {
                    Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                    Intrinsics.checkNotNullParameter(period, "period");
                    rVarA = pd.b.r(aVar.c(currencyPairs), new g48.h(aVar, period, this.f3654b, 22));
                } else {
                    rVarA = aVar.a(currencyPairs, false);
                }
                efm.r rVarDistinctUntilChanged = ue0.e.H(nim.a.w(u1.d(map, rVarA), new a5b.b(tVar, holdings, bVar, fVar, 3)), zhm.h0.f322473a, new aed.a(12)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged;
            case 1:
                com.revolut.feature.shops.impl.ui.details.a aVar2 = (com.revolut.feature.shops.impl.ui.details.a) this.f3655c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                Boolean bool = (Boolean) this.e;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.f;
                b.a aVar3 = ((cjd.d) ((j2) aVar2.D.f22677a).getValue()).f;
                boolean z = ref$BooleanRef.f186407a;
                Intrinsics.h(bool);
                return cjd.d.a((cjd.d) obj2, null, null, null, 0, false, b.a.a(aVar3, null, null, bool.booleanValue(), this.f3654b, z, ref$BooleanRef2.f186407a, null, 67), false, false, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 2:
                g1i.d0 d0Var = (g1i.d0) this.f3655c;
                xi0.b currencyBottom = (xi0.b) this.d;
                String str = (String) this.e;
                wd6.i iVar = (wd6.i) this.f;
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                g1i.o0 o0Var = d0Var.f139605n;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(draft, "draft");
                Intrinsics.checkNotNullParameter(currencyBottom, "currencyBottom");
                if (Intrinsics.f(currencyBottom, draft.f96879a.f96897a)) {
                    MoneyDetails moneyDetails = draft.f96880b;
                    pair = new Pair(moneyDetails.f96897a, moneyDetails.f);
                } else {
                    MoneyDetails moneyDetails2 = draft.f96879a;
                    pair = new Pair(moneyDetails2.f96897a, moneyDetails2.f);
                }
                return o0Var.m(draft, (xi0.b) pair.f186385a, currencyBottom, (String) pair.f186386b, str, this.f3654b, iVar);
            case 3:
                k9 k9Var = (k9) this.f3655c;
                do3.n nVar = (do3.n) this.d;
                Data data = (Data) this.e;
                Set set = (Set) this.f;
                Intrinsics.h(k9Var);
                Intrinsics.h(nVar);
                return k4a.k.a((k4a.k) obj2, data, this.f3654b, set, k9Var, do3.q.y(nVar), null, 80);
            case 4:
                List list = (List) this.f3655c;
                List list2 = (List) this.d;
                Set set2 = (Set) this.e;
                ContactsFilter contactsFilter = (ContactsFilter) this.f;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Map map2 = (Map) pair2.f186385a;
                Map map3 = (Map) pair2.f186386b;
                List list3 = (List) map2.get(d3a.a.REVOLUT);
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (obj3 instanceof jq9.y) {
                            arrayList2.add(obj3);
                        }
                    }
                    C = new ArrayList(zhm.w.t(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        C.add(((jq9.y) it8.next()).f177526a);
                    }
                } else {
                    C = zhm.f0.f322471a;
                }
                if (contactsFilter != null) {
                    C = jn3.a.c(C, contactsFilter);
                }
                List listA2 = jn3.a.a(kn3.f.a(C, list), set2, map3);
                List list4 = (List) map2.get(d3a.a.DEVICE);
                if (list4 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list4) {
                        if (obj4 instanceof jq9.y) {
                            arrayList3.add(obj4);
                        }
                    }
                    C2 = new ArrayList(zhm.w.t(arrayList3, 10));
                    Iterator it9 = arrayList3.iterator();
                    while (it9.hasNext()) {
                        C2.add(((jq9.y) it9.next()).f177526a);
                    }
                } else {
                    C2 = zhm.f0.f322471a;
                }
                if (contactsFilter != null) {
                    C2 = jn3.a.c(C2, contactsFilter);
                }
                List listA3 = jn3.a.a(kn3.f.a(C2, list), set2, map3);
                Iterable iterable = (List) map2.get(d3a.a.VIRTUAL_CONTACTS);
                if (iterable == null) {
                    iterable = zhm.f0.f322471a;
                }
                Collection collection = (List) map2.get(d3a.a.REVTAG);
                if (collection == null) {
                    collection = zhm.f0.f322471a;
                }
                ArrayList arrayListE0 = zhm.d0.E0(iterable, collection);
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = arrayListE0.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        if (contactsFilter != null) {
                            arrayList4 = jn3.a.c(arrayList4, contactsFilter);
                        }
                        Object obj5 = map2.get(d3a.a.GROUPS);
                        ContactType.Group group = ContactType.Group.f66037a;
                        if (!list.contains(group)) {
                            obj5 = null;
                        }
                        List list5 = (List) obj5;
                        if (list5 == null || (listB = jn3.a.b(list5, set2, map3)) == null) {
                            arrayList = 0;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj6 : listB) {
                                jq9.t tVar2 = (jq9.t) obj6;
                                jq9.b0 b0Var = tVar2 instanceof jq9.b0 ? (jq9.b0) tVar2 : null;
                                if (b0Var != null && (paymentGroup2 = b0Var.f177496a) != null && paymentGroup2.f79288g) {
                                    PaymentGroup paymentGroup3 = ((jq9.b0) tVar2).f177496a;
                                    if (!this.f3654b || oi0.d.c(paymentGroup3.d).size() > 1) {
                                        arrayList.add(obj6);
                                    }
                                }
                            }
                        }
                        if (arrayList == 0) {
                            arrayList = zhm.f0.f322471a;
                        }
                        nn3.a aVar4 = nn3.a.REVOLUT;
                        int size = listA2.size();
                        Integer numValueOf = Integer.valueOf(size);
                        if (size <= 0) {
                            numValueOf = null;
                        }
                        Pair pair3 = new Pair(aVar4, numValueOf);
                        nn3.a aVar5 = nn3.a.GROUP;
                        int size2 = arrayList.size();
                        Integer numValueOf2 = Integer.valueOf(size2);
                        if (size2 <= 0) {
                            numValueOf2 = null;
                        }
                        Map mapQ = foh.i.q(pair3, new Pair(aVar5, numValueOf2));
                        ArrayList arrayListA = kn3.f.a(zhm.d0.E0(listA3, listA2), list2);
                        ?? r4 = arrayList;
                        if (!list2.contains(group)) {
                            r4 = 0;
                        }
                        if (r4 == 0) {
                            r4 = zhm.f0.f322471a;
                        }
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayListA, 10));
                        Iterator it11 = arrayListA.iterator();
                        while (it11.hasNext()) {
                            arrayList5.add(new cn3.e((zm3.a) it11.next()));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        for (jq9.t tVar3 : (Iterable) r4) {
                            jq9.b0 b0Var2 = tVar3 instanceof jq9.b0 ? (jq9.b0) tVar3 : null;
                            cn3.f fVar2 = (b0Var2 == null || (paymentGroup = b0Var2.f177496a) == null) ? null : new cn3.f(paymentGroup);
                            if (fVar2 != null) {
                                arrayList6.add(fVar2);
                            }
                        }
                        List listA4 = jn3.a.a(kn3.f.a(arrayList4, list2), set2, map3);
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(listA4, 10));
                        Iterator it12 = listA4.iterator();
                        while (it12.hasNext()) {
                            arrayList7.add(new cn3.e((zm3.a) it12.next()));
                        }
                        return new kn3.e(mapQ, zhm.d0.E0(arrayList6, arrayList5), arrayList7);
                    }
                    jq9.t tVar4 = (jq9.t) it10.next();
                    jq9.y yVar = tVar4 instanceof jq9.y ? (jq9.y) tVar4 : null;
                    zm3.a aVar6 = yVar != null ? yVar.f177526a : null;
                    if (aVar6 != null) {
                        arrayList4.add(aVar6);
                    }
                }
                break;
            case 5:
                return kye.m.a((kye.m) obj2, false, (String) this.f3655c, null, (dj0.d) this.d, null, (dj0.d) this.e, ((p3) this.f).f190815b, null, null, false, null, null, false, null, null, null, null, null, null, null, this.f3654b, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -4194411, 63);
            case 6:
                jid.z zVar = (jid.z) this.f3655c;
                ogd.k sortingCriteria = (ogd.k) this.d;
                String orderingKey = (String) this.e;
                Integer num = (Integer) this.f;
                Watchlist watchlist = (Watchlist) obj2;
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                kgm.i iVar2 = (kgm.i) zVar.f174462c;
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(sortingCriteria, "sortingCriteria");
                Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                ogd.m mVar = sortingCriteria.f225123a;
                boolean z3 = mVar != ogd.m.PRICE_CHANGE && this.f3654b;
                switch (l3d.g.f191904a[mVar.ordinal()]) {
                    case 1:
                        a4d.a aVar7 = (a4d.a) iVar2.f184023b;
                        String watchlistId = watchlist.f86895a;
                        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
                        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowV = nim.a.v(((n4d.m) aVar7).i.b(new Pair(orderingKey, watchlistId), loadingStrategy), new l3d.e(iVar2, watchlist));
                        break;
                    case 2:
                        flowV = nim.a.v(((kpj.f) iVar2.f184024c).b(watchlist.d), new kzc.a(iVar2, sortingCriteria, 12));
                        break;
                    case 3:
                        List listP0 = watchlist.d;
                        ogd.l lVar = sortingCriteria.f225124b;
                        int i = lVar == null ? -1 : l3d.g.f191905b[lVar.ordinal()];
                        if (i != -1) {
                            if (i == 1) {
                                listP0 = zhm.d0.P0(listP0, new l3d.i());
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                listP0 = zhm.d0.P0(listP0, new l3d.j());
                            }
                        }
                        flowV = new go.g(zi0.c.P(listP0, false, null, 3), 2);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new IllegalArgumentException("Unable to sort items, unsupported sorting type: " + sortingCriteria.f225123a);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return boh.f.e(nim.a.v(flowV, new kzc.a(watchlist, num, 13)), new l3d.f(z3, iVar2, 0));
            case 7:
                nvg.d dVar = (nvg.d) this.f3655c;
                iwg.a aVar8 = (iwg.a) this.d;
                boolean z4 = this.f3654b;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                pvg.t tVar5 = dVar.f219604c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT `caa`.`assetType`, `caa`.`sector`, `caa`.`total_value`,\n            `cs`.`asset` as `cash_asset`, `cs`.`value` as `cash_value`, `cs`.`allocation` as `cash_allocation`,\n            `ass`.`asset` as `asset_asset`, `ass`.`quantity` as `asset_quantity`, `ass`.`value` as `asset_value`, `ass`.`allocation` as `asset_allocation`, `ass`.`ref` as `asset_ref`,\n            `ass`.`openingPrice` as `asset_openingPrice`, `ass`.`currentPrice` as `asset_currentPrice`, `ass`.`positionId` as `asset_positionId`, `ass`.`leverage` as `asset_leverage`\n            FROM `complex_analytics_allocations` as `caa`\n            LEFT JOIN `complex_analytics_allocations_cash` as `cs`\n            ON `caa`.`assetType` = `cs`.`assetType` \n            AND `caa`.`sector` = `cs`.`sector`\n            AND `caa`.`currency` = `cs`.`currency`\n            AND `caa`.`portfolio_id` = `cs`.`portfolio_id`\n            LEFT JOIN `complex_analytics_allocations_assets` as `ass`\n            ON `caa`.`assetType` = `ass`.`assetType` \n            AND `caa`.`sector` = `ass`.`sector`\n            AND `caa`.`currency` = `ass`.`currency`\n            AND `caa`.`portfolio_id` = `ass`.`portfolio_id`\n            WHERE `caa`.`assetType` = ?\n            AND `caa`.`sector` = ?\n            AND `caa`.`currency` = ?\n            AND `caa`.`portfolio_id` = ?\n            AND `caa`.`currency` = ?\n        ");
                try {
                    String strA = pvg.t.a(aVar8);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    sQLiteStatementPrepare.bindLong(2, z4 ? 1L : 0L);
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str2);
                    }
                    sQLiteStatementPrepare.bindText(4, str3);
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str2);
                    }
                    ArrayList arrayList8 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList8.add(new pvg.c(pvg.t.e(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0)), ((int) sQLiteStatementPrepare.getLong(1)) != 0, b21.a.g(sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2)), sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3), b21.a.g(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4)), sQLiteStatementPrepare.isNull(5) ? null : Float.valueOf((float) sQLiteStatementPrepare.getDouble(5)), sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6), sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7), b21.a.g(sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8)), sQLiteStatementPrepare.isNull(9) ? null : Float.valueOf((float) sQLiteStatementPrepare.getDouble(9)), sQLiteStatementPrepare.isNull(10) ? null : sQLiteStatementPrepare.getText(10), b21.a.e(sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11)), b21.a.e(sQLiteStatementPrepare.isNull(12) ? null : sQLiteStatementPrepare.getText(12)), sQLiteStatementPrepare.isNull(13) ? null : sQLiteStatementPrepare.getText(13), sQLiteStatementPrepare.isNull(14) ? null : sQLiteStatementPrepare.getText(14)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList8;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 8:
                ft3.d1 d1Var = (ft3.d1) this.f3655c;
                String str4 = (String) this.d;
                oq3.m mVar2 = (oq3.m) this.e;
                oq3.i iVar3 = (oq3.i) this.f;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (!enabled.booleanValue()) {
                    return efm.d0.m(Boolean.FALSE);
                }
                ft3.q0.Companion.getClass();
                return mVar2.d(ft3.e.a(d1Var, str4), this.f3654b, iVar3).D(Boolean.TRUE);
            case 9:
                s06.j jVar = (s06.j) this.f3655c;
                jf0.c cVar = (jf0.c) this.d;
                lg0.a aVar9 = (lg0.a) this.e;
                s06.g gVar = (s06.g) this.f;
                y06.f restrictionsResult = (y06.f) obj2;
                Intrinsics.checkNotNullParameter(restrictionsResult, "restrictionsResult");
                if (!Intrinsics.f(restrictionsResult, y06.d.f310152a)) {
                    if (!(restrictionsResult instanceof y06.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ufm.c cVar2 = new ufm.c(new pu9.a(jVar, ((y06.e) restrictionsResult).f310153a, 20), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                    return cVar2;
                }
                if (gVar != null) {
                    ufm.c cVar3 = new ufm.c(new pu9.a(jVar, gVar.f258853a, 20), 2);
                    Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
                    return cVar3;
                }
                s06.j.e(cVar);
                jf0.d dVarA = jVar.f258857a.a(cVar);
                boolean z6 = this.f3654b;
                efm.d0 d0VarF = dVarA.f(cVar, z6);
                ryd.j jVar2 = new ryd.j(new ryd.k(17), 21);
                d0VarF.getClass();
                ufm.i iVar4 = new ufm.i(new ufm.i(new ufm.i(d0VarF, jVar2, 1), new ryd.j(new ryd.k(18), 22), 2), new ryd.j(new ard.t(jVar, cVar, z6, aVar9, 25), 23), 0);
                Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                return iVar4;
            case 10:
                return NavControllerImpl.executePopOperations$lambda$10((Ref$BooleanRef) this.f3655c, (Ref$BooleanRef) this.d, (NavControllerImpl) this.e, this.f3654b, (ArrayDeque) this.f, (NavBackStackEntry) obj2);
            case 11:
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f3655c;
                h93.f0 f0Var = (h93.f0) this.d;
                yt8.i iVar5 = (yt8.i) this.e;
                List list6 = (List) this.f;
                s5b.i result = (s5b.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                Continuation continuation = null;
                if (Intrinsics.f(result, s5b.e.f260057a)) {
                    gVar2.l2(new r1(gVar2, f0Var, continuation, 11), new yi5.b(26));
                } else if (Intrinsics.f(result, s5b.f.f260058a)) {
                    gVar2.f65440t.x(az2.b.b(gVar2.L, f0Var, iVar5, list6, false, this.f3654b, 8));
                } else if (result instanceof s5b.d) {
                    gVar2.U2();
                    gVar2.l2(new s1(gVar2, f0Var, ((s5b.d) result).f260056a, null), new yi5.b(26));
                } else if (!(result instanceof s5b.g)) {
                    if (!Intrinsics.f(result, s5b.h.f260060a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar2.U2();
                } else if (f0Var.W || f0Var.X) {
                    gVar2.n2(new s1(gVar2, f0Var, ((s5b.g) result).f260059a, continuation, 2), new whi.b(6));
                } else {
                    gVar2.Z2(f0Var, ((s5b.g) result).f260059a);
                }
                return Unit.f186387a;
            case 12:
                wh3.i iVar6 = (wh3.i) this.f3655c;
                CheckoutParams checkoutParams = (CheckoutParams) this.d;
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) this.e;
                NaviCommand naviCommand = (NaviCommand) this.f;
                PreorderResult checkoutResult = (PreorderResult) obj2;
                Intrinsics.checkNotNullParameter(checkoutResult, "checkoutResult");
                iVar6.T2(new hve.i(iVar6, checkoutParams, analyticsProduct, naviCommand, checkoutResult, this.f3654b, (Continuation) null), new yi5.b(27));
                return Unit.f186387a;
            case 13:
                xlb.y yVar2 = (xlb.y) this.f3655c;
                SavingsProductData savingsProductData = (SavingsProductData) this.d;
                SavingAccountType savingAccountType = (SavingAccountType) this.e;
                SavingsChallengeCreationData savingsChallengeCreationData = (SavingsChallengeCreationData) this.f;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                yVar2.getClass();
                SavingsProduct savingsProduct = savingsProductData.f86683a;
                return new SavingsAccountCreationStepDestination.Fund(savingAccountType, savingsProduct.f86617a, savingsProduct.f86618b.f306286a, yVar2.a(savingsProductData), new FinishCommand(null, false ? 1 : 0, false ? 1 : 0, 7), zBooleanValue, savingsChallengeCreationData, this.f3654b);
            default:
                Data data2 = (Data) this.f3655c;
                Clause clause = (Clause) this.d;
                String str5 = (String) this.e;
                y7a.f0 f0Var2 = (y7a.f0) this.f;
                y7a.r rVar = (y7a.r) obj2;
                Intrinsics.h(data2);
                Collection collection2 = (Collection) data2.getContent();
                boolean z11 = collection2 == null || collection2.isEmpty();
                List list7 = (List) data2.getContent();
                if (list7 != null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj7 : list7) {
                        qv0.i iVar7 = (qv0.i) obj7;
                        if (kotlin.text.d0.W(str5) || f0Var2.y2().b(str5, iVar7)) {
                            arrayList9.add(obj7);
                        }
                    }
                    listA = f0Var2.y2().a(str5, arrayList9);
                } else {
                    listA = null;
                }
                Data data3 = new Data(listA, null, false, 6, null);
                boolean z12 = this.f3654b;
                return y7a.r.a(rVar, data2, data3, null, null, z12, z11, z12, clause, 28);
        }
    }

    public /* synthetic */ s(Data data, boolean z, Clause clause, String str, y7a.f0 f0Var) {
        this.f3653a = 14;
        this.f3655c = data;
        this.f3654b = z;
        this.d = clause;
        this.e = str;
        this.f = f0Var;
    }

    public /* synthetic */ s(Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.f3653a = i;
        this.f3655c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.f3654b = z;
    }

    public /* synthetic */ s(Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i) {
        this.f3653a = i;
        this.f3655c = obj2;
        this.d = obj3;
        this.f3654b = z;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ s(kn3.f fVar, List list, List list2, boolean z, Set set, ContactsFilter contactsFilter) {
        this.f3653a = 4;
        this.f3655c = list;
        this.d = list2;
        this.f3654b = z;
        this.e = set;
        this.f = contactsFilter;
    }
}
