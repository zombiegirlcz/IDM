package d6e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f111505w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f111505w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111505w.emit(null, this);
    }
}
