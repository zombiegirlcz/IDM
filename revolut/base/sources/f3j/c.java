package f3j;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.expansion.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f131977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.beneficiary.impl.expansion.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f131977w |= Integer.MIN_VALUE;
        return this.v.a(null, null, null, null, this);
    }
}
