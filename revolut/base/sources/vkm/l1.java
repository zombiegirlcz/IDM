package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class l1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pe0.k f290064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(pe0.k kVar, Continuation continuation) {
        super(continuation);
        this.f290064w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290064w.emit(null, this);
    }
}
