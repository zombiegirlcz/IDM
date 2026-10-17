package znc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zj6.d f323689w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zj6.d dVar, Continuation continuation) {
        super(continuation);
        this.f323689w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f323689w.emit(null, this);
    }
}
