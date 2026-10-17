package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kq.g f290050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f290051x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kq.g gVar, Continuation continuation) {
        super(continuation);
        this.f290050w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290050w.collect(null, this);
    }
}
