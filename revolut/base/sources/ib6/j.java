package ib6;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.content.NavDestination;
import androidx.content.internal.NavGraphImpl;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import com.revolut.feature.insurance_car.impl.data.model.PlanOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import d3c.p;
import d3c.x;
import dej.e3;
import dej.p0;
import dfl.i0;
import hfg.m0;
import hfg.n0;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.o1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import p4c.s;
import tof.a3;
import yhm.m;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160100b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f160099a = i;
        this.f160100b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [d3c.x] */
    /* JADX WARN: Type inference failed for: r8v9, types: [d3c.x] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p pVar;
        Set setI1;
        Data institutionInfoData;
        int i = this.f160099a;
        ?? r72 = 0;
        Object obj3 = null;
        r72 = 0;
        Object obj4 = this.f160100b;
        switch (i) {
            case 0:
                c update = (c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new c(update.f160092a, ((Number) obj4).floatValue());
            case 1:
                ip7.f updateState = (ip7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ip7.f.a(updateState, null, gc0.c.A(updateState.f167668c, obj4), 11);
            case 2:
                ip7.f updateState2 = (ip7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                boolean z = false;
                Object obj5 = null;
                for (Object obj6 : ((o1) zi0.c.I(updateState2.f167667b)).f185369b) {
                    if (((PlanOption) obj6).d.contains(obj4)) {
                        if (z) {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        z = true;
                        obj5 = obj6;
                    }
                }
                if (z) {
                    return ip7.f.a(updateState2, null, a1.m(a1.k(updateState2.f167668c, d0.i1(((PlanOption) obj5).d)), obj4), 11);
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                iqg.g update2 = (iqg.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = update2.f167838a;
                Intrinsics.checkNotNullParameter(data, "data");
                return new iqg.g(data, (Integer) obj4);
            case 4:
                ith.f update3 = (ith.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                List sections = update3.f168386b;
                Intrinsics.checkNotNullParameter(sections, "sections");
                return new ith.f((DocumentGroup) obj4, sections);
            case 5:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a update4 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                LinkedHashMap linkedHashMapZ = r0.z(update4.d);
                String str = ((FreelancerInvoiceItemPayload) obj4).f73393a;
                a.c cVar = (a.c) linkedHashMapZ.get(str);
                linkedHashMapZ.put(str, cVar != null ? a.c.a(cVar, !cVar.f73845a, null, null, null, 14) : new a.c((String) r72, (String) r72, (String) r72, 14));
                Unit unit = Unit.f186387a;
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(update4, null, null, null, linkedHashMapZ, null, null, LDSFile.EF_SOD_TAG);
            case 6:
                return LazyListIntervalContent.item$lambda$0(obj4, ((Integer) obj2).intValue());
            case 7:
                return LazyListIntervalContent.item$lambda$1(obj4, ((Integer) obj2).intValue());
            case 8:
                khj.c update5 = (khj.c) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                String selectedOptionId = ((khj.i) obj4).getId();
                List options = update5.f184146a;
                Intrinsics.checkNotNullParameter(options, "options");
                Intrinsics.checkNotNullParameter(selectedOptionId, "selectedOptionId");
                return new khj.c(options, selectedOptionId);
            case 9:
                lij.c update6 = (lij.c) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                String selectedPlanId = ((EsimDataPlan) obj4).f100212a;
                List plans = update6.f195532a;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
                return new lij.c(plans, selectedPlanId);
            case 10:
                mth.i update7 = (mth.i) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return mth.i.a(update7, null, null, (DocumentGroup) obj4, 3);
            case 11:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update8 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                n0 n0Var = (n0) obj4;
                m0 m0Var = n0Var.f151872g;
                TravelMilesSearchLocation.City city = new TravelMilesSearchLocation.City(m0Var.f151866a, m0Var.f151867b);
                m0 m0Var2 = n0Var.f151873h;
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update8, city, new TravelMilesSearchLocation.City(m0Var2.f151866a, m0Var2.f151867b), null, null, null, null, null, null, false, null, null, false, null, 8188);
            case 12:
                nnj.k update9 = (nnj.k) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return nnj.k.a(update9, null, new nnj.h((e3) obj4), null, null, null, null, 61);
            case 13:
                nnj.k update10 = (nnj.k) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return nnj.k.a(update10, null, new nnj.i((p0) obj4), null, null, null, null, 61);
            case 14:
                Intrinsics.checkNotNullParameter((i0) obj2, "it");
                return obj4;
            case 15:
                p2c.i update11 = (p2c.i) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return p2c.i.a(update11, 0, new p2c.k(((Number) obj4).intValue()), null, null, null, 61);
            case 16:
                p4c.k update12 = (p4c.k) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                od0.i iVar = (od0.i) update12.d.getContent();
                if (iVar != null && (pVar = (p) iVar.f224257a) != null) {
                    Iterator it8 = pVar.f.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (Intrinsics.f(((x) next).f111071a, ((s) obj4).f232891a)) {
                                obj3 = next;
                            }
                        }
                    }
                    r72 = (x) obj3;
                }
                if (r72 == 0) {
                    r72 = update12.e;
                }
                return p4c.k.a(update12, 0L, null, null, null, r72, null, null, null, 239);
            case 17:
                return pj3.f.a((pj3.f) obj2, null, new yhm.m(obj4), null, 5);
            case 18:
                Boolean it9 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9, obj4);
            case 19:
                rgf.f update13 = (rgf.f) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return rgf.f.a(update13, null, null, null, gc0.c.A(update13.d, obj4), null, null, null, null, null, 759);
            case 20:
                rgf.f update14 = (rgf.f) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return rgf.f.a(update14, null, null, null, null, null, gc0.c.A(update14.f, obj4), null, null, null, 991);
            case 21:
                s47.j update15 = (s47.j) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                LocalDate dateGroup = (LocalDate) obj4;
                update15.getClass();
                Intrinsics.checkNotNullParameter(dateGroup, "dateGroup");
                List list = (List) update15.f.get(dateGroup);
                if (list == null || (setI1 = d0.i1(list)) == null) {
                    return update15;
                }
                Set setH1 = d0.h1(update15.d);
                Set set = setI1;
                if (setH1.containsAll(set)) {
                    setH1.removeAll(set);
                } else {
                    setH1.addAll(set);
                }
                return s47.j.a(update15, null, null, setH1, 23);
            case 22:
                s47.j update16 = (s47.j) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                a3 transaction = (a3) obj4;
                update16.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Set setH12 = d0.h1(update16.d);
                if (!setH12.remove(transaction)) {
                    setH12.add(transaction);
                }
                return s47.j.a(update16, null, null, setH12, 23);
            case 23:
                return NavGraphImpl.setStartDestination$lambda$14(obj4, (NavDestination) obj2);
            case 24:
                s6d.j update17 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                Data data2 = update17.f260240a;
                k6d.h hVar = (k6d.h) data2.getContent();
                return s6d.j.a(update17, Data.copy$default(data2, hVar != null ? k6d.h.a(hVar, null, !((Boolean) obj4).booleanValue(), false, false, false, null, null, 503) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 25:
                s6d.j update18 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update18, "$this$update");
                Data data3 = update18.f260240a;
                k6d.h hVar2 = (k6d.h) data3.getContent();
                return s6d.j.a(update18, Data.copy$default(data3, hVar2 != null ? k6d.h.a(hVar2, obj4 instanceof String ? (String) obj4 : null, false, false, false, false, null, null, 509) : null, null, false, 6, null), false, null, null, null, null, 121);
            case 26:
                s6d.j update19 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update19, "$this$update");
                Data data4 = update19.f260240a;
                k6d.h hVar3 = (k6d.h) data4.getContent();
                return s6d.j.a(update19, Data.copy$default(data4, hVar3 != null ? k6d.h.a(hVar3, null, false, !((Boolean) obj4).booleanValue(), false, false, null, null, 495) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 27:
                s6d.j update20 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update20, "$this$update");
                Data data5 = update20.f260240a;
                k6d.h hVar4 = (k6d.h) data5.getContent();
                return s6d.j.a(update20, Data.copy$default(data5, hVar4 != null ? k6d.h.a(hVar4, null, false, false, !((Boolean) obj4).booleanValue(), false, null, null, 479) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 28:
                s6d.j update21 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update21, "$this$update");
                Data data6 = update21.f260240a;
                k6d.h hVar5 = (k6d.h) data6.getContent();
                return s6d.j.a(update21, Data.copy$default(data6, hVar5 != null ? k6d.h.a(hVar5, null, false, false, false, !((Boolean) obj4).booleanValue(), null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            default:
                sj6.c cVar2 = (sj6.c) obj2;
                m.Companion companion = yhm.m.INSTANCE;
                boolean z3 = obj4 instanceof yhm.n;
                if (z3) {
                    Throwable thA = yhm.m.a(obj4);
                    if (thA != null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                    }
                    institutionInfoData = new Data(null, thA, false, 5, null);
                } else {
                    institutionInfoData = new Data(z3 ? null : obj4, null, false, 6, null);
                }
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(institutionInfoData, "institutionInfoData");
                return new sj6.c(institutionInfoData);
        }
    }
}
