package fc9;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.c {
    public a35.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.playbilling.e f133669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f133670x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.onboarding.impl.playbilling.e eVar, gim.c cVar) {
        super(cVar);
        this.f133669w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f133670x |= Integer.MIN_VALUE;
        Object objC = this.f133669w.c(null, this);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : new m(objC);
    }
}
