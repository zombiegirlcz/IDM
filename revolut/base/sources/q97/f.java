package q97;

import com.revolut.feature.separate_favourites.api.alerts.AlertsFeatureConfig;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t97.d f243685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t97.c productCellProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f243685b = t97.d.ALERTS;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243685b;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey[] elements = {y1d.a.f310358b, y1d.a.f310359c, y1d.a.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new o97.l(new FeatureCommand(new AlertsFeatureConfig.AlertsScreen(new SharedAlertsConfiguration(kotlin.collections.d.y0(elements), (Set) null, (mgd.d) null, (SharedAlertsConfiguration.Action.CreateAlert) null, false, 62))));
    }
}
