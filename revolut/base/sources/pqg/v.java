package pqg;

import androidx.sqlite.SQLiteConnection;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.impl.mappers.settings.GroupSettingsAction;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import ip0.gu;
import ip0.pb0;
import ip0.xk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import orl.t0;
import psk.j;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238771a;

    public /* synthetic */ v(int i) {
        this.f238771a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        switch (this.f238771a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (List) pair.f186386b;
            case 1:
                SavingsProductData it8 = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 4:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                return Boolean.TRUE;
            case 5:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 6:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable2, h0Var2);
                return Unit.f186387a;
            case 7:
                orl.o oVar = (orl.o) obj2;
                Intrinsics.h(oVar);
                return mrl.d.f(oVar);
            case 8:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                return zhm.d0.P0(orders, new prl.g());
            case 9:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "data");
                if (!zi0.c.E(it9) || !pyd.c.G(it9)) {
                    qe0.o.Companion.getClass();
                    Intrinsics.checkNotNullParameter(it9, "it");
                } else if (((Collection) zi0.c.I(it9)).isEmpty()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                t0 it10 = (t0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                return Boolean.valueOf(it10.getCancellable());
            case 11:
                orl.j0 item = (orl.j0) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return mrl.f.b(item);
            case 12:
                orl.x it11 = (orl.x) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new k4l.a0(it11.getOrderId(), it11.getOrderCompoundId());
            case 13:
                orl.j0 item2 = (orl.j0) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                return mrl.f.b(item2);
            case 14:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                List list = (List) hVar.f288433a;
                qs9.b bVar = (qs9.b) hVar.f288434b;
                return new qs9.a((do3.n) hVar.f288435c, bVar.f248759a, bVar.f248760b, bVar.f248761c, list, (st9.f) hVar.d);
            case 15:
                qs9.c it12 = (qs9.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zhm.d0.P0(it12.f248762a, new ps9.b());
            case 16:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                List list3 = (List) pair2.f186386b;
                List list4 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                Iterator it13 = list4.iterator();
                while (it13.hasNext()) {
                    arrayList.add(new GroupTransactionItem.Bill((oq9.i) it13.next()));
                }
                List list5 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it14 = list5.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(new GroupTransactionItem.Settlement((oq9.c0) it14.next()));
                }
                return new qs9.c(zhm.d0.E0(arrayList2, arrayList));
            case 17:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = GroupChatSettingsScreen.f79374a0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj3 = it15.u;
                if (obj3 instanceof vr9.j) {
                    return (vr9.j) obj3;
                }
                return null;
            case 18:
                KProperty[] kPropertyArr2 = GroupChatSettingsScreen.f79374a0;
                Object obj4 = ((RowDelegate.Model) obj2).u;
                if (obj4 instanceof ur9.c) {
                    return (ur9.c) obj4;
                }
                return null;
            case 19:
                RowDelegate.Model it16 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = GroupChatSettingsScreen.f79374a0;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj5 = it16.u;
                if (obj5 instanceof GroupSettingsAction.SmartSettlementSetting) {
                    return (GroupSettingsAction.SmartSettlementSetting) obj5;
                }
                return null;
            case 20:
                KProperty[] kPropertyArr4 = GroupChatSettingsScreen.f79374a0;
                Object f = ((qv0.p) obj2).getF51698j();
                if (f instanceof GroupSettingsAction) {
                    return (GroupSettingsAction) f;
                }
                return null;
            case 21:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = GroupChatSettingsScreen.f79374a0;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj6 = it17.u;
                if (obj6 instanceof GroupTransactionItem) {
                    return (GroupTransactionItem) obj6;
                }
                return null;
            case 22:
                vh it18 = (vh) obj2;
                KProperty[] kPropertyArr6 = GroupChatSettingsScreen.f79374a0;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj7 = ((RowDelegate.Model) it18.f54884b).u;
                if (obj7 instanceof GroupTransactionItem.Bill) {
                    return (GroupTransactionItem.Bill) obj7;
                }
                return null;
            case 23:
                yoj.a it19 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                if (!hx7.i.v(it19.f315683b)) {
                    yoj.d dVar = it19.f315683b;
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    if (dVar != yoj.d.PENDING) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 24:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Pair pair4 = (Pair) pair3.f186385a;
                Pair pair5 = (Pair) pair3.f186386b;
                return new vf0.h(pair4.f186385a, pair4.f186386b, pair5.f186385a, pair5.f186386b);
            case 25:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List list6 = rates;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it20 = list6.iterator();
                while (it20.hasNext()) {
                    arrayList3.add(ofm.q.f0((qta.c) it20.next()));
                }
                return arrayList3;
            case 26:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM custom_assets").step();
                    return null;
                } finally {
                }
            case 27:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM field_definitions").step();
                    return null;
                } finally {
                }
            case 28:
                j.a aVar = psk.j.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar = new gu("ATTRS_WIDGET_LOADING_SUBHEADER", 0, 0, 30);
                int i = R$attr.uikit_dp0;
                IntRange intRangeO = kotlin.ranges.f.o(0, 4);
                ArrayList arrayList4 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it21 = intRangeO.iterator();
                while (it21.f289625c) {
                    arrayList4.add(new pb0(a0.d.n("ATTRS_WIDGET_LOADING_", it21.nextInt())));
                }
                return i2b.a.r(guVar, new xk("ATTRS_WIDGET_LOADING_GRID", arrayList4, 2, null, null, i, 0, 0, 0, 65400));
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
        }
    }

    public /* synthetic */ v(psk.j jVar) {
        this.f238771a = 28;
    }
}
