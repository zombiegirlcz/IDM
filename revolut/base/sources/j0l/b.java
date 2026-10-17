package j0l;

import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import h0l.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h {

    @NotNull
    public static final a Companion = new a();
    public final TradingOnboardingBackendFlowContract$Configuration o;

    public b(TradingOnboardingBackendFlowContract$Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.o = config;
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            return;
        }
        f.Companion.getClass();
        C1(u0.b(new ActivityNavigateCommand(h0l.a.f148430b, this.o, null, 9876, 0, null, null, null, null, false, 1012)));
    }
}
