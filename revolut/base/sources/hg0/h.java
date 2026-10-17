package hg0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f3d.f f152052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f3d.f fVar, Continuation continuation) {
        super(continuation);
        this.f152052w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152052w.emit(null, this);
    }
}
