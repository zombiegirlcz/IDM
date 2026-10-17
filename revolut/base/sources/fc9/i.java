package fc9;

import yhm.m;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f133666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.playbilling.e f133667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f133668y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.onboarding.impl.playbilling.e eVar, gim.c cVar) {
        super(cVar);
        this.f133667x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        this.f133666w = obj2;
        this.f133668y |= Integer.MIN_VALUE;
        Object objB = this.f133667x.b(this);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : new m(objB);
    }
}
