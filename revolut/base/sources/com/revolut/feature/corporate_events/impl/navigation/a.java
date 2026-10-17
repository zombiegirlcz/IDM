package com.revolut.feature.corporate_events.impl.navigation;

import android.content.Context;
import com.revolut.feature.corporate_events.impl.navigation.CorporateEventsHomeFeatureConfig;
import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CorporateEventsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        CorporateEventsFeatureConfig config = (CorporateEventsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof CorporateEventsFeatureConfig.CorporateEventsConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        navigator.c(new FeatureCommand(new CorporateEventsHomeFeatureConfig.CorporateEventsHome((CorporateEventsFeatureConfig.CorporateEventsConfig) config)));
    }
}
