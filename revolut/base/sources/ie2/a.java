package ie2;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.swish.impl.domain.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f160622w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.revolut.feature.apm.swish.impl.domain.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f160622w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
