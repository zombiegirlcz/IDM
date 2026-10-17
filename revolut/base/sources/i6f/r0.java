package i6f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f158968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f158968w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158968w.emit(null, this);
    }
}
