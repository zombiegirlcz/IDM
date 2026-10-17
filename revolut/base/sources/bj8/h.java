package bj8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f15587w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f15587w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f15587w.emit(null, this);
    }
}
