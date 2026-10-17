package h2k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a8k.c f148860w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a8k.c cVar, Continuation continuation) {
        super(continuation);
        this.f148860w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f148860w.emit(null, this);
    }
}
