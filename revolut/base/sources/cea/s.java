package cea;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.c {
    public String u;
    public com.revolut.feature.pockets.impl.details_v2.linked_account_details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.linked_account_details.a f23458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23459y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f23458x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23457w = obj2;
        this.f23459y |= Integer.MIN_VALUE;
        return com.revolut.feature.pockets.impl.details_v2.linked_account_details.a.J2(this.f23458x, this);
    }
}
