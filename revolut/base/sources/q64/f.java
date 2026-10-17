package q64;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f242481w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f242481w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f242481w.emit(null, this);
    }
}
