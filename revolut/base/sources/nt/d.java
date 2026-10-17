package nt;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f218934w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f218934w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f218934w.emit(null, this);
    }
}
