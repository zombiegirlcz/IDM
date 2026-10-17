package xzk;

import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends nri.a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f310046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mm.d f310047c;
    public final c d;
    public final ifm.b e;
    public final zzk.a f;

    public h(ln.a navigationCommandsDispatcher, mm.d actionsDispatcher, c state, ifm.b compositeDisposable, zzk.a nationalIdentifiersUtils) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(nationalIdentifiersUtils, "nationalIdentifiersUtils");
        this.f310046b = navigationCommandsDispatcher;
        this.f310047c = actionsDispatcher;
        this.d = state;
        this.e = compositeDisposable;
        this.f = nationalIdentifiersUtils;
    }

    @Override // nri.a
    public final void i3() {
        this.e.a(j3(false).v());
    }

    public final efm.b j3(boolean z) {
        e0l.e.Companion.getClass();
        FragmentNavigateCommand fragmentNavigateCommand = new FragmentNavigateCommand(e0l.a.f121727b, null, true, 2042);
        if (z) {
            fragmentNavigateCommand = n.g(fragmentNavigateCommand);
        }
        return this.f310046b.a(fragmentNavigateCommand);
    }
}
