package ys;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ymk.x f316346w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ymk.x xVar, Continuation continuation) {
        super(continuation);
        this.f316346w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f316346w.emit(null, this);
    }
}
