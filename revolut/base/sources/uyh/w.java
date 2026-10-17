package uyh;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacade;
import com.revolut.feature.product.onboarding.domain.models.DeclarationValue;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$InputData;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.PassportService;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f284415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f284416c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, Double d, Double d5) {
        this.f284414a = 1;
        this.f284415b = dVar;
        this.f284416c = d;
        this.d = d5;
    }

    private final Object a(Object obj2) {
        Object cryptoExchangeFees;
        vf5.d dVar = (vf5.d) this.f284416c;
        List list = (List) this.f284415b;
        hha.d dVar2 = (hha.d) this.d;
        List<CryptoExchangeFeesFacade> cryptoExchangeFeesFacades = (List) obj2;
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesFacades, "cryptoExchangeFeesFacades");
        ArrayList arrayList = new ArrayList();
        for (CryptoExchangeFeesFacade cryptoExchangeFeesFacade : cryptoExchangeFeesFacades) {
            List list2 = cryptoExchangeFeesFacade.f70824a;
            dVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list2.iterator();
            while (true) {
                cryptoExchangeFees = null;
                if (!it8.hasNext()) {
                    break;
                }
                String str = (String) it8.next();
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next = it9.next();
                    if (Intrinsics.f(((hha.d) next).f152287a, str)) {
                        cryptoExchangeFees = next;
                        break;
                    }
                }
                hha.d dVar3 = (hha.d) cryptoExchangeFees;
                if (dVar3 != null) {
                    arrayList2.add(dVar3);
                }
            }
            List listP0 = zhm.d0.P0(arrayList2, new vf5.c());
            if (((List) ue0.e.M(listP0)) != null) {
                List list3 = listP0;
                boolean z = false;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it10 = list3.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            break;
                        }
                        if (Intrinsics.f(((hha.d) it10.next()).f152287a, dVar2.f152287a)) {
                            z = true;
                            break;
                        }
                    }
                }
                cryptoExchangeFees = new CryptoExchangeFees(listP0, z, cryptoExchangeFeesFacade.f70825b, cryptoExchangeFeesFacade.f70826c, cryptoExchangeFeesFacade.d);
            }
            if (cryptoExchangeFees != null) {
                arrayList.add(cryptoExchangeFees);
            }
        }
        return zhm.d0.P0(arrayList, new vf5.b());
    }

    private final Object b(Object obj2) {
        String str = (String) this.f284416c;
        com.revolut.feature.product.onboarding.flow.a aVar = (com.revolut.feature.product.onboarding.flow.a) this.f284415b;
        DeclarationValue declarationValue = (DeclarationValue) this.d;
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        kvh.h.Companion.getClass();
        kvh.g.a("Failed to submit " + str + " step", error);
        qg7.k kVar = new qg7.k(aVar, 13, str, declarationValue);
        ve7.i iVar = new ve7.i(10);
        vja.b bVar = aVar.f81257q;
        if (!(error instanceof HandledNetworkException)) {
            if (bVar.Z2(error)) {
                aVar.C2(vja.m.f289674a);
            } else {
                bVar.b3(error, kVar, iVar);
            }
        }
        return Boolean.TRUE;
    }

    private final Object c(Object obj2) {
        String str = (String) this.f284416c;
        cli.y yVar = ((vlg.s) this.f284415b).f290446q;
        String str2 = (String) this.d;
        vlg.e update = (vlg.e) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        switch (vlg.r.f290444a[vlg.o.valueOf(str).ordinal()]) {
            case 1:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, new ilg.a(str2), null, null, null, null, null, null, null, 254), 3);
            case 2:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, null, new ilg.a(str2), null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS), 3);
            case 3:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, new ilg.a(str2), null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), 3);
            case 4:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, null, null, null, null, new ilg.a(str2), null, null, PassportService.DEFAULT_MAX_BLOCKSIZE), 3);
            case 5:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, null, null, new ilg.a(str2), null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION), 3);
            case 6:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, null, null, null, null, null, null, new ilg.a(str2), CertificateBody.profileType), 3);
            case 7:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, null, null, null, null, null, new ilg.a(str2), null, 191), 3);
            case 8:
                return vlg.e.a(update, null, null, ilg.b.a(((vlg.e) ((j2) yVar.f22677a).getValue()).f290434c, null, null, null, null, new ilg.a(str2), null, null, null, 239), 3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Object d(Object obj2) {
        String strE;
        jf0.c cVar = (jf0.c) this.f284416c;
        vli.k kVar = (vli.k) this.f284415b;
        String str = (String) this.d;
        MoneyRequest moneyRequest = (MoneyRequest) obj2;
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        MoneyRequestCounterParty moneyRequestCounterPartyA = com.revolut.domain.models.moneyrequest.b.a(moneyRequest);
        if (moneyRequestCounterPartyA == null || (strE = moneyRequestCounterPartyA.getE()) == null) {
            strE = cVar.e(2);
        }
        String str2 = strE;
        return new ufm.i(((nj8.n) kVar.e).i(str2), new vif.c(new ryd.f((Object) kVar, (Object) moneyRequest, (Object) cVar, str2, (Object) str, 10), 21), 0);
    }

    private final Object e(Object obj2) {
        String rawValue = (String) this.f284416c;
        vn6.i iVar = (vn6.i) this.f284415b;
        String str = (String) this.d;
        vn6.d update = (vn6.d) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        String str2 = iVar.o.d.e;
        if (str2 == null) {
            str2 = "";
        }
        String iban = str2 + str;
        update.getClass();
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(iban, "iban");
        return new vn6.d(rawValue, iban);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private final Object g(Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listA;
        Object obj3;
        ?? arrayList3;
        Set set;
        ?? arrayList4;
        Iterator it8;
        Object next;
        Set set2;
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) this.f284416c;
        List list = (List) this.f284415b;
        List list2 = (List) this.d;
        List rates = (List) obj2;
        Intrinsics.checkNotNullParameter(rates, "rates");
        IncomeSorterDestinationsContract$InputData incomeSorterDestinationsContract$InputData = aVar.o;
        cli.y yVar = aVar.v;
        gte.a aVar2 = aVar.f87735s;
        IncomeSorterDestinationsContract$InputData.SelectionMode selectionMode = incomeSorterDestinationsContract$InputData.f87718a;
        if (selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                IncomeSorterDestinationInfo incomeSorterDestinationInfo = (IncomeSorterDestinationInfo) obj4;
                Set set3 = ((IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection) selectionMode).f87720a;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it9 = set3.iterator();
                    while (it9.hasNext()) {
                        if (((IncomeSorterDestinationInfo) it9.next()).getId().equals(incomeSorterDestinationInfo.getId())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj4);
            }
        } else {
            if (!(selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj5 : list) {
                IncomeSorterDestinationInfo incomeSorterDestinationInfo2 = (IncomeSorterDestinationInfo) obj5;
                if ((incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.JointPocket) || (incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) || (incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.Savings) || (incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.SubaccountPocket)) {
                    arrayList.add(obj5);
                } else if (!(incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.RoboPortfolio) && !(incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.Investment) && !(incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) && !(incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.BankTransfer) && !(incomeSorterDestinationInfo2 instanceof IncomeSorterDestinationInfo.Crypto)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        xi0.b bVar = incomeSorterDestinationsContract$InputData.f87719b;
        if (!(selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.DestinationsSelection)) {
            if (!(selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            list2 = zhm.f0.f322471a;
        }
        List list3 = list2;
        jte.d dVar = (jte.d) aVar2;
        if (dVar.c(WealthUiApi$Toggles.InvestIncomeSorterV2.f95859c)) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : arrayList) {
                if (obj6 instanceof IncomeSorterDestinationInfo.Investment.CashHolding) {
                    arrayList5.add(obj6);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj7 : arrayList) {
                if (obj7 instanceof IncomeSorterDestinationInfo.Investment.Instrument) {
                    arrayList6.add(obj7);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj8 : arrayList) {
                if (!(((IncomeSorterDestinationInfo) obj8) instanceof IncomeSorterDestinationInfo.Investment)) {
                    arrayList7.add(obj8);
                }
            }
            vpd.l lVar = ((vpd.d) ((j2) yVar.f22677a).getValue()).f291157b;
            vpd.j jVar = lVar instanceof vpd.j ? (vpd.j) lVar : null;
            if (jVar == null || (set2 = jVar.f291169a) == null) {
                arrayList4 = 0;
            } else {
                arrayList4 = new ArrayList();
                for (Object obj9 : set2) {
                    if (obj9 instanceof IncomeSorterDestinationInfo.Investment) {
                        arrayList4.add(obj9);
                    }
                }
            }
            if (arrayList4 == 0) {
                arrayList4 = zhm.f0.f322471a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj10 : arrayList5) {
                com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar3 = ((IncomeSorterDestinationInfo.Investment.CashHolding) obj10).f;
                Object obj11 = linkedHashMap.get(aVar3);
                if (obj11 == null) {
                    ArrayList arrayList8 = new ArrayList();
                    linkedHashMap.put(aVar3, arrayList8);
                    obj11 = arrayList8;
                }
                ((List) obj11).add(obj10);
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it10 = linkedHashMap.entrySet().iterator();
            while (it10.hasNext()) {
                Map.Entry entry = (Map.Entry) it10.next();
                com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar4 = (com.revolut.feature.spending_analytics.api.models.income_sorter.a) entry.getKey();
                List listL = (List) entry.getValue();
                if (aVar4 == com.revolut.feature.spending_analytics.api.models.income_sorter.a.CUSTODIAN_JISA) {
                    it8 = it10;
                } else {
                    Iterator it11 = listL.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            it8 = it10;
                            next = null;
                            break;
                        }
                        next = it11.next();
                        it8 = it10;
                        if (Intrinsics.f(((IncomeSorterDestinationInfo.Investment.CashHolding) next).f87465a, bVar)) {
                            break;
                        }
                        it10 = it8;
                    }
                    IncomeSorterDestinationInfo.Investment.CashHolding cashHolding = (IncomeSorterDestinationInfo.Investment.CashHolding) next;
                    if (cashHolding == null) {
                        cashHolding = (IncomeSorterDestinationInfo.Investment.CashHolding) zhm.d0.d0(listL);
                    }
                    listL = zhm.v.l(cashHolding);
                }
                zhm.a0.x(listL, arrayList9);
                it10 = it8;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj12 : arrayList6) {
                IncomeSorterDestinationInfo.Investment.Instrument instrument = (IncomeSorterDestinationInfo.Investment.Instrument) obj12;
                ArrayList arrayList10 = arrayList;
                Pair pair = new Pair(instrument.k, instrument.f87475j);
                Object arrayList11 = linkedHashMap2.get(pair);
                if (arrayList11 == null) {
                    arrayList11 = new ArrayList();
                    linkedHashMap2.put(pair, arrayList11);
                }
                ((List) arrayList11).add(obj12);
                arrayList = arrayList10;
            }
            arrayList2 = arrayList;
            ArrayList arrayList12 = new ArrayList(linkedHashMap2.size());
            Iterator it12 = linkedHashMap2.entrySet().iterator();
            while (it12.hasNext()) {
                arrayList12.add(zhm.d0.V0(zhm.d0.P0((List) ((Map.Entry) it12.next()).getValue(), new vpd.h0()), 2));
            }
            ArrayList arrayListE0 = zhm.d0.E0(zhm.w.u(arrayList12), zhm.d0.E0(arrayList9, (Collection) arrayList4));
            HashSet hashSet = new HashSet();
            ArrayList arrayList13 = new ArrayList();
            for (Object obj13 : arrayListE0) {
                if (hashSet.add(((IncomeSorterDestinationInfo.Investment) obj13).getId())) {
                    arrayList13.add(obj13);
                }
            }
            listA = zhm.d0.E0(arrayList13, arrayList7);
        } else {
            arrayList2 = arrayList;
            listA = arrayList2;
        }
        if (dVar.c(WealthUiApi$Toggles.CryptoIncomeSorter.f95853c)) {
            ArrayList arrayList14 = new ArrayList();
            for (Object obj14 : listA) {
                if (obj14 instanceof IncomeSorterDestinationInfo.Crypto.RevXFiatPocket) {
                    arrayList14.add(obj14);
                }
            }
            ArrayList arrayList15 = new ArrayList();
            for (Object obj15 : listA) {
                if (obj15 instanceof IncomeSorterDestinationInfo.Crypto.CryptoPocket) {
                    arrayList15.add(obj15);
                }
            }
            ArrayList arrayList16 = new ArrayList();
            for (Object obj16 : listA) {
                if (!(((IncomeSorterDestinationInfo) obj16) instanceof IncomeSorterDestinationInfo.Crypto)) {
                    arrayList16.add(obj16);
                }
            }
            int size = arrayList14.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj3 = null;
                    break;
                }
                obj3 = arrayList14.get(i);
                if (Intrinsics.f(((IncomeSorterDestinationInfo.Crypto.RevXFiatPocket) obj3).f87462a, bVar)) {
                    break;
                }
                i++;
            }
            IncomeSorterDestinationInfo.Crypto.RevXFiatPocket revXFiatPocket = (IncomeSorterDestinationInfo.Crypto.RevXFiatPocket) obj3;
            if (revXFiatPocket == null) {
                revXFiatPocket = (IncomeSorterDestinationInfo.Crypto.RevXFiatPocket) zhm.d0.d0(arrayList14);
            }
            vpd.l lVar2 = ((vpd.d) ((j2) yVar.f22677a).getValue()).f291157b;
            vpd.j jVar2 = lVar2 instanceof vpd.j ? (vpd.j) lVar2 : null;
            if (jVar2 == null || (set = jVar2.f291169a) == null) {
                arrayList3 = 0;
            } else {
                arrayList3 = new ArrayList();
                for (Object obj17 : set) {
                    if (obj17 instanceof IncomeSorterDestinationInfo.Crypto) {
                        arrayList3.add(obj17);
                    }
                }
            }
            if (arrayList3 == 0) {
                arrayList3 = zhm.f0.f322471a;
            }
            aim.e eVarB = zhm.u.b();
            eVarB.addAll((Collection) arrayList3);
            if (revXFiatPocket != null) {
                eVarB.add(revXFiatPocket);
            }
            eVarB.addAll(arrayList16);
            eVarB.addAll(zhm.d0.V0(arrayList15, 2));
            listA = zhm.u.a(eVarB);
        }
        List list4 = listA;
        xi0.b bVar2 = incomeSorterDestinationsContract$InputData.f87719b;
        IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection remainingBalanceDestinationSelection = selectionMode instanceof IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection ? (IncomeSorterDestinationsContract$InputData.SelectionMode.RemainingBalanceDestinationSelection) selectionMode : null;
        return new vpd.c(list4, arrayList2, remainingBalanceDestinationSelection != null ? remainingBalanceDestinationSelection.f87722a : null, rates, bVar2, list3);
    }

    private final Object h(Object obj2) {
        vpd.c cVar = (vpd.c) this.f284416c;
        ArrayList arrayList = (ArrayList) this.f284415b;
        LinkedHashSet selectedDestinations = (LinkedHashSet) this.d;
        vpd.d update = (vpd.d) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        ArrayList arrayListE0 = zhm.d0.E0(arrayList, cVar.f291152a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayListE0) {
            if (hashSet.add(((IncomeSorterDestinationInfo) obj3).getId())) {
                arrayList2.add(obj3);
            }
        }
        Data dataP = zi0.c.P(vpd.c.a(cVar, arrayList2), false, null, 3);
        Intrinsics.checkNotNullParameter(selectedDestinations, "selectedDestinations");
        return vpd.d.a(update, dataP, new vpd.j(selectedDestinations), null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f284416c
            nu0.i r0 = (nu0.i) r0
            java.lang.Object r1 = r4.f284415b
            vq0.e r1 = (vq0.e) r1
            java.lang.Object r2 = r4.d
            jv0.y r2 = (jv0.y) r2
            jv0.m r5 = (jv0.m) r5
            java.lang.String r3 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            boolean r3 = r5 instanceof jv0.o
            if (r3 == 0) goto L28
            jv0.o r5 = (jv0.o) r5
            boolean r5 = r5.f178755a
            if (r5 == 0) goto L20
            nu0.e r5 = nu0.e.PAUSE
            goto L22
        L20:
            nu0.e r5 = nu0.e.PLAY
        L22:
            com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView r0 = (com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView) r0
            r0.g0(r5)
            goto L72
        L28:
            jv0.m$c r3 = jv0.m.c.f178753a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r5, r3)
            if (r3 == 0) goto L34
            r1.c()
            goto L72
        L34:
            jv0.m$b r1 = jv0.m.b.f178752a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r1)
            if (r5 == 0) goto L72
            boolean r5 = r2.getSubtitlesEnabled()
            if (r5 == 0) goto L6c
            java.util.List r5 = r2.getAvailableSubtitlesTracks()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r1 = r5 instanceof java.util.Collection
            if (r1 == 0) goto L56
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L56
            goto L6c
        L56:
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r5.next()
            pz0.a r1 = (pz0.a) r1
            boolean r1 = r1.f
            if (r1 == 0) goto L5a
            r5 = 1
            goto L6d
        L6c:
            r5 = 0
        L6d:
            com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView r0 = (com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView) r0
            r0.f0(r5)
        L72:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uyh.w.i(java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2) {
        Function1 function1 = (Function1) this.f284416c;
        l4l.a aVar = (l4l.a) this.f284415b;
        m4l.j jVar = (m4l.j) this.d;
        List pockets = (List) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : pockets) {
            if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new SourcePocket.Pocket((io3.d) it8.next(), null, aVar, jVar));
        }
        return arrayList2;
    }

    private final Object k(Object obj2) {
        vse.d dVar = (vse.d) this.f284416c;
        TicketDetails ticketDetails = (TicketDetails) this.f284415b;
        ose.c cVar = (ose.c) this.d;
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        aim.e eVarB = zhm.u.b();
        zhm.a0.x(dVar.e(cVar.f229322a, cVar.f229323b, ticketDetails, null, new vch.a(ticketDetails, 27)), eVarB);
        return zhm.u.a(eVarB);
    }

    private final Object l(Object obj2) {
        return vt0.h.g0((vt0.h) this.f284416c, (LightPromptViewModel.V1Content) this.f284415b, (Clause) this.d, (ty0.a) obj2);
    }

    private final Object m(Object obj2) {
        ufm.d dVar = (ufm.d) this.f284416c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f284415b;
        nx9.d dVar2 = (nx9.d) this.d;
        do3.n user = (do3.n) obj2;
        Intrinsics.checkNotNullParameter(user, "user");
        List listA = ((kx9.a) dVar.f279875a).a(zhm.d0.d1(linkedHashMap.keySet()));
        int iB = zhm.q0.b(zhm.w.t(listA, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
        for (Object obj3 : listA) {
            linkedHashMap2.put(((nx9.b) obj3).f220483a, obj3);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            nx9.b bVar = (nx9.b) linkedHashMap2.get(str);
            String strK = do3.q.k(user);
            if (strK == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i = bVar != null ? bVar.e : 0;
            List<ux9.t> list2 = list;
            ux9.t tVar = (ux9.t) zhm.d0.m0(zhm.d0.P0(list2, new vx9.d()));
            long timestamp = bVar != null ? bVar.f : 0L;
            for (ux9.t tVar2 : list2) {
                if (tVar2.getTimestamp() > timestamp && ((tx9.f) dVar.f279876b).a() != 0 && tVar2.b().b(strK)) {
                    i++;
                }
            }
            if (tVar.getTimestamp() > timestamp) {
                timestamp = tVar.getTimestamp();
            }
            jq9.b paymentItem = tVar.b();
            Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
            Pair pairA = nx9.c.a(paymentItem);
            arrayList.add(new nx9.b(str, dVar2, (String) pairA.f186385a, (nx9.a) pairA.f186386b, i, timestamp));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uyh.w.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0382  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uyh.w.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ w(Object obj2, int i, Object obj3, Object obj4) {
        this.f284414a = i;
        this.f284416c = obj2;
        this.f284415b = obj3;
        this.d = obj4;
    }

    public /* synthetic */ w(vea.l lVar, xi0.b bVar, AccountId accountId, o97.y yVar) {
        this.f284414a = 12;
        this.f284416c = bVar;
        this.f284415b = accountId;
        this.d = yVar;
    }

    public /* synthetic */ w(vpd.c cVar, ArrayList arrayList, vpd.j jVar, LinkedHashSet linkedHashSet) {
        this.f284414a = 22;
        this.f284416c = cVar;
        this.f284415b = arrayList;
        this.d = linkedHashSet;
    }
}
