package ayj;

import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.junior_upgrade.api.navigation.KompotJuniorUpgradeFeatureConfig;
import com.revolut.retail.feature.junior_upgrade.impl.model.PlanConfigurations;
import hha.d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import xfa.b;
import yik.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11253a;

    public a(h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f11253a = pricingPlanStringMapper;
    }

    public final FeatureCommand a(PlanConfigurations planConfigurations, d userPlan, b analyticSource, FeatureCommand nextCommand, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(planConfigurations, "planConfigurations");
        Intrinsics.checkNotNullParameter(userPlan, "userPlan");
        Intrinsics.checkNotNullParameter(analyticSource, "analyticSource");
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        Iterator it8 = planConfigurations.f101752b.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            int i = ((JuniorPlanConfiguration) next).f;
            do {
                Object next2 = it8.next();
                int i2 = ((JuniorPlanConfiguration) next2).f;
                if (i < i2) {
                    next = next2;
                    i = i2;
                }
            } while (it8.hasNext());
        }
        JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) next;
        return new FeatureCommand(new KompotJuniorUpgradeFeatureConfig.JuniorUpgrade(juniorPlanConfiguration.f, juniorPlanConfiguration.f76899b, juniorPlanConfiguration.d, fgk.b.a(this.f11253a, userPlan), analyticSource, nextCommand, naviCommand));
    }
}
