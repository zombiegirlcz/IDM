package wp5;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299157a;

    public /* synthetic */ w(int i) {
        this.f299157a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ApmQuoteRate apmQuoteRate;
        Object objValueOf = null;
        switch (this.f299157a) {
            case 0:
                wk5.a it8 = (wk5.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(it8, false, null, 3);
            case 1:
                wp9.p it9 = (wp9.p) obj2;
                KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.f299195c);
            case 2:
                SelectableDelegate.Model model = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = ((RowDelegate.Model) model.f53305b).u;
                if (obj3 instanceof wp9.g0) {
                    return (wp9.g0) obj3;
                }
                return null;
            case 3:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = SplitBillsSummaryScreen.Z;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = it10.u;
                if (obj4 instanceof zp9.u) {
                    return (zp9.u) obj4;
                }
                return null;
            case 4:
                wp9.v it11 = (wp9.v) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new vf0.h(it11.f299204c, it11.f299203b, it11.d, it11.f299205g);
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return wpj.e.e;
            case 6:
                spk.c alertsDto = (spk.c) obj2;
                Intrinsics.checkNotNullParameter(alertsDto, "alertsDto");
                return wpk.a.a(alertsDto);
            case 7:
                spk.c alertsDto2 = (spk.c) obj2;
                Intrinsics.checkNotNullParameter(alertsDto2, "alertsDto");
                return wpk.a.a(alertsDto2);
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "RATE_ALERT_LIST";
            case 9:
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Unit.f186387a;
            case 10:
                wq1.i updateState = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return new wq1.i(wq1.h.NOTICE, new wq1.g(0));
            case 11:
                wq1.i updateState2 = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return new wq1.i(wq1.h.VEHICLE, new wq1.g(0));
            case 12:
                wq1.i updateState3 = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return wq1.i.a(updateState3, wq1.g.a(updateState3.f299390b, null, null, mq1.a.CAR, null, 11));
            case 13:
                wq1.i updateState4 = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return wq1.i.a(updateState4, wq1.g.a(updateState4.f299390b, null, null, mq1.a.MOTORCYCLE, null, 11));
            case 14:
                wq1.i updateState5 = (wq1.i) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return wq1.i.a(updateState5, wq1.g.a(updateState5.f299390b, null, null, mq1.a.TRAILER, null, 11));
            case 15:
                wr1.g it12 = (wr1.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Pair(it12.f299486a, it12.f.f282231b.f163145a);
            case 16:
                wr1.g it13 = (wr1.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                io3.d dVar = it13.f.f282231b;
                ApmQuote apmQuote = it13.f299489g;
                if (apmQuote != null && (apmQuoteRate = apmQuote.f62209a) != null) {
                    objValueOf = Double.valueOf(apmQuoteRate.f62228a);
                }
                return new Pair(dVar, objValueOf);
            case 17:
                io3.d.Companion.getClass();
                return io3.d.f163144x;
            case 18:
                Optional it14 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (del.a) gj7.b.m(it14);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.v.k(new s7("AVAILABLE_CELL_DETAILS_LOADING_ID", 0, 0, 0, 0, false, null, 126), new s7("NOT_AVAILABLE_CELL_DETAILS_LOADING_ID", 0, 0, 0, 0, false, null, 126));
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.g(m6.a(), m6.a(), (Clause) null, (aw0.f) null, 25);
            case 21:
                wrd.a update = (wrd.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wrd.a.a(update, null, !update.f299551c, 3);
            case 22:
                k71.q it15 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zi0.c.P(it15, false, null, 3);
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                k71.q.Companion.getClass();
                return new Data(k71.p.a(), null, false, 6, null);
            case 24:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                return new wrj.h((List) kVar.f288454a, (ie3.a) kVar.f288455b, (List) kVar.f288456c, (Map) kVar.d, (k71.q) kVar.e);
            case 25:
                Map it16 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zi0.c.P(it16, false, null, 3);
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new wrj.g((List) getDefaultLoadingItems.invoke(), wrj.e.f299596a);
            case 27:
                rzj.k it17 = (rzj.k) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f258697a;
            case 28:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                if (items.size() <= 1) {
                    if (items.size() == 1) {
                        return (amd.j) zhm.d0.K0(items);
                    }
                    return null;
                }
                amd.b bVar = amd.b.LINKED_COMBINED;
                List list = items;
                ArrayList arrayList = new ArrayList();
                Iterator it18 = list.iterator();
                while (it18.hasNext()) {
                    zhm.a0.x(((amd.j) it18.next()).f6333b, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it19 = list.iterator();
                while (it19.hasNext()) {
                    zhm.a0.x(((amd.j) it19.next()).f6334c, arrayList2);
                }
                return new amd.j(bVar, arrayList, arrayList2, false, null, 24);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                do3.n nVar = (do3.n) pair.f186385a;
                List list2 = (List) ((Map) pair.f186386b).get(fo3.d.PERSONAL);
                if (list2 == null) {
                    throw new IllegalStateException("Wallets with WalletIdentityType.PERSONAL not found");
                }
                Iterator it20 = list2.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Object next = it20.next();
                        if (Intrinsics.f(((fo3.c) ((Pair) next).f186385a).f136805h, nVar.f116408a)) {
                            objValueOf = next;
                        }
                    }
                }
                Pair pair2 = (Pair) objValueOf;
                if (pair2 != null) {
                    return pair2;
                }
                throw new IllegalStateException(a10.b.s("Wallet with ownerId=", nVar.f116408a, " not found"));
        }
    }
}
