package o5i;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f222444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f222445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qpk.b f222446c;
    public final mre.c d;

    public d(x deeplinkHandler, ln.a navigationCommandsDispatcher, qpk.b rateDetailsFeatureConfigProvider, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f222444a = deeplinkHandler;
        this.f222445b = navigationCommandsDispatcher;
        this.f222446c = rateDetailsFeatureConfigProvider;
        this.d = termsNavigationFactory;
    }

    public final h a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarS1 = lg0.b.s1(this.f222444a, deeplink, null, Boolean.FALSE, 2);
        d0VarS1.getClass();
        h hVar = new h(d0VarS1, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }
}
