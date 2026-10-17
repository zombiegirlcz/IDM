package s8h;

import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements i0h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f260993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f260994b;

    public b(sri.m navigator, a collectionNaviCommandsProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(collectionNaviCommandsProvider, "collectionNaviCommandsProvider");
        this.f260993a = navigator;
        this.f260994b = yhm.j.b(new s8f.h(1));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "collections");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(u0.f(ScreenerRedesignAllCollectionsDestination.f96104a)), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new c86.d(this, z, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
