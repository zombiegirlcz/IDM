package grd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f146002w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f146002w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f146002w.emit(null, this);
    }
}
