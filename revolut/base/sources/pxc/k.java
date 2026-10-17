package pxc;

import com.revolut.feature.selfserve.sot.api.declaration.SotApi$Toggles$SotKompotMigration;
import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import com.revolut.feature.selfserve.sot.api.navigation.SotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f240608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f240609b;

    public k(gte.a featureToggleInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f240608a = navigator;
        this.f240609b = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "source-of-transactions");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(((jte.d) this.f240609b).c(SotApi$Toggles$SotKompotMigration.f85858c) ? new SotDestination(new SotDestination.Config.Sot(false)) : new BridgeDestination(new FeatureCommand(new SotFeatureConfig.Sot(false))), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new pfm.h(new phc.d(this, ((jte.d) this.f240609b).c(SotApi$Toggles$SotKompotMigration.f85858c) ? u0.f(new SotDestination(new SotDestination.Config.Sot(false))) : new FeatureCommand(new SotFeatureConfig.Sot(false)), 3), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
