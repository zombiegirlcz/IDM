package oji;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f225787a;

    public d(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f225787a = ue0.e.c(context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj2, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return this.f225787a.fold(obj2, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225787a.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f225787a.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new d(this.f225787a.plus(ue0.e.c(context)));
    }
}
