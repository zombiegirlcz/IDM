package agh;

import aig.r;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.delegates.xh;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesContract$State;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import h30.l;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jel.b0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import nel.a0;
import nel.n;
import nel.v;
import org.jmrtd.lds.LDSFile;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4833a;

    public /* synthetic */ h(int i) {
        this.f4833a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a0 a0Var;
        n nVar;
        v vVar;
        int i = 0;
        switch (this.f4833a) {
            case 0:
                return l.q("it", (od0.i) obj2);
            case 1:
                jel.c it8 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof b0) {
                    return (b0) it8;
                }
                return null;
            case 2:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it9 = intRangeU.iterator();
                while (it9.f289625c) {
                    pb0 pb0VarB = nb0.b(pb0.Companion, a0.d.n("FUND_FEES_INFO_LOADING_ITEM", it9.nextInt()), false, 0, false, 30);
                    yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(pb0VarB);
                }
                return arrayList;
            case 3:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
            case 4:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
            case 5:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
            case 6:
                Intrinsics.checkNotNullParameter((Amount) obj2, "it");
                return new AssetClauseType.Stock(new NumberClause.Format.AllDigitsAfterDot(null, null, 3));
            case 7:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 9:
                ahd.n update = (ahd.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ahd.n.a(update, null, null, null, null, 11);
            case 10:
                ahd.n it10 = (ahd.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f4950b;
            case 11:
                Watchlist it11 = (Watchlist) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.d;
            case 12:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return w.u(it12);
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Set set = (Set) pair.f186386b;
                if (set.isEmpty()) {
                    return list;
                }
                List<ohe.b> list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (ohe.b bVar : list2) {
                    List<ohe.a> list3 = bVar.f225355b;
                    ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                    for (ohe.a aVarA : list3) {
                        ProductAccount productAccount = aVarA.f225352b;
                        if ((productAccount instanceof ProductAccount.ValueItem.Main) && set.contains(((ProductAccount.ValueItem.Main) productAccount).f89504c.f89729a)) {
                            aVarA = ohe.a.a(aVarA, null, 3);
                        }
                        arrayList3.add(aVarA);
                    }
                    List<ohe.a> list4 = bVar.d;
                    ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                    for (ohe.a aVarA2 : list4) {
                        ProductAccount productAccount2 = aVarA2.f225352b;
                        if ((productAccount2 instanceof ProductAccount.ValueItem.Main) && set.contains(((ProductAccount.ValueItem.Main) productAccount2).f89504c.f89729a)) {
                            aVarA2 = ohe.a.a(aVarA2, null, 3);
                        }
                        arrayList4.add(aVarA2);
                    }
                    arrayList2.add(ohe.b.a(bVar, arrayList3, arrayList4));
                }
                return arrayList2;
            case 14:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return r0.p((Map) pair2.f186386b, (Map) pair2.f186385a);
            case 15:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return ((fo3.c) pair3.f186385a).d;
            case 16:
                vh it13 = (vh) obj2;
                KProperty[] kPropertyArr = ScheduledPaymentsScreen.Z;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f54883a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ahg.h.f5119a;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList5 = new ArrayList(w.t(intRange, 10));
                vim.f it14 = intRange.iterator();
                while (it14.f289625c) {
                    arrayList5.add(nb0.b(pb0.Companion, a0.d.n("AVAILABLE_VOUCHERS_LOADING_ITEM_LIST_ID", it14.nextInt()), false, 0, false, 30));
                }
                eVarB.addAll(yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("AVAILABLE_VOUCHERS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278), null, 0, 0, 126));
                IntRange intRange2 = new IntRange(0, 3, 1);
                ArrayList arrayList6 = new ArrayList(w.t(intRange2, 10));
                vim.f it15 = intRange2.iterator();
                while (it15.f289625c) {
                    arrayList6.add(nb0.b(pb0.Companion, a0.d.n("USED_VOUCHERS_LOADING_ITEM_LIST_ID", it15.nextInt()), false, 0, false, 30));
                }
                eVarB.addAll(yp0.b.g(arrayList6, new ListSubheaderDelegate.Model("USED_VOUCHERS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278), null, 0, 0, 126));
                return u.a(eVarB);
            case 20:
                ai4.e update2 = (ai4.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ai4.e.a(update2, false, null, 3);
            case 21:
                List performanceAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : performanceAssets) {
                    vel.f fVar = (vel.f) obj3;
                    vel.e eVar = fVar instanceof vel.e ? (vel.e) fVar : null;
                    if (eVar != null && (a0Var = eVar.f288355a) != null && (nVar = a0Var.f214560a) != null && (vVar = nVar.f) != null && vVar.d) {
                        arrayList7.add(obj3);
                    }
                }
                return arrayList7;
            case 22:
                qi7.h it16 = (qi7.h) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f246672b;
            case 23:
                qi7.a it17 = (qi7.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f246659c;
            case 24:
                SwipeToActionDelegate.b it18 = (SwipeToActionDelegate.b) obj2;
                KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 instanceof xh);
            case 25:
                AccountSpacesContract$State update3 = (AccountSpacesContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return AccountSpacesContract$State.a(update3, null, null, null, aie.c.f5235a, null, 23);
            case 26:
                AccountSpacesContract$State update4 = (AccountSpacesContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return AccountSpacesContract$State.a(update4, null, null, null, null, null, 23);
            case 27:
                aig.i update5 = (aig.i) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return aig.i.a(update5, null, null, null, !update5.d, false, null, null, LDSFile.EF_SOD_TAG);
            case 28:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP.add(new pb0(a0.d.n("TRANSACTIONS_LOADING_ITEM_ID_", i)));
                    i++;
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            default:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                while (i < 3) {
                    arrayListP2.add(new pb0(a0.d.n("AIRLINES_LOADING_ITEM_ID_", i)));
                    i++;
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return r.a(arrayListP2, r.b());
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f4833a = i;
    }
}
