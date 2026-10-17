package sie;

import aii.u;
import com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditHub;
import com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditTab;
import com.revolut.feature.tab.credit.api.navigation.CreditTabRestoreNavigationDestination;
import com.revolut.feature.tab.credit.impl.ui.restore.CreditTabRestoreFlow;
import com.revolut.feature.tab.credit.impl.ui.restore.CreditTabRestoreFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(TabCreditApi$Toggles$CreditTab.f89768c, TabCreditApi$Toggles$CreditHub.f89767c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CreditTabRestoreNavigationDestination) {
            return new CreditTabRestoreFlow(new CreditTabRestoreFlowContract$InputData(((CreditTabRestoreNavigationDestination) destination).f89769a));
        }
        return null;
    }
}
