package iql;

import com.revolut.sso.impl.domain.models.Claim;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.c {
    public Claim u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signup.b f167903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f167904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.sso.impl.ui.signup.b bVar, gim.c cVar) {
        super(cVar);
        this.f167903w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f167904x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.signup.b.J2(this.f167903w, null, this);
    }
}
