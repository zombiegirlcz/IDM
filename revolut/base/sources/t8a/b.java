package t8a;

import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;
import tqi.g;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c70.a f268874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f268875m;

    public b(c70.a clipboard, g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.f268874l = clipboard;
        this.f268875m = shareNaviCommandFactory;
    }

    @Override // t8a.a
    public final void Z2(PixKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f268874l.a(null, key.getF80405a(), false);
    }

    @Override // t8a.a
    public final BridgeDestination b3(PixKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return u0.b(this.f268875m.f(0, "", key.getF80405a()));
    }
}
