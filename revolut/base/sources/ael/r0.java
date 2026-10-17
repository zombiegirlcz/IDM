package ael;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListScreen;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.shared.feature.wealth.domain.api.interactors.TradingStatementsInteractor$NotReadyException;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.ah0;
import ip0.bo0;
import ip0.um0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3652a;

    public /* synthetic */ r0(int i) {
        this.f3652a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object next;
        int i = 16;
        switch (this.f3652a) {
            case 0:
                Optional optionalConfig = (Optional) obj2;
                Intrinsics.checkNotNullParameter(optionalConfig, "optionalConfig");
                hel.a aVar = (hel.a) gj7.b.m(optionalConfig);
                return new TradingLegalEntityInformation(aVar != null ? aVar.d : null);
            case 1:
                hel.a it8 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return u1.a(it8);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List<hel.a> list = (List) pair.f186385a;
                String str = (String) pair.f186386b;
                for (hel.a aVar2 : list) {
                    if (Intrinsics.f(aVar2.f151717b, str)) {
                        return aVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                hel.a it9 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.d;
            case 4:
                wbl.k it10 = (wbl.k) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                b1.a(it10);
                return it10;
            case 5:
                wbl.k it11 = (wbl.k) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                b1.a(it11);
                return it11;
            case 6:
                efm.i errors = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                aed.f fVar = new aed.f(new r0(8), i);
                int i2 = efm.i.f125385a;
                return errors.f(fVar, i2, i2);
            case 7:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return new Data(new wbl.m(file), null, false, 6, null);
            case 8:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return error instanceof TradingStatementsInteractor$NotReadyException ? efm.i.i(Unit.f186387a) : efm.i.c(error);
            case 9:
                wbl.k statementStatus = (wbl.k) obj2;
                Intrinsics.checkNotNullParameter(statementStatus, "statementStatus");
                String str2 = statementStatus.f296271b;
                if (str2 != null) {
                    return new Data(str2, null, false, 6, null);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 10:
                wbl.k statementStatus2 = (wbl.k) obj2;
                Intrinsics.checkNotNullParameter(statementStatus2, "statementStatus");
                String str3 = statementStatus2.f296271b;
                return str3 != null ? efm.d0.m(new Data(str3, null, false, 6, null)) : efm.d0.m(new Data(null, new IllegalStateException("Statement status url must not be null"), false, 5, null));
            case 11:
                List accountInvestments = (List) obj2;
                Intrinsics.checkNotNullParameter(accountInvestments, "accountInvestments");
                return zhm.r0.t(accountInvestments);
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.r0.g();
            case 13:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = af0.b.f3818a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255100b = false;
                Json.f255101c = true;
                Json.f255099a = true;
                Json.e = true;
                return Unit.f186387a;
            case 14:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = PocketsListScreen.Y;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.u;
                if (obj3 instanceof afa.b0) {
                    return (afa.b0) obj3;
                }
                return null;
            case 15:
                um0 it13 = (um0) obj2;
                KProperty[] kPropertyArr2 = PocketsListScreen.Y;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj4 = it13.d;
                if (obj4 instanceof afa.c) {
                    return (afa.c) obj4;
                }
                return null;
            case 16:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                Pair pair2 = (Pair) entry.getKey();
                List list2 = (List) entry.getValue();
                String str4 = ((xi0.b) pair2.f186385a).f306286a;
                String str5 = ((wi0.b) pair2.f186386b).f297794a;
                int size = list2.size();
                List list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    arrayList.add(kotlin.jvm.internal.o0.f186429a.b(((mda.c) it14.next()).getClass()).m());
                }
                StringBuilder sbM = v0.a.m("(currency=", str4, ", country=", str5, ", count=");
                sbM.append(size);
                sbM.append(", types=");
                sbM.append(arrayList);
                sbM.append(")");
                return sbM.toString();
            case 17:
                List info = (List) obj2;
                Intrinsics.checkNotNullParameter(info, "info");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : info) {
                    mda.c cVar = (mda.c) obj5;
                    Pair pair3 = new Pair(cVar.b(), cVar.a());
                    Object arrayList2 = linkedHashMap.get(pair3);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(pair3, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (((List) entry2.getValue()).size() > 1) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    hx7.e.n(new IllegalStateException(j6.a.q("PocketsList: duplicate CurrencyAccountInfo detected: ", zhm.d0.k0(linkedHashMap2.entrySet(), null, null, null, 0, new r0(i), 31))));
                }
                Collection<List> collectionValues = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(collectionValues, 10));
                for (List list4 : collectionValues) {
                    Iterator it15 = list4.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            next = it15.next();
                            if (((mda.c) next) instanceof mda.b) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    mda.c cVar2 = (mda.c) next;
                    if (cVar2 == null) {
                        cVar2 = (mda.c) zhm.d0.b0(list4);
                    }
                    arrayList3.add(cVar2);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj6 : arrayList3) {
                    xi0.b bVarB = ((mda.c) obj6).b();
                    Object arrayList4 = linkedHashMap3.get(bVarB);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap3.put(bVarB, arrayList4);
                    }
                    ((List) arrayList4).add(obj6);
                }
                return linkedHashMap3;
            case 18:
                kn2.a it16 = (kn2.a) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.P(it16, false, null, 3);
            case 19:
                e7l.f it17 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.M;
            case 20:
                Set it18 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : it18) {
                    if (h30.l.D(xi0.b.Companion, (String) obj7)) {
                        arrayList5.add(obj7);
                    }
                }
                return zhm.d0.i1(arrayList5);
            case 21:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : pockets) {
                    io3.d dVar = (io3.d) obj8;
                    if (h30.l.D(xi0.b.Companion, dVar.f163147c) && zhm.v.k(io3.k.ACTIVE, io3.k.INACTIVE).contains(dVar.f)) {
                        arrayList6.add(obj8);
                    }
                }
                return arrayList6;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayListB = aff.k.b();
                yp0.b.k(arrayListB, 0, 0, 0, 0, 31);
                return arrayListB;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return aff.k.b();
            case 25:
                gef.b it19 = (gef.b) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new cff.a(it19, it19.f143283b);
            case 26:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i3 = 0; i3 < 4; i3++) {
                    String strN = a0.d.n("LOADING_ITEM_ID_", i3);
                    bo0 bo0Var = new bo0(strN);
                    int i5 = R$attr.uikit_dp0;
                    yp0.b.l(bo0Var, i5, i5, i5, i5, null, false, 48);
                    arrayListP.add(new ah0(strN, bo0Var, false));
                }
                return arrayListP;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i6 = R$string.hotels_booking_details_suggested_experiences_title;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new TextLocalisedClause(i6, zhm.u.c(""), null, 12);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                lw0.a aVarB = ag5.j.b();
                CounterTextDelegate.Model model = new CounterTextDelegate.Model("LOADING_FEE_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_percentage_fee, null, null, 14), CounterTextDelegate.c.a.f52173a, null, false, null, null, 0, 0, 0, 0, 2040);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new cii.b(ag5.j.a(), zhm.u.c(model), aVarB);
            default:
                agh.d it20 = (agh.d) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f4827b;
        }
    }

    public /* synthetic */ r0(Object obj2, int i) {
        this.f3652a = i;
    }
}
