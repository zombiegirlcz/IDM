package s2i;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import okl.m;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements b, k1i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1i.k f259363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f259364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mde.e f259365c;

    public j(ln.a navigationCommandsDispatcher, k1i.k exchangeFeeRouter, mde.e sharedHelpDestinationProvider) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(exchangeFeeRouter, "exchangeFeeRouter");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        this.f259363a = exchangeFeeRouter;
        this.f259364b = navigationCommandsDispatcher;
        this.f259365c = sharedHelpDestinationProvider;
    }

    @Override // t2i.c, u2i.s
    public final efm.b a(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        return this.f259364b.a(naviCommand);
    }

    @Override // k1i.c
    public final efm.b b() {
        return this.f259363a.b();
    }

    @Override // t2i.c
    public final efm.b finish() {
        return m.w(null, null, null, 7, this.f259364b);
    }
}
