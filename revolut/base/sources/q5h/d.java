package q5h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f242402w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f242402w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f242402w.emit(null, this);
    }
}
