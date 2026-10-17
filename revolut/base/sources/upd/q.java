package upd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u97.e f281986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u97.e eVar, Continuation continuation) {
        super(continuation);
        this.f281986w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f281986w.emit(null, this);
    }
}
