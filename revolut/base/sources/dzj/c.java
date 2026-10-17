package dzj;

import android.content.Context;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.limits.api.LimitsApi$Toggles$MexicoHideAtmLimits;
import com.revolut.retail.feature.limits.api.LimitsApi$Toggles$PortugalExchangeLimitOnlyCurrency;
import com.revolut.retail.feature.limits.api.navigation.LimitsFeatureConfig;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsDestination;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$InputData;
import com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow.LimitsPromptFlowContract$Configuration;
import com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow.LimitsPromptFlowContract$Limit;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nzj.f;
import sri.m;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof LimitsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand featureCommand;
        LimitsPromptFlowContract$Limit limitsPromptFlowContract$Limit;
        LimitsFeatureConfig config = (LimitsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof LimitsFeatureConfig.LimitPrompt) {
            f.Companion.getClass();
            ExplicitActivityDestination explicitActivityDestination = nzj.a.f221074b;
            LimitsFeatureConfig.LimitPrompt limitPrompt = (LimitsFeatureConfig.LimitPrompt) config;
            int i = b.f121353a[limitPrompt.f101776a.ordinal()];
            if (i == 1) {
                limitsPromptFlowContract$Limit = LimitsPromptFlowContract$Limit.Fx.f101790a;
            } else if (i == 2) {
                limitsPromptFlowContract$Limit = LimitsPromptFlowContract$Limit.WalletDaily.f101791a;
            } else if (i == 3) {
                limitsPromptFlowContract$Limit = LimitsPromptFlowContract$Limit.WalletWeekly.f101792a;
            } else if (i == 4) {
                limitsPromptFlowContract$Limit = LimitsPromptFlowContract$Limit.WalletYearly.f101793a;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                limitsPromptFlowContract$Limit = LimitsPromptFlowContract$Limit.Atm.f101789a;
            }
            featureCommand = new ActivityNavigateCommand(explicitActivityDestination, new LimitsPromptFlowContract$Configuration(limitsPromptFlowContract$Limit, limitPrompt.f101777b), null, null, 0, null, null, null, null, false, 1020);
        } else {
            if (!(config instanceof LimitsFeatureConfig.Limits)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitsFeatureConfig.Limits limits = (LimitsFeatureConfig.Limits) config;
            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SettingsLimitsDestination(new SettingsLimitsFlowContract$InputData(limits.f101779b, limits.f101778a)), false, (Integer) null, 0, 61));
        }
        navigator.c(featureCommand);
    }

    @Override // nte.a
    public final List e() {
        return v.k(LimitsApi$Toggles$MexicoHideAtmLimits.f101774c, LimitsApi$Toggles$PortugalExchangeLimitOnlyCurrency.f101775c);
    }
}
