package nol;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b f218098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f218099x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.sso.impl.ui.phone.change_flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f218098w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f218099x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.phone.change_flow.b.I2(this.f218098w, null, null, this);
    }
}
