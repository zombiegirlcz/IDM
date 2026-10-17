package k50;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class g4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f181078w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f181078w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f181078w.emit(null, this);
    }
}
