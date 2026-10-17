package ogk;

import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose$GetPlanOrHigher$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose$GetPlanOrHigher$Tier;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Current;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Tier;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Feature;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Tier;
import hha.u;
import hha.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static PlanFilter a(PlanUpgradePurpose purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        boolean z = purpose instanceof PlanUpgradePurpose.GetHigherPlan;
        PlanFilter$HigherThan$Current planFilter$HigherThan$Current = PlanFilter$HigherThan$Current.f103386a;
        PlanFilter.Current current = PlanFilter.Current.f103385a;
        if (z) {
            PlanFilter[] planFilterArr = {current, planFilter$HigherThan$Current};
            PlanFilter.INSTANCE.getClass();
            return PlanFilter.Companion.a(planFilterArr);
        }
        if (purpose instanceof PlanUpgradePurpose.GetFeature) {
            PlanFilter.Companion companion = PlanFilter.INSTANCE;
            PlanFilter[] filters = {planFilter$HigherThan$Current, new PlanFilter$With$Feature(((PlanUpgradePurpose.GetFeature) purpose).f103360a)};
            companion.getClass();
            Intrinsics.checkNotNullParameter(filters, "filters");
            return PlanFilter.Companion.a(current, new PlanFilter.And(kotlin.collections.d.v0(filters)));
        }
        if (purpose instanceof PlanUpgradePurpose.GetAnyFeature) {
            PlanFilter.Companion companion2 = PlanFilter.INSTANCE;
            List features = ((PlanUpgradePurpose.GetAnyFeature) purpose).f103358a;
            companion2.getClass();
            Intrinsics.checkNotNullParameter(features, "features");
            List list = features;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new PlanFilter$With$Feature((u) it8.next()));
            }
            PlanFilter[] filters2 = {planFilter$HigherThan$Current, new PlanFilter.Or(arrayList)};
            Intrinsics.checkNotNullParameter(filters2, "filters");
            return PlanFilter.Companion.a(current, new PlanFilter.And(kotlin.collections.d.v0(filters2)));
        }
        if (purpose instanceof PlanUpgradePurpose.GetAnyPlanOf) {
            PlanFilter.Companion companion3 = PlanFilter.INSTANCE;
            List planIds = ((PlanUpgradePurpose.GetAnyPlanOf) purpose).f103359a;
            companion3.getClass();
            Intrinsics.checkNotNullParameter(planIds, "planIds");
            List list2 = planIds;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new PlanFilter$With$Id((String) it9.next()));
            }
            PlanFilter[] filters3 = {planFilter$HigherThan$Current, new PlanFilter.Or(arrayList2)};
            Intrinsics.checkNotNullParameter(filters3, "filters");
            return new PlanFilter.And(kotlin.collections.d.v0(filters3));
        }
        if (purpose instanceof PlanUpgradePurpose$GetPlanOrHigher$Id) {
            PlanFilter.Companion companion4 = PlanFilter.INSTANCE;
            String str = ((PlanUpgradePurpose$GetPlanOrHigher$Id) purpose).f103363a;
            PlanFilter[] planFilterArr2 = {current, new PlanFilter.And(planFilter$HigherThan$Current, new PlanFilter.Or(new PlanFilter$With$Id(str), new PlanFilter$HigherThan$Id(str)))};
            companion4.getClass();
            return PlanFilter.Companion.a(planFilterArr2);
        }
        if (purpose instanceof PlanUpgradePurpose$GetPlanOrHigher$Tier) {
            PlanFilter.Companion companion5 = PlanFilter.INSTANCE;
            w0 w0Var = ((PlanUpgradePurpose$GetPlanOrHigher$Tier) purpose).f103364a;
            PlanFilter[] planFilterArr3 = {current, new PlanFilter.And(planFilter$HigherThan$Current, new PlanFilter.Or(new PlanFilter$With$Tier(w0Var), new PlanFilter$HigherThan$Tier(w0Var)))};
            companion5.getClass();
            return PlanFilter.Companion.a(planFilterArr3);
        }
        if (!(purpose instanceof PlanUpgradePurpose.GetPlanFromTier)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanFilter.Companion companion6 = PlanFilter.INSTANCE;
        w0 w0Var2 = ((PlanUpgradePurpose.GetPlanFromTier) purpose).f103362a;
        PlanFilter[] planFilterArr4 = {current, new PlanFilter$With$Tier(w0Var2), new PlanFilter$HigherThan$Tier(w0Var2)};
        companion6.getClass();
        return PlanFilter.Companion.a(planFilterArr4);
    }
}
