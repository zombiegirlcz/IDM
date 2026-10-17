package y0l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.d f310224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f310225b;

    public g(mm.d actionsDispatcher, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f310224a = actionsDispatcher;
        this.f310225b = navigationCommandsDispatcher;
    }
}
