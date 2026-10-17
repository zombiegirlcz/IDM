package b22;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f11864w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f11864w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f11864w.emit(null, this);
    }
}
