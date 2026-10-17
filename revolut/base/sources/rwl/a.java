package rwl;

import android.content.Context;
import com.revolut.feature.card_screen.api.navigation.RetailCardsScreenFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lwl.n;
import lwl.o;
import sab.b;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof RetailCardsScreenFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        RetailCardsScreenFeatureConfig config = (RetailCardsScreenFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof RetailCardsScreenFeatureConfig.ShowPinAuth) {
            o.Companion.getClass();
            RetailCardsScreenFeatureConfig.ShowPinAuth showPinAuth = (RetailCardsScreenFeatureConfig.ShowPinAuth) config;
            activityNavigateCommand = new ActivityNavigateCommand(n.a(), new LoginScreenContract$Configuration(b.SIGN_SHOW_PIN, null, null, showPinAuth.f65368a, 62), null, showPinAuth.f65368a, 0, null, null, null, null, false, 1012);
        } else {
            if (!(config instanceof RetailCardsScreenFeatureConfig.ResetContactlessLimit)) {
                throw new NoWhenBranchMatchedException();
            }
            o.Companion.getClass();
            RetailCardsScreenFeatureConfig.ResetContactlessLimit resetContactlessLimit = (RetailCardsScreenFeatureConfig.ResetContactlessLimit) config;
            activityNavigateCommand = new ActivityNavigateCommand(n.a(), new LoginScreenContract$Configuration(b.RESET_CARD_SCA_COUNTER, resetContactlessLimit.f65366a, null, null, 124), null, Integer.valueOf(resetContactlessLimit.f65367b), 0, null, null, null, null, false, 1012);
        }
        navigator.c(activityNavigateCommand);
    }
}
