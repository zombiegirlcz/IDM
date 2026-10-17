package da8;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a f112487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112488x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar, gim.c cVar) {
        super(cVar);
        this.f112487w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112488x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a.I2(this.f112487w, null, this);
    }
}
