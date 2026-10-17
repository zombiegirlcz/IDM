package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class v5 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.c f184983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(k7i.c cVar, Continuation continuation) {
        super(continuation);
        this.f184983w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184983w.emit(null, this);
    }
}
