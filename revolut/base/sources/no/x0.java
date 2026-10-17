package no;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.analytics.tracking.v3.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f217866w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.revolut.analytics.tracking.v3.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f217866w |= Integer.MIN_VALUE;
        return com.revolut.analytics.tracking.v3.f.b(this.v, this);
    }
}
