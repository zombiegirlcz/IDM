package i30;

import aii.r;
import aqd.o1;
import com.revolut.core.ui_kit.delegates.y1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$FixedTermSavings;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreen;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import ds6.d0;
import fnc.s;
import i2i.o;
import i3g.j;
import i42.b;
import i42.d;
import i42.e;
import i6f.b0;
import i6f.c0;
import i6f.t;
import i85.y;
import ip0.wj;
import ip0.yo0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kbb.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.g;
import lk0.h;
import nii.y0;
import nii.z;
import od0.i;
import pfm.h;
import rf3.k;
import rf3.l;
import ufm.c;
import vkm.j2;
import vkm.q;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158067b;

    public /* synthetic */ a(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar, r rVar, int i) {
        this.f158066a = i;
        this.f158067b = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r25v0, types: [eel.b] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarA;
        Map mapG;
        Map categories;
        d0 d0VarA2;
        Map mapG2;
        Map currencies;
        Integer num;
        List list;
        int i = this.f158066a;
        int i2 = 6;
        int i3 = 26;
        int i5 = 5;
        boolean z = true;
        z = true;
        ?? r142 = 0;
        r142 = 0;
        r142 = 0;
        r142 = 0;
        Object obj3 = this.f158067b;
        switch (i) {
            case 0:
                s sVar = (s) obj3;
                i phoneOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(phoneOptional, "phoneOptional");
                if (phoneOptional.d()) {
                    return efm.d0.m(Boolean.TRUE);
                }
                c cVar = new c(new k((l) sVar.f136657b, z ? 1 : 0), 0);
                Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
                return new ufm.i(cVar, new i2i.a(23, new o(15)), 1);
            case 1:
                g pagedData = (g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                h hVar = new h(new hc7.a((i3g.c) obj3, pagedData, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 2:
                KProperty[] kPropertyArr = TravelExperiencesReviewsScreen.Q;
                j jVar = (j) ((TravelExperiencesReviewsScreen) obj3).P.getValue();
                jVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                jVar.f158218r.onNext(event);
                return Unit.f186387a;
            case 3:
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.a aVar = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.a) obj3;
                yki.a aVar2 = aVar.f96987p;
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a output = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof a.C0592a) {
                    oki.h.D2(aVar2);
                } else {
                    if (!(output instanceof j3i.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j3i.l lVar = (j3i.l) output;
                    aVar.C2(new s0i.c(lVar.f171202a, lVar.f171203b));
                    oki.h.D2(aVar2);
                }
                return Unit.f186387a;
            case 4:
                yo0 yo0Var = (yo0) obj3;
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d.a(update, null, yo0Var != yo0.LOADING_FINISHED, 1);
            case 5:
                Data content = zi0.c.P((i42.a) obj3, false, null, 3);
                ((d) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                return new d(content, false);
            case 6:
                return d.a((d) obj2, zi0.c.P(new b(((i42.l) obj3).o.f62272a), false, null, 3), false, 2);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new e(u.c(new wj("LOADING_ITEM_ID")), null, ((d) obj3).f158269b);
            case 8:
                d47.g gVar = (d47.g) obj3;
                i47.h update2 = (i47.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = update2.f158287a;
                Set set = gVar.f111235a;
                d0 d0Var = (d0) data.getContent();
                if (d0Var != null) {
                    d0 d0Var2 = (d0) data.getContent();
                    if (d0Var2 == null || (categories = d0Var2.f117232a) == null) {
                        mapG = null;
                    } else {
                        e23.c cVar2 = new e23.c(i5, set);
                        Intrinsics.checkNotNullParameter(categories, "categories");
                        mapG = q0.f(categories, cim.b.i(cVar2, cim.b.a(new o1(categories, 12), new l2d.a(27))));
                    }
                    if (mapG == null) {
                        mapG = r0.g();
                    }
                    d0VarA = d0.a(d0Var, mapG, null, 30);
                } else {
                    d0VarA = null;
                }
                return i47.h.a(update2, Data.copy$default(data, d0VarA, null, false, 6, null), gVar.f111235a, null, 4);
            case 9:
                f47.g gVar2 = (f47.g) obj3;
                i47.h update3 = (i47.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data2 = update3.f158287a;
                Set set2 = gVar2.f132016a;
                d0 d0Var3 = (d0) data2.getContent();
                if (d0Var3 != null) {
                    d0 d0Var4 = (d0) data2.getContent();
                    if (d0Var4 == null || (currencies = d0Var4.f117233b) == null) {
                        mapG2 = null;
                    } else {
                        e23.c cVar3 = new e23.c(i2, set2);
                        Intrinsics.checkNotNullParameter(currencies, "currencies");
                        mapG2 = q0.f(currencies, cim.b.i(cVar3, cim.b.a(new o1(currencies, 11), new l2d.a(i3))));
                    }
                    if (mapG2 == null) {
                        mapG2 = r0.g();
                    }
                    d0VarA2 = d0.a(d0Var3, null, mapG2, 29);
                } else {
                    d0VarA2 = null;
                }
                return i47.h.a(update3, Data.copy$default(data2, d0VarA2, null, false, 6, null), null, gVar2.f132016a, 2);
            case 10:
                g it8 = (g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                pfm.h hVar2 = new pfm.h(new hc7.a((i4g.h) obj3, it8, i2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 11:
                y1 y1Var = (y1) obj3;
                e3h.c update4 = (e3h.c) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                if (y1Var != null && (num = y1Var.f55614a) != null) {
                    int iIntValue = num.intValue();
                    eel.a aVar3 = (eel.a) update4.f.getContent();
                    if (aVar3 != null && (list = aVar3.f125219c) != null) {
                        r142 = (eel.b) zhm.d0.e0(iIntValue, list);
                    }
                }
                return e3h.c.a(update4, null, null, null, null, null, null, null, null, r142, null, null, null, null, 4193791);
            case 12:
                return e3h.c.a((e3h.c) obj2, null, (i4l.a) obj3, null, null, null, null, null, null, null, null, null, null, null, 4194301);
            case 13:
                return e3h.c.a((e3h.c) obj2, null, null, null, null, null, null, null, null, null, null, null, (eel.i) obj3, null, 4186111);
            case 14:
                return i52.b.a((i52.b) obj2, (i52.c) obj3, null, 479);
            case 15:
                i58.a updateState = (i58.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                return new i58.a((j38.a) obj3);
            case 16:
                itb.b params = (itb.b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return ((f) ((i5a.b) obj3).f158794b).b(params);
            case 17:
                com.revolut.feature.masav.impl.ui.review.a aVar4 = (com.revolut.feature.masav.impl.ui.review.a) obj3;
                h1j.b result = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof h1j.d) {
                    h1j.d dVar = (h1j.d) result;
                    if (!Intrinsics.f(((i69.f) ((j2) aVar4.f78130r.f22677a).getValue()).f158894b.f163145a, dVar.f148580a)) {
                        aVar4.l2(new i44.a(aVar4, dVar, r142, i5), new yi5.b(i3));
                    }
                }
                return Unit.f186387a;
            case 18:
                t update5 = (t) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                BenchmarkInfo benchmarkInfo = ((x6f.h) obj3).f303091a;
                return t.a(update5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, benchmarkInfo != null ? new c0(benchmarkInfo) : b0.f158914a, null, null, 229375);
            case 19:
                return t.a((t) obj2, null, null, null, null, null, null, null, (g7f.c) obj3, null, null, null, null, null, null, null, null, null, null, 262015);
            case 20:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, (e7f.e) obj3, null, null, null, null, null, null, null, null, 261631);
            case 21:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, null, (i7f.b) obj3, null, null, null, null, null, null, 260095);
            case 22:
                return t.a((t) obj2, null, null, null, null, null, null, null, null, null, null, null, null, (a7f.c) obj3, null, null, null, null, null, 258047);
            case 23:
                return t.a((t) obj2, null, null, null, null, (v6f.e) obj3, null, null, null, null, null, null, null, null, null, null, null, null, null, 262127);
            case 24:
                i76.d dVar2 = (i76.d) obj3;
                eii.k output2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof eii.i) {
                    Object obj4 = ((eii.i) output2).f126655a;
                    ChargeEntry chargeEntry = obj4 instanceof ChargeEntry ? (ChargeEntry) obj4 : null;
                    if (chargeEntry != null) {
                        dVar2.b3(chargeEntry);
                    }
                }
                return Unit.f186387a;
            case 25:
                i7e.d dVar3 = (i7e.d) obj3;
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                pcd.a aVarA = opg.c.a(vault);
                String str = aVarA != null ? aVarA.f234844g : null;
                boolean z3 = str == null || str.length() == 0;
                pcd.a aVarA2 = opg.c.a(vault);
                boolean z4 = (aVarA2 != null ? aVarA2.i : null) != null;
                if (!((jte.d) dVar3.f).c(SavingsCoreApi$Toggles$FixedTermSavings.f83118c) ? !z3 : !z3 || z4) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                i7f.g gVar3 = (i7f.g) obj3;
                String portfolioId = (String) obj2;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                return q.Q(gVar3.o.a(portfolioId), new eh9.j((Continuation) r142, gVar3, portfolioId, 20));
            case 27:
                com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) obj3;
                l83.d result2 = (l83.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof l83.b) {
                    bVar.C2(new i83.g(((l83.b) result2).f192765a));
                } else if (result2 instanceof l83.c) {
                    bVar.C1(new BridgeDestination(new FeatureCommand(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, ((l83.c) result2).f192766a.f65552j, null, null, false, false, null, 528482302))));
                } else if (!(result2 instanceof l83.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 28:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                ((y) obj3).getClass();
                return new i85.t((List) defaultLoadingItems.invoke(), i85.r.f159464a, false);
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it9, h0Var);
                ((i8e.k) obj3).X1(new y0(null, new z(new TextLocalisedClause(R$string.bill_accounts_home_error_message, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f158066a = i;
        this.f158067b = obj2;
    }
}
