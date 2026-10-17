package cya;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f110073l;

    public f(x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f110073l = deeplinkHandler;
    }

    public final void a2(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        V2(new cn0.d(this, url2, (Continuation) null, 26), new yi5.b(29));
    }
}
