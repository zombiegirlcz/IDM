package tjh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f271773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, Continuation continuation) {
        super(continuation);
        this.f271773w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271773w.emit(null, this);
    }
}
