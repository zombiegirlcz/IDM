package s96;

import ami.n;
import yhm.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f261118w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f261118w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
