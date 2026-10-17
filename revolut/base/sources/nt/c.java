package nt;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f218933w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f218933w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f218933w.emit(null, this);
    }
}
