package ahe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.api.model.spaces.SpaceContentModel;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.tab.accounts.impl.total_wealth.models.TotalWealthCategoryViewInfo;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.e2;
import vge.m1;
import vge.t2;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f5032b;

    public /* synthetic */ u(w0 w0Var, int i) {
        this.f5031a = i;
        this.f5032b = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVarL;
        int i;
        Flow kVar;
        go.g gVar;
        go.g gVar2;
        Flow kVar2;
        int i2;
        ProductAccountId productAccountId;
        int i3 = this.f5031a;
        int i5 = 3;
        w0 w0Var = this.f5032b;
        switch (i3) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Map map = (Map) rVar.f314201a;
                Set set = (Set) rVar.f314202b;
                List list = (List) rVar.f314203c;
                jhe.g gVar3 = w0Var.f5047m;
                Set setKeySet = map.keySet();
                List listK = zhm.v.k(TotalWealthCategoryKey.Cash.INSTANCE, TotalWealthCategoryKey.Savings.INSTANCE, TotalWealthCategoryKey.Crypto.INSTANCE, TotalWealthCategoryKey.Invest.INSTANCE, TotalWealthCategoryKey.Joint.INSTANCE, TotalWealthCategoryKey.Credit.INSTANCE, TotalWealthCategoryKey.Pro.INSTANCE);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : setKeySet) {
                    if (obj3 instanceof TotalWealthCategoryKey.Youth) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayListD = w0Var.d(map, zhm.d0.F0(TotalWealthCategoryKey.Linked.INSTANCE, zhm.d0.E0(zhm.d0.P0(arrayList, new k0()), listK)));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayListD) {
                    ohe.f fVar = (ohe.f) obj4;
                    if (!(fVar.f225362b instanceof yfe.p0) || !set.contains(fVar.f225361a)) {
                        arrayList2.add(obj4);
                    }
                }
                return new a(gVar3.b(arrayList2, list), map);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    ArrayList arrayListB = ((ohe.b) it8.next()).b();
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayListB, 10));
                    Iterator it9 = arrayListB.iterator();
                    while (it9.hasNext()) {
                        arrayList4.add(((ohe.a) it9.next()).f225352b);
                    }
                    zhm.a0.x(arrayList4, arrayList3);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayList3) {
                    if (obj5 instanceof ProductAccount.ValueItem.Main) {
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : arrayList5) {
                    if (!kotlin.text.a0.H(((ProductAccount.ValueItem.Main) obj6).f89504c.f89729a, "Total-", false)) {
                        arrayList6.add(obj6);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it10 = arrayList6.iterator();
                while (true) {
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    if (!it10.hasNext()) {
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj7 : arrayList7) {
                            if (!Intrinsics.f((xi0.b) obj7, bVar)) {
                                arrayList8.add(obj7);
                            }
                        }
                        Set setI1 = zhm.d0.i1(arrayList8);
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(setI1, 10));
                        Iterator it11 = setI1.iterator();
                        while (it11.hasNext()) {
                            v1.c.A(arrayList9, (xi0.b) it11.next(), bVar);
                        }
                        boolean zIsEmpty = arrayList9.isEmpty();
                        w0 w0Var2 = this.f5032b;
                        return zIsEmpty ? new v1(new a31.w((Object) w0Var2, (Object) list2, (Object) bVar, (Continuation) (objArr3 == true ? 1 : 0), 3)) : rd0.e.e(nim.a.u(new a1a.c((Object) w0Var2, (Object) list2, (Object) bVar, (Continuation) (objArr2 == true ? 1 : 0), 7), rd0.e.b(w0Var2.f5044h.d(arrayList9, age.c.f4818a))), zhm.h0.f322473a, new a19.e(i5, 2, objArr == true ? 1 : 0));
                    }
                    dj0.d dVarA = com.revolut.feature.tab.accounts.api.model.a.a((ProductAccount.ValueItem.Main) it10.next());
                    xi0.b bVar2 = dVarA != null ? dVarA.f115083b : null;
                    if (bVar2 != null) {
                        arrayList7.add(bVar2);
                    }
                }
                break;
            case 2:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                xi0.b bVar3 = (xi0.b) pair2.f186386b;
                w0Var.getClass();
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i6 = 0;
                for (Object obj8 : list3) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i6 == 0) {
                        ohe.f fVar2 = (ohe.f) obj8;
                        yfe.r0 r0Var = fVar2.f225362b;
                        if (r0Var instanceof yfe.p0) {
                            dVarO = new dj0.d(0L, bVar3);
                        } else {
                            if (!(r0Var instanceof yfe.q0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i22 = y.f5057a[ohe.h.a(fVar2.f225361a).ordinal()];
                            if (i22 == 1) {
                                dVarO = ((yfe.q0) r0Var).f313296b;
                            } else if (i22 == 2) {
                                dVarO = ((yfe.q0) r0Var).f313296b.l();
                            } else {
                                if (i22 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVarO = new dj0.d(0L, bVar3);
                            }
                        }
                    } else {
                        ohe.f fVar3 = (ohe.f) obj8;
                        yfe.r0 r0Var2 = fVar3.f225362b;
                        if (r0Var2 instanceof yfe.p0) {
                            dVarL = new dj0.d(0L, bVar3);
                        } else {
                            if (!(r0Var2 instanceof yfe.q0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i32 = y.f5057a[ohe.h.a(fVar3.f225361a).ordinal()];
                            if (i32 == 1) {
                                dVarL = ((yfe.q0) r0Var2).f313296b;
                            } else if (i32 == 2) {
                                dVarL = ((yfe.q0) r0Var2).f313296b.l();
                            } else {
                                if (i32 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVarL = new dj0.d(0L, bVar3);
                            }
                        }
                        dVarO = pyd.c.O(dVarO, dVarL);
                    }
                    i6 = i21;
                }
                return dVarO;
            case 3:
                ohe.b model = (ohe.b) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                w0 w0Var3 = this.f5032b;
                w0Var3.getClass();
                ArrayList arrayListB2 = model != null ? model.b() : null;
                if (arrayListB2 == null || arrayListB2.isEmpty()) {
                    return new go.g(new TotalWealthCategoryViewInfo(zhm.f0.f322471a, zhm.h0.f322473a), 2);
                }
                List list4 = model.d;
                ArrayList arrayList10 = new ArrayList();
                ArrayList<ohe.a> arrayList11 = new ArrayList();
                for (Object obj9 : list4) {
                    if (((ohe.a) obj9).f225353c) {
                        arrayList10.add(obj9);
                    } else {
                        arrayList11.add(obj9);
                    }
                }
                List list5 = model.f225355b;
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj10 : list5) {
                    if (((ohe.a) obj10).f225353c) {
                        arrayList12.add(obj10);
                    } else {
                        arrayList13.add(obj10);
                    }
                }
                ArrayList arrayListE0 = zhm.d0.E0(arrayList12, arrayList10);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it12 = arrayListE0.iterator();
                while (it12.hasNext()) {
                    ProductAccount productAccount = ((ohe.a) it12.next()).f225352b;
                    ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
                    String str = (main == null || (productAccountId = main.f89504c) == null) ? null : productAccountId.f89729a;
                    if (str != null) {
                        linkedHashSet.add(str);
                    }
                }
                if (arrayList11.isEmpty() && arrayList13.isEmpty()) {
                    return new go.g(new TotalWealthCategoryViewInfo(zhm.f0.f322471a, linkedHashSet), 2);
                }
                ArrayList<ohe.a> arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                for (Object obj11 : arrayList13) {
                    if (((ohe.a) obj11).f225351a.f89553a == ProductId.ON_HOLD) {
                        arrayList14.add(obj11);
                    } else {
                        arrayList15.add(obj11);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj12 : arrayList15) {
                    ProductSpaceIdentifier productSpaceIdentifier = ((ohe.a) obj12).f225351a.f89554b;
                    Object arrayList16 = linkedHashMap.get(productSpaceIdentifier);
                    if (arrayList16 == null) {
                        arrayList16 = new ArrayList();
                        linkedHashMap.put(productSpaceIdentifier, arrayList16);
                    }
                    ((List) arrayList16).add(obj12);
                }
                List<ProductSpaceIdentifier> listD1 = zhm.d0.d1(linkedHashMap.keySet());
                ArrayList arrayList17 = new ArrayList(zhm.w.t(listD1, 10));
                for (ProductSpaceIdentifier productSpaceIdentifier2 : listD1) {
                    List list6 = (List) zhm.r0.h(productSpaceIdentifier2, linkedHashMap);
                    Clause clause = model.f225356c;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj13 : list6) {
                        pie.v vVar = ((ohe.a) obj13).f225351a.f89555c;
                        Object obj14 = linkedHashMap2.get(vVar);
                        if (obj14 == null) {
                            ArrayList arrayList18 = new ArrayList();
                            linkedHashMap2.put(vVar, arrayList18);
                            obj14 = arrayList18;
                        }
                        ((List) obj14).add(obj13);
                    }
                    ArrayList arrayList19 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        pie.v vVar2 = (pie.v) entry.getKey();
                        List list7 = (List) entry.getValue();
                        ohe.b bVar4 = model;
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(list7, 10));
                        for (Iterator it13 = list7.iterator(); it13.hasNext(); it13 = it13) {
                            ohe.a aVar = (ohe.a) it13.next();
                            arrayList20.add(new SubSpaceAccountItem(aVar.f225351a, aVar.f225352b));
                        }
                        ProductSpaceIdentifier productSpaceIdentifier3 = productSpaceIdentifier2;
                        productSpaceIdentifier2 = productSpaceIdentifier3;
                        arrayList19.add(new v1(new i0(vVar2, arrayList20, w0Var3, productSpaceIdentifier3, null)));
                        arrayList17 = arrayList17;
                        linkedHashMap = linkedHashMap3;
                        model = bVar4;
                    }
                    ohe.b bVar5 = model;
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    ArrayList arrayList21 = arrayList17;
                    if (arrayList19.isEmpty()) {
                        kVar2 = new go.g(zhm.f0.f322471a, 2);
                        i2 = 1;
                    } else {
                        i2 = 1;
                        kVar2 = new ag1.k((Flow[]) zhm.d0.d1(arrayList19).toArray(new Flow[0]), i2);
                    }
                    arrayList21.add(new ahd.y(kVar2, clause, productSpaceIdentifier2, i2));
                    arrayList17 = arrayList21;
                    linkedHashMap = linkedHashMap4;
                    model = bVar5;
                }
                ArrayList arrayList22 = arrayList17;
                if (arrayList22.isEmpty()) {
                    i = 2;
                    kVar = new go.g(zhm.f0.f322471a, 2);
                } else {
                    i = 2;
                    kVar = new ag1.k((Flow[]) zhm.d0.d1(arrayList22).toArray(new Flow[0]), i);
                }
                if (arrayList14.isEmpty()) {
                    gVar = new go.g(null, i);
                } else {
                    ProductSpaceIdentifier.Restricted restricted = ProductSpaceIdentifier.Restricted.f89751c;
                    Clause clauseA = lge.m.a(pie.a.RESTRICTED);
                    pie.v vVar3 = pie.v.FLAT_ROOT;
                    ArrayList arrayList23 = new ArrayList(zhm.w.t(arrayList14, 10));
                    for (ohe.a aVar2 : arrayList14) {
                        arrayList23.add(new SubSpaceAccountItem(aVar2.f225351a, aVar2.f225352b));
                    }
                    i = 2;
                    gVar = new go.g(new SpaceContentModel(clauseA, restricted, zhm.u.c(new SubSpaceContentModel.FlatSubSpaceContentModel(vVar3, arrayList23))), 2);
                }
                if (arrayList11.isEmpty()) {
                    gVar2 = new go.g(null, i);
                } else {
                    ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList11, 10));
                    for (ohe.a aVar3 : arrayList11) {
                        Clause clauseA2 = lge.m.a(aVar3.f225351a.f89554b.f89741a);
                        ProductContext productContext = new ProductContext(aVar3.f225351a.f89553a, ProductSpaceIdentifier.Favourites.f89744c, pie.v.FLAT_ROOT);
                        ProductAccount productAccountT = aVar3.f225352b;
                        if (productAccountT instanceof ProductAccount.ValueItem.Main) {
                            ProductAccount.ValueItem.Main main2 = (ProductAccount.ValueItem.Main) productAccountT;
                            AccountListItemModel accountListItemModel = main2.e;
                            Clause clause2 = accountListItemModel.f89479c;
                            if (clause2 != null) {
                                clauseA2 = new CompositeClause(zhm.v.k(clauseA2, clause2), new DotDividerClause((Integer) null), null, null, 12);
                            }
                            productAccountT = ProductAccount.ValueItem.Main.T(main2, null, AccountListItemModel.a(accountListItemModel, clauseA2, 507), null, null, 507);
                        } else if (!(productAccountT instanceof ProductAccount.ValueItem.Discover) && !(productAccountT instanceof ProductAccount.PendingItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (productAccountT instanceof ProductAccount.ValueItem.Main) {
                            productAccountT = ProductAccount.ValueItem.Main.T((ProductAccount.ValueItem.Main) productAccountT, null, null, null, null, 383);
                        }
                        arrayList24.add(new SubSpaceAccountItem(productContext, productAccountT));
                    }
                    gVar2 = new go.g(new SpaceContentModel(lge.m.a(pie.a.FAVOURITES), ProductSpaceIdentifier.Favourites.f89744c, zhm.u.c(new SubSpaceContentModel.FlatSubSpaceContentModel(pie.v.FLAT_ROOT, arrayList24))), 2);
                }
                v0b.b bVarH = ta6.a.h(kVar, gVar2, gVar, new h0(4, 0, null));
                t1j.b bVar6 = w0Var3.o;
                Flow originFlow = w0Var3.f5048n.b(bVarH, qfe.e.f245291a);
                Intrinsics.checkNotNullParameter(originFlow, "originFlow");
                return new a3i.i(new t38.e(originFlow, 24, ((t2) ((e2) bVar6.f267380b)).n(), new m1(bVar6, null)), linkedHashSet, 8);
            default:
                aim.o oVar = new aim.o();
                Iterator it14 = ((List) obj2).iterator();
                while (it14.hasNext()) {
                    for (ohe.a aVar4 : ((ohe.b) it14.next()).b()) {
                        int i33 = w0.f5039x;
                        w0Var.getClass();
                        ProductAccount productAccount2 = aVar4.f225352b;
                        if ((productAccount2 instanceof ProductAccount.ValueItem.Main) && !kotlin.text.a0.H(((ProductAccount.ValueItem.Main) productAccount2).f89504c.f89729a, "Total-", false) && !aVar4.f225353c) {
                            oVar.add(new ProductAccountDescriptor$Value.Main(aVar4.f225352b.getF89504c(), aVar4.f225351a.f89553a));
                        }
                    }
                }
                return zhm.y0.a(oVar);
        }
    }
}
