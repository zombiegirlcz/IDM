package kce;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8e.a f182719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9e.c f182720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v60.i f182721c;

    public r(z8e.a appNavigationProvider, c9e.c subscriptionNavigationProvider) {
        Intrinsics.checkNotNullParameter(appNavigationProvider, "appNavigationProvider");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        this.f182719a = appNavigationProvider;
        this.f182720b = subscriptionNavigationProvider;
        v60.i iVar = new v60.i();
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        this.f182721c = iVar;
    }

    public final pfm.h a(NaviCommand naviCommand) {
        pfm.h hVar = new pfm.h(new hc7.a(this, naviCommand, 18), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
