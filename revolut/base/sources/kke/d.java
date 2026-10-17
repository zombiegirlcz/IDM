package kke;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tab.invest.api.TabInvestApi$Toggles;
import com.revolut.feature.tab.invest.api.declaration.InvestSettingsDestination;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreenContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f184583a;

    public d(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f184583a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return TabInvestApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InvestSettingsDestination) {
            return new InvestSettingsScreen(new InvestSettingsScreenContract$InputData(((InvestSettingsDestination) destination).f89828a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f184583a;
    }
}
