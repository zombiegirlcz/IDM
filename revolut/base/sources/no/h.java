package no;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends gim.c {
    public hlm.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.analytics.tracking.v3.a f217777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f217778x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.analytics.tracking.v3.a aVar, gim.c cVar) {
        super(cVar);
        this.f217777w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f217778x |= Integer.MIN_VALUE;
        return com.revolut.analytics.tracking.v3.a.a(this.f217777w, this);
    }
}
