package gde;

import android.content.Context;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.support.api.SupportApi$Toggles$AskAiHelpCentreV3;
import com.revolut.feature.support.api.SupportApi$Toggles$GetHelpButtonAtTopOnTransactionDetails;
import com.revolut.feature.support.api.SupportApi$Toggles$HelpCenterRevampLoading;
import com.revolut.feature.support.api.SupportApi$Toggles$InboundTransferImprovementsV3;
import com.revolut.feature.support.api.SupportApi$Toggles$NewLocateInboundTransferEntryPoints;
import com.revolut.feature.support.api.SupportApi$Toggles$PigeonFaq;
import com.revolut.feature.support.api.SupportApi$Toggles$ProactiveSupport;
import com.revolut.feature.support.api.SupportApi$Toggles$SupportTroubleshootingFlowKompotMigration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof FaqFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        FeatureCommand featureCommand;
        FaqFeatureConfig config = (FaqFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof FaqFeatureConfig.Categories) {
            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedHelpDestination((SharedHelpDestination.InputData) null, 3), false, (Integer) null, 0, 61));
        } else if (config instanceof FaqFeatureConfig.Entry) {
            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((FaqFeatureConfig.Entry) config).f73118a, 14), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61));
        } else {
            if (!(config instanceof FaqFeatureConfig.Starter)) {
                throw new NoWhenBranchMatchedException();
            }
            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((FaqFeatureConfig.Starter) config).f73121a, 14), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61));
        }
        navigator.c(featureCommand);
    }

    @Override // nte.a
    public final List e() {
        return v.k(SupportApi$Toggles$AskAiHelpCentreV3.f89336c, SupportApi$Toggles$PigeonFaq.f89341c, SupportApi$Toggles$GetHelpButtonAtTopOnTransactionDetails.f89337c, SupportApi$Toggles$HelpCenterRevampLoading.f89338c, SupportApi$Toggles$ProactiveSupport.f89342c, SupportApi$Toggles$InboundTransferImprovementsV3.f89339c, SupportApi$Toggles$NewLocateInboundTransferEntryPoints.f89340c, SupportApi$Toggles$SupportTroubleshootingFlowKompotMigration.f89344c);
    }
}
