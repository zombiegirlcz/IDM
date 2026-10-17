package aig;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import com.revolut.revolut.feature_fourthline_impl.R;
import eig.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5274c;

    public /* synthetic */ p(tdi.a aVar, boolean z, boolean z3) {
        this.f5272a = 2;
        this.f5273b = z;
        this.f5274c = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ?? arrayList;
        ?? arrayList2;
        Object next;
        RevPoints revPoints;
        switch (this.f5272a) {
            case 0:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List<u2f.d> list2 = (List) pair.f186386b;
                aim.o oVar = new aim.o();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    Iterator it9 = ((TradeRevPointsAccount) it8.next()).e.iterator();
                    while (it9.hasNext()) {
                        oVar.add((String) it9.next());
                    }
                }
                aim.o oVarA = y0.a(oVar);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (u2f.d dVar : list2) {
                    if (oVarA.f5338a.containsKey(dVar.f276617a)) {
                        arrayList3.add(dVar);
                    } else {
                        arrayList4.add(dVar);
                    }
                }
                if (arrayList3.isEmpty() && this.f5273b) {
                    arrayList = u.c(new RowDelegate.Model("ACCOUNTS_EMPTY_PLACEHOLDER_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_travel, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.miles_home_section_accounts_empty_state_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.miles_home_section_accounts_empty_state_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                } else {
                    arrayList = new ArrayList(w.t(arrayList3, 10));
                    Iterator it10 = arrayList3.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(ugg.b.b((u2f.d) it10.next(), list));
                    }
                }
                ?? r87 = arrayList;
                e0 e0Var = e0.OUTSIDE_BOX;
                int i = R$attr.uikit_dp8;
                int i2 = R$attr.uikit_dp16;
                boolean zIsEmpty = ((Collection) r87).isEmpty();
                ?? D = r87;
                if (!zIsEmpty) {
                    D = yp0.b.d(r87, new ListSubheaderDelegate.Model("YOUR_AIRLINES_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_home_section_your_airlines_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2);
                }
                List listV0 = this.f5274c ? d0.V0(arrayList4, 5) : arrayList4;
                LargeActionButtonDelegate.Model model = listV0.size() < arrayList4.size() ? new LargeActionButtonDelegate.Model("AIRLINES_SEE_ALL_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, null, null, 1000) : null;
                aim.e eVarB = u.b();
                Iterator it11 = listV0.iterator();
                while (it11.hasNext()) {
                    eVarB.add(ugg.b.b((u2f.d) it11.next(), list));
                }
                if (model != null) {
                    eVarB.add(model);
                }
                aim.e eVarA = u.a(eVarB);
                e0 e0Var2 = e0.OUTSIDE_BOX;
                int i3 = R$attr.uikit_dp8;
                int i5 = R$attr.uikit_dp16;
                boolean zIsEmpty2 = eVarA.isEmpty();
                Iterable iterableD = eVarA;
                if (!zIsEmpty2) {
                    iterableD = yp0.b.d(eVarA, r.b(), e0Var2, i3, i3, i5, i5);
                }
                return d0.E0(iterableD, (Collection) D);
            case 1:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list3 = (List) pair2.f186385a;
                List<TravelMilesAirline> list4 = (List) pair2.f186386b;
                aim.o oVar2 = new aim.o();
                Iterator it12 = list3.iterator();
                while (it12.hasNext()) {
                    Iterator it13 = ((TravelMilesAccountV2) it12.next()).d.iterator();
                    while (it13.hasNext()) {
                        oVar2.add((String) it13.next());
                    }
                }
                aim.o oVarA2 = y0.a(oVar2);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (TravelMilesAirline travelMilesAirline : list4) {
                    if (travelMilesAirline.f94091g.f != null) {
                        if (oVarA2.f5338a.containsKey(travelMilesAirline.f94088a)) {
                            arrayList5.add(travelMilesAirline);
                        }
                    }
                    arrayList6.add(travelMilesAirline);
                }
                if (arrayList5.isEmpty() && this.f5273b) {
                    arrayList2 = u.c(new RowDelegate.Model("ACCOUNTS_EMPTY_PLACEHOLDER_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_travel, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.miles_home_section_accounts_empty_state_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.miles_home_section_accounts_empty_state_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                } else {
                    arrayList2 = new ArrayList(w.t(arrayList5, 10));
                    Iterator it14 = arrayList5.iterator();
                    while (it14.hasNext()) {
                        arrayList2.add(ugg.b.a((TravelMilesAirline) it14.next()));
                    }
                }
                ?? r72 = arrayList2;
                e0 e0Var3 = e0.OUTSIDE_BOX;
                int i6 = R$attr.uikit_dp8;
                int i21 = R$attr.uikit_dp16;
                boolean zIsEmpty3 = ((Collection) r72).isEmpty();
                ?? D2 = r72;
                if (!zIsEmpty3) {
                    D2 = yp0.b.d(r72, new ListSubheaderDelegate.Model("YOUR_AIRLINES_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_home_section_your_airlines_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var3, i6, i6, i21, i21);
                }
                List listV02 = this.f5274c ? d0.V0(arrayList6, 5) : arrayList6;
                LargeActionButtonDelegate.Model model2 = listV02.size() < arrayList6.size() ? new LargeActionButtonDelegate.Model("AIRLINES_SEE_ALL_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, null, null, 1000) : null;
                aim.e eVarB2 = u.b();
                Iterator it15 = listV02.iterator();
                while (it15.hasNext()) {
                    eVarB2.add(ugg.b.a((TravelMilesAirline) it15.next()));
                }
                if (model2 != null) {
                    eVarB2.add(model2);
                }
                aim.e eVarA2 = u.a(eVarB2);
                e0 e0Var4 = e0.OUTSIDE_BOX;
                int i22 = R$attr.uikit_dp8;
                int i32 = R$attr.uikit_dp16;
                boolean zIsEmpty4 = eVarA2.isEmpty();
                Iterable iterableD2 = eVarA2;
                if (!zIsEmpty4) {
                    iterableD2 = yp0.b.d(eVarA2, t.b(), e0Var4, i22, i22, i32, i32);
                }
                return d0.E0(iterableD2, (Collection) D2);
            default:
                Pair pair3 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                RevPointsPocketInfo revPointsPocketInfo = (RevPointsPocketInfo) pair3.f186385a;
                List list5 = (List) pair3.f186386b;
                if (!this.f5273b) {
                    return f0.f322471a;
                }
                RevPointsPocketThreshold revPointsPocketThresholdT = hx7.q.t(revPointsPocketInfo, list5);
                RevPointsPocketThreshold revPointsPocketThresholdC = revPointsPocketThresholdT != null ? hx7.q.C(revPointsPocketThresholdT, list5) : null;
                Iterator it16 = list5.iterator();
                if (it16.hasNext()) {
                    next = it16.next();
                    if (it16.hasNext()) {
                        dj0.d dVar2 = ((RevPointsPocketThreshold) next).f97795c;
                        do {
                            Object next2 = it16.next();
                            dj0.d dVar3 = ((RevPointsPocketThreshold) next2).f97795c;
                            dVar2.getClass();
                            if (dVar2.compareTo(dVar3) < 0) {
                                next = next2;
                                dVar2 = dVar3;
                            }
                        } while (it16.hasNext());
                    }
                } else {
                    next = null;
                }
                RevPointsPocketThreshold revPointsPocketThreshold = (RevPointsPocketThreshold) next;
                if (revPointsPocketThresholdT != null && revPointsPocketThresholdC == null) {
                    return f0.f322471a;
                }
                TextLocalisedClause textLocalisedClause = revPointsPocketThresholdC != null ? new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_home_banner_earning_title, u.c(nub.a.i(revPointsPocketThresholdC.f97794b, null, nub.d.f219277a, o9.NON_SENSITIVE, 1)), null, 12) : new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_home_banner_not_earning_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = revPointsPocketThresholdC != null ? new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_home_banner_earning_description, null, null, 14) : (revPointsPocketThreshold == null || (revPoints = revPointsPocketThreshold.f97794b) == null) ? null : new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_home_banner_not_earning_max_reward_description, u.c(nub.a.i(revPoints, null, null, null, 7)), null, 12);
                TextLocalisedClause textLocalisedClause3 = revPointsPocketThresholdC != null ? new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_home_banner_earning_action, null, null, 14) : new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_home_banner_not_earning_action, null, null, 14);
                ActionWidgetDelegate.Model.b aVar = (revPointsPocketThresholdT == null || !this.f5274c) ? ActionWidgetDelegate.Model.b.C0394b.f51606a : new ActionWidgetDelegate.Model.b.a(null);
                adi.b.Companion.getClass();
                ActionWidgetDelegate.Model model3 = new ActionWidgetDelegate.Model("REV_POINTS_POCKET_PRODUCT_ACCOUNT_ITEM_ID", textLocalisedClause, textLocalisedClause2, new com.revolut.core.ui_kit.delegates.m(adi.a.f3361b, (LayeredImage) null, (ProgressStyle) null, 6), aVar, new com.revolut.core.ui_kit.delegates.i(14, textLocalisedClause3, null, false), null, null, null, false, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                return u.c(model3);
        }
    }

    public /* synthetic */ p(boolean z, cli.n nVar, boolean z3, int i) {
        this.f5272a = i;
        this.f5273b = z;
        this.f5274c = z3;
    }
}
