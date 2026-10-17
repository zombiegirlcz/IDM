package yna;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ymk.x f315367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ymk.x xVar, Continuation continuation) {
        super(continuation);
        this.f315367w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f315367w.emit(null, this);
    }
}
