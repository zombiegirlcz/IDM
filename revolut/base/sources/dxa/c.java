package dxa;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f120924w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        this.u = obj2;
        this.f120924w |= Integer.MIN_VALUE;
        Object objB = this.v.b(null, null, null, this);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : new m(objB);
    }
}
