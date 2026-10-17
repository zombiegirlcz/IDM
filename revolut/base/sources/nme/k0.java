package nme;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f217305w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f217305w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f217305w.emit(null, this);
    }
}
