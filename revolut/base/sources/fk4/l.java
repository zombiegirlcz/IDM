package fk4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f135712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f135712w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f135712w.emit(null, this);
    }
}
