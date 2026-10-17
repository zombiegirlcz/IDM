package fg8;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerControllerContract$ProcessingState;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDetails;
import ip0.pb0;
import ip0.qj0;
import ip0.s7;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.i3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134929a;

    public /* synthetic */ g(int i) {
        this.f134929a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        Object next;
        List list;
        switch (this.f134929a) {
            case 0:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                return Boolean.valueOf(ta6.a.x(profile));
            case 1:
                bla.c it8 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 == bla.c.ENABLED);
            case 2:
                NaviCommand nextCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
                return com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), null, null, 6))), nextCommand);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new fhf.g((List) getDefaultLoadingItems.invoke());
            case 5:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!kotlin.text.d0.W(it9));
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("ID_EXCHANGE_AMOUNT_ITEM", 0, 0, 0, 0, false, null, 126);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return zhm.f0.f322471a;
            case 9:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 10:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 11:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it12);
            case 12:
                ejb.b savingsAccountsInfo = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(savingsAccountsInfo, "savingsAccountsInfo");
                return savingsAccountsInfo.f126837b;
            case 13:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (n38.a) it13.f224257a;
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 15:
                fi7.j it14 = (fi7.j) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.d;
            case 16:
                fi7.j it15 = (fi7.j) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f135325c;
            case 17:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<qi7.h> list2 = instruments;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (qi7.h hVar : list2) {
                    arrayList2.add(new p5d.b(hVar.f246671a.a(), zi0.c.N(hVar.f246671a), null));
                }
                return arrayList2;
            case 18:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                List list3 = (List) kVar.f288454a;
                Map map = (Map) kVar.f288455b;
                Map map2 = (Map) kVar.f288456c;
                List list4 = (List) kVar.d;
                List list5 = (List) kVar.e;
                List list6 = list3;
                int iB = zhm.q0.b(zhm.w.t(list6, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list6) {
                    linkedHashMap.put(((i3) obj3).getId(), obj3);
                }
                List list7 = list4;
                int iB2 = zhm.q0.b(zhm.w.t(list7, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj4 : list7) {
                    linkedHashMap2.put(((SuspiciousTransactionDetails) obj4).f104932b, obj4);
                }
                List list8 = list5;
                int iB3 = zhm.q0.b(zhm.w.t(list8, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj5 : list8) {
                    linkedHashMap3.put(((yk5.a) obj5).f314566a, obj5);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    CryptoAddressCounterparty cryptoAddressCounterparty = ((yk5.a) entry.getValue()).f;
                    if (cryptoAddressCounterparty != null) {
                        linkedHashMap4.put(entry.getKey(), cryptoAddressCounterparty);
                    }
                }
                return new fif.g(linkedHashMap, map, map2, linkedHashMap2, linkedHashMap4);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.r0.g();
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.r0.g();
            case 21:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return zhm.d0.U(zhm.d0.E0((List) pair2.f186386b, (List) pair2.f186385a));
            case 22:
                String groupId = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                od0.i.Companion.getClass();
                return od0.h.a(groupId);
            case 23:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List list9 = (List) hVar2.f288433a;
                Map map3 = (Map) hVar2.f288434b;
                Map map4 = (Map) hVar2.f288435c;
                fif.g gVar = (fif.g) hVar2.d;
                return new fif.i(list9, map3, map4, new fif.g(gVar.f135399a, gVar.f135400b, gVar.f135401c, gVar.d, gVar.e));
            case 24:
                ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimGetPlanScreen.Z;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj6 = model.f52715m;
                if (obj6 instanceof EsimDataPlan) {
                    return (EsimDataPlan) obj6;
                }
                return null;
            case 25:
                EsimGetPlanScreenContract$DomainState state = (EsimGetPlanScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                Data data = state.e;
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        Iterator it16 = ((List) content).iterator();
                        while (true) {
                            if (it16.hasNext()) {
                                next = it16.next();
                                if (Intrinsics.f(((fij.p) next).f135451a, fij.n.f135450a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        fij.p pVar = (fij.p) next;
                        if (pVar == null || (list = pVar.f135453c) == null) {
                            arrayList = 0;
                        } else {
                            List list10 = list;
                            arrayList = new ArrayList(zhm.w.t(list10, 10));
                            Iterator it17 = list10.iterator();
                            while (it17.hasNext()) {
                                arrayList.add(((EsimDataPlan) it17.next()).f100212a);
                            }
                        }
                        if (arrayList == 0) {
                            arrayList = zhm.f0.f322471a;
                        }
                    } else {
                        arrayList = 0;
                    }
                    return new Data(arrayList, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 26:
                return ((EsimGetPlanScreenContract$DomainState) obj2).f100987b;
            case 27:
                return ((EsimGetPlanScreenContract$DomainState) obj2).f100988c;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                qj0 qj0Var = new qj0("ID_LOADING_TABS", 2);
                yp0.b.r(qj0Var, R$attr.uikit_dp0, 0, R$attr.uikit_dp16, 0, 10);
                ArrayList arrayList3 = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList3.add(new pb0(a0.d.n("ID_LOADING_ITEM_PREFIX_", i)));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return zhm.u.c(new xc(fij.m.COUNTRY.getValue(), i2b.a.q(qj0Var, arrayList3), 0, null, null, 0, 0, 0, 1020));
            default:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return Boolean.valueOf(Intrinsics.f((CryptoQrScannerControllerContract$ProcessingState) pair3.f186386b, CryptoQrScannerControllerContract$ProcessingState.Detecting.f70899a));
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f134929a = i;
    }
}
