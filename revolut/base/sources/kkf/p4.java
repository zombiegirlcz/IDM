package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class p4 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.c f184883w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(k7i.c cVar, Continuation continuation) {
        super(continuation);
        this.f184883w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184883w.emit(null, this);
    }
}
