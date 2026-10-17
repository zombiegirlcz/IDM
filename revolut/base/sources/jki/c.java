package jki;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f175186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f175186w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f175186w.emit(null, this);
    }
}
