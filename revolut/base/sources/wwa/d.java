package wwa;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f300638w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f300638w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
