package oah;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public nii.g u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a f223648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223649x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar, gim.c cVar) {
        super(cVar);
        this.f223648w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f223649x |= Integer.MIN_VALUE;
        return this.f223648w.K2(null, this);
    }
}
