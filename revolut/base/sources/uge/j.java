package uge;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.impl.navigation.ThemeCustomisationDeeplinkDescriptor;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f280032a;

    public j(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f280032a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "home") && Intrinsics.f(cVar.e(2), "theme-customisation");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new ThemeCustomisationDeeplinkDescriptor(Intrinsics.f((String) cVar.d.get("tab"), "mode") ? cm2.i.MODE : null))), null, null, 12)), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new to7.f(this, deeplink, 6), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
