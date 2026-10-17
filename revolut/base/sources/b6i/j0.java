package b6i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f12792w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f12792w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f12792w.emit(null, this);
    }
}
