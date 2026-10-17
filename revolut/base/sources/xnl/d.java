package xnl;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.passcode.change_flow.a f307515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f307516x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.sso.impl.ui.passcode.change_flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f307515w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f307516x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.passcode.change_flow.a.I2(this.f307515w, false, this);
    }
}
