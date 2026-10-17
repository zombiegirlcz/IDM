package qma;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.details.address.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f247790w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.profile.impl.ui.details.address.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f247790w |= Integer.MIN_VALUE;
        return com.revolut.feature.profile.impl.ui.details.address.flow.c.I2(this.v, null, this);
    }
}
