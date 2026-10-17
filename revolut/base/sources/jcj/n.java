package jcj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jck.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import le.u1;
import m1c.r0;
import nkm.y;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172833a;

    public /* synthetic */ n(int i) {
        this.f172833a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.d dVar;
        dj0.d dVarE = null;
        switch (this.f172833a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new s7("LOADING_ITEM_PREFIX_NETWORK_FEE_ID", 0, 0, 0, 0, false, null, 126);
            case 1:
                t it8 = (t) obj2;
                KProperty[] kPropertyArr = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f54722b.f51590a, "id_enable_contacts_permissions"));
            case 2:
                ListSubheaderDelegate.Model it9 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f52708a, "id_upcoming_birthdays_header"));
            case 3:
                ListSubheaderDelegate.Model it10 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f52708a, "id_upcoming_birthdays_header"));
            case 4:
                FullScreenStateDelegate.Model it11 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(Intrinsics.f(it11.f52373a, "id_clear_search"));
            case 5:
                t it12 = (t) obj2;
                KProperty[] kPropertyArr5 = PlanGiftingReceiverPickerScreen.U;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f54722b.f51590a, "id_enable_birthday_sharing"));
            case 6:
                return new kotlin.time.b(((Boolean) ((Pair) obj2).f186385a).booleanValue() ? com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a.f102506x : com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a.f102507y);
            case 7:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(pd.b.j((Boolean) it13.f224257a));
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.d();
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.d();
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 13:
                Sequence it14 = (Sequence) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return y.J(it14);
            case 14:
                Map.Entry it15 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (Comparable) ((Pair) it15.getKey()).f186385a;
            case 15:
                Map.Entry it16 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (Comparable) ((Pair) it16.getKey()).f186386b;
            case 16:
                List contacts = (List) obj2;
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : contacts) {
                    int i = g0.f172849a[((zm3.j) obj3).e.ordinal()];
                    if (i == 1) {
                        arrayList.add(obj3);
                    } else if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return arrayList;
            case 17:
                Intrinsics.checkNotNullParameter((LocalDate) obj2, "it");
                return Boolean.TRUE;
            case 18:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186385a, (List) pair.f186386b);
            case 19:
                Sequence upcomingBirthdays = (Sequence) obj2;
                Intrinsics.checkNotNullParameter(upcomingBirthdays, "upcomingBirthdays");
                return y.J(y.H(upcomingBirthdays, 3));
            case 20:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new Data(it17, null, false, 6, null);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return od3.b.b();
            case 22:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new md3.b((uc3.f) rVar.f314203c, (List) rVar.f314201a, ((r0) rVar.f314202b).f201447a);
            case 23:
                r rVar2 = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                List list = (List) rVar2.f314201a;
                CashbackCurrency cashbackCurrency = (CashbackCurrency) rVar2.f314202b;
                xi0.b bVar = (xi0.b) rVar2.f314203c;
                uc3.a aVar = (uc3.a) d0.d0(list);
                if (aVar != null && (dVar = aVar.f278974b) != null) {
                    dVarE = io3.h.e(dVar);
                }
                xi0.b bVar2 = cashbackCurrency.f65687a;
                if (bVar2 != null) {
                    bVar = bVar2;
                }
                return dVarE == null ? new dj0.d(0L, bVar) : dVarE;
            case 24:
                Optional it18 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return v.l(u1.l(it18));
            case 25:
                Data productAccountData = (Data) obj2;
                Intrinsics.checkNotNullParameter(productAccountData, "productAccountData");
                int i2 = 4;
                return (Data) iii.c.f(productAccountData, new j45.m(productAccountData, 21), new jch.p(productAccountData, i2), new jb8.b(i2));
            case 26:
                jd7.d update = (jd7.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jd7.d.a(update, new Data(null, null, true, 3, null));
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(nb0.a(pb0.Companion, "HTML_DOCUMENT_LOADING_ROW_ID", false, 6));
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            default:
                RowDelegate.Model it19 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = CryptoCurrencyPairPickerScreen.T;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj4 = it19.u;
                if (obj4 instanceof Pair) {
                    return (Pair) obj4;
                }
                return null;
        }
    }
}
