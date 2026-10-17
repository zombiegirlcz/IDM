package ey5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f130574w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f130574w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f130574w.emit(null, this);
    }
}
