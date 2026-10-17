package dv5;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.exchange.models.ExchangeOrder;
import du7.e2;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import pt5.j;
import pt5.v;
import pt5.w;
import tof.a3;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements pt5.f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f118036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd9.e f118037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f118038c;

    public f(whf.n transactionsListMapper, yd9.e ordersMapper) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        this.f118036a = transactionsListMapper;
        this.f118037b = ordersMapper;
        this.f118038c = yhm.j.b(new e2(29));
    }

    public static List c(String str) {
        List listC = u.c(new FullScreenStateDelegate.Model("LIST_ID_EMPTY_RESULT", new TextLocalisedClause(R$string.crypto_investments_search_no_result_text, null, null, 14), new TextLocalisedClause(R$string.crypto_investments_search_no_result_description, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.crypto_investments_search_no_result_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, pt5.e.f239616a, null, null, 1728));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public static ListSubheaderDelegate.Model d(boolean z) {
        return new ListSubheaderDelegate.Model("LIST_ID_ORDERS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_investments_orders_title, null, null, 14), (Image) null, (Clause) (z ? new TextLocalisedClause(R$string.crypto_home_widget_orders_subheader_action_see_all, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, z, 3), false, false, (Object) j.a.f239620a, (Parcelable) null, 0, 0, 0, 0, 64426);
    }

    public static ListSubheaderDelegate.Model f(Clause clause) {
        return new ListSubheaderDelegate.Model("LIST_ID_ORDERS_HEADER", (Image) null, clause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, false, 3), false, false, (Object) j.a.f239620a, (Parcelable) null, 0, 0, 0, 0, 64426);
    }

    public static ListSubheaderDelegate.Model g(boolean z) {
        return new ListSubheaderDelegate.Model("LIST_ID_TRANSACTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_investments_transactions_title, null, null, 14), (Image) null, (Clause) (z ? new TextLocalisedClause(R$string.crypto_home_widget_transactions_subheader_action_see_all, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, z, 3), false, false, (Object) j.a.f239620a, (Parcelable) null, 0, 0, 0, 0, 64426);
    }

    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.AnimationRequest, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static qv0.i h(qv0.i iVar) {
        ?? r2;
        if (!(iVar instanceof wh)) {
            return iVar;
        }
        wh whVar = (wh) iVar;
        qv0.i iVar2 = whVar.f54925b;
        if (!(iVar2 instanceof RowDelegate.Model)) {
            return whVar;
        }
        RowDelegate.Model modelX = (RowDelegate.Model) iVar2;
        Object obj2 = modelX.u;
        if (obj2 instanceof a3) {
            a3 a3Var = (a3) obj2;
            if (k71.k.v(a3Var)) {
                String str = a3Var.f272592g1;
                if (str != null) {
                    pt5.i iVar3 = new pt5.i(str);
                    r2 = 0;
                    modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, iVar3, 0, 0, 0, 0, null, -4194305, 15);
                } else {
                    r2 = 0;
                    IllegalStateException illegalStateException = new IllegalStateException("RevX order transaction has no group key");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, new pt5.k(a3Var), 0, 0, 0, 0, null, -4194305, 15);
                }
            } else {
                r2 = 0;
                modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, new pt5.k(a3Var), 0, 0, 0, 0, null, -4194305, 15);
            }
        } else {
            Object obj3 = null;
            if (obj2 instanceof ExchangeOrder) {
                modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, new pt5.g((ExchangeOrder) obj2), 0, 0, 0, 0, null, -4194305, 15);
                r2 = obj3;
            } else {
                r2 = obj3;
                if (obj2 instanceof qua.p) {
                    modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, new pt5.h((qua.p) obj2), 0, 0, 0, 0, null, -4194305, 15);
                    r2 = obj3;
                }
            }
        }
        return wh.a(whVar, modelX, r2, r2, 16381);
    }

    public final List e(String searchQuery, List orders, boolean z) {
        Iterable iterableA;
        qv0.i iVarC;
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        if (orders.isEmpty()) {
            if (!d0.W(searchQuery)) {
                return c(searchQuery);
            }
            List listC = u.c(new FullScreenStateDelegate.Model("LIST_ID_EMPTY_ORDERS", new TextLocalisedClause(R$string.crypto_investments_no_orders_placeholder, null, null, 14), new TextLocalisedClause(R$string.crypto_investments_no_orders_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D285", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        yd9.e eVar = this.f118037b;
        if (z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : orders) {
                w wVar = (w) obj2;
                if (!(wVar instanceof pt5.u)) {
                    if (!(wVar instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i = e.f118035a[((v) wVar).f239626a.f249316b.ordinal()];
                    if (i != 1 && i != 2) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList.add(obj2);
            }
            ArrayList<w> arrayListE0 = zhm.d0.E0(arrayList2, arrayList);
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListE0, 10));
            for (w wVar2 : arrayListE0) {
                if (wVar2 instanceof pt5.u) {
                    iVarC = eVar.a(((pt5.u) wVar2).f239625a);
                } else {
                    if (!(wVar2 instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVarC = eVar.c(((v) wVar2).f239626a);
                }
                arrayList3.add(iVarC);
            }
            iterableA = arrayList3;
        } else {
            aim.e eVarB = u.b();
            List list = orders;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof v) {
                    arrayList4.add(obj3);
                }
            }
            if (!arrayList4.isEmpty()) {
                eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_RECURRING_BUYS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_investments_recurring_buy_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(eVar.c(((v) it8.next()).f239626a));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof pt5.u) {
                    arrayList6.add(obj4);
                }
            }
            if (!arrayList6.isEmpty()) {
                eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_EXCHANGE_ORDERS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_investments_other_orders, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    arrayList7.add(eVar.a(((pt5.u) it9.next()).f239625a));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList7);
            }
            iterableA = u.a(eVarB);
        }
        ArrayList arrayList8 = new ArrayList(zhm.w.t(iterableA, 10));
        Iterator it10 = iterableA.iterator();
        while (it10.hasNext()) {
            arrayList8.add(h((qv0.i) it10.next()));
        }
        if (!z) {
            return arrayList8;
        }
        List listV0 = zhm.d0.V0(arrayList8, 3);
        yp0.b.k(listV0, 0, 0, 0, 0, 31);
        return listV0;
    }
}
