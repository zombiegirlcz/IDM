package rsl;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.w2;
import jsl.g0;
import jsl.y;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257124a;

    public /* synthetic */ c(int i) {
        this.f257124a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f257124a;
        jsl.n nVar = jsl.n.f178225a;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Optional.empty();
            case 1:
                jel.c it8 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof w2) {
                    return (w2) it8;
                }
                return null;
            case 2:
                y it9 = (y) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f;
            case 3:
                return ((Boolean) obj2).booleanValue() ? jsl.l.f178221a : nVar;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return nVar;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return jsl.m.f178223a;
            case 6:
                y it10 = (y) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f178254a;
            case 7:
                InvestOrder it11 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(com.revolut.retail.trading.core.domain.orders.a.l(it11));
            case 8:
                InvestOrder it12 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return tsl.g.b(it12);
            case 9:
                tsl.f it13 = (tsl.f) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (it13 instanceof tsl.d) {
                    return (tsl.d) it13;
                }
                return null;
            case 10:
                tsl.d it14 = (tsl.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return com.revolut.retail.trading.core.domain.orders.a.j(it14.f274174a);
            case 11:
                ChargeBreakdown it15 = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Optional.of(it15);
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return g0.f178213a;
            case 14:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 15:
                nel.n it16 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it16);
            case 16:
                nel.n it17 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new rtl.i(it17.i);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 19:
                nel.n it18 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.i;
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                List<io3.g> list3 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (io3.g gVar : list3) {
                    xi0.a aVar = xi0.b.Companion;
                    String str = gVar.f163163a.f163147c;
                    aVar.getClass();
                    arrayList2.add(new rtl.f(xi0.a.a(str), gVar));
                }
                List list4 = list2;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                Iterator it19 = list4.iterator();
                while (it19.hasNext()) {
                    arrayList3.add(new rtl.f((xi0.b) it19.next(), null));
                }
                return d0.E0(arrayList3, arrayList2);
            case 21:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List<io3.d> list5 = pockets;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                for (io3.d dVar : list5) {
                    xi0.a aVar2 = xi0.b.Companion;
                    String str2 = dVar.f163147c;
                    aVar2.getClass();
                    arrayList4.add(new Pair(dVar, xi0.a.a(str2)));
                }
                return arrayList4;
            case 22:
                vh it20 = (vh) obj2;
                ActivityScreen.Companion aVar3 = ActivityScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f54883a;
            case 23:
                ru5.j updateState = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ru5.j.a(updateState, null, null, null, null, null, null, null, null, false, null, null, 3839);
            case 24:
                ru5.j updateState2 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                List list6 = updateState2.f257420h;
                if (list6 != null) {
                    List list7 = list6;
                    arrayList = new ArrayList(w.t(list7, 10));
                    Iterator it21 = list7.iterator();
                    while (it21.hasNext()) {
                        arrayList.add(((CryptoTransactionFilter) it21.next()).c());
                    }
                }
                return ru5.j.a(updateState2, null, null, null, null, null, null, null, arrayList, false, null, null, 3967);
            case 25:
                ru5.j updateState3 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return ru5.j.a(updateState3, null, null, updateState3.f257417b, null, null, updateState3.d, null, null, false, null, null, 4059);
            case 26:
                ru5.j updateState4 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                m70.a.c(t0.f186434a);
                return ru5.j.a(updateState4, null, null, null, null, null, null, "", null, false, null, null, 4031);
            case 27:
                ru5.j updateState5 = (ru5.j) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return ru5.j.a(updateState5, null, null, null, null, null, null, null, null, true, null, null, 3839);
            case 28:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
        }
    }
}
