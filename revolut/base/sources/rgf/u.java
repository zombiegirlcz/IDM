package rgf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qx4.b f254175w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(qx4.b bVar, Continuation continuation) {
        super(continuation);
        this.f254175w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254175w.emit(null, this);
    }
}
