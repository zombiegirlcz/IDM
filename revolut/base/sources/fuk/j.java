package fuk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fod.i f138244w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fod.i iVar, Continuation continuation) {
        super(continuation);
        this.f138244w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f138244w.emit(null, this);
    }
}
