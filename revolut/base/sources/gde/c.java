package gde;

import android.content.Context;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof HelpCentreFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        HelpCentreFeatureConfig config = (HelpCentreFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof HelpCentreFeatureConfig.Topic) {
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((HelpCentreFeatureConfig.Topic) config).f89351a, 14), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61)));
            return;
        }
        if (!(config instanceof HelpCentreFeatureConfig.TransactionTroubleshooting)) {
            throw new NoWhenBranchMatchedException();
        }
        HelpCentreFeatureConfig.TransactionTroubleshooting transactionTroubleshooting = (HelpCentreFeatureConfig.TransactionTroubleshooting) config;
        String str = transactionTroubleshooting.f89354b;
        List list = transactionTroubleshooting.d;
        String str2 = transactionTroubleshooting.e;
        boolean z = transactionTroubleshooting.f;
        String str3 = transactionTroubleshooting.f89355c;
        TransactionTroubleshooterDestination destination = new TransactionTroubleshooterDestination(new TransactionTroubleshooterDestination.TroubleshooterList(str, list, str2, z, str3 != null ? y0.b(str3) : null, 96));
        Intrinsics.checkNotNullParameter(destination, "destination");
        navigator.c(new FeatureCommand(new TransactionTroubleshooterFeatureConfig(null, destination, false, null, 0, 61)));
    }
}
