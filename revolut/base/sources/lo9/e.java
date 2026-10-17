package lo9;

import k7c.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lk4.g;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f197425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f197426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f197427c;

    public e(kdh.b paymentWidgetFetcher, b paymentWidgetCache) {
        Intrinsics.checkNotNullParameter(paymentWidgetFetcher, "paymentWidgetFetcher");
        Intrinsics.checkNotNullParameter(paymentWidgetCache, "paymentWidgetCache");
        this.f197425a = paymentWidgetFetcher;
        this.f197426b = paymentWidgetCache;
        Continuation continuation = null;
        this.f197427c = new x4l.c(new x(this, continuation, 19), new g(this, 16), new lcc.c(this, 29), new le8.d(this, continuation, 27), new j40.d(this, continuation, 29));
    }
}
