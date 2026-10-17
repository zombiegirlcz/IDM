package vo5;

import android.content.Context;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoWithdrawFeatureConfig;
import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$SendToConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import wp5.e;
import wp5.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CryptoWithdrawFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        CryptoWithdrawFeatureConfig config = (CryptoWithdrawFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof CryptoWithdrawFeatureConfig.Withdraw)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoWithdrawFeatureConfig.Withdraw withdraw = (CryptoWithdrawFeatureConfig.Withdraw) config;
        xi0.b bVar = withdraw.f71146c;
        WithdrawFinishBehavior withdrawFinishBehavior = withdraw.f71144a;
        String str = withdraw.f71145b;
        p.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(e.f299116b, bVar == null ? new CryptoWithdrawToAddressReviewContract$SendToConfig.ExistingAddress(str, withdrawFinishBehavior) : new CryptoWithdrawToAddressReviewContract$SendToConfig.MatchOrCreateAddressForCurrency(withdrawFinishBehavior, str, bVar), null, null, 0, null, null, null, null, false, 1020));
    }
}
