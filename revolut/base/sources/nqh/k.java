package nqh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ njj.i f218465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(njj.i iVar, Continuation continuation) {
        super(continuation);
        this.f218465w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f218465w.emit(null, this);
    }
}
