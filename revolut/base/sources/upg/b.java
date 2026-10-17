package upg;

import android.content.Context;
import com.revolut.feature.vaults.api.navigation.VaultsFeatureConfig;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import sri.m;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof VaultsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        VaultsFeatureConfig config = (VaultsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof VaultsFeatureConfig.EditRecurringTransfer) {
            VaultsFeatureConfig.EditRecurringTransfer editRecurringTransfer = (VaultsFeatureConfig.EditRecurringTransfer) config;
            String str = editRecurringTransfer.f94703a;
            String str2 = editRecurringTransfer.f94704b;
            navigator.c(new FeatureCommand(new VaultsKompotFeatureConfig.RecurringTransfer(new VaultsKompotFeatureConfig.RecurringTransfer.Config(editRecurringTransfer.e, editRecurringTransfer.d, editRecurringTransfer.f, str, str2, null))));
            return;
        }
        if (config instanceof VaultsFeatureConfig.Withdraw) {
            navigator.c(new FeatureCommand(new VaultsKompotFeatureConfig.WithdrawMoney(((VaultsFeatureConfig.Withdraw) config).f94708a)));
        } else {
            if (!(config instanceof VaultsFeatureConfig.OneTimeFunding)) {
                throw new NoWhenBranchMatchedException();
            }
            s sVar = ((VaultsFeatureConfig.OneTimeFunding) config).f94706a;
            navigator.c(new FeatureCommand(new VaultsKompotFeatureConfig.AddMoney(new VaultsKompotFeatureConfig.AddMoney.Config(sVar, sVar.e(), null, false, false, null, 1020))));
        }
    }
}
