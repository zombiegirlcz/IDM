package nnb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f217504w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f217504w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f217504w.emit(null, this);
    }
}
