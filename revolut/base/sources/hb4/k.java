package hb4;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.DummyCommand;
import do3.q;
import hbf.p;
import ip0.og;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import m1c.r1;
import tof.a3;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150605a;

    public /* synthetic */ k(int i) {
        this.f150605a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        cd1.c cVar;
        boolean z = true;
        switch (this.f150605a) {
            case 0:
                ax4.b updateConstructorState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                return new ax4.b(0);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                m70.a.c(t0.f186434a);
                return new j(o.b(""), f0.f322471a);
            case 2:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(new s7(a0.d.n("ID_CELL_LOADING_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 3:
                hbf.i it8 = (hbf.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f150664a;
            case 4:
                hbf.i it9 = (hbf.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f150664a;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return p.f150674a;
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                whf.p pVar = (whf.p) pair.f186385a;
                List list = (List) pair.f186386b;
                aim.e eVarB = u.b();
                List list2 = pVar.f297646a;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList.add(new l9g.a((a3) it10.next()));
                }
                eVarB.addAll(arrayList);
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(new l9g.b((RevPointsTransaction) it11.next()));
                }
                eVarB.addAll(arrayList2);
                return new l9g.d(d0.P0(u.a(eVarB), new hbg.f0()), pVar.f297647b, pVar.f297648c);
            case 7:
                whf.p content = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                List list4 = content.f297646a;
                ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(new l9g.a((a3) it12.next()));
                }
                return new l9g.d(arrayList3, content.f297647b, content.f297648c);
            case 8:
                hbg.l update = (hbg.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return hbg.l.a(update, null, null, null, null, null, null, true, false, 383);
            case 9:
                hbg.l update2 = (hbg.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return hbg.l.a(update2, null, null, null, null, null, null, false, false, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 10:
                hbg.l update3 = (hbg.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return hbg.l.a(update3, null, null, null, null, null, null, false, false, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 11:
                List txData = (List) obj2;
                Intrinsics.checkNotNullParameter(txData, "txData");
                List list5 = txData;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                Iterator it13 = list5.iterator();
                while (it13.hasNext()) {
                    arrayList4.add(((r1) it13.next()).f201449a);
                }
                return arrayList4;
            case 12:
                return hbg.l.a((hbg.l) obj2, null, null, null, null, null, null, false, false, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 16:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "InvestTransactionsWidgetControllerModelExtension", "Failed to load trading transaction history", throwable, h0Var);
                return Boolean.TRUE;
            case 17:
                Throwable throwable2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "InvestTransactionsWidgetControllerModelExtension", "Failed to load trading transaction updates", throwable2, h0Var2);
                return Boolean.TRUE;
            case 18:
                WealthAccount it14 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.Q2());
            case 19:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list6 = accounts;
                if ((list6 instanceof Collection) && list6.isEmpty()) {
                    z = false;
                } else {
                    Iterator it15 = list6.iterator();
                    while (it15.hasNext()) {
                        if (((WealthAccount) it15.next()).Q2()) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                return Optional.of((h1h.g) obj2);
            case 21:
                Intrinsics.checkNotNullParameter((v9l.a) obj2, "it");
                return SelectableDelegate.b.C0424b.f53319a;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return DummyCommand.f98635a;
            case 23:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (wk5.a) d0.d0(it16);
            case 24:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List list7 = cards;
                ArrayList arrayList5 = new ArrayList(w.t(list7, 10));
                Iterator it17 = list7.iterator();
                while (it17.hasNext()) {
                    arrayList5.add(((h93.f0) it17.next()).f150110a);
                }
                return arrayList5;
            case 25:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (qta.c) d0.b0(it18);
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new ncj.c((ncj.b) pair2.f186385a, (qta.c) pair2.f186386b);
            case 27:
                Data it19 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                try {
                    Object content2 = it19.getContent();
                    if (content2 != null) {
                        r rVar = (r) content2;
                        cVar = new cd1.c((List) rVar.f314201a, (List) rVar.f314202b, (List) rVar.f314203c);
                    } else {
                        cVar = null;
                    }
                    return new Data(cVar, it19.getError(), it19.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, it19.getLoading());
                }
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                og ogVar = new og("CATALOGUE_EXPANDABLE_LOADING_LIST_ID");
                IntRange intRange = new IntRange(0, 4, 1);
                ArrayList arrayList6 = new ArrayList(w.t(intRange, 10));
                vim.f it20 = intRange.iterator();
                while (it20.f289625c) {
                    arrayList6.add(new pb0(a0.d.n("ROW_LOADING_ITEM_ID", it20.nextInt())));
                }
                return new he1.k(d0.E0(arrayList6, u.c(ogVar)), he1.n.f151525b);
            default:
                do3.n it21 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return q.x(it21);
        }
    }
}
