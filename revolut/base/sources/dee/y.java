package dee;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f113428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f113428w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f113428w.emit(null, this);
    }
}
