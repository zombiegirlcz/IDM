package tjh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dmf.a f271766w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dmf.a aVar, Continuation continuation) {
        super(continuation);
        this.f271766w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271766w.emit(null, this);
    }
}
