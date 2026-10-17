package uyc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f284151w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f284151w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284151w.emit(null, this);
    }
}
