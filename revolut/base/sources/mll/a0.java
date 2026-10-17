package mll;

import com.revolut.sso.impl.domain.models.Claim;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends gim.c {
    public Claim.Email u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f207041x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f207040w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f207041x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.combined_authentication.flow.c.N2(this.f207040w, null, null, this);
    }
}
