package g1e;

import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends oki.h {

    @NotNull
    public static final d Companion = new d();
    public final StockLendingOnboardingContract$Configuration o;

    public e(StockLendingOnboardingContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.o = configuration;
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            return;
        }
        c.Companion.getClass();
        C1(u0.b(new ActivityNavigateCommand(a.f139578b, this.o, null, 31452, 0, null, null, null, null, false, 1012)));
    }
}
