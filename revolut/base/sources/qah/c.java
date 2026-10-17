package qah;

import kotlin.jvm.internal.Intrinsics;
import o9h.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f244036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sgh.a f244037b;

    public c(ln.a navigationCommandsDispatcher, sgh.a navigationProvider, g footerDisclosureRouter) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(footerDisclosureRouter, "footerDisclosureRouter");
        this.f244036a = navigationCommandsDispatcher;
        this.f244037b = navigationProvider;
    }
}
