package q95;

import com.revolut.feature.credit.overdraft.api.navigation.OverdraftDetailsFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ibb.c;
import kotlin.jvm.internal.Intrinsics;
import o95.g;
import o95.i;
import q03.m;
import te0.w;
import w4l.k;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements vx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f243639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f243640b;

    public b(g overdraftProductFeatureTogglesInteractor, i overdraftProductInteractor) {
        Intrinsics.checkNotNullParameter(overdraftProductFeatureTogglesInteractor, "overdraftProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(overdraftProductInteractor, "overdraftProductInteractor");
        this.f243639a = overdraftProductFeatureTogglesInteractor;
        this.f243640b = overdraftProductInteractor;
    }

    public static FeatureCommand c(String str) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(c.f160140a.f83420a, null), null, new FeatureCommand(new OverdraftDetailsFeatureConfig(str)), 2)));
    }

    @Override // vx4.b
    public final d0 a(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return w.o0(kotlin.coroutines.g.f186406a, new m(this, loadingStrategy, null, 22));
    }

    @Override // vx4.a
    public final FeatureCommand b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        return c(facilityId);
    }
}
