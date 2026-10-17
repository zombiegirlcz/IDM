package nol;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f218100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b f218101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f218102y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.sso.impl.ui.phone.change_flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f218101x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f218100w = obj2;
        this.f218102y |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.phone.change_flow.b.J2(this.f218101x, null, this);
    }
}
