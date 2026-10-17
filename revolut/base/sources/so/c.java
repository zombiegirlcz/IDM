package so;

import ecm.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import skm.a0;
import skm.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.a implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f264660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q handler) {
        super(z.f264021a);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f264660b = handler;
    }

    @Override // skm.a0
    public final void handleException(CoroutineContext context, Throwable exception) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        a aVar = b.Companion;
        this.f264660b.g("AnalyticsExceptionHandler", exception);
    }
}
