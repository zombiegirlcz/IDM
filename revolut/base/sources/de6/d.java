package de6;

import android.content.Context;
import com.revolut.feature.extension_auth.api.ExtensionAuthApi$Toggles$ExtensionAuthFlowKompotMigration;
import com.revolut.feature.extension_auth.api.ExtensionAuthFeatureConfig;
import com.revolut.feature.extension_auth.api.navigation.ExtensionAuthDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import ge6.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements uri.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f113301a;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f113301a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ExtensionAuthFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ExtensionAuthFeatureConfig config = (ExtensionAuthFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (((jte.d) this.f113301a).c(ExtensionAuthApi$Toggles$ExtensionAuthFlowKompotMigration.f72162c)) {
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ExtensionAuthDestination(0), false, (Integer) null, 0, 61)));
        } else {
            e.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(ge6.a.f143232b, null, null, null, 0, null, null, null, null, false, 1022));
        }
    }

    @Override // nte.a
    public final List e() {
        return u.c(ExtensionAuthApi$Toggles$ExtensionAuthFlowKompotMigration.f72162c);
    }
}
