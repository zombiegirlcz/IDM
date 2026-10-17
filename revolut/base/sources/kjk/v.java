package kjk;

import bjk.g2;
import bjk.i0;
import bjk.j0;
import bjk.k0;
import bjk.m0;
import bjk.n0;
import bjk.p0;
import bjk.q0;
import bjk.r0;
import bjk.r3;
import bjk.s0;
import bjk.w0;
import bjk.w2;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanDashboardTile;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubModal;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductOnboarding;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanUnlockableBenefitsLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBillingPicker;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenId;
import com.revolut.retail.feature.pricing_plans.ui.api.models.StudentHubScreenConfig;
import ggk.b1;
import ggk.d1;
import ggk.g0;
import ggk.g1;
import ggk.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import ljk.j;
import ljk.m;
import ljk.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f184471b;

    public /* synthetic */ v(f0 f0Var, int i) {
        this.f184470a = i;
        this.f184471b = f0Var;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        mjk.e eVar;
        String str;
        m.b bVar;
        ljk.j jVar;
        j.c cVar;
        m.b bVar2;
        j.a aVar;
        ArrayList arrayList;
        q0 q0Var;
        ArrayList arrayList2;
        Iterator it8;
        Iterator it9;
        String str2;
        String str3;
        ArrayList arrayList3;
        n0 n0Var;
        int i = this.f184470a;
        f0 f0Var = this.f184471b;
        switch (i) {
            case 0:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                c0 param = (c0) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(param, "param");
                efm.d0<g2> plansDashboardLayout = f0Var.f184433a.getPlansDashboardLayout(param.f184425b.a());
                kce.c cVar2 = new kce.c(new x(0), 24);
                plansDashboardLayout.getClass();
                ufm.i iVar = new ufm.i(plansDashboardLayout, cVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 1:
                PricingPlanScreenId screenId = (PricingPlanScreenId) obj2;
                PricingPlanScreenConfig domain = (PricingPlanScreenConfig) obj3;
                Intrinsics.checkNotNullParameter(screenId, "screenId");
                Intrinsics.checkNotNullParameter(domain, "domain");
                xe0.e eVar2 = f0Var.f184434b;
                String strA = f0.a(screenId);
                Intrinsics.checkNotNullParameter(domain, "domain");
                String str4 = domain.f102852a;
                String str5 = domain.f102853b;
                ArrayList arrayList4 = domain.f102854c;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(mjk.z.o((PlanScreenElementView) it10.next()));
                }
                PlanScreenElementView.Footer footer = domain.d;
                eVar2.G(new ljk.p(str4, str5, arrayList5, footer != null ? mjk.z.o(footer) : null), strA, wim.z.d(o0.b(ljk.p.class)));
                return Unit.f186387a;
            case 2:
                w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                g0 param2 = (g0) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(param2, "param");
                efm.d0<bjk.f0> planDashboardConfig = f0Var.f184433a.getPlanDashboardConfig(param2.a());
                kce.c cVar3 = new kce.c(new x(1), 26);
                planDashboardConfig.getClass();
                ufm.i iVar2 = new ufm.i(planDashboardConfig, cVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 3:
                g0 param3 = (g0) obj2;
                ggk.l domain2 = (ggk.l) obj3;
                Intrinsics.checkNotNullParameter(param3, "param");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                f0Var.f184435c.f(f0.b(param3), domain2);
                return Unit.f186387a;
            case 4:
                g0 param4 = (g0) obj2;
                ggk.l domain3 = (ggk.l) obj3;
                Intrinsics.checkNotNullParameter(param4, "param");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                xe0.e eVar3 = f0Var.f184434b;
                String strB = f0.b(param4);
                Object obj4 = mjk.d.f206058a;
                Intrinsics.checkNotNullParameter(domain3, "<this>");
                ArrayList<ggk.m> arrayList6 = domain3.f143744a;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                for (ggk.m mVar : arrayList6) {
                    String str6 = mVar.f143748a;
                    Boolean boolValueOf = Boolean.valueOf(mVar.f143749b);
                    PlanDashboardTile planDashboardTile = mVar.f143750c;
                    boolean z = planDashboardTile instanceof PlanDashboardTile.Text;
                    if (z) {
                        eVar = mjk.e.TEXT;
                    } else if (planDashboardTile instanceof PlanDashboardTile.Image) {
                        eVar = mjk.e.IMAGE;
                    } else if (planDashboardTile instanceof PlanDashboardTile.Video) {
                        eVar = mjk.e.VIDEO;
                    } else {
                        if (!(planDashboardTile instanceof PlanDashboardTile.SmallVideo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = mjk.e.SMALL_VIDEO;
                    }
                    if (z) {
                        str = null;
                    } else if (planDashboardTile instanceof PlanDashboardTile.Image) {
                        str = ((PlanDashboardTile.Image) planDashboardTile).f102645a;
                    } else if (planDashboardTile instanceof PlanDashboardTile.Video) {
                        str = ((PlanDashboardTile.Video) planDashboardTile).f102648a;
                    } else {
                        if (!(planDashboardTile instanceof PlanDashboardTile.SmallVideo)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((PlanDashboardTile.SmallVideo) planDashboardTile).f102646a;
                    }
                    arrayList7.add(new ljk.f(str6, boolValueOf, new ljk.g(u1.g(eVar, mjk.d.f206058a), str)));
                }
                eVar3.G(new ljk.e(arrayList7), strB, wim.z.d(o0.b(ljk.e.class)));
                return Unit.f186387a;
            case 5:
                w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                z params = (z) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(params, "params");
                efm.d0<w2> bottomSheetLayout = f0Var.f184433a.getBottomSheetLayout(params.f184478b, params.d, params.e, m70.a.l(zhm.d0.k0(params.f184479c, ",", null, null, 0, null, 62)));
                kce.c cVar4 = new kce.c(new k65.d(1, f0Var.e, mjk.u.class, "toDomain", "toDomain(Lcom/revolut/retail/feature/pricing_plans/ui/impl/network/dto/PricingPlanBottomSheetConfigDto;)Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetConfig;", 0, 15), 25);
                bottomSheetLayout.getClass();
                ufm.i iVar3 = new ufm.i(bottomSheetLayout, cVar4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 6:
                z params2 = (z) obj2;
                PricingPlanBottomSheetConfig domain4 = (PricingPlanBottomSheetConfig) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(domain4, "domain");
                f0Var.f184435c.f(params2.f, domain4);
                return Unit.f186387a;
            case 7:
                z params3 = (z) obj2;
                PricingPlanBottomSheetConfig domain5 = (PricingPlanBottomSheetConfig) obj3;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(domain5, "domain");
                xe0.e eVar4 = f0Var.f184434b;
                String str7 = params3.f;
                Intrinsics.checkNotNullParameter(domain5, "domain");
                String str8 = domain5.f102813a;
                PricingPlanBottomSheetConfig.Header header = domain5.f102814b;
                String str9 = header.f102818a;
                String str10 = header.f102819b;
                PricingPlanBottomSheetConfig.Header.Icon icon = header.f102820c;
                o.b bVar3 = new o.b(str9, str10, icon != null ? new o.b.a(icon.f102821a, icon.f102822b) : null);
                List list = domain5.f102815c;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList8.add(mjk.z.o((PlanScreenElementView) it11.next()));
                }
                PricingPlanBottomSheetConfig.Background background = domain5.d;
                eVar4.G(new ljk.o(str8, bVar3, arrayList8, background != null ? new o.a(background.f102816a.name(), background.f102817b) : null), str7, wim.z.d(o0.b(ljk.o.class)));
                return Unit.f186387a;
            case 8:
                w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str11 = (String) pair.f186385a;
                efm.d0<w0> planHubScreen = f0Var.f184433a.getPlanHubScreen(m70.a.l(zhm.d0.k0((List) pair.f186386b, ",", null, null, 0, null, 62)));
                kce.c cVar5 = new kce.c(new k79.b(f0Var, str11, 20), 23);
                planHubScreen.getClass();
                ufm.i iVar4 = new ufm.i(planHubScreen, cVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 9:
                Pair pair2 = (Pair) obj2;
                PlanHubScreenConfig domain6 = (PlanHubScreenConfig) obj3;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Intrinsics.checkNotNullParameter(domain6, "domain");
                String str12 = (String) pair2.f186385a;
                f0Var.f184435c.f("plans_hub_screen_config_" + str12, domain6);
                return Unit.f186387a;
            case 10:
                Pair pair3 = (Pair) obj2;
                PlanHubScreenConfig domain7 = (PlanHubScreenConfig) obj3;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Intrinsics.checkNotNullParameter(domain7, "domain");
                String str13 = (String) pair3.f186385a;
                xe0.e eVar5 = f0Var.f184434b;
                String str14 = "plans_hub_screen_config_" + str13;
                Intrinsics.checkNotNullParameter(domain7, "domain");
                m.b bVarG = mjk.i.g(domain7.f102661a);
                ArrayList arrayList9 = domain7.f102662b;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                Iterator it12 = arrayList9.iterator();
                while (it12.hasNext()) {
                    arrayList10.add(mjk.z.o((PlanScreenElementView) it12.next()));
                }
                PlanHubProductOnboarding model = domain7.f102663c;
                if (model != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    String str15 = model.f102653a;
                    ArrayList<PlanHubProductOnboarding.Step> arrayList11 = model.f102654b;
                    ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                    for (PlanHubProductOnboarding.Step step : arrayList11) {
                        String str16 = step.f102656a;
                        String str17 = step.f102657b;
                        String str18 = step.f102658c;
                        j.d dVar = new j.d(step.d);
                        PlanHubProductOnboarding.Step.Badge badge = step.e;
                        if (badge != null) {
                            bVar2 = bVarG;
                            aVar = new j.a(badge.f102659a, new j.a.C1111a(badge.f102660b));
                        } else {
                            bVar2 = bVarG;
                            aVar = null;
                        }
                        arrayList12.add(new j.b(str16, str17, str18, dVar, aVar));
                        bVarG = bVar2;
                    }
                    bVar = bVarG;
                    int i2 = mjk.g.f206061c[model.f102655c.ordinal()];
                    if (i2 == 1) {
                        cVar = j.c.CENTERED;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = j.c.FULLSCREEN;
                    }
                    jVar = new ljk.j(str15, arrayList12, cVar);
                } else {
                    bVar = bVarG;
                    jVar = null;
                }
                PlanHubProductArticle planHubProductArticle = domain7.d;
                ljk.i iVar5 = planHubProductArticle != null ? new ljk.i(planHubProductArticle.f102651a, planHubProductArticle.f102652b) : null;
                ArrayList<PlanHubModal> arrayList13 = domain7.f;
                ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                for (PlanHubModal planHubModal : arrayList13) {
                    arrayList14.add(new ljk.h(planHubModal.f102649a, planHubModal.f102650b));
                }
                eVar5.G(new ljk.k(bVar, arrayList10, jVar, iVar5, arrayList14), str14, wim.z.d(o0.b(ljk.k.class)));
                return Unit.f186387a;
            case 11:
                b0 params4 = (b0) obj2;
                PricingPlanBillingPicker domain8 = (PricingPlanBillingPicker) obj3;
                Intrinsics.checkNotNullParameter(params4, "params");
                Intrinsics.checkNotNullParameter(domain8, "domain");
                f0Var.f184435c.f(params4.a(), domain8);
                return Unit.f186387a;
            case 12:
                w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                String receiverUserName = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(receiverUserName, "receiverUserName");
                efm.d0<g2> planGiftingDashboardLayout = f0Var.f184433a.getPlanGiftingDashboardLayout(receiverUserName);
                kce.c cVar6 = new kce.c(new kh4.b(28), 20);
                planGiftingDashboardLayout.getClass();
                ufm.i iVar6 = new ufm.i(planGiftingDashboardLayout, cVar6, 1);
                Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                return iVar6;
            case 13:
                c0 param5 = (c0) obj2;
                h1 domain9 = (h1) obj3;
                Intrinsics.checkNotNullParameter(param5, "param");
                Intrinsics.checkNotNullParameter(domain9, "domain");
                f0Var.f184435c.f(param5.a(), domain9);
                return Unit.f186387a;
            case 14:
                String receiverUserName2 = (String) obj2;
                h1 domain10 = (h1) obj3;
                Intrinsics.checkNotNullParameter(receiverUserName2, "receiverUserName");
                Intrinsics.checkNotNullParameter(domain10, "domain");
                f0Var.f184435c.f("plans_gifting_dashboard_layout_" + receiverUserName2, domain10);
                return Unit.f186387a;
            case 15:
                String receiverUserName3 = (String) obj2;
                h1 domain11 = (h1) obj3;
                Intrinsics.checkNotNullParameter(receiverUserName3, "receiverUserName");
                Intrinsics.checkNotNullParameter(domain11, "domain");
                f0Var.f184434b.G(mjk.r.s(domain11), j6.a.q("plans_gifting_dashboard_layout_", receiverUserName3), wim.z.d(o0.b(g2.class)));
                return Unit.f186387a;
            case 16:
                w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                String input = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(input, "input");
                efm.d0<g2.d> planGiftBenefitsLayout = f0Var.f184433a.getPlanGiftBenefitsLayout(input);
                kce.c cVar7 = new kce.c(new kh4.b(29), 22);
                planGiftBenefitsLayout.getClass();
                ufm.i iVar7 = new ufm.i(planGiftBenefitsLayout, cVar7, 1);
                Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                return iVar7;
            case 17:
                String input2 = (String) obj2;
                g1 domain12 = (g1) obj3;
                Intrinsics.checkNotNullParameter(input2, "input");
                Intrinsics.checkNotNullParameter(domain12, "domain");
                f0Var.f184435c.f("plans_gift_benefits_layout_" + input2, domain12);
                return Unit.f186387a;
            case 18:
                String input3 = (String) obj2;
                g1 domain13 = (g1) obj3;
                Intrinsics.checkNotNullParameter(input3, "input");
                Intrinsics.checkNotNullParameter(domain13, "domain");
                f0Var.f184434b.G(mjk.r.r(domain13), j6.a.q("plans_gift_benefits_layout_", input3), wim.z.d(o0.b(g2.d.class)));
                return Unit.f186387a;
            case 19:
                c0 param6 = (c0) obj2;
                h1 domain14 = (h1) obj3;
                Intrinsics.checkNotNullParameter(param6, "param");
                Intrinsics.checkNotNullParameter(domain14, "domain");
                f0Var.f184434b.G(mjk.r.s(domain14), param6.a(), wim.z.d(o0.b(g2.class)));
                return Unit.f186387a;
            case 20:
                od0.i planId = (od0.i) obj2;
                ggk.y benefitsToLoseInfo = (ggk.y) obj3;
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(benefitsToLoseInfo, "benefitsToLoseInfo");
                f0Var.f184435c.f(f0.c((String) planId.f224257a), benefitsToLoseInfo);
                return Unit.f186387a;
            case 21:
                od0.i planId2 = (od0.i) obj2;
                ggk.y domain15 = (ggk.y) obj3;
                Intrinsics.checkNotNullParameter(planId2, "planId");
                Intrinsics.checkNotNullParameter(domain15, "domain");
                xe0.e eVar6 = f0Var.f184434b;
                String strC = f0.c((String) planId2.f224257a);
                Intrinsics.checkNotNullParameter(domain15, "<this>");
                List list2 = domain15.f143798a;
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList15 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it13 = list3.iterator();
                    while (it13.hasNext()) {
                        ggk.a0 a0Var = (ggk.a0) it13.next();
                        Intrinsics.checkNotNullParameter(a0Var, "<this>");
                        String str19 = a0Var.f143700a;
                        ArrayList arrayList16 = a0Var.f143701b;
                        ArrayList arrayList17 = new ArrayList(zhm.w.t(arrayList16, 10));
                        Iterator it14 = arrayList16.iterator();
                        while (it14.hasNext()) {
                            ggk.v vVar = (ggk.v) it14.next();
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            k0 k0VarD0 = ofm.q.d0(vVar.f143785a);
                            String str20 = vVar.f143786b;
                            String str21 = vVar.f143787c;
                            List list4 = vVar.d;
                            ArrayList arrayList18 = new ArrayList(zhm.w.t(list4, 10));
                            for (Iterator it15 = list4.iterator(); it15.hasNext(); it15 = it15) {
                                ggk.n nVar = (ggk.n) it15.next();
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList18.add(new i0(nVar.f143754a, nVar.f143755b));
                            }
                            ggk.w wVar = vVar.e;
                            if (wVar != null) {
                                Intrinsics.checkNotNullParameter(wVar, "<this>");
                                Intrinsics.checkNotNullParameter(wVar, "<this>");
                                ggk.q qVar = wVar.f143788a;
                                k0 k0VarD02 = qVar != null ? ofm.q.d0(qVar) : null;
                                String str22 = wVar.f143789b;
                                it8 = it13;
                                String str23 = wVar.f143790c;
                                ArrayList arrayList19 = wVar.d;
                                it9 = it14;
                                str2 = str20;
                                str3 = str21;
                                ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                                Iterator it16 = arrayList19.iterator();
                                while (it16.hasNext()) {
                                    ggk.x xVar = (ggk.x) it16.next();
                                    Intrinsics.checkNotNullParameter(xVar, "<this>");
                                    arrayList20.add(new p0(xVar.f143793a, xVar.f143794b, xVar.f143795c));
                                    it16 = it16;
                                    arrayList18 = arrayList18;
                                }
                                arrayList3 = arrayList18;
                                n0Var = new n0(new j0(k0VarD02, str22, str23, arrayList20));
                            } else {
                                it8 = it13;
                                it9 = it14;
                                str2 = str20;
                                str3 = str21;
                                arrayList3 = arrayList18;
                                n0Var = null;
                            }
                            arrayList17.add(new bjk.o0(k0VarD0, str2, str3, arrayList3, n0Var));
                            it13 = it8;
                            it14 = it9;
                        }
                        arrayList15.add(new s0(str19, arrayList17));
                    }
                    arrayList = arrayList15;
                } else {
                    arrayList = null;
                }
                List list5 = domain15.f143799b;
                ggk.z zVar = domain15.f143800c;
                if (zVar != null) {
                    Intrinsics.checkNotNullParameter(zVar, "<this>");
                    b1 b1Var = zVar.f143804a;
                    g2.d.s sVarN = b1Var != null ? mjk.r.n(b1Var) : null;
                    List list6 = zVar.f143805b;
                    ArrayList arrayListB = list6 != null ? mjk.r.b(list6) : null;
                    d1 d1Var = zVar.f143806c;
                    q0Var = new q0(sVarN, arrayListB, d1Var != null ? mjk.r.o(d1Var) : null);
                } else {
                    q0Var = null;
                }
                List list7 = domain15.d;
                if (list7 != null) {
                    List<ggk.t> list8 = list7;
                    ArrayList arrayList21 = new ArrayList(zhm.w.t(list8, 10));
                    for (ggk.t tVar : list8) {
                        Intrinsics.checkNotNullParameter(tVar, "<this>");
                        arrayList21.add(new m0(tVar.f143779a, tVar.f143780b, tVar.f143781c));
                    }
                    arrayList2 = arrayList21;
                } else {
                    arrayList2 = null;
                }
                ggk.u uVar = domain15.e;
                eVar6.G(new r0(arrayList, list5, q0Var, arrayList2, uVar != null ? uVar.name() : null), strC, wim.z.d(o0.b(r0.class)));
                return Unit.f186387a;
            case 22:
                String planId3 = (String) obj2;
                ggk.k benefits = (ggk.k) obj3;
                Intrinsics.checkNotNullParameter(planId3, "planId");
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                f0Var.f184435c.f("plans_benefits_suggestions_" + planId3, benefits);
                return Unit.f186387a;
            case 23:
                String feedIdKey = (String) obj2;
                PlanUnlockableBenefitsLayout domain16 = (PlanUnlockableBenefitsLayout) obj3;
                Intrinsics.checkNotNullParameter(feedIdKey, "feedIdKey");
                Intrinsics.checkNotNullParameter(domain16, "domain");
                f0Var.f184435c.f(f0.d(feedIdKey), domain16);
                return Unit.f186387a;
            case 24:
                String planId4 = (String) obj2;
                StudentHubScreenConfig domain17 = (StudentHubScreenConfig) obj3;
                Intrinsics.checkNotNullParameter(planId4, "planId");
                Intrinsics.checkNotNullParameter(domain17, "domain");
                f0Var.f184435c.f("student_hub_screen_config_" + planId4, domain17);
                return Unit.f186387a;
            case 25:
                w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                od0.i planId5 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(planId5, "planId");
                efm.d0<r0> downgradePerksLoss = f0Var.f184433a.getDowngradePerksLoss((String) planId5.f224257a);
                kce.c cVar8 = new kce.c(new x(2), 27);
                downgradePerksLoss.getClass();
                ufm.i iVar8 = new ufm.i(downgradePerksLoss, cVar8, 1);
                Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                return iVar8;
            case 26:
                w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                PricingPlanScreenId screenId2 = (PricingPlanScreenId) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(screenId2, "screenId");
                efm.d0<r3> screen = f0Var.f184433a.getScreen(screenId2.f102855a);
                kce.c cVar9 = new kce.c(new w(f0Var, 14), 21);
                screen.getClass();
                ufm.i iVar9 = new ufm.i(screen, cVar9, 1);
                Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                return iVar9;
            default:
                PricingPlanScreenId screenId3 = (PricingPlanScreenId) obj2;
                PricingPlanScreenConfig domain18 = (PricingPlanScreenConfig) obj3;
                Intrinsics.checkNotNullParameter(screenId3, "screenId");
                Intrinsics.checkNotNullParameter(domain18, "domain");
                f0Var.f184435c.f(f0.a(screenId3), domain18);
                return Unit.f186387a;
        }
    }
}
