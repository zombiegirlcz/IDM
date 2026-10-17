package sui;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f265775w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f265775w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265775w.emit(null, this);
    }
}
