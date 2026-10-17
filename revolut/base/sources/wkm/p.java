package wkm;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final class p implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f298324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f298325b;

    public p(CoroutineContext coroutineContext, Throwable th10) {
        this.f298324a = coroutineContext;
        this.f298325b = th10;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj2, Function2 function2) {
        return this.f298324a.fold(obj2, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return this.f298324a.get(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return this.f298324a.minusKey(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f298324a.plus(coroutineContext);
    }
}
