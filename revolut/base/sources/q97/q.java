package q97;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f243770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f243770w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243770w.emit(null, this);
    }
}
