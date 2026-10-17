package z55;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yuc.d f319519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(yuc.d dVar, Continuation continuation) {
        super(continuation);
        this.f319519w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f319519w.emit(null, this);
    }
}
