package z0f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f318260w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f318260w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f318260w.emit(null, this);
    }
}
