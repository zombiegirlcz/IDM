package mh4;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a;
import com.youTransactor.uCube.rpc.Constants;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import khg.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mhb.a;
import mif.e0;
import org.jmrtd.lds.LDSFile;
import tof.a3;
import tof.t3;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205410a;

    public /* synthetic */ x(int i) {
        this.f205410a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Boolean boolValueOf = null;
        switch (this.f205410a) {
            case 0:
                return k.a((k) obj2, null, null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 1:
                mhb.a update = (mhb.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ArrayList contactForms = d0.F0(new a.C1165a(0), update.f205470a);
                Intrinsics.checkNotNullParameter(contactForms, "contactForms");
                return new mhb.a(contactForms);
            case 2:
                KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return a.b.f86977a;
            case 3:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f53228a, "LIST_ID_ADD_TO_WATCHLIST"));
            case 4:
                KProperty[] kPropertyArr3 = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter((RowDelegate.Model) obj2, "it");
                return a.C0546a.f86976a;
            case 5:
                FullScreenStateDelegate.Model it9 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f52373a, "LIST_ID_EMPTY_STATE") && (it9.k instanceof mhd.o));
            case 6:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return (List) defaultLoadingItems.invoke();
            case 7:
                mhd.n updateState = (mhd.n) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return mhd.n.a(updateState, null, null, null, null, null, false, null, LDSFile.EF_SOD_TAG);
            case 8:
                rfd.e it10 = (rfd.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f253760a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return j.a.f184127a;
            case 10:
                Data data = (Data) obj2;
                if (data.getContent() == null && data.getError() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT CASE\n                -- An empty table must not be treated as complete.\n                WHEN COUNT(*) > 0\n                    AND COUNT(*) = SUM(CASE WHEN value = 1 THEN 1 ELSE 0 END)\n                THEN 1\n                ELSE 0\n            END\n            FROM loading_state\n            WHERE id LIKE ? || '%'\n        ");
                try {
                    sQLiteStatementPrepare.bindText(1, "LOADING_COMPLETED_KEY");
                    if (sQLiteStatementPrepare.step()) {
                        Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                            break;
                        }
                    }
                    return boolValueOf;
                } finally {
                }
            case 12:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM search_indexes").step();
                    return Unit.f186387a;
                } finally {
                }
            case 13:
                tof.f it11 = (tof.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return j6.a.s("(", e0.c(it11.f272742a), ", ", e0.c(it11.f272743b), ")");
            case 14:
                String it12 = (String) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return "content_index:" + it12 + "*";
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 16:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(nb0.a(pb0.Companion, String.valueOf(i), false, 6));
                }
                return yp0.b.h(arrayListP, new gu("POPULAR_DESTINATIONS_TITLE_ID", 0, 0, 30), null, 0, 126);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = zhm.v.k(new s7("ID_LOADING_ITEM_1", 0, 0, 0, 0, false, null, 126), new s7("ID_LOADING_ITEM_2", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 18:
                List planLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(planLimits, "planLimits");
                return Boolean.valueOf(e0.l(planLimits) != null);
            case 19:
                l71.d userCompany = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                return Boolean.valueOf(l71.f.d(userCompany));
            case 20:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                return te0.w.S(user, wi0.b.O) ? "DOMESTIC_ATM_LIMITS" : "ATM_LIMITS";
            case 21:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return n14.e.A((List) pair.f186385a, (List) pair.f186386b);
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List<a3> list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                Map mapD = n14.e.d((List) rVar.f314203c);
                ArrayList arrayList = new ArrayList();
                for (a3 a3Var : list) {
                    Iterator it13 = list2.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            next = it13.next();
                            if (Intrinsics.f(a3Var.f272579a, ((t3) next).f273055a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    t3 t3Var = (t3) next;
                    j61.c cVar = t3Var != null ? new j61.c(n14.e.t(a3Var, mapD), t3Var) : null;
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                return arrayList;
            case 23:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                List list4 = (List) ((Data) pair2.f186386b).getContent();
                if (list4 == null) {
                    list4 = f0.f322471a;
                }
                return n14.e.A(list3, list4);
            case 24:
                StackTraceElement stackTraceElement = (StackTraceElement) obj2;
                return a0.d.s("at ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName());
            case 25:
                qk0.b it14 = (qk0.b) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f246928a;
            case 26:
                qk0.b it15 = (qk0.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f246928a;
            case 27:
                sk0.b it16 = (sk0.b) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f263747a;
            case 28:
                gk3.a it17 = (gk3.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.f144316a != gk3.c.UNKNOWN);
            default:
                gk3.a it18 = (gk3.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f144316a;
        }
    }

    public /* synthetic */ x(Object obj2, int i) {
        this.f205410a = i;
    }
}
