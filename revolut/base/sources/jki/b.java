package jki;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f175185w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f175185w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f175185w.emit(null, this);
    }
}
