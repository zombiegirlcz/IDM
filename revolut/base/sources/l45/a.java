package l45;

import android.content.Context;
import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import com.revolut.feature.credit.loan.api.navigation.LoanFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.forbearance_overdue.ForbearanceOverdueContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import y55.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof LoanFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        LoanFeatureConfig config = (LoanFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof LoanFeatureConfig.LoanForbearanceOverduePayment)) {
            throw new NoWhenBranchMatchedException();
        }
        b.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(y55.a.f310992b, new ForbearanceOverdueContract$Configuration(((LoanFeatureConfig.LoanForbearanceOverduePayment) config).f70218a), null, null, 0, null, null, null, null, false, 1020));
    }

    @Override // nte.a
    public final List e() {
        return LoanApi$Toggles.a();
    }
}
