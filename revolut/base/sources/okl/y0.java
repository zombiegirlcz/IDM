package okl;

import com.revolut.sso.impl.domain.models.Claim;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 extends gim.c {
    public Claim u;
    public gkl.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.revolut.sso.impl.ui.auth.n nVar, gim.c cVar) {
        super(cVar);
        this.f226252x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226251w = obj2;
        this.f226253y |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.auth.n.L2(this.f226252x, null, null, null, this);
    }
}
