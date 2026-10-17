package kjk;

import android.os.Parcelable;
import bjk.g2;
import bjk.r3;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanDashboardTile;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubModal;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductOnboarding;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanUnlockableBenefitsLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBillingPicker;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenId;
import com.revolut.retail.feature.pricing_plans.ui.api.models.StudentHubScreenConfig;
import ggk.g0;
import ggk.g1;
import ggk.h1;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ljk.j;
import ljk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f184473b;

    public /* synthetic */ w(f0 f0Var, int i) {
        this.f184472a = i;
        this.f184473b = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PlanHubProductOnboarding planHubProductOnboarding;
        PlanHubProductArticle planHubProductArticle;
        ggk.b0 b0Var;
        int i = this.f184472a;
        Parcelable background = null;
        f0 f0Var = this.f184473b;
        switch (i) {
            case 0:
                PricingPlanScreenId screenId = (PricingPlanScreenId) obj2;
                Intrinsics.checkNotNullParameter(screenId, "screenId");
                ljk.p entity = (ljk.p) wp5.y.t(ljk.p.class, f0Var.f184434b, f0.a(screenId));
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                String id10 = entity.getId();
                String title = entity.getTitle();
                ArrayList arrayListZ = zhm.d0.Z(entity.getContent());
                ArrayList arrayList = new ArrayList();
                Iterator it8 = arrayListZ.iterator();
                while (it8.hasNext()) {
                    PlanScreenElementView planScreenElementViewI = mjk.z.i((ljk.d) it8.next());
                    if (planScreenElementViewI != null) {
                        arrayList.add(planScreenElementViewI);
                    }
                }
                ljk.d footer = entity.getFooter();
                if (footer != null) {
                    Parcelable parcelableI = mjk.z.i(footer);
                    if (parcelableI instanceof PlanScreenElementView.Footer) {
                        background = (PlanScreenElementView.Footer) parcelableI;
                    }
                }
                return new PricingPlanScreenConfig(id10, title, arrayList, background);
            case 1:
                g0 param = (g0) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                return (ggk.l) f0Var.f184435c.get(f0.b(param));
            case 2:
                g0 param2 = (g0) obj2;
                Intrinsics.checkNotNullParameter(param2, "param");
                ljk.e eVar = (ljk.e) f0Var.f184434b.T2(f0.b(param2), f0.f184431s);
                if (eVar == null) {
                    return null;
                }
                Object obj3 = mjk.d.f206058a;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                List<ljk.f> planConfigs = eVar.getPlanConfigs();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(planConfigs, 10));
                for (ljk.f fVar : planConfigs) {
                    String planId = fVar.getPlanId();
                    boolean zJ = pd.b.j(fVar.getHidden());
                    ljk.g tile = fVar.getTile();
                    PlanDashboardTile image = PlanDashboardTile.Text.f102647a;
                    if (tile != null) {
                        int i2 = mjk.c.f206057a[((mjk.e) u1.t(tile.getType(), mjk.e.UNKNOWN, mjk.d.f206058a)).ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                String url2 = tile.getUrl();
                                image = new PlanDashboardTile.Image(url2 != null ? url2 : "");
                            } else if (i2 == 3) {
                                String url3 = tile.getUrl();
                                image = new PlanDashboardTile.Video(url3 != null ? url3 : "");
                            } else if (i2 == 4) {
                                String url4 = tile.getUrl();
                                image = new PlanDashboardTile.SmallVideo(url4 != null ? url4 : "");
                            } else if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        arrayList2.add(new ggk.m(planId, zJ, image));
                    }
                    arrayList2.add(new ggk.m(planId, zJ, image));
                }
                return new ggk.l(arrayList2);
            case 3:
                z params = (z) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (PricingPlanBottomSheetConfig) f0Var.f184435c.get(params.f);
            case 4:
                c0 param3 = (c0) obj2;
                Intrinsics.checkNotNullParameter(param3, "param");
                return (h1) f0Var.f184435c.get(param3.a());
            case 5:
                z params2 = (z) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                ljk.o entity2 = (ljk.o) wp5.y.t(ljk.o.class, f0Var.f184434b, params2.f);
                if (entity2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity2, "entity");
                String id11 = entity2.getId();
                String title2 = entity2.getHeader().getTitle();
                String description = entity2.getHeader().getDescription();
                o.b.a icon = entity2.getHeader().getIcon();
                PricingPlanBottomSheetConfig.Header header = new PricingPlanBottomSheetConfig.Header(title2, description, icon != null ? new PricingPlanBottomSheetConfig.Header.Icon(icon.getUrl(), icon.getAssetName()) : null);
                List content = entity2.getContent();
                ArrayList arrayList3 = new ArrayList();
                Iterator it9 = content.iterator();
                while (it9.hasNext()) {
                    PlanScreenElementView planScreenElementViewI2 = mjk.z.i((ljk.d) it9.next());
                    if (planScreenElementViewI2 != null) {
                        arrayList3.add(planScreenElementViewI2);
                    }
                }
                o.a background2 = entity2.getBackground();
                if (background2 != null && Intrinsics.f(background2.getType(), "ANIMATED_BACKGROUND")) {
                    background = new PricingPlanBottomSheetConfig.Background(com.revolut.retail.feature.pricing_plans.ui.api.models.j.ANIMATED_BACKGROUND, background2.getCode());
                }
                return new PricingPlanBottomSheetConfig(id11, header, arrayList3, background);
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                return (PlanHubScreenConfig) v7.r("plans_hub_screen_config_", str, f0Var.f184435c);
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                String planId2 = (String) pair2.f186385a;
                ljk.k entity3 = (ljk.k) wp5.y.t(ljk.k.class, f0Var.f184434b, j6.a.q("plans_hub_screen_config_", planId2));
                if (entity3 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity3, "entity");
                Intrinsics.checkNotNullParameter(planId2, "planId");
                PlanHubScreenHeader.Standard standardE = mjk.i.e(entity3.getHeader());
                ArrayList arrayListZ2 = zhm.d0.Z(entity3.getContent());
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = arrayListZ2.iterator();
                while (it10.hasNext()) {
                    PlanScreenElementView planScreenElementViewI3 = mjk.z.i((ljk.d) it10.next());
                    if (planScreenElementViewI3 != null) {
                        arrayList4.add(planScreenElementViewI3);
                    }
                }
                ljk.j entity4 = entity3.getOnboarding();
                if (entity4 != null) {
                    Intrinsics.checkNotNullParameter(entity4, "entity");
                    String id12 = entity4.getId();
                    List<j.b> steps = entity4.getSteps();
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(steps, 10));
                    for (j.b bVar : steps) {
                        String id13 = bVar.getId();
                        String title3 = bVar.getTitle();
                        String subtitle = bVar.getSubtitle();
                        String url5 = bVar.getVideo().getUrl();
                        j.a badge = bVar.getBadge();
                        arrayList5.add(new PlanHubProductOnboarding.Step(id13, title3, subtitle, url5, badge != null ? new PlanHubProductOnboarding.Step.Badge(badge.getLabel(), badge.getIcon().getAssetName()) : null));
                    }
                    j.c style = entity4.getStyle();
                    int i3 = style == null ? -1 : mjk.g.f206060b[style.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        b0Var = ggk.b0.CENTERED;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b0Var = ggk.b0.FULLSCREEN_VIDEO;
                    }
                    planHubProductOnboarding = new PlanHubProductOnboarding(id12, arrayList5, b0Var);
                } else {
                    planHubProductOnboarding = null;
                }
                ljk.i productArticle = entity3.getProductArticle();
                if (productArticle != null) {
                    String id14 = productArticle.getId();
                    Map params3 = productArticle.getParams();
                    if (params3 == null) {
                        params3 = r0.g();
                    }
                    planHubProductArticle = new PlanHubProductArticle(id14, params3);
                } else {
                    planHubProductArticle = null;
                }
                List modals = entity3.getModals();
                if (modals == null) {
                    modals = zhm.f0.f322471a;
                }
                List<ljk.h> list = modals;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list, 10));
                for (ljk.h hVar : list) {
                    arrayList6.add(new PlanHubModal(hVar.getId(), hVar.getDeeplink()));
                }
                return new PlanHubScreenConfig(standardE, arrayList4, planHubProductOnboarding, planHubProductArticle, planId2, arrayList6);
            case 8:
                b0 params4 = (b0) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                return (PricingPlanBillingPicker) f0Var.f184435c.get(params4.a());
            case 9:
                String receiverUserName = (String) obj2;
                Intrinsics.checkNotNullParameter(receiverUserName, "receiverUserName");
                return (h1) v7.r("plans_gifting_dashboard_layout_", receiverUserName, f0Var.f184435c);
            case 10:
                String receiverUserName2 = (String) obj2;
                Intrinsics.checkNotNullParameter(receiverUserName2, "receiverUserName");
                g2 g2Var = (g2) wp5.y.t(g2.class, f0Var.f184434b, j6.a.q("plans_gifting_dashboard_layout_", receiverUserName2));
                if (g2Var != null) {
                    return mjk.r.l(g2Var);
                }
                return null;
            case 11:
                String input = (String) obj2;
                Intrinsics.checkNotNullParameter(input, "input");
                return (g1) v7.r("plans_gift_benefits_layout_", input, f0Var.f184435c);
            case 12:
                String input2 = (String) obj2;
                Intrinsics.checkNotNullParameter(input2, "input");
                g2.d dVar = (g2.d) wp5.y.t(g2.d.class, f0Var.f184434b, j6.a.q("plans_gift_benefits_layout_", input2));
                if (dVar != null) {
                    return mjk.r.k(dVar);
                }
                return null;
            case 13:
                c0 param4 = (c0) obj2;
                Intrinsics.checkNotNullParameter(param4, "param");
                g2 g2Var2 = (g2) wp5.y.t(g2.class, f0Var.f184434b, param4.a());
                if (g2Var2 != null) {
                    return mjk.r.l(g2Var2);
                }
                return null;
            case 14:
                r3 dto = (r3) obj2;
                Intrinsics.checkNotNullParameter(dto, "it");
                mjk.x xVar = f0Var.d;
                Intrinsics.checkNotNullParameter(dto, "dto");
                mjk.z zVar = xVar.f206064a;
                String id15 = dto.getId();
                String title4 = dto.getTitle();
                ArrayList arrayListZ3 = zhm.d0.Z(dto.getContent());
                ArrayList arrayList7 = new ArrayList();
                Iterator it11 = arrayListZ3.iterator();
                while (it11.hasNext()) {
                    PlanScreenElementView planScreenElementViewH = zVar.h((bjk.d) it11.next());
                    if (planScreenElementViewH != null) {
                        arrayList7.add(planScreenElementViewH);
                    }
                }
                List footer2 = dto.getFooter();
                if (footer2 == null) {
                    footer2 = zhm.f0.f322471a;
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it12 = footer2.iterator();
                while (it12.hasNext()) {
                    PlanScreenElementView planScreenElementViewH2 = zVar.h((bjk.d) it12.next());
                    if (planScreenElementViewH2 != null) {
                        arrayList8.add(planScreenElementViewH2);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj4 : arrayList8) {
                    if (obj4 instanceof PlanScreenElementView.Footer) {
                        arrayList9.add(obj4);
                    }
                }
                return new PricingPlanScreenConfig(id15, title4, arrayList7, (PlanScreenElementView.Footer) zhm.d0.d0(arrayList9));
            case 15:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                bjk.r0 r0Var = (bjk.r0) wp5.y.t(bjk.r0.class, f0Var.f184434b, f0.c((String) it13.f224257a));
                if (r0Var != null) {
                    return mjk.f.a(r0Var);
                }
                return null;
            case 16:
                String planId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(planId3, "planId");
                return (ggk.k) v7.r("plans_benefits_suggestions_", planId3, f0Var.f184435c);
            case 17:
                String feedIdKey = (String) obj2;
                Intrinsics.checkNotNullParameter(feedIdKey, "feedIdKey");
                return (PlanUnlockableBenefitsLayout) f0Var.f184435c.get(f0.d(feedIdKey));
            case 18:
                String planId4 = (String) obj2;
                Intrinsics.checkNotNullParameter(planId4, "planId");
                return (StudentHubScreenConfig) v7.r("student_hub_screen_config_", planId4, f0Var.f184435c);
            case 19:
                od0.i it14 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (ggk.y) f0Var.f184435c.get(f0.c((String) it14.f224257a));
            default:
                PricingPlanScreenId screenId2 = (PricingPlanScreenId) obj2;
                Intrinsics.checkNotNullParameter(screenId2, "screenId");
                return (PricingPlanScreenConfig) f0Var.f184435c.get(f0.a(screenId2));
        }
    }
}
