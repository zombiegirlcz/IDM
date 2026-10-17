package fc9;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.playbilling.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f133665w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.onboarding.impl.playbilling.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f133665w |= Integer.MIN_VALUE;
        Object objA = this.v.a(this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new m(objA);
    }
}
