package com.revolut.retail.feature.pricing_plans.ui.impl.analytics;

import com.google.protobuf.b4;
import com.google.protobuf.d4;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.tracking.v3.PlansDashboardContext;
import cp5.c;
import ggk.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vc.o;
import xfa.b;
import yik.d;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f102961a;

    public a(d sourceMapper) {
        Intrinsics.checkNotNullParameter(sourceMapper, "sourceMapper");
        this.f102961a = sourceMapper;
    }

    public static PlansDashboardContext.a d(PlansDashboardContext.a aVar, xfa.a aVar2) {
        if (aVar2 != null) {
            LinkedHashMap linkedHashMap = aVar2.f305202a;
            if (!linkedHashMap.isEmpty()) {
                TreeMap treeMapE = q0.e(linkedHashMap);
                f3 f3VarNewBuilder = h3.newBuilder();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(treeMapE.size()));
                for (Map.Entry entry : treeMapE.entrySet()) {
                    Object key = entry.getKey();
                    b4 b4VarNewBuilder = d4.newBuilder();
                    b4VarNewBuilder.h((String) entry.getValue());
                    linkedHashMap2.put(key, (d4) b4VarNewBuilder.a());
                }
                f3VarNewBuilder.h(linkedHashMap2);
                w0 w0VarA = f3VarNewBuilder.a();
                Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                aVar.c();
                ((PlansDashboardContext) aVar.f49761b).setMetadata((h3) w0VarA);
            }
        }
        return aVar;
    }

    public final w0 a(PricingPlanAnalyticsSource source, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof PricingPlanAnalyticsSource.Predefined) {
            return b(((PricingPlanAnalyticsSource.Predefined) source).f102960a, aVar);
        }
        if (!(source instanceof PricingPlanAnalyticsSource.Custom)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        PlansDashboardContext.a aVarNewBuilder = PlansDashboardContext.newBuilder();
        String str = ((PricingPlanAnalyticsSource.Custom) source).f102959a;
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setSource(str);
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsOnboarding(false);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setIsOnboarding(...)");
        d(aVarNewBuilder, aVar);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public final w0 b(b source, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        PlansDashboardContext.a aVarNewBuilder = PlansDashboardContext.newBuilder();
        String strA = source.a();
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setSource(strA);
        g0 g0VarA = this.f102961a.a(source);
        boolean z = g0VarA == g0.ONBOARDING || g0VarA == g0.ONBOARDING_CREDIT;
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsOnboarding(z);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setIsOnboarding(...)");
        d(aVarNewBuilder, aVar);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public final w0 c(hha.d plan, b source, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(source, "source");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        PlansDashboardContext.a aVarNewBuilder = PlansDashboardContext.newBuilder();
        String str = plan.f152289c;
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setPlanName(str);
        String strA = source.a();
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setSource(strA);
        boolean zI = o.i(plan);
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsDiscount(zI);
        Intrinsics.checkNotNullParameter(plan, "<this>");
        boolean zK = o.k(c.q(plan));
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsFreetrial(zK);
        g0 g0VarA = this.f102961a.a(source);
        boolean z = g0VarA == g0.ONBOARDING || g0VarA == g0.ONBOARDING_CREDIT;
        aVarNewBuilder.c();
        ((PlansDashboardContext) aVarNewBuilder.f49761b).setIsOnboarding(z);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setIsOnboarding(...)");
        d(aVarNewBuilder, aVar);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
