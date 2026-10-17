package q97;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class b2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q5g.f f243655w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(q5g.f fVar, Continuation continuation) {
        super(continuation);
        this.f243655w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243655w.emit(null, this);
    }
}
