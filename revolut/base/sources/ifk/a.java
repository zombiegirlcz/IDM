package ifk;

import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import iha.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f161033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f161034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f161035c;

    static {
        iha.a aVar = iha.a.NON_USEFUL_BENEFITS;
        Pair pair = new Pair("NON_USEFUL_BENEFITS", aVar);
        iha.a aVar2 = iha.a.UNFAIR_PRICE;
        Pair pair2 = new Pair("UNFAIR_PRICE", aVar2);
        iha.a aVar3 = iha.a.UNHAPPY_WITH_CUSTOMER_SUPPORT;
        Pair pair3 = new Pair("UNHAPPY_WITH_CUSTOMER_SUPPORT", aVar3);
        iha.a aVar4 = iha.a.UNHAPPY_WITH_PLAN_CHANGES;
        Pair pair4 = new Pair("UNHAPPY_WITH_PLAN_CHANGES", aVar4);
        iha.a aVar5 = iha.a.NON_WORKING_FEATURES;
        Pair pair5 = new Pair("NON_WORKING_FEATURES", aVar5);
        iha.a aVar6 = iha.a.NON_AVAILABLE_FEATURES;
        Pair pair6 = new Pair("NON_AVAILABLE_FEATURES", aVar6);
        iha.a aVar7 = iha.a.ACCIDENTAL_UPGRADE;
        Pair pair7 = new Pair("ACCIDENTAL_UPGRADE", aVar7);
        iha.a aVar8 = iha.a.NO_LONGER_NEEDED_BENEFITS;
        Pair pair8 = new Pair("NO_LONGER_NEEDED_BENEFITS", aVar8);
        iha.a aVar9 = iha.a.TRAVEL_INSURANCE_REMOVAL;
        Pair pair9 = new Pair("TRAVEL_INSURANCE_REMOVAL", aVar9);
        iha.a aVar10 = iha.a.OTHER;
        f161033a = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("OTHER", aVar10));
        f161034b = r0.k(new Pair(aVar, "NON_USEFUL_BENEFITS"), new Pair(aVar2, "UNFAIR_PRICE"), new Pair(aVar3, "UNHAPPY_WITH_CUSTOMER_SUPPORT"), new Pair(aVar4, "UNHAPPY_WITH_PLAN_CHANGES"), new Pair(aVar5, "NON_WORKING_FEATURES"), new Pair(aVar6, "NON_AVAILABLE_FEATURES"), new Pair(aVar7, "ACCIDENTAL_UPGRADE"), new Pair(aVar8, "NO_LONGER_NEEDED_BENEFITS"), new Pair(aVar9, "TRAVEL_INSURANCE_REMOVAL"), new Pair(aVar10, "OTHER"));
        f161035c = r0.k(new Pair(x.IN_LESS_THAN_3_MONTHS, "IN_LESS_THAN_3_MONTHS"), new Pair(x.IN_3_TO_6_MONTHS, "IN_3_TO_6_MONTHS"), new Pair(x.IN_6_TO_12_MONTHS, "IN_6_TO_12_MONTHS"), new Pair(x.IN_MORE_THAN_12_MONTHS, "IN_MORE_THAN_12_MONTHS"), new Pair(x.NOT_PLANNING_TO_UPGRADE, "NOT_PLANNING_TO_UPGRADE"));
    }

    public static final String a(PricingPlanUpdateSource pricingPlanUpdateSource) {
        Intrinsics.checkNotNullParameter(pricingPlanUpdateSource, "<this>");
        if (pricingPlanUpdateSource instanceof PricingPlanUpdateSource.Dynamic) {
            return ((PricingPlanUpdateSource.Dynamic) pricingPlanUpdateSource).f81151a;
        }
        if (Intrinsics.f(pricingPlanUpdateSource, PricingPlanUpdateSource.Offboarding.f81152a)) {
            return "offboarding";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String b(iha.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return (String) u1.t(aVar, "OTHER", f161034b);
    }
}
