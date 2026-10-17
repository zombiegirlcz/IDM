package ble;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f16572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f16572w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f16572w.emit(null, this);
    }
}
