package c2l;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.travel_status.impl.ui.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20829w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.travel_status.impl.ui.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f20829w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.travel_status.impl.ui.flow.b.I2(this.v, null, this);
    }
}
