package pd4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.swish.api.R$string;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.ValidationViolation;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$Step;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.q10;
import ip0.t10;
import ip0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import le.u1;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235090a;

    public /* synthetic */ u(int i) {
        this.f235090a = i;
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f235090a) {
            case 0:
                ValidationViolation it8 = (ValidationViolation) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return j6.a.q("• ", it8.f67953c);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 2:
                pdg.m it9 = (pdg.m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f235205h;
            case 3:
                pdg.m it10 = (pdg.m) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.i;
            case 4:
                pdg.m it11 = (pdg.m) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f235206j;
            case 5:
                pdg.m update = (pdg.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return pdg.m.a(update, null, null, null, null, null, null, null, null, null, true, 6143);
            case 6:
                pdg.m update2 = (pdg.m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return pdg.m.a(update2, null, null, null, null, null, null, null, null, null, false, 6143);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IllegalStateException illegalStateException = new IllegalStateException("Bed options are loading, but user opened checkout");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                s0 s0Var = new s0(2);
                s0Var.a(new gu("AMENITIES_LOADING_ITEM_ID", 0, 0, 30));
                IntRange intRange = new IntRange(0, 4, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it12 = intRange.iterator();
                while (it12.f289625c) {
                    arrayList.add(new t10(a0.d.n("AMENITIES_LOADING_ITEM_ID", it12.nextInt()), q10.f165912a));
                }
                s0Var.b(arrayList.toArray(new t10[0]));
                ArrayList arrayList2 = s0Var.f186433a;
                List listK = zhm.v.k(arrayList2.toArray(new Object[arrayList2.size()]));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return a.b.f93985a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 14:
                HotelsPropertyRoomOccupancy it13 = (HotelsPropertyRoomOccupancy) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return v04.b.N(it13);
            case 15:
                pe2.g update3 = (pe2.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data areaContent = new Data(null, null, true, 3, null);
                update3.getClass();
                Intrinsics.checkNotNullParameter(areaContent, "areaContent");
                return new pe2.g(areaContent);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                nb0 nb0Var = pb0.Companion;
                eVarB.addAll(yp0.b.g(zhm.v.k(nb0.b(nb0Var, "ID_ROW_LOADING_1", false, 0, false, 30), nb0.b(nb0Var, "ID_ROW_LOADING_2", false, 0, false, 30)), new ListSubheaderDelegate.Model("ID_TRANSACTION_LIMIT_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.swish_area_section_transaction_limits_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                eVarB.addAll(yp0.b.g(zhm.v.k(nb0.b(nb0Var, "ID_ROW_LOADING_3", false, 0, false, 30), nb0.b(nb0Var, "ID_ROW_LOADING_4", false, 0, false, 30)), new ListSubheaderDelegate.Model("ID_DETAILS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.swish_area_section_details_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                pb0 pb0VarB = nb0.b(nb0Var, "ID_ROW_LOADING_5", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                return zhm.u.a(eVarB);
            case 17:
                PodNomineesFlowContract$Step step = (PodNomineesFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf(step instanceof PodNomineesFlowContract$Step.PodNomineesList);
            case 18:
                y it14 = (y) obj2;
                KProperty[] kPropertyArr = UpiAreaScreen.X;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj3 = it14.f167226b.f58324n;
                if (obj3 instanceof pf2.a) {
                    return (pf2.a) obj3;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB2 = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                return zhm.v.k(guVar, pb0VarB2);
            case 20:
                pf4.e update4 = (pf4.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return pf4.e.a(update4, null, null, 3);
            case 21:
                ax4.b updateConstructorState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                return new ax4.b(0);
            case 22:
                pf4.e update5 = (pf4.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return pf4.e.a(update5, null, Data.copy$default(update5.f235436b, null, null, true, 3, null), 5);
            case 23:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new qf9.a((List) pair.f186385a, (List) pair.f186386b);
            case 24:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : recurringPayments) {
                    if (qua.u.l((qua.p) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 25:
                Function0 defaultLoading = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoading, "defaultLoading");
                pf9.g.Companion.getClass();
                f0 menuItems = f0.f322471a;
                int i = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_title;
                Intrinsics.checkNotNullParameter(menuItems, "items");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                List items = (List) defaultLoading.invoke();
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                return new xf9.b(i, items, menuItems, false);
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list = (List) pair2.f186385a;
                Set setI1 = d0.i1((List) pair2.f186386b);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list) {
                    if (setI1.contains(((Troubleshooter) obj5).f91840a)) {
                        arrayList4.add(obj5);
                    }
                }
                return arrayList4;
            case 27:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 28:
                hfk.b downgradeSurveyConfig = (hfk.b) obj2;
                Intrinsics.checkNotNullParameter(downgradeSurveyConfig, "downgradeSurveyConfig");
                Object obj6 = ifk.a.f161033a;
                Intrinsics.checkNotNullParameter(downgradeSurveyConfig, "<this>");
                List availableDowngradeReasons = downgradeSurveyConfig.getAvailableDowngradeReasons();
                ArrayList arrayList5 = new ArrayList();
                Iterator it15 = availableDowngradeReasons.iterator();
                while (it15.hasNext()) {
                    iha.a aVar = (iha.a) u1.v((String) it15.next(), ifk.a.f161033a);
                    if (aVar != null) {
                        arrayList5.add(aVar);
                    }
                }
                return new iha.c(arrayList5);
            default:
                gfk.r it16 = (gfk.r) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Intrinsics.checkNotNullParameter(it16, "<this>");
                List limits = it16.getLimits();
                ArrayList arrayList6 = new ArrayList();
                Iterator it17 = limits.iterator();
                while (it17.hasNext()) {
                    mha.h hVarA = nfk.d.a((gfk.k) it17.next());
                    if (hVarA != null) {
                        arrayList6.add(hVarA);
                    }
                }
                return arrayList6;
        }
    }

    public /* synthetic */ u(Object obj2, int i) {
        this.f235090a = i;
    }
}
