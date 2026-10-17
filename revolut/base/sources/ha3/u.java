package ha3;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f150427w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f150427w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f150427w.emit(null, this);
    }
}
