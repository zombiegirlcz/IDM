package mqg;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.internal.views.MonthYearPickerView;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.data.model.Data;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.k;
import he3.j;
import he3.l;
import he3.s;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.u40;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import jv0.m;
import jv0.p;
import jv0.q;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lw0.h;
import lw0.i;
import ms0.d3;
import ms0.h3;
import ms0.k0;
import ms0.l0;
import ms0.y2;
import oq9.t;
import oq9.u;
import pcd.x;
import tof.i3;
import tof.l3;
import yhm.m;
import yhm.o;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207996a;

    public /* synthetic */ b(int i) {
        this.f207996a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Collection collection;
        Object objA;
        String strD;
        boolean z = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z = false;
        switch (this.f207996a) {
            case 0:
                npg.b it8 = (npg.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f218208b;
            case 1:
                SavingsProductData it9 = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ocd.a.e(it9) ? zbb.c.f320866b : zbb.b.f320865b;
            case 2:
                Intrinsics.checkNotNullParameter((c01.b) obj2, "it");
                return Unit.f186387a;
            case 3:
                x it10 = (x) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return uj3.b.l(it10);
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                h hVar = new h(i.TITLE_SUBTITLE);
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "credit-card-display-amount-loading-available", false, 0, true, 22), nb0.b(nb0Var, "credit-card-display-amount-loading-spent", false, 0, true, 22));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new cii.b(null, listK, hVar);
            case 5:
                cr9.b it11 = (cr9.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.getEligibility();
            case 6:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (!it12.getLoading() || ((collection = (Collection) it12.getContent()) != null && !collection.isEmpty())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                List reminders = (List) obj2;
                Intrinsics.checkNotNullParameter(reminders, "reminders");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : reminders) {
                    if (obj3 instanceof u) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 8:
                List reminders2 = (List) obj2;
                Intrinsics.checkNotNullParameter(reminders2, "reminders");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : reminders2) {
                    if (obj4 instanceof t) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 9:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new u40(a0.d.n("STEP_LOADING_ITEM_", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                ArrayList arrayList3 = new ArrayList(4);
                for (int i2 = 0; i2 < 4; i2++) {
                    arrayList3.add(new s7(a0.d.n("DETAILS_LOADING_ITEM_", i2), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                ArrayList arrayListE0 = d0.E0(arrayList3, arrayListP);
                s7 s7Var = new s7("GET_HELP_LOADING_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return new mrc.d(d0.F0(s7Var, arrayListE0));
            case 10:
                s remoteTransactionGrouping = (s) obj2;
                Intrinsics.checkNotNullParameter(remoteTransactionGrouping, "remoteTransactionGrouping");
                return remoteTransactionGrouping.a(l.CATEGORY, null).f151570a;
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List<j> list2 = (List) pair.f186386b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.h(list2);
                for (j jVar : list2) {
                    i3 i3VarA = l3.a(jVar.f151563a, list);
                    Long l2 = (Long) linkedHashMap.get(i3VarA);
                    linkedHashMap.put(i3VarA, Long.valueOf(Math.abs(jVar.f151564b.f115082a) + (l2 != null ? l2.longValue() : 0L)));
                }
                return linkedHashMap;
            case 12:
                Map amountsByTransactionCategory = (Map) obj2;
                Intrinsics.checkNotNullParameter(amountsByTransactionCategory, "amountsByTransactionCategory");
                Pair pair2 = new Pair(v13.d.u(qzi.l.OVERALL), Long.valueOf(d0.U0(amountsByTransactionCategory.values())));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(amountsByTransactionCategory.size()));
                for (Map.Entry entry : amountsByTransactionCategory.entrySet()) {
                    linkedHashMap2.put(v13.d.t((i3) entry.getKey()), entry.getValue());
                }
                return r0.q(linkedHashMap2, pair2);
            case 13:
                tq0.c clickData = (tq0.c) obj2;
                int i3 = l0.E;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj5 = clickData.f273449a.i;
                Intrinsics.i(obj5, "null cannot be cast to non-null type java.time.LocalDate");
                return (LocalDate) obj5;
            case 14:
                tq0.c clickData2 = (tq0.c) obj2;
                int i5 = l0.E;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj6 = clickData2.f273449a.i;
                Intrinsics.i(obj6, "null cannot be cast to non-null type java.time.LocalDate");
                return new k0((LocalDate) obj6);
            case 15:
                int i6 = MonthYearPickerView.k;
                Intrinsics.checkNotNullParameter((YearMonth) obj2, "it");
                return Unit.f186387a;
            case 16:
                m it13 = (m) obj2;
                ProductIntroView.Companion aVar = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13 instanceof m.a);
            case 17:
                m mVar = (m) obj2;
                ProductIntroView.Companion aVar2 = ProductIntroView.INSTANCE;
                if (!(mVar instanceof q)) {
                    return Unit.f186387a;
                }
                oz0.a aVar3 = ((q) mVar).f178759a;
                throw new RuntimeException("PlaybackFailed code=" + (aVar3 != null ? Integer.valueOf(aVar3.f231097a) : null) + " message=" + (aVar3 != null ? aVar3.f231098b : null), aVar3 != null ? aVar3.f231099c : null);
            case 18:
                h3 it14 = (h3) obj2;
                ProductIntroView.Companion aVar4 = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(it14, "it");
                d3 d3Var = it14 instanceof d3 ? (d3) it14 : null;
                if (d3Var == null) {
                    return null;
                }
                Throwable th10 = d3Var.f208225b;
                if (th10 != null) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = o.a(th10);
                } else {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = Unit.f186387a;
                }
                return new yhm.m(objA);
            case 19:
                jv0.m it15 = (jv0.m) obj2;
                ProductIntroView.Companion aVar5 = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (!(it15 instanceof jv0.l)) {
                    it15 = null;
                }
                jv0.l lVar = (jv0.l) it15;
                if (lVar != null) {
                    return Boolean.valueOf(lVar.f178750a);
                }
                return null;
            case 20:
                jv0.m it16 = (jv0.m) obj2;
                ProductIntroView.Companion aVar6 = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(it16, "it");
                if ((it16 instanceof p) && !((p) it16).f178758a) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return y2.b.f208496a;
            case 22:
                PromptContentDelegate.Model it17 = (PromptContentDelegate.Model) obj2;
                BluePromptActivity.Companion companion3 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj7 = it17.f53071x;
                Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.blue_prompt.BluePromptModel");
                return (ks2.c) obj7;
            case 23:
                PromptContentDelegate.Model it18 = (PromptContentDelegate.Model) obj2;
                BluePromptActivity.Companion companion4 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj8 = it18.f53071x;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.feature.blue_prompt.BluePromptModel");
                return (ks2.c) obj8;
            case 24:
                PromptContentDelegate.Model it19 = (PromptContentDelegate.Model) obj2;
                BluePromptActivity.Companion companion5 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj9 = it19.f53071x;
                Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.blue_prompt.BluePromptModel");
                return (ks2.c) obj9;
            case 25:
                BluePromptActivity.Companion companion6 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter((PromptContentDelegate.Model) obj2, "it");
                return Unit.f186387a;
            case 26:
                NaviCommand naviCommand = (NaviCommand) ((od0.i) obj2).f224257a;
                if (naviCommand != null) {
                    rfm.u uVarG = k.g(naviCommand);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar2 = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar2, "empty(...)");
                return hVar2;
            case 27:
                Intrinsics.checkNotNullParameter((tjg.c) obj2, "it");
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter((Long) obj2, "it");
                return new Data(null, new TimeoutException(), false, 5, null);
            default:
                od0.i it20 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20.d() && (strD = ipa.k.d((ipa.j) it20.c())) != null && strD.length() == 6) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}
