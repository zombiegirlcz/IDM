package cea;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.linked_account_details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f23460w |= Integer.MIN_VALUE;
        return com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.K2(this.v, this);
    }
}
