package s0l;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rx6.e f258974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rx6.e eVar, Continuation continuation) {
        super(continuation);
        this.f258974w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f258974w.emit(null, this);
    }
}
