package oqa;

import android.content.Context;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardAddCardFeatureConfig;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationFeatureConfig;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
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
        return config instanceof PushToCardAddCardFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        dqa.a aVar;
        PushToCardAddCardFeatureConfig config = (PushToCardAddCardFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        int i = a.f227875a[config.f81498a.ordinal()];
        if (i == 1) {
            aVar = dqa.a.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = dqa.a.LEGACY_RESULT;
        }
        navigator.c(new FeatureCommand(new CardOwnerCreationFeatureConfig(new CardOwnerCreationInputData(aVar, 6))));
    }
}
