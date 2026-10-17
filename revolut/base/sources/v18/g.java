package v18;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f285273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f285273w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f285273w.emit(null, this);
    }
}
