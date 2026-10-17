package pb2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreen;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import ip0.pb0;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od3.a0;
import od3.b0;
import od3.c0;
import od3.d0;
import od3.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234602a;

    public /* synthetic */ a(int i) {
        this.f234602a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String country;
        String str;
        String str2;
        z = false;
        boolean z = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z = false;
        boolean z6 = false;
        z = false;
        boolean z11 = false;
        z = false;
        boolean z12 = false;
        z = false;
        boolean z29 = false;
        Object obj3 = null;
        switch (this.f234602a) {
            case 0:
                return (Clause) obj2;
            case 1:
                LocalDateTime localDateTime = (LocalDateTime) obj2;
                if (localDateTime != null) {
                    return new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                }
                return null;
            case 2:
                LocalDateTime localDateTime2 = (LocalDateTime) obj2;
                if (localDateTime2 != null) {
                    return new TimeClause(oi0.d.R(localDateTime2), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                }
                return null;
            case 3:
                dj0.d dVar = (dj0.d) obj2;
                if (dVar != null) {
                    return c.k(dVar);
                }
                return null;
            case 4:
                h it8 = (h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (ApmPaymentAuthorisationPendingAction) it8.f234606a.getContent();
            case 5:
                return f0.f322471a;
            case 6:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                if (address == null || (country = address.getCountry()) == null) {
                    throw new IllegalStateException("User doesn't have address");
                }
                String currencyCode = Currency.getInstance(new Locale("", country)).getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                return new xi0.b(6, currencyCode, null);
            case 7:
                wl2.e it9 = (wl2.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf((it9 instanceof wl2.b) || (it9 instanceof wl2.c));
            case 8:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = PocketPickerScreen.f95623a0;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = it10.u;
                if (obj4 instanceof rbh.f) {
                    return (rbh.f) obj4;
                }
                return null;
            case 9:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new pb0(a0.d.n("pocket-picker-loading-", i)));
                }
                return pch.g.b(arrayListP);
            case 10:
                Data transactionsData = (Data) obj2;
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                return new od3.w(transactionsData);
            case 11:
                vf0.e eVar = (vf0.e) obj2;
                Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                return new od3.x((Data) eVar.f288410a, (Data) eVar.f288411b, (Data) eVar.f288412c, (Data) eVar.d, (Data) eVar.e, (Data) eVar.f, (Data) eVar.f288413g, (Data) eVar.f288414h, (Data) eVar.i);
            case 12:
                List allPlans = (List) obj2;
                Intrinsics.checkNotNullParameter(allPlans, "allPlans");
                Iterator it11 = allPlans.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        if (hha.s.j((hha.d) next)) {
                            obj3 = next;
                        }
                    }
                }
                hha.d dVar2 = (hha.d) obj3;
                if (dVar2 != null) {
                    return dVar2;
                }
                throw new NullPointerException("Metal cashback source was open, but Metal plan not available");
            case 13:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                List list = plans;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            if (hha.s.j((hha.d) it12.next())) {
                                z29 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z29);
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                CashbackCurrency cashbackCurrency = (CashbackCurrency) pair.f186386b;
                if (zBooleanValue && cp5.d.A(cashbackCurrency.f65687a)) {
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            case 15:
                l71.d company = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(company, "company");
                if ((Intrinsics.f(company.f192500c, "LT") || Intrinsics.f(company.f192500c, "FR")) && company.f192499b.contains("BANK")) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 16:
                vf0.a aVar = (vf0.a) obj2;
                Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                return new od3.y((Data) aVar.f288388a, (Data) aVar.f288389b, (Data) aVar.f288390c, (Data) aVar.d, (Data) aVar.e, (Data) aVar.f, (Data) aVar.f288391g, (Data) aVar.f288392h, (Data) aVar.i, (Data) aVar.f288393j);
            case 17:
                List plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                List list2 = plans2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it13 = list2.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            if (hha.s.j((hha.d) it13.next())) {
                                z6 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z6);
            case 18:
                List plans3 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans3, "plans");
                List list3 = plans3;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it14 = list3.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            if (hha.s.p((hha.d) it14.next())) {
                                z4 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 19:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue2 = ((Boolean) pair2.f186385a).booleanValue();
                CashbackCurrency cashbackCurrency2 = (CashbackCurrency) pair2.f186386b;
                if (zBooleanValue2 && cp5.d.A(cashbackCurrency2.f65687a)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 20:
                l71.d company2 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(company2, "company");
                if ((Intrinsics.f(company2.f192500c, "LT") || Intrinsics.f(company2.f192500c, "FR")) && company2.f192499b.contains("BANK")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new od3.z((Data) rVar.f314201a, (Data) rVar.f314202b, (Data) rVar.f314203c);
            case 22:
                Data transactionsData2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(transactionsData2, "transactionsData");
                return new a0(transactionsData2);
            case 23:
                Data transactionsData3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(transactionsData3, "transactionsData");
                return new b0(transactionsData3);
            case 24:
                Data transactionsData4 = (Data) obj2;
                Intrinsics.checkNotNullParameter(transactionsData4, "transactionsData");
                return new c0(transactionsData4);
            case 25:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return new d0((Data) rVar2.f314201a, (Data) rVar2.f314202b, (Data) rVar2.f314203c);
            case 26:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list4 = (List) pair3.f186385a;
                hha.d dVar3 = (hha.d) pair3.f186386b;
                CashbackDetails.INSTANCE.getClass();
                vei.a aVarA = CashbackDetails.Companion.a(dVar3);
                Iterator it15 = list4.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next2 = it15.next();
                        if (((CashbackDetails) next2).f97896a == aVarA) {
                            obj3 = next2;
                        }
                    }
                }
                CashbackDetails cashbackDetails = (CashbackDetails) obj3;
                if (cashbackDetails == null || (str = cashbackDetails.f97897b) == null) {
                    throw new NullPointerException(a0.d.s("No stays cashback for plan with id ", dVar3.f152287a, " and code ", dVar3.f152288b));
                }
                return str;
            case 27:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return new e0((Data) pair4.f186385a, (Data) pair4.f186386b);
            case 28:
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                List list5 = (List) pair5.f186385a;
                hha.d dVar4 = (hha.d) pair5.f186386b;
                CashbackDetails.INSTANCE.getClass();
                vei.a aVarA2 = CashbackDetails.Companion.a(dVar4);
                Iterator it16 = list5.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        Object next3 = it16.next();
                        if (((CashbackDetails) next3).f97896a == aVarA2) {
                            obj3 = next3;
                        }
                    }
                }
                CashbackDetails cashbackDetails2 = (CashbackDetails) obj3;
                if (cashbackDetails2 == null || (str2 = cashbackDetails2.f97897b) == null) {
                    throw new NullPointerException(a0.d.s("No stays cashback for plan with id ", dVar4.f152287a, " and code ", dVar4.f152288b));
                }
                return str2;
            default:
                pd4.i update = (pd4.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return pd4.i.a(update, null, null, null, 31);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f234602a = i;
    }
}
