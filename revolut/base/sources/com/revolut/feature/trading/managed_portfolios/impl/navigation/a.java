package com.revolut.feature.trading.managed_portfolios.impl.navigation;

import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow;
import com.revolut.feature.trading.managed_portfolios.impl.navigation.ManagedPortfoliosInternalDestination;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsControllerContract$InputData;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    @NotNull
    public static final d6f.a Companion = new d6f.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f91261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f91262b;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f91261a = featureToggleInteractor;
        this.f91262b = y0.b("templates/tactical-allocation/{tacticalAllocationId}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f91262b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("tacticalAllocationId");
        if (str == null) {
            return null;
        }
        if (((d) this.f91261a).c(ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow.f91227c)) {
            return new ManagedPortfoliosInternalDestination.TacticalAllocationDestination(new TacticalAllocationsControllerContract$InputData(str));
        }
        return null;
    }
}
