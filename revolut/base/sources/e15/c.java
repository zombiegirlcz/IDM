package e15;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f121879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f121879w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f121879w.emit(null, this);
    }
}
