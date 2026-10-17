package iz3;

import iz1.p;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f169848l;

    public c(x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f169848l = deeplinkHandler;
    }

    @Override // iz3.a
    public final void Z2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        T2(new p(this, url2, null, 1), new yi5.b(27));
    }
}
