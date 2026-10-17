package bem;

import aem.h1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class i implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f14889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f14890b;

    public i(h1 httpSendSender, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(httpSendSender, "httpSendSender");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f14889a = httpSendSender;
        this.f14890b = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f14890b;
    }
}
