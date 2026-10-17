package ood;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oce.c f227087w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(oce.c cVar, Continuation continuation) {
        super(continuation);
        this.f227087w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f227087w.emit(null, this);
    }
}
