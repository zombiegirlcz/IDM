package z0k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f318624w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f318624w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f318624w.emit(null, this);
    }
}
