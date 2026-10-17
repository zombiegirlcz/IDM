package tda;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.api.navigation.PocketsListDestination;
import com.revolut.feature.pockets.api.navigation.PocketsListFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PocketsListFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        PocketListType joint;
        PocketsListFeatureConfig config = (PocketsListFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        int i = a.f269941a[config.f80784a.ordinal()];
        if (i == 1) {
            AccountId accountId = config.f80785b;
            if (accountId instanceof AccountId.Joint) {
                joint = new PocketListType.Joint((AccountId.Joint) accountId);
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                joint = PocketListType.Main.f80780a;
            }
        } else if (i == 2) {
            joint = PocketListType.Pro.f80781a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            joint = PocketListType.RevXFiat.f80782a;
        }
        navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PocketsListDestination(joint), false, (Integer) null, 0, 61)));
    }
}
