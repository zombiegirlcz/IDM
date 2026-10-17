package ie2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public com.revolut.feature.apm.swish.impl.domain.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.swish.impl.domain.a f160624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f160625x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.apm.swish.impl.domain.a aVar, gim.c cVar) {
        super(cVar);
        this.f160624w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f160625x |= Integer.MIN_VALUE;
        return this.f160624w.b(this);
    }
}
