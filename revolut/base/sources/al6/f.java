package al6;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a f6161y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.external_accounts.impl.ui.colombia.pse.topup.a aVar, gim.c cVar) {
        super(cVar);
        this.f6161y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6160x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f6161y.I2(null, null, false, this);
    }
}
