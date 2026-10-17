package y3f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xv5.f f310722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xv5.f fVar, Continuation continuation) {
        super(continuation);
        this.f310722w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f310722w.emit(null, this);
    }
}
