package rz3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x94.e f258500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f258501b;

    public b(x94.e router, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f258500a = router;
        this.f258501b = navigationCommandsDispatcher;
    }
}
