package nol;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f218092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b f218093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f218094y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.sso.impl.ui.phone.change_flow.b bVar, gim.c cVar) {
        super(cVar);
        this.f218093x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f218092w = obj2;
        this.f218094y |= Integer.MIN_VALUE;
        return this.f218093x.L2(this, null, false);
    }
}
