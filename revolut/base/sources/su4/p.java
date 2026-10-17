package su4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f265658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f265658w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265658w.emit(null, this);
    }
}
