package g9h;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static BridgeDestination a(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        b(asset);
        return u0.b(DummyCommand.f98635a);
    }

    public static void b(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        hx7.e.n(new IllegalStateException(a0.d.r(asset.b().f288358b.name(), " assetType is not supported")));
    }
}
