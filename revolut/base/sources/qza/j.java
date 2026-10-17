package qza;

import kotlin.jvm.internal.Intrinsics;
import rfm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements hn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f250462a;

    public j(ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f250462a = navigationCommandsDispatcher;
    }

    @Override // hn.a
    public final efm.d0 c(npi.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        f0 f0VarF = okl.m.w(null, null, null, 7, this.f250462a).f(efm.d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}
