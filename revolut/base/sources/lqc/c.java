package lqc;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.salary_switch.api.SalarySwitchApi$Toggles$BrazilSalaryTransfers;
import com.revolut.feature.salary_switch.api.SalarySwitchApi$Toggles$CountrySalarySwitch;
import com.revolut.feature.salary_switch.api.navigation.SalaryAccountDetailsDestination;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlow;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wpc.d;
import wpc.k;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof k)) {
            return null;
        }
        k kVar = (k) descriptor;
        return kVar.a(new ShareSalaryDetailsScreen(kVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return v.k(SalarySwitchApi$Toggles$BrazilSalaryTransfers.f85224c, SalarySwitchApi$Toggles$CountrySalarySwitch.f85225c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SalarySwitchDestination) {
            SalarySwitchDestination salarySwitchDestination = (SalarySwitchDestination) destination;
            return new SalarySwitchFlow(new erc.c(salarySwitchDestination.getF85227a(), salarySwitchDestination.getF85228b()));
        }
        if (destination instanceof SalaryAccountDetailsDestination) {
            return new ShareSalaryDetailsScreen(new d(((SalaryAccountDetailsDestination) destination).getF85226a(), wpc.e.POPUP));
        }
        return null;
    }
}
