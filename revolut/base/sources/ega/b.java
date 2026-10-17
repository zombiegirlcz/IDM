package ega;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f125573w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
