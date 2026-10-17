package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$UiConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import dok.i;
import fq7.k;
import ggk.g1;
import ggk.h1;
import ggk.i0;
import ggk.l0;
import ghk.d0;
import ghk.h;
import ghk.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements n {

    @NotNull
    public static final d0 Companion = new d0();
    public static final h e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPagerFlowContract$InputData f103076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dok.e f103077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f103078c;
    public final gte.a d;

    static {
        a.C0633a c0633a = a.C0633a.f103064a;
        e = new h(c0633a, c0633a);
    }

    public e(PlanPagerFlowContract$InputData inputData, com.revolut.retail.feature.pricing_plans.ui.impl.footer.e footerMapper, dok.e backgroundMapper, i navigationItemMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(navigationItemMapper, "navigationItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f103076a = inputData;
        this.f103077b = backgroundMapper;
        this.f103078c = navigationItemMapper;
        this.d = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if ((r2 instanceof com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType.Default) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a a(java.util.List r17, com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button r18, com.revolut.feature.pricingplans.models.PricingPlanSubscription r19, ggk.g1 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e.a(java.util.List, com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button, com.revolut.feature.pricingplans.models.PricingPlanSubscription, ggk.g1, boolean):com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a");
    }

    @Override // cli.n
    public final o c(j jVar) {
        String str;
        Clause textClause;
        Clause clause;
        String str2;
        ghk.j domainState = (ghk.j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data planLayout = domainState.e;
        Data data = domainState.d;
        Data data2 = domainState.f143962g;
        Data data3 = domainState.f143961c;
        g1 g1Var = (g1) planLayout.getContent();
        if (g1Var == null || (str = g1Var.f143718a) == null) {
            str = "";
        }
        String str3 = str;
        final int i = 1;
        List list = (List) iii.c.f(t1.t(data3, data2), new r(5), new gcc.c(12), new Function3(this) { // from class: ghk.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e f143951b;

            {
                this.f143951b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                l0 l0Var;
                ArrayList arrayList;
                switch (i) {
                    case 0:
                        h1 layout = (h1) obj2;
                        ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        i0 i0Var = layout.f143728c;
                        if (i0Var == null || (l0Var = i0Var.f143729a) == null) {
                            return null;
                        }
                        return this.f143951b.f103078c.a(l0Var);
                    default:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        List list2 = (List) pair.f186385a;
                        h1 h1Var = (h1) pair.f186386b;
                        PlanLayoutType planLayoutType = this.f143951b.f103076a.d.f103060b;
                        planLayoutType.getClass();
                        if (planLayoutType instanceof PlanLayoutType.Default) {
                            ArrayList<hha.d> arrayListS = d8l.d.s(h1Var.f143727b, list2);
                            arrayList = new ArrayList(zhm.w.t(arrayListS, 10));
                            for (hha.d dVar : arrayListS) {
                                arrayList.add(new com.revolut.core.ui_kit.views.q(dVar.f152287a, new com.revolut.core.ui_kit.views.t(dok.g.d(dVar, null)), 58));
                            }
                        } else {
                            ArrayList<g1> arrayList2 = h1Var.f143727b;
                            arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (g1 g1Var2 : arrayList2) {
                                arrayList.add(new com.revolut.core.ui_kit.views.q(g1Var2.f143718a, new com.revolut.core.ui_kit.views.t(new TextClause(g1Var2.f143719b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 58));
                            }
                        }
                        return arrayList;
                }
            }
        });
        h hVar = (h) iii.c.f(t1.u(data3, data, planLayout), new r(6), new gcc.c(14), new fyg.b(this, domainState, 15));
        b bVar = (b) iii.c.f(planLayout, new r(7), new gcc.c(15), new k(this, 24));
        Intrinsics.checkNotNullParameter(planLayout, "planLayout");
        Intrinsics.checkNotNullParameter(planLayout, "planLayout");
        dok.e eVar = this.f103077b;
        Object obj2 = null;
        AnimatedBackgroundType animatedBackgroundType = (AnimatedBackgroundType) iii.c.f(planLayout, new doe.c(eVar, obj2, 2), new a8a.a(eVar, obj2, 20), new dbg.b(eVar, 7));
        g1 g1Var2 = (g1) planLayout.getContent();
        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = this.f103076a;
        if (g1Var2 == null || (str2 = g1Var2.f143720c) == null) {
            PlanPagerFlowContract$UiConfig.TitleConfig titleConfig = planPagerFlowContract$InputData.d.f103059a;
            if (titleConfig instanceof PlanPagerFlowContract$UiConfig.TitleConfig.Custom) {
                clause = ((PlanPagerFlowContract$UiConfig.TitleConfig.Custom) titleConfig).f103062a;
                final int i2 = 0;
                return new ghk.o(str3, clause, (NavBarMenuItem) iii.c.f(data2, new r(8), new gcc.c(11), new Function3(this) { // from class: ghk.c0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e f143951b;

                    {
                        this.f143951b = this;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj22, Object obj3, Object obj4) {
                        l0 l0Var;
                        ArrayList arrayList;
                        switch (i2) {
                            case 0:
                                h1 layout = (h1) obj22;
                                ((Boolean) obj3).booleanValue();
                                Intrinsics.checkNotNullParameter(layout, "layout");
                                i0 i0Var = layout.f143728c;
                                if (i0Var == null || (l0Var = i0Var.f143729a) == null) {
                                    return null;
                                }
                                return this.f143951b.f103078c.a(l0Var);
                            default:
                                Pair pair = (Pair) obj22;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                List list2 = (List) pair.f186385a;
                                h1 h1Var = (h1) pair.f186386b;
                                PlanLayoutType planLayoutType = this.f143951b.f103076a.d.f103060b;
                                planLayoutType.getClass();
                                if (planLayoutType instanceof PlanLayoutType.Default) {
                                    ArrayList<hha.d> arrayListS = d8l.d.s(h1Var.f143727b, list2);
                                    arrayList = new ArrayList(zhm.w.t(arrayListS, 10));
                                    for (hha.d dVar : arrayListS) {
                                        arrayList.add(new com.revolut.core.ui_kit.views.q(dVar.f152287a, new com.revolut.core.ui_kit.views.t(dok.g.d(dVar, null)), 58));
                                    }
                                } else {
                                    ArrayList<g1> arrayList2 = h1Var.f143727b;
                                    arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                                    for (g1 g1Var22 : arrayList2) {
                                        arrayList.add(new com.revolut.core.ui_kit.views.q(g1Var22.f143718a, new com.revolut.core.ui_kit.views.t(new TextClause(g1Var22.f143719b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 58));
                                    }
                                }
                                return arrayList;
                        }
                    }
                }), planPagerFlowContract$InputData.d.f103061c, list, hVar, bVar, animatedBackgroundType);
            }
            if (!(titleConfig instanceof PlanPagerFlowContract$UiConfig.TitleConfig.Default)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = (Clause) iii.c.f(t1.u(planLayout, data, data3), new r(4), new gcc.c(13), new k(23));
        } else {
            textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        clause = textClause;
        final int i22 = 0;
        return new ghk.o(str3, clause, (NavBarMenuItem) iii.c.f(data2, new r(8), new gcc.c(11), new Function3(this) { // from class: ghk.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.e f143951b;

            {
                this.f143951b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj22, Object obj3, Object obj4) {
                l0 l0Var;
                ArrayList arrayList;
                switch (i22) {
                    case 0:
                        h1 layout = (h1) obj22;
                        ((Boolean) obj3).booleanValue();
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        i0 i0Var = layout.f143728c;
                        if (i0Var == null || (l0Var = i0Var.f143729a) == null) {
                            return null;
                        }
                        return this.f143951b.f103078c.a(l0Var);
                    default:
                        Pair pair = (Pair) obj22;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        List list2 = (List) pair.f186385a;
                        h1 h1Var = (h1) pair.f186386b;
                        PlanLayoutType planLayoutType = this.f143951b.f103076a.d.f103060b;
                        planLayoutType.getClass();
                        if (planLayoutType instanceof PlanLayoutType.Default) {
                            ArrayList<hha.d> arrayListS = d8l.d.s(h1Var.f143727b, list2);
                            arrayList = new ArrayList(zhm.w.t(arrayListS, 10));
                            for (hha.d dVar : arrayListS) {
                                arrayList.add(new com.revolut.core.ui_kit.views.q(dVar.f152287a, new com.revolut.core.ui_kit.views.t(dok.g.d(dVar, null)), 58));
                            }
                        } else {
                            ArrayList<g1> arrayList2 = h1Var.f143727b;
                            arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                            for (g1 g1Var22 : arrayList2) {
                                arrayList.add(new com.revolut.core.ui_kit.views.q(g1Var22.f143718a, new com.revolut.core.ui_kit.views.t(new TextClause(g1Var22.f143719b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 58));
                            }
                        }
                        return arrayList;
                }
            }
        }), planPagerFlowContract$InputData.d.f103061c, list, hVar, bVar, animatedBackgroundType);
    }
}
