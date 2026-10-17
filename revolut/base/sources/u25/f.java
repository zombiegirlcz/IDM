package u25;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f276552w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f276552w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f276552w.emit(null, this);
    }
}
