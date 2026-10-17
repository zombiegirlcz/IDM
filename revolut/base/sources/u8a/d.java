package u8a;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public com.revolut.feature.pix.impl.flow.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.b f278146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f278147x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.pix.impl.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f278146w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f278147x |= Integer.MIN_VALUE;
        return com.revolut.feature.pix.impl.flow.b.J2(this.f278146w, null, this);
    }
}
