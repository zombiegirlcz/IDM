package px0;

import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import do3.n;
import h30.l;
import h93.f0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mq9.e;
import od0.i;
import org.joda.time.DateTime;
import pya.d;
import tof.a3;
import zhm.d0;
import zhm.v;
import zhm.w;
import zm3.p;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240551a;

    public /* synthetic */ a(int i) {
        this.f240551a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pya.b bVar;
        int i = this.f240551a;
        d dVar = d.f240712a;
        pya.c cVar = pya.c.f240710a;
        switch (i) {
            case 0:
                tq0.c it8 = (tq0.c) obj2;
                CalendarPickerRangeView.Companion companion = CalendarPickerRangeView.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f273449a.i instanceof DateTime);
            case 1:
                tq0.c it9 = (tq0.c) obj2;
                CalendarPickerRangeView.Companion companion2 = CalendarPickerRangeView.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.f273449a.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type org.joda.time.DateTime");
                return new Date(((DateTime) obj3).getMillis());
            case 2:
                DOBInputData it10 = (DOBInputData) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf((it10 instanceof DOBInputData.Empty) || (it10 instanceof DOBInputData.Filled));
            case 3:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                e.Companion.getClass();
                return new Data(e.e, it11, false, 4, null);
            case 4:
                n it12 = (n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f116414l;
            case 5:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                return d0.P0(items, new px9.b());
            case 6:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Data(null, it13, false, 5, null);
            case 7:
                n it14 = (n) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.f116414l != null);
            case 8:
                n it15 = (n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f116414l;
            case 9:
                PerformanceChartPoint it16 = (PerformanceChartPoint) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.d;
            case 10:
                PerformanceChartPoint it17 = (PerformanceChartPoint) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Float.valueOf(it17.f94996c);
            case 11:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(!it18.isEmpty());
            case 12:
                f0 card = (f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return Boolean.valueOf(!card.f150126y);
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186386b, (List) pair.f186385a);
            case 14:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it19 = list2.iterator();
                while (it19.hasNext()) {
                    arrayList.add(new ly9.d((zm3.a) it19.next()));
                }
                return arrayList;
            case 15:
                zm3.b contactGroups = (zm3.b) obj2;
                Intrinsics.checkNotNullParameter(contactGroups, "contactGroups");
                ArrayList arrayListE0 = d0.E0(contactGroups.d, contactGroups.f323334c);
                ArrayList arrayList2 = new ArrayList(w.t(arrayListE0, 10));
                Iterator it20 = arrayListE0.iterator();
                while (it20.hasNext()) {
                    arrayList2.add(new ly9.d((zm3.a) it20.next()));
                }
                return arrayList2;
            case 16:
                i vcOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(vcOptional, "vcOptional");
                p pVar = (p) vcOptional.g();
                return zi0.c.P(v.l(pVar != null ? new ly9.d(pVar) : null), false, null, 3);
            case 17:
                pya.e update = (pya.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return update instanceof pya.b ? pya.b.a((pya.b) update, null, null, null, null, false, 507) : update;
            case 18:
                pya.e update2 = (pya.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                bVar = update2 instanceof pya.b ? (pya.b) update2 : null;
                return bVar != null ? bVar : dVar;
            case 19:
                Intrinsics.checkNotNullParameter((pya.e) obj2, "$this$update");
                return cVar;
            case 20:
                Intrinsics.checkNotNullParameter((pya.e) obj2, "$this$update");
                return dVar;
            case 21:
                Intrinsics.checkNotNullParameter((pya.e) obj2, "$this$update");
                return cVar;
            case 22:
                pya.e update3 = (pya.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                bVar = update3 instanceof pya.b ? (pya.b) update3 : null;
                return bVar != null ? bVar : dVar;
            case 23:
                Intrinsics.checkNotNullParameter((pya.e) obj2, "$this$update");
                return cVar;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 25:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Boolean bool = (Boolean) pair2.f186385a;
                Boolean bool2 = (Boolean) pair2.f186386b;
                if (!bool.booleanValue() && !bool2.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                i it21 = (i) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return (DocumentType) it21.c();
            case 27:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Map map = (Map) pair3.f186385a;
                DocumentType documentType = (DocumentType) pair3.f186386b;
                Intrinsics.h(documentType);
                return (List) map.getOrDefault(documentType, zhm.f0.f322471a);
            case 28:
                List it22 = (List) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return (a3) d0.b0(it22);
            default:
                return l.q("documents", (i) obj2);
        }
    }
}
