package li5;

import yhm.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f195414w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f195414w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
