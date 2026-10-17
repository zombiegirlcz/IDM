package vkb;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289900w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f289900w |= Integer.MIN_VALUE;
        return this.v.Z2(null, null, this);
    }
}
