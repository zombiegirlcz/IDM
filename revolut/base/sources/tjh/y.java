package tjh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f271776w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f271776w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271776w.emit(null, this);
    }
}
