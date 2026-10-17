package xq8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public com.revolut.feature.junior_transfer.impl.ui.add_money.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.add_money.c f308131x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f308132y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.junior_transfer.impl.ui.add_money.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f308131x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f308130w = obj2;
        this.f308132y |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_transfer.impl.ui.add_money.c.I2(this.f308131x, null, this);
    }
}
