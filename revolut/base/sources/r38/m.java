package r38;

import android.content.Context;
import androidx.content.NavBackStackEntry;
import androidx.content.fragment.FragmentNavigator;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$State;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.feature.support.api.SupportApi$Toggles$HelpCenterRevampLoading;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$ModalStep;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import ha3.x;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.w60;
import ip0.x60;
import ip0.za0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import r3e.p;
import r40.c1;
import r83.q;
import rp0.a0;
import v30.z;
import vkm.j2;
import wsg.n;
import yhm.r;
import ywc.a;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zx0.n;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f251224b;

    public /* synthetic */ m(Object obj2, int i) {
        this.f251223a = i;
        this.f251224b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayListF0;
        Object mVar;
        int i = this.f251223a;
        int i2 = 0;
        int i3 = 1;
        Object[] objArr = 0;
        Object obj3 = this.f251224b;
        switch (i) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                xi0.b bVar = (xi0.b) rVar.f314202b;
                return mo3.a.n(nim.a.w(((n) ((jt0.b) obj3).f178265b).O(list, true, bVar), new ou5.a(13, bVar)));
            case 1:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr = StoreSearchScreen.W;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 12);
                screenGridLayoutManager.setSpanSizeLookup(new r3e.b((StoreSearchScreen) obj3, screenGridLayoutManager));
                return screenGridLayoutManager;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                String str = ((r3e.h) obj3).f251281a;
                aim.e eVarB = u.b();
                if (d0.W(str)) {
                    eVarB.add(new gu("STORE_SEARCH_LOADING_POPULAR_BRANDS_SUBHEADER", 0, 0, 30));
                    ArrayList arrayList = new ArrayList(4);
                    while (i2 < 4) {
                        arrayList.add(new pe(a0.d.n("STORE_SEARCH_LOADING_POPULAR_BRANDS_GRID_ITEM_", i2)));
                        i2++;
                    }
                    za0 za0Var = new za0("STORE_SEARCH_LOADING_POPULAR_BRANDS_GRID", arrayList);
                    yp0.b.l(za0Var, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
                    eVarB.add(za0Var);
                } else {
                    eVarB.add(new gu("STORE_SEARCH_LOADING_BRANDS_SUBHEADER", 0, 0, 30));
                    ArrayList arrayList2 = new ArrayList(5);
                    for (int i5 = 0; i5 < 5; i5++) {
                        arrayList2.add(nb0.b(pb0.Companion, a0.d.n("STORE_SEARCH_LOADING_BRANDS_ROW_", i5), false, 0, false, 30));
                    }
                    yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                    eVarB.addAll(arrayList2);
                    eVarB.add(new gu("STORE_SEARCH_LOADING_PRODUCTS_SUBHEADER", 0, 0, 30));
                    ArrayList arrayList3 = new ArrayList(4);
                    for (int i6 = 0; i6 < 4; i6++) {
                        arrayList3.add(nb0.b(pb0.Companion, a0.d.n("STORE_SEARCH_LOADING_PRODUCTS_ITEM_", i6), false, 0, false, 30));
                    }
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    eVarB.addAll(arrayList3);
                    eVarB.add(new gu("STORE_SEARCH_LOADING_ORDERS_SUBHEADER", 0, 0, 30));
                    ArrayList arrayList4 = new ArrayList(2);
                    while (i2 < 2) {
                        arrayList4.add(nb0.b(pb0.Companion, a0.d.n("STORE_SEARCH_LOADING_ORDERS_ROW_", i2), false, 0, false, 30));
                        i2++;
                    }
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    eVarB.addAll(arrayList4);
                }
                return u.a(eVarB);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar2 = (xi0.b) pair.f186385a;
                dj0.d dVar = (dj0.d) pair.f186386b;
                u5k.c cVar = ((r3k.f) obj3).f251310q;
                Intrinsics.h(bVar2);
                return ((u5k.d) cVar).a(dVar, bVar2).x();
            case 4:
                TicketDetails details = (TicketDetails) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                kse.a ticket = ((u40.c) obj3).f276962a.f285839a;
                Intrinsics.checkNotNullParameter(ticket, "ticket");
                Intrinsics.checkNotNullParameter(details, "details");
                z zVar = new z(ticket, details);
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                return new u40.c(zVar);
            case 5:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                if (!((jte.d) ((rf3.d) ((c1) obj3).f251327a).f253679a).c(SupportApi$Toggles$HelpCenterRevampLoading.f89338c)) {
                    return (List) getDefaultLoadingItems.invoke();
                }
                ArrayList arrayList5 = new ArrayList(2);
                while (i2 < 2) {
                    arrayList5.add(nb0.b(pb0.Companion, "LIST_ID_LOADING_ITEM", false, 0, false, 30));
                    i2++;
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return arrayList5;
            case 6:
                r4h.d update = (r4h.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean z = !((r4h.d) ((j2) ((r4h.f) obj3).o.f22677a).getValue()).f251463a;
                update.getClass();
                return new r4h.d(z);
            case 7:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, null, ((fpf.b) ((fpf.c) obj3)).f137095a, null, null, null, 1044479);
            case 8:
                BankTransferData updateTransferData2 = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData2, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData2, 0L, null, null, null, ((c4k.f) ((c4k.g) obj3)).f21308a, null, null, null, null, null, null, null, null, 1048543);
            case 9:
                return r4k.l.a((r4k.l) obj2, null, null, null, null, (v4k.b) obj3, null, 895);
            case 10:
                return r4k.l.a((r4k.l) obj2, null, (r4k.m) obj3, null, null, null, null, 1015);
            case 11:
                return FragmentNavigator.fragmentViewObserver$lambda$3((FragmentNavigator) obj3, (NavBackStackEntry) obj2);
            case 12:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (k5c.a) ((r5c.b) obj3).f251578a.get("CRYPTO_EXCHANGE_ELIGIBILITY_KEY");
            case 13:
                r60.d dVar2 = (r60.d) obj3;
                a0 state = (a0) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                if (!state.f256040a) {
                    Function0 function0 = dVar2.f251628g;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    dVar2.f251628g = null;
                }
                return Unit.f186387a;
            case 14:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return yp0.b.g(v.k(new s7("ManagedPortfolioDetailsFeesExtensionMapper_fees_management_title_loading", 0, 0, 0, 0, false, null, 126), new s7("ManagedPortfolioDetailsFeesExtensionMapper_fees_product_title_loading", 0, 0, 0, 0, false, null, 126)), ((r6f.j) obj3).f251834a, null, 0, 0, 126);
            case 15:
                r6g.h update2 = (r6g.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r6g.h.a(update2, 0, null, (m7g.d) obj3, 3);
            case 16:
                TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant removeAdultForInfant = (TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant) obj3;
                r6g.h update3 = (r6g.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                int i21 = update3.f251841a - 1;
                List list2 = update3.f251842b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list2) {
                    if (((TravelFlightsPassengersPickerScreenContract$Child) obj4).f93375a != removeAdultForInfant.f93382a.f93375a) {
                        arrayList6.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                for (Object obj5 : arrayList6) {
                    int i22 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    TravelFlightsPassengersPickerScreenContract$Child.Companion companion = TravelFlightsPassengersPickerScreenContract$Child.INSTANCE;
                    LocalDate birthDate = ((TravelFlightsPassengersPickerScreenContract$Child) obj5).f93376b;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(birthDate, "birthDate");
                    arrayList7.add(new TravelFlightsPassengersPickerScreenContract$Child(i22, birthDate));
                    i2 = i22;
                }
                return r6g.h.a(update3, i21, arrayList7, null, 4);
            case 17:
                TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant addAdultForInfant = (TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant) obj3;
                r6g.h update4 = (r6g.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                List list3 = update4.f251842b;
                List<TravelFlightsPassengersPickerScreenContract$Child> list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it10 = list4.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            if (((TravelFlightsPassengersPickerScreenContract$Child) it10.next()).f93375a == addAdultForInfant.f93379a.f93375a) {
                                i2 = 1;
                            }
                        }
                    }
                }
                int i32 = update4.f251841a + 1;
                if (i2 != 0) {
                    arrayListF0 = new ArrayList(w.t(list4, 10));
                    for (TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child : list4) {
                        int i33 = travelFlightsPassengersPickerScreenContract$Child.f93375a;
                        TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child2 = addAdultForInfant.f93379a;
                        if (i33 == travelFlightsPassengersPickerScreenContract$Child2.f93375a) {
                            travelFlightsPassengersPickerScreenContract$Child = travelFlightsPassengersPickerScreenContract$Child2;
                        }
                        arrayListF0.add(travelFlightsPassengersPickerScreenContract$Child);
                    }
                } else {
                    arrayListF0 = zhm.d0.F0(addAdultForInfant.f93379a, list3);
                }
                return r6g.h.a(update4, i32, arrayListF0, null, 4);
            case 18:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new r74.n(u.c(new x60("INTRO_PROMPT_LOADING_ID", w60.CIRCLE_ASSET, q74.b.a(((r74.v) obj3).f252013a.f67329a))));
            case 19:
                PermissionsControllerContract$State update5 = (PermissionsControllerContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return PermissionsControllerContract$State.a(update5, ((com.revolut.feature.permissions.flow.b) obj3).J2());
            case 20:
                SavingsAccountDetails account = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return ((ou5.b) obj3).s(account, null, null);
            case 21:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                ((q) obj3).f252342a.c(command);
                return Boolean.TRUE;
            case 22:
                com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b) obj3;
                ywc.a result = (ywc.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ywc.b) {
                    bVar3.l2(new r83.g(bVar3, ((ywc.b) result).f317414a, objArr == true ? 1 : 0, i3), new yi5.b(26));
                } else {
                    if (!(result instanceof a.C1767a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i43 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 23:
                r93.c cVar2 = (r93.c) obj3;
                n93.g action = (n93.g) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                l93.f fVar = cVar2.f252497a;
                String str2 = action.f213554a;
                e93.e eVar = action.f213555b;
                String str3 = action.d;
                String str4 = action.e;
                AccountId accountId = action.f213558h;
                AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
                String str5 = joint != null ? joint.f51413b : null;
                if (str5 == null) {
                    str5 = action.i;
                }
                ufm.i iVar = new ufm.i(((x) fVar).t(str2, eVar, str3, str4, str5, action.f, action.f213557g, action.f213559j), new r83.d(7, new r4k.x(cVar2, action, 8)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 24:
                psg.a walletProfile = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
                return rd0.e.c(hj8.a.a(((r93.k) obj3).f252516r, walletProfile.f239485b, w4l.j.f294644c), kotlin.coroutines.g.f186406a);
            case 25:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ((prl.e) obj3).q();
            case 26:
                r9i.e eVar2 = (r9i.e) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                String str6 = (String) pair2.f186385a;
                Data data = (Data) pair2.f186386b;
                i9i.d dVar3 = (i9i.d) data.component1();
                Throwable error = data.getError();
                boolean loading = data.getLoading();
                if (dVar3 != null) {
                    r9i.a aVar = eVar2.f252733b;
                    mVar = new zx0.m(r9i.a.b(dVar3));
                } else if (loading) {
                    mVar = n.b.f326008a;
                } else {
                    mVar = n.a.f326007a;
                    if (error != null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                    }
                }
                return new Pair(str6, mVar);
            case 27:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                ((ra0.a) obj3).getClass();
                return Boolean.valueOf(ra0.a.a(screen));
            case 28:
                CreditPostTerminationPlanDetails it13 = (CreditPostTerminationPlanDetails) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                wsg.n nVar = ((ra5.b) obj3).f252785c;
                Intrinsics.checkNotNullParameter(it13, "<this>");
                return rd0.e.b(osg.b.o(nVar, it13.f70654c.f115083b, null, null, null, w4l.i.f294643c, 62));
            default:
                NaviCommand command2 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command2, "command");
                ((rae.b) obj3).f252815a.c(command2);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ m(p pVar, r3e.h hVar) {
        this.f251223a = 2;
        this.f251224b = hVar;
    }
}
