package jma;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements sla.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f176494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tla.d f176495b;

    public c(sri.m navigator, tla.d profileAppNavigationCommandsProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(profileAppNavigationCommandsProvider, "profileAppNavigationCommandsProvider");
        this.f176494a = navigator;
        this.f176495b = profileAppNavigationCommandsProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "change-passcode");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(((i) this.f176495b).b()), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        FeatureCommand featureCommandB = ((i) this.f176495b).b();
        sri.m mVar = this.f176494a;
        if (z) {
            mVar.c(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), featureCommandB));
        } else {
            mVar.c(featureCommandB);
        }
        ufm.b bVarM = d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
