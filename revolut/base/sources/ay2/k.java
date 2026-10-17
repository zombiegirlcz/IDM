package ay2;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import aw0.k9;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.error.ErrorNotHandledException;
import ip0.pb0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.c1;
import m1c.d1;
import m1c.e1;
import o5l.v;
import t3e.b;
import tof.a3;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11043c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj2, boolean z, boolean z3, int i) {
        this.f11041a = i;
        this.d = obj2;
        this.f11042b = z;
        this.f11043c = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        ArrayList arrayList;
        switch (this.f11041a) {
            case 0:
                l lVar = (l) this.d;
                o5l.i it8 = (o5l.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                lVar.getClass();
                boolean z = this.f11042b;
                v vVarA = (z && this.f11043c) ? lVar.a(it8) : null;
                return (vVarA == null || (dVar = vVarA.f222484c) == null) ? lVar.c(it8, z) : dVar;
            case 1:
                f9b.f fVar = (f9b.f) this.d;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (!fVar.f132903b.b(error, null, null, this.f11042b, this.f11043c)) {
                    error = new ErrorNotHandledException(error);
                }
                return efm.r.error(error);
            case 2:
                hmc.o oVar = (hmc.o) this.d;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (this.f11042b) {
                    objA = this.f11043c ? oVar.a() : null;
                    pb0 pb0Var = new pb0("robo-template-loading-list-id");
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    Object[] elements = {objA, pb0Var};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    objA = kotlin.collections.d.L(elements);
                }
                return objA == null ? f0.f322471a : objA;
            case 3:
                jyk.r rVar = (jyk.r) this.d;
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                if (!this.f11042b || this.f11043c) {
                    command = com.revolut.retail.core.navigation.a.c(jyk.r.b(), command);
                }
                return ((wxk.g) rVar.f179500b).b(command);
            case 4:
                ArrayList arrayList2 = (ArrayList) this.d;
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                if (arrayList2.isEmpty()) {
                    List list = transactions;
                    ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(new c1((a3) it9.next()));
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        if (hashSet.add(((c1) obj3).f201357a)) {
                            arrayList4.add(obj3);
                        }
                    }
                    return d0.P0(arrayList4, new mdi.b());
                }
                if (transactions.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList2, 10));
                    Iterator it10 = arrayList2.iterator();
                    while (it10.hasNext()) {
                        arrayList5.add(new d1((RevPointsTransaction) it10.next()));
                    }
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : arrayList5) {
                        if (hashSet2.add(((d1) obj4).f201357a)) {
                            arrayList6.add(obj4);
                        }
                    }
                    return d0.P0(arrayList6, new mdi.c());
                }
                Iterator it11 = arrayList2.iterator();
                if (!it11.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it11.next();
                if (it11.hasNext()) {
                    long j2 = ((RevPointsTransaction) next).d;
                    do {
                        Object next2 = it11.next();
                        long j3 = ((RevPointsTransaction) next2).d;
                        if (j2 < j3) {
                            next = next2;
                            j2 = j3;
                        }
                    } while (it11.hasNext());
                }
                long j5 = ((RevPointsTransaction) next).d;
                Iterator it12 = arrayList2.iterator();
                if (!it12.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next3 = it12.next();
                if (it12.hasNext()) {
                    long j16 = ((RevPointsTransaction) next3).d;
                    do {
                        Object next4 = it12.next();
                        long j22 = ((RevPointsTransaction) next4).d;
                        if (j16 > j22) {
                            next3 = next4;
                            j16 = j22;
                        }
                    } while (it12.hasNext());
                }
                long j42 = ((RevPointsTransaction) next3).d;
                boolean z3 = this.f11042b;
                boolean z4 = this.f11043c;
                if (!z3 || !z4) {
                    if (z3) {
                        arrayList = new ArrayList();
                        for (Object obj5 : transactions) {
                            if (((a3) obj5).f272591g.getMillis() >= j42) {
                                arrayList.add(obj5);
                            }
                        }
                    } else if (z4) {
                        arrayList = new ArrayList();
                        for (Object obj6 : transactions) {
                            if (((a3) obj6).f272591g.getMillis() <= j5) {
                                arrayList.add(obj6);
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj7 : transactions) {
                            long millis = ((a3) obj7).f272591g.getMillis();
                            if (j42 <= millis && millis <= j5) {
                                arrayList.add(obj7);
                            }
                        }
                    }
                    transactions = arrayList;
                }
                List list2 = transactions;
                ArrayList arrayList7 = new ArrayList(w.t(list2, 10));
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    arrayList7.add(new c1((a3) it13.next()));
                }
                ArrayList arrayList8 = new ArrayList(w.t(arrayList2, 10));
                Iterator it14 = arrayList2.iterator();
                while (it14.hasNext()) {
                    arrayList8.add(new d1((RevPointsTransaction) it14.next()));
                }
                ArrayList arrayListE0 = d0.E0(arrayList8, arrayList7);
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj8 : arrayListE0) {
                    if (hashSet3.add(((e1) obj8).f201357a)) {
                        arrayList9.add(obj8);
                    }
                }
                return d0.P0(arrayList9, new mdi.d());
            case 5:
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.d;
                q2e.h hVar = (q2e.h) obj2;
                b.a aVar = hVar.f241589m;
                Boolean bool = cVar.L;
                Intrinsics.h(bool);
                return q2e.h.a(hVar, null, null, null, null, null, null, null, false, false, false, false, null, b.a.a(aVar, null, null, bool.booleanValue(), true, this.f11042b, this.f11043c, null, 67), null, null, 61439);
            case 6:
                k9 k9Var = (k9) this.d;
                Intrinsics.h(k9Var);
                return q4a.f.a((q4a.f) obj2, this.f11042b, this.f11043c, null, null, null, false, k9Var, null, OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP);
            case 7:
                String str = (String) this.d;
                ta8.i update = (ta8.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ta8.i.a(update, null, str.length() == 9 && !this.f11042b, this.f11043c, str, 1);
            default:
                return AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$0$0((OffsetProvider) this.d, this.f11042b, this.f11043c, (SemanticsPropertyReceiver) obj2);
        }
    }

    public /* synthetic */ k(boolean z, boolean z3, Object obj2, int i) {
        this.f11041a = i;
        this.f11042b = z;
        this.f11043c = z3;
        this.d = obj2;
    }
}
