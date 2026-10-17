package he8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a f151599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f151600x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f151599w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f151600x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.I2(this.f151599w, null, this);
    }
}
