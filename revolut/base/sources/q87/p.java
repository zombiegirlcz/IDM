package q87;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f243028w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f243028w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243028w.emit(null, this);
    }
}
