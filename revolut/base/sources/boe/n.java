package boe;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.flows.missing.b f17403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17404x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.tax_residency.impl.flows.missing.b bVar, gim.c cVar) {
        super(cVar);
        this.f17403w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17404x |= Integer.MIN_VALUE;
        return this.f17403w.P2(false, false, this);
    }
}
