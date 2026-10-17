package sje;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f263716w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f263716w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f263716w.emit(null, this);
    }
}
