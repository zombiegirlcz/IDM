package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class t0 implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f163088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f163089b;

    public t0(e0 channel, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f163088a = channel;
        this.f163089b = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f163089b;
    }
}
