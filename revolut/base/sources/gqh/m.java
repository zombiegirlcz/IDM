package gqh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f145744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f145744w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f145744w.emit(null, this);
    }
}
