package vge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a87.f f288864w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a87.f fVar, Continuation continuation) {
        super(continuation);
        this.f288864w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288864w.emit(null, this);
    }
}
