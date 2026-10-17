package b35;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0a.f f12003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b0a.f fVar, Continuation continuation) {
        super(continuation);
        this.f12003w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f12003w.emit(null, this);
    }
}
