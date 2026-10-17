package yna;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ymk.x f315371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ymk.x xVar, Continuation continuation) {
        super(continuation);
        this.f315371w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f315371w.emit(null, this);
    }
}
