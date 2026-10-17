package rd3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import com.revolut.retail.feature.cryptocommoditydetails.api.ui.delegates.PriceTargetsWidgetContract$Parcel$SeeAllParcel;
import ip0.pb0;
import ip0.px;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253330a;

    public /* synthetic */ m(int i) {
        this.f253330a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f253330a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                d.Companion.getClass();
                return d.f253322b;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                m70.a.c(t0.f186434a);
                return "";
            case 3:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return null;
            case 4:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return null;
            case 5:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it14 = intRangeO.iterator();
                while (it14.f289625c) {
                    arrayList.add(new pb0(a0.d.n("ID_LOADING__", it14.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 6:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return null;
            case 7:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 8:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 9:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 10:
                String str = (String) obj2;
                return a10.b.t(str, "value", "- ", str);
            case 11:
                ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f52715m;
                PriceTargetsWidgetContract$Parcel$SeeAllParcel priceTargetsWidgetContract$Parcel$SeeAllParcel = obj3 instanceof PriceTargetsWidgetContract$Parcel$SeeAllParcel ? (PriceTargetsWidgetContract$Parcel$SeeAllParcel) obj3 : null;
                if (Intrinsics.f(model.f52708a, "PRICE_TARGETS_WIDGET_HEADER_LIST_ID")) {
                    return priceTargetsWidgetContract$Parcel$SeeAllParcel;
                }
                return null;
            case 12:
                px model2 = (px) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.d;
                if (obj4 instanceof ncj.d) {
                    return (ncj.d) obj4;
                }
                return null;
            case 13:
                ListSubheaderDelegate.Model model3 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                return Boolean.valueOf(Intrinsics.f(model3.f52708a, "PRICE_TARGETS_WIDGET_HEADER_LIST_ID"));
            case 14:
                ListSubheaderDelegate.Model it19 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Unit.f186387a;
            case 15:
                re2.d it20 = (re2.d) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f253489a;
            case 16:
                dda.a it21 = (dda.a) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f113159a;
            case 17:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Set setI1 = d0.i1((List) pair.f186386b);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list) {
                    if (setI1.contains(((io3.d) obj5).f163145a)) {
                        arrayList2.add(obj5);
                    } else {
                        arrayList3.add(obj5);
                    }
                }
                return new eda.a(arrayList2, arrayList3);
            case 18:
                e7l.f it22 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                LinkedHashSet linkedHashSet = it22.M;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(linkedHashSet, 10));
                Iterator it23 = linkedHashSet.iterator();
                while (it23.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it23.next(), arrayList4);
                }
                return Integer.valueOf(rea.g.a(arrayList4));
            case 19:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new eda.e(pocket, false);
            case 20:
                e7l.f it24 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(it24.C0 == e7l.a.OAUTH_ONCE);
            case 21:
                io3.d pocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return new eda.e(pocket2, true);
            case 22:
                do3.n it25 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return new rfm.o(new nc0.a(it25, 26));
            case 23:
                mm0.o it26 = (mm0.o) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return Boolean.valueOf(it26 instanceof mm0.r);
            case 24:
                mm0.o session = (mm0.o) obj2;
                Intrinsics.checkNotNullParameter(session, "session");
                return new p10.f(session.a().f207120a, session.a().f207121b);
            case 25:
                String it27 = (String) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                od0.h hVar = od0.i.Companion;
                String strL = m70.a.l(it27);
                hVar.getClass();
                return od0.h.a(strL);
            case 26:
                String it28 = (String) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                od0.h hVar2 = od0.i.Companion;
                String strL2 = m70.a.l(it28);
                hVar2.getClass();
                return od0.h.a(strL2);
            case 27:
                ChecklistChallenge checklistChallenge = (ChecklistChallenge) obj2;
                return Boolean.valueOf(checklistChallenge == null || !(checklistChallenge.f65777c instanceof ChecklistChallengeState.Purchased));
            case 28:
                Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
                return Boolean.TRUE;
            default:
                ChecklistChallenge it29 = (ChecklistChallenge) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return Boolean.valueOf(it29.f65777c instanceof ChecklistChallengeState.OptIn);
        }
    }

    public /* synthetic */ m(rea.g gVar) {
        this.f253330a = 18;
    }
}
