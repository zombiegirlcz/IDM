package efb;

import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a;
import com.youTransactor.uCube.rpc.Constants;
import eic.s;
import eig.t;
import ip0.gu;
import ip0.nb0;
import ip0.og;
import ip0.pb0;
import ip0.s7;
import ip0.xk;
import ip0.z90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import xhf.d1;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125313a;

    public /* synthetic */ i(int i) {
        this.f125313a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f125313a;
        b39.b bVar = b39.b.f12015a;
        int i2 = 0;
        switch (i) {
            case 0:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.REVERYWHERE) : bVar;
            case 1:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.STATIONS) : bVar;
            case 2:
                egh.g it8 = (egh.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f125649a;
            case 3:
                egh.g it9 = (egh.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f125649a;
            case 4:
                egh.g it10 = (egh.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f125650b;
            case 5:
                egh.g it11 = (egh.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f125649a;
            case 6:
                egh.g it12 = (egh.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f125651c;
            case 7:
                return h30.l.q("it", (od0.i) obj2);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 9:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 1, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it13 = intRangeU.iterator();
                while (it13.f289625c) {
                    arrayList.add(new s7(a0.d.n("FUND_INVESTMENT_DETAILS_CELL_LOADING", it13.nextInt()), 0, 0, 0, 0, true, null, 94));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                IntRange intRange = new IntRange(2, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it14 = intRange.iterator();
                while (it14.f289625c) {
                    arrayList2.add(new s7(a0.d.n("FUND_INVESTMENT_DETAILS_CELL_LOADING", it14.nextInt()), 0, 0, 0, 0, true, null, 94));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return d0.E0(arrayList2, arrayList);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return a.b.f95816a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 12:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new TextLocalisedClause(R$string.x_pay_otp_verification_title, null, null, 14);
            case 14:
                gh7.k params = (gh7.k) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return "INDIVIDUAL_FLAG_KEY".concat(params.getKey());
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                IntRange intRange2 = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange2, 10));
                vim.f it15 = intRange2.iterator();
                while (it15.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("loading_", it15.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return new eh8.i(eh8.g.f125755a, null, u.a(eVarB));
            case 16:
                CenteredAmountDelegate.Model it16 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr = PaymentAmountScreen.f78771b0;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.f51981p;
                if (obj3 instanceof yof.b) {
                    return (yof.b) obj3;
                }
                return null;
            case 17:
                eh9.a it17 = (eh9.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f125765a;
            case 18:
                eh9.a update = (eh9.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return eh9.a.a(update, null, null, update.d + 1, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 19:
                ei1.e update2 = (ei1.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                m70.a.c(t0.f186434a);
                update2.getClass();
                Intrinsics.checkNotNullParameter("", "query");
                return new ei1.e(null, "");
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listA = xi1.a.a();
                yp0.b.k(listA, 0, 0, 0, 0, 31);
                return listA;
            case 21:
                eic.h update3 = (eic.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data layout = Data.copy$default(update3.f126471a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(layout, "layout");
                return new eic.h(layout);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = u.b();
                aim.e eVarB3 = u.b();
                eVarB3.add(new z90("ID_ACTION_BUTTON_FAQ"));
                eVarB3.add(new z90("ID_ACTION_BUTTON_FEEDBACK"));
                Unit unit = Unit.f186387a;
                aim.e eVarA = u.a(eVarB3);
                Float fValueOf = Float.valueOf(16.0f);
                int i3 = R$attr.uikit_dp8;
                int i5 = R$attr.uikit_dp4;
                eVarB2.add(new xk("ID_ACTION_BUTTONS_SECTION", eVarA, 2, fValueOf, null, i3, i3, i5, i5, 63600));
                og ogVar = new og("ID_DESCRIPTION");
                yp0.b.l(ogVar, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(ogVar);
                eVarB2.add(new gu("ID_SECTION_SUBHEADER", 0, 0, 30));
                ArrayList arrayList4 = new ArrayList(6);
                for (int i6 = 0; i6 < 6; i6++) {
                    arrayList4.add(t61.a.o("ID_SECTION_ITEM_", i6, pb0.Companion, false, 4));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList4);
                return new s(eic.k.f126476a, eic.f.f126470a, u.a(eVarB2));
            case 23:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                Iterator it18 = transactions.iterator();
                if (it18.hasNext()) {
                    next = it18.next();
                    if (it18.hasNext()) {
                        long createdDate = ((d1) next).getCreatedDate();
                        do {
                            Object next2 = it18.next();
                            long createdDate2 = ((d1) next2).getCreatedDate();
                            if (createdDate > createdDate2) {
                                next = next2;
                                createdDate = createdDate2;
                            }
                        } while (it18.hasNext());
                    }
                } else {
                    next = null;
                }
                d1 d1Var = (d1) next;
                return new Pair(d1Var != null ? Long.valueOf(d1Var.getCreatedDate()) : null, transactions);
            case 24:
                Intrinsics.checkNotNullParameter((Pair) obj2, "<destruct>");
                return Boolean.valueOf(!((List) r1.f186386b).isEmpty());
            case 25:
                Intrinsics.checkNotNullParameter((Pair) obj2, "<destruct>");
                return Boolean.valueOf(!((List) r1.f186386b).isEmpty());
            case 26:
                Intrinsics.checkNotNullParameter((Pair) obj2, "<destruct>");
                return Boolean.valueOf(!((List) r1.f186386b).isEmpty());
            case 27:
                eig.k update4 = (eig.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return eig.k.a(update4, null, null, null, null, !update4.e, false, null, null, 239);
            case 28:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                while (i2 < 3) {
                    arrayListP.add(new pb0(a0.d.n("AIRLINES_LOADING_ITEM_ID_", i2)));
                    i2++;
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return t.a(arrayListP, t.b());
            default:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                while (i2 < 3) {
                    arrayListP2.add(new pb0(a0.d.n("TRANSACTIONS_LOADING_ITEM_ID_", i2)));
                    i2++;
                }
                yp0.b.k(arrayListP2, 0, 0, 0, 0, 31);
                return arrayListP2;
        }
    }

    public /* synthetic */ i(n nVar, int i) {
        this.f125313a = i;
    }
}
