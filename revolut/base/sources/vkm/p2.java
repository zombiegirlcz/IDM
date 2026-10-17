package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class p2 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f290098a;

    public p2(Throwable th10) {
        this.f290098a = th10;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) throws Throwable {
        throw this.f290098a;
    }
}
