package ohb;

import yhm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public lhb.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f225341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225342x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f225341w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225342x |= Integer.MIN_VALUE;
        Object objI2 = j.I2(this.f225341w, this);
        return objI2 == fim.a.COROUTINE_SUSPENDED ? objI2 : new m(objI2);
    }
}
