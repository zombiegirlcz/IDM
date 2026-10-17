package wyc;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonActivity;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.retail.wealth.resources.R$string;
import h93.f0;
import ip0.cs;
import ip0.gu;
import ip0.ls;
import ip0.nb0;
import ip0.pb0;
import ip0.qj0;
import ip0.v7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m1c.y0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301220a;

    public /* synthetic */ p(int i) {
        this.f301220a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 5;
        switch (this.f301220a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j.a(update, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), 9);
            case 1:
                SelectableDelegate.Model it8 = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((RowDelegate.Model) it8.f53305b).u;
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.a(pb0.Companion, "BENCHMARK_LOADING_LIST_ID", false, 4);
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 5:
                return Boolean.valueOf(((vyg.h) obj2).f293319a);
            case 6:
                return ((vyg.h) obj2).f293321c;
            case 7:
                wyg.a it9 = (wyg.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f301280n;
            case 8:
                Optional selectedBenchmarkOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(selectedBenchmarkOptional, "selectedBenchmarkOptional");
                return selectedBenchmarkOptional.filter(new akl.p(new p(i), 29)).map(new com.google.android.material.color.utilities.f(13, new p(6)));
            case 9:
                wyg.a it10 = (wyg.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new vf0.h(it10.f301273b, it10.f301272a, it10.f301275g, it10.f301279m);
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                qj0 qj0Var = new qj0("LIST_ID_TABS_LOADING", 5);
                ls lsVar = new ls("LIST_ID_LOADING_ITEM");
                yp0.b.l(lsVar, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(qj0Var, lsVar);
            case 12:
                List issuedPointsList = (List) obj2;
                Intrinsics.checkNotNullParameter(issuedPointsList, "issuedPointsList");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : issuedPointsList) {
                    IssuedPoints issuedPoints = (IssuedPoints) obj3;
                    if (issuedPoints.f83950g.f83958b != y0.UNKNOWN) {
                        dj0.d dVar = issuedPoints.e;
                        dj0.d.Companion.getClass();
                        if (dVar.f(dj0.d.e)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                List listP0 = zhm.d0.P0(arrayList, new wzb.j());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : listP0) {
                    Integer numValueOf = Integer.valueOf(((IssuedPoints) obj4).a().getYear());
                    Object objU = linkedHashMap.get(numValueOf);
                    if (objU == null) {
                        objU = v7.u(linkedHashMap, numValueOf);
                    }
                    ((List) objU).add(obj4);
                }
                return linkedHashMap;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new ip0.s("ACTION_WIDGET_LOADING_ITEM_ID"));
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList2 = new ArrayList();
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    int iNextInt = it11.nextInt();
                    aim.e eVarB2 = zhm.u.b();
                    eVarB2.add(new gu(a0.d.n("YEARLY_GROUP_HEADER_LOADING_LIST_ID_PREFIX", iNextInt), 0, 0, 30));
                    IntRange intRange2 = new IntRange(0, 3, 1);
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(intRange2, 10));
                    vim.f it12 = intRange2.iterator();
                    while (it12.f289625c) {
                        arrayList3.add(nb0.b(pb0.Companion, a0.d.g(iNextInt, it12.nextInt(), "ROW_LOADING_ITEM_ID_PREFIX_", "_"), false, 0, false, 30));
                    }
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    eVarB2.addAll(arrayList3);
                    cs csVar = new cs(a0.d.n("LARGE_ACTION_BUTTON_LOADING_ITEM_ID_PREFIX", iNextInt));
                    yp0.b.l(csVar, 0, 0, 0, 0, null, false, 63);
                    eVarB2.add(csVar);
                    zhm.a0.x(zhm.u.a(eVarB2), arrayList2);
                }
                eVarB.addAll(arrayList2);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ROW_LOADING_ITEM_ID_PREFIX_EXPIRED_POINTS", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                return zhm.u.a(eVarB);
            case 14:
                InputDisclosureDelegate.Model it13 = (InputDisclosureDelegate.Model) obj2;
                int i2 = CardSelectReplaceReasonActivity.f64920w0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13;
            case 15:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new x03.a((f0) rVar.f314201a, (d71.a) ((od0.i) rVar.f314202b).f224257a, (wy2.d) ((od0.i) rVar.f314203c).f224257a);
            case 16:
                d71.a it14 = (d71.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 17:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                if (error == null || data.getContent() != null || data.getLoading()) {
                    return data;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return new Data(od0.i.f224256b, null, false, 6, null);
            case 18:
                qv0.p it15 = (qv0.p) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object e = it15.getF53564b();
                Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.feature.card_management.api.ReplaceCardReason");
                return (wy2.d) e;
            case 19:
                g0b.c update2 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g0b.c.a(update2, null, null, null, null, null, null, null, null, null, false, null, null, null, 2031615);
            case 20:
                g0b.c it16 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f139398a;
            case 21:
                g0b.c update3 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return g0b.c.a(update3, null, null, null, null, null, null, null, null, null, false, null, null, null, 2097149);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 24:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new x0l.b(x0l.j.a(), new TextLocalisedClause(R$string.wealth_onboarding_risk_disclaimer_title, null, null, 14), null, zhm.f0.f322471a);
            case 27:
                return ButtonKt.Button$lambda$2$lambda$1((SemanticsPropertyReceiver) obj2);
            case 28:
                return ProgressIndicatorKt._get_circularIndeterminateProgressAnimationSpec_$lambda$42((KeyframesSpec.KeyframesSpecConfig) obj2);
            default:
                return ProgressIndicatorKt._get_circularIndeterminateRotationAnimationSpec_$lambda$41((KeyframesSpec.KeyframesSpecConfig) obj2);
        }
    }

    public /* synthetic */ p(cli.n nVar, int i) {
        this.f301220a = i;
    }
}
