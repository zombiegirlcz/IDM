package aa7;

import com.revolut.core.ui_kit.delegates.SmartTileAssetViewLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nbh.c f2779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nbh.f f2780b;

    public m(nbh.a instrumentImageProvider, nbh.c instrumentInfoProvider, nbh.f instrumentRowProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(instrumentInfoProvider, "instrumentInfoProvider");
        Intrinsics.checkNotNullParameter(instrumentRowProvider, "instrumentRowProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f2779a = instrumentInfoProvider;
        this.f2780b = instrumentRowProvider;
    }

    public static koi.j a() {
        SmartTileAssetViewLoadingDelegate.Model model = new SmartTileAssetViewLoadingDelegate.Model("ASSET_SMART_TILE_LOADING_LIST_ID");
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
