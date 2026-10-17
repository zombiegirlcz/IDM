package no;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f217831w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f217831w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f217831w.emit(null, this);
    }
}
