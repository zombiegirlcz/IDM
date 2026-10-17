package nyd;

import wxd.p;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f220855w |= Integer.MIN_VALUE;
        Object objD = this.v.d(null, null, this);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : new p((String) objD);
    }
}
