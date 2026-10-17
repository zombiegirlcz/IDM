package zmg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zj6.d f323506w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zj6.d dVar, Continuation continuation) {
        super(continuation);
        this.f323506w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f323506w.emit(null, this);
    }
}
