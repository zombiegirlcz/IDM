package xub;

import android.view.animation.Animation;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$FlowState;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$Step;
import com.revolut.feature.transport.impl.ui.help.contact.TransportHelpContactScreen;
import com.revolut.retail.feature.api.trips.models.Trip;
import ip0.s7;
import ip0.t1;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jq9.r;
import k4l.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import oq9.c0;
import tof.a3;
import vf0.k;
import xv4.m;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.a1;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309003a;

    public /* synthetic */ e(int i) {
        this.f309003a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        ArrayList arrayList = null;
        switch (this.f309003a) {
            case 0:
                RevPointsBuyingFlowContract$FlowState update = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update, RevPointsBuyingFlowContract$Step.Info.f83560a, false, null, 6);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(1);
            case 2:
                Animation it8 = (Animation) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Unit.f186387a;
            case 3:
                Animation it9 = (Animation) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Unit.f186387a;
            case 4:
                Animation it10 = (Animation) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Unit.f186387a;
            case 5:
                return xv4.f.a((xv4.f) obj2, new Data(null, null, true, 3, null), false, false, 14);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    arrayList2.add(new s7(a0.d.n("id_statement_details_cell_loading_", it11.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                IntRange intRange2 = new IntRange(4, 5, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange2, 10));
                vim.f it12 = intRange2.iterator();
                while (it12.f289625c) {
                    arrayList3.add(new s7(a0.d.n("id_statement_details_cell_loading_", it12.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return new m(null, u.a(eVarB), true);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar = (od0.i) pair.f186385a;
                Data data = (Data) pair.f186386b;
                xi0.b bVar = (xi0.b) data.getContent();
                if (iVar.d() && bVar != null) {
                    xi0.b bVar2 = (xi0.b) iVar.c();
                    xi0.b.Companion.getClass();
                    if (bVar2.equals(xi0.b.i) || bVar2.equals(bVar)) {
                        return zi0.c.P(iVar.c(), false, null, 3);
                    }
                }
                xi0.b.Companion.getClass();
                return Intrinsics.f(bVar, xi0.b.O) ? Data.copy$default(data, xi0.b.i, null, false, 6, null) : data;
            case 8:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                Iterable iterable = config.P0;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList4 = new ArrayList(w.t(iterable2, 10));
                Iterator it13 = iterable2.iterator();
                while (it13.hasNext()) {
                    arrayList4.add(((e7l.h) it13.next()).f123408a.f306286a);
                }
                return a1.l(linkedHashSet, arrayList4);
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Data data2 = (Data) pair2.f186385a;
                Set set = (Set) pair2.f186386b;
                List list = (List) data2.getContent();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (set.contains(((uv5.i) obj3).f283321a.f306286a)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return Data.copy$default(data2, arrayList, null, false, 6, null);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new xvc.m(iii.c.c(5), f0.f322471a);
            case 11:
                RowDelegate.Model it14 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransportHelpContactScreen.U;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj4 = it14.u;
                if (obj4 instanceof xvf.e) {
                    return (xvf.e) obj4;
                }
                return null;
            case 12:
                CellDetailsActionDelegate.Model it15 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TransportHelpContactScreen.U;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj5 = it15.f51787l;
                if (obj5 instanceof xvf.e) {
                    return (xvf.e) obj5;
                }
                return null;
            case 13:
                CellDetailsDelegate.Model it16 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TransportHelpContactScreen.U;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj6 = it16.o;
                if (obj6 instanceof xvf.e) {
                    return (xvf.e) obj6;
                }
                return null;
            case 14:
                xvf.f it17 = (xvf.f) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (axf.a) it17.f309249a.getContent();
            case 15:
                Function0 loadingItemsGenerator = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItemsGenerator, "loadingItemsGenerator");
                return (List) loadingItemsGenerator.invoke();
            case 16:
                return Float.valueOf(((xvi.e) obj2).f309279a);
            case 17:
                List trips = (List) obj2;
                Intrinsics.checkNotNullParameter(trips, "trips");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : trips) {
                    Trip trip = (Trip) obj7;
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = trip.getCurrency();
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = o.a(th10);
                    }
                    if (!(objA instanceof n)) {
                        arrayList5.add(obj7);
                    }
                    break;
                }
                return arrayList5;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 19:
                j it18 = (j) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new sdf.d(it18);
            case 20:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                aim.e eVarB2 = u.b();
                for (int i = 0; i < 6; i++) {
                    t1 t1Var = new t1(a0.d.n("SECTION_GRID_BOX_ID", i), null, 6);
                    yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                    eVarB2.add(t1Var);
                }
                xk xkVar = new xk("SECTION_GRID_BOX_ID", u.a(eVarB2), 3, null, null, 56);
                int i2 = R$attr.uikit_dp0;
                yp0.b.p(xkVar, i2, i2, i2, i2);
                List listC = u.c(xkVar);
                lw0.a aVarA = xwb.h.a();
                n6.Companion.getClass();
                return new cii.b(new aw0.e(false, null, null, m6.a(), null, null, 55), listC, aVarA);
            case 21:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM iris_contacts");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 22:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 23:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return Boolean.valueOf(((Boolean) pair3.f186385a).booleanValue() && !d0.W((String) pair3.f186386b));
            case 24:
                uj3.a it20 = (uj3.a) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(uj3.b.q(it20));
            case 25:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return f0.f322471a;
            case 26:
                k kVar = (k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                List list2 = (List) kVar.f288454a;
                List list3 = (List) kVar.f288455b;
                List list4 = (List) kVar.f288456c;
                List list5 = (List) kVar.d;
                mq9.e eVar = (mq9.e) kVar.e;
                List list6 = list4;
                int iB = q0.b(w.t(list6, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj8 : list6) {
                    linkedHashMap.put(((a3) obj8).f272579a, obj8);
                }
                List list7 = list2;
                int iB2 = q0.b(w.t(list7, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj9 : list7) {
                    linkedHashMap2.put(((MoneyRequest) obj9).f60314a, obj9);
                }
                List list8 = list3;
                int iB3 = q0.b(w.t(list8, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3);
                for (Object obj10 : list8) {
                    linkedHashMap3.put(((TransferLinkDetails.Active) obj10).f60354b, obj10);
                }
                List list9 = list5;
                int iB4 = q0.b(w.t(list9, 10));
                if (iB4 < 16) {
                    iB4 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB4);
                for (Object obj11 : list9) {
                    linkedHashMap4.put(((MessageItem) obj11).f79531a, obj11);
                }
                List list10 = eVar.f207901a;
                int iB5 = q0.b(w.t(list10, 10));
                if (iB5 < 16) {
                    iB5 = 16;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iB5);
                for (Object obj12 : list10) {
                    linkedHashMap5.put(((oq9.i) obj12).getId(), obj12);
                }
                List list11 = eVar.f207902b;
                int iB6 = q0.b(w.t(list11, 10));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(iB6 >= 16 ? iB6 : 16);
                for (Object obj13 : list11) {
                    linkedHashMap6.put(((c0) obj13).getId(), obj13);
                }
                return new xx9.g(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6);
            case 27:
                Map profileMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(profileMap, "profileMap");
                ArrayList arrayList6 = new ArrayList(profileMap.size());
                Iterator it22 = profileMap.entrySet().iterator();
                while (it22.hasNext()) {
                    arrayList6.add((JuniorBankingProfile) ((Map.Entry) it22.next()).getValue());
                }
                return zhm.d0.i1(arrayList6);
            case 28:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                List list12 = it23;
                ArrayList cryptoRecipients = new ArrayList();
                for (Object obj14 : list12) {
                    if (obj14 instanceof r) {
                        cryptoRecipients.add(obj14);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj15 : list12) {
                    if (!(((jq9.k) obj15) instanceof r)) {
                        arrayList7.add(obj15);
                    }
                }
                Intrinsics.checkNotNullParameter(cryptoRecipients, "cryptoRecipients");
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                for (Object obj16 : cryptoRecipients) {
                    r rVar = (r) obj16;
                    String strName = wk5.m.a(rVar.f177518b.f71063h).name();
                    CryptoAddress cryptoAddress = rVar.f177518b;
                    yhm.r rVar2 = new yhm.r(cryptoAddress.f71061c, strName, com.revolut.feature.crypto.withdraw.api.models.b.a(cryptoAddress));
                    Object arrayList8 = linkedHashMap7.get(rVar2);
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap7.put(rVar2, arrayList8);
                    }
                    ((List) arrayList8).add(obj16);
                }
                ArrayList arrayList9 = new ArrayList(linkedHashMap7.size());
                Iterator it24 = linkedHashMap7.entrySet().iterator();
                while (it24.hasNext()) {
                    List list13 = (List) ((Map.Entry) it24.next()).getValue();
                    r rVar3 = (r) zhm.d0.P0(list13, new xx9.a()).get(0);
                    CryptoAddress cryptoAddress2 = rVar3.f177518b;
                    ArrayList arrayList10 = new ArrayList(w.t(list13, 10));
                    Iterator it25 = list13.iterator();
                    while (it25.hasNext()) {
                        arrayList10.add(((r) it25.next()).f177518b.f71059a);
                    }
                    CryptoAddress cryptoAddress3 = CryptoAddress.a(cryptoAddress2, zhm.d0.i1(arrayList10));
                    jq9.b paymentItem = rVar3.f177519c;
                    int i3 = rVar3.d;
                    Intrinsics.checkNotNullParameter(cryptoAddress3, "cryptoAddress");
                    Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
                    arrayList9.add(new r(cryptoAddress3, paymentItem, i3));
                }
                return zhm.d0.P0(zhm.d0.E0(arrayList9, arrayList7), new xx9.k());
            default:
                List it26 = (List) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return new Data(it26, null, false, 6, null);
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f309003a = i;
    }
}
