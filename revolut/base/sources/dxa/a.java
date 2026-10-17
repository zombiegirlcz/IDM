package dxa;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f120921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        this.u = obj2;
        this.f120921w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
