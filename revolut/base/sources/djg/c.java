package djg;

import android.content.Context;
import com.revolut.feature.trusted_merchants.api.TrustedMerchantsApi$Toggles$TrustedMerchantsFlowKompotMigration;
import com.revolut.feature.trusted_merchants.api.TrustedMerchantsFeatureConfig;
import com.revolut.feature.trusted_merchants.api.navigation.TrustedMerchantsFlowDestination;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qjg.e;
import sri.m;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f115385a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f115385a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TrustedMerchantsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TrustedMerchantsFeatureConfig config = (TrustedMerchantsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        boolean z = config instanceof TrustedMerchantsFeatureConfig.TrustedMerchantsListFeatureConfig;
        gte.a aVar = this.f115385a;
        if (z) {
            if (((d) aVar).c(TrustedMerchantsApi$Toggles$TrustedMerchantsFlowKompotMigration.f94401c)) {
                navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TrustedMerchantsFlowDestination(TrustedMerchantsFlowDestination.StartType.MerchantList.f94416a), false, (Integer) null, 0, 61)));
                return;
            } else {
                e.Companion.getClass();
                navigator.c(new ActivityNavigateCommand(qjg.a.f246867b, null, null, null, 0, null, null, null, null, false, 1022));
                return;
            }
        }
        if (!(config instanceof TrustedMerchantsFeatureConfig.TrustedMerchantDetailsFeatureConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((d) aVar).c(TrustedMerchantsApi$Toggles$TrustedMerchantsFlowKompotMigration.f94401c)) {
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TrustedMerchantsFlowDestination(new TrustedMerchantsFlowDestination.StartType.MerchantDetails(((TrustedMerchantsFeatureConfig.TrustedMerchantDetailsFeatureConfig) config).f94402a)), false, (Integer) null, 0, 61)));
        } else {
            pjg.e.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(pjg.a.f236754b, new TrustedMerchantDetailsContract$Configuration(((TrustedMerchantsFeatureConfig.TrustedMerchantDetailsFeatureConfig) config).f94402a), null, null, 0, null, null, null, null, false, 1020));
        }
    }
}
