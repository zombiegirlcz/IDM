package e6h;

import aii.p;
import aii.u;
import com.revolut.feature.wealth.gia.margin_trading.impl.navigation.internal_destinations.MarginStatusDestination;
import com.revolut.feature.wealth.gia.margin_trading.impl.navigation.internal_destinations.WealthMarginMinimumRequirementDestination;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementContract$InputData;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreenContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MarginStatusDestination) {
            return new MarginStatusScreen(new MarginStatusScreenContract$InputData(((MarginStatusDestination) destination).f95450b));
        }
        if (destination instanceof WealthMarginMinimumRequirementDestination) {
            return new WealthMarginMinimumRequirementScreen(new WealthMarginMinimumRequirementContract$InputData(((WealthMarginMinimumRequirementDestination) destination).f95452b));
        }
        return null;
    }
}
