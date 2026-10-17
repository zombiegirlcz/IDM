package mll;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f207079w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f207079w |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.combined_authentication.flow.c.J2(this.v, this);
    }
}
