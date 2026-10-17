package amh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f6419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f6419w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f6419w.emit(null, this);
    }
}
