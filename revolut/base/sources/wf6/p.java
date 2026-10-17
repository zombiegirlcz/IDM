package wf6;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$PagerItem;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.q0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297004a;

    public /* synthetic */ p(int i) {
        this.f297004a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e0h.a aVar;
        ufe.b bVarValueOf;
        boolean z = false;
        switch (this.f297004a) {
            case 0:
                Intrinsics.checkNotNullParameter((MainContainerScreenDestination) obj2, "it");
                return Boolean.TRUE;
            case 1:
                MainContainerScreenDestination destination = (MainContainerScreenDestination) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                return new q06.h(destination, null);
            case 2:
                wfh.l it8 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f297121b;
            case 3:
                Optional it9 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h1h.g gVar = (h1h.g) it9.orElse(null);
                if (gVar != null && (aVar = gVar.f148577b) != null && (!aVar.f121715a.isEmpty() || aVar.f121716b > 0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                wfh.l it10 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f297120a;
            case 5:
                wfh.l it11 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f297121b;
            case 6:
                wfh.l it12 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f297128n;
            case 7:
                return h30.l.q("it", (od0.i) obj2);
            case 8:
                wfh.l it13 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f297122c;
            case 9:
                wfh.l it14 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.d;
            case 10:
                wfh.l it15 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f297128n;
            case 11:
                wfh.l it16 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f297120a;
            case 12:
                wfh.l it17 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f297127m;
            case 13:
                List fundShares = (List) obj2;
                Intrinsics.checkNotNullParameter(fundShares, "fundShares");
                List list = fundShares;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it18 = list.iterator();
                while (it18.hasNext()) {
                    t61.a.A(xi0.b.Companion, ((nel.n) it18.next()).f214596b, arrayList);
                }
                return arrayList;
            case 14:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(!it19.isEmpty());
            case 15:
                wfh.l it20 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f297127m;
            case 16:
                List fundShares2 = (List) obj2;
                Intrinsics.checkNotNullParameter(fundShares2, "fundShares");
                List list2 = fundShares2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it21 = list2.iterator();
                while (it21.hasNext()) {
                    t61.a.A(xi0.b.Companion, ((nel.n) it21.next()).f214596b, arrayList2);
                }
                return zhm.d0.i1(arrayList2);
            case 17:
                Set it22 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(!it22.isEmpty());
            case 18:
                return h30.l.q("it", (od0.i) obj2);
            case 19:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List list3 = instruments;
                int iB = q0.b(zhm.w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list3) {
                    linkedHashMap.put(((nel.n) obj3).f214596b, obj3);
                }
                return linkedHashMap;
            case 20:
                wfh.l it23 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                nel.n nVar = (nel.n) it23.f297121b.getContent();
                if (nVar != null) {
                    return ifk.b.i(nVar);
                }
                return null;
            case 21:
                wfh.l it24 = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f297121b;
            case 22:
                return ((wfh.l) obj2).f297121b;
            case 23:
                InputTextDelegate.TextData it25 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr = FormScreen.V;
                Intrinsics.checkNotNullParameter(it25, "it");
                return Boolean.valueOf(!kotlin.text.a0.H(it25.f52597a, "MONEY_ITEM_ID_", false));
            case 24:
                ListSubheaderDelegate.Model it26 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = FormScreen.V;
                Intrinsics.checkNotNullParameter(it26, "it");
                return Boolean.valueOf(it26.f52715m instanceof BillFormFieldV2);
            case 25:
                wg9.k update = (wg9.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wg9.k.a(update, null, null, null, null, null, 63);
            case 26:
                wg9.k update2 = (wg9.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wg9.k.a(update2, null, null, null, null, null, 63);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                wgb.k kVar = new wgb.k(new aw0.e(true, null, null, m6.a(), null, null, 54));
                List listC = zhm.u.c(new gu("LOADING_SECTION_TITLE_LIST_ID", 0, 0, 30));
                ArrayList arrayList3 = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList3.add(t61.a.o("LOADING_SECTION_ITEM_LIST_ID_PREFIX_", i, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                List listO = i2b.a.o(listC, arrayList3);
                s7 s7Var = new s7("LOADING_CELL_ITEM_LIST_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return new wgb.m(null, kVar, i2b.a.p(listO, s7Var));
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(MultipleWatchlistsFlowContract$PagerItem.Loading.f86914a);
            default:
                List<tj1.c> advisedComponents = (List) obj2;
                Intrinsics.checkNotNullParameter(advisedComponents, "advisedComponents");
                ArrayList arrayList4 = new ArrayList();
                for (tj1.c cVar : advisedComponents) {
                    if (cVar.f271597b != tj1.e.ACCOUNT_SWITCHER_DISCOVERY_PRODUCT) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        ufe.a aVar2 = ufe.b.Companion;
                        String value = cVar.f271596a;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        try {
                            String upperCase = value.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            bVarValueOf = ufe.b.valueOf(upperCase);
                        } catch (IllegalArgumentException e) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            bVarValueOf = null;
                        }
                    } else {
                        bVarValueOf = null;
                    }
                    if (bVarValueOf != null) {
                        arrayList4.add(bVarValueOf);
                    }
                    break;
                }
                return arrayList4;
        }
    }

    public /* synthetic */ p(Object obj2, int i) {
        this.f297004a = i;
    }
}
