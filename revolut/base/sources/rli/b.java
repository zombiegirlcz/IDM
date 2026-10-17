package rli;

import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f255079w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f255079w |= Integer.MIN_VALUE;
        Object objA = this.v.a(this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
