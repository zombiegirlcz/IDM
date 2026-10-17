package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.c f184901w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(k7i.c cVar, Continuation continuation) {
        super(continuation);
        this.f184901w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184901w.emit(null, this);
    }
}
