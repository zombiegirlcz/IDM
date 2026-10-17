package wgb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f3d.f f297294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f3d.f fVar, Continuation continuation) {
        super(continuation);
        this.f297294w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f297294w.emit(null, this);
    }
}
