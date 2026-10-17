package z0f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f318271w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f318271w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f318271w.emit(null, this);
    }
}
