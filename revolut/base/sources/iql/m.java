package iql;

import com.revolut.sso.impl.domain.models.Claim;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.c {
    public Claim.Email u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signup.b f167905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f167906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.sso.impl.ui.signup.b bVar, gim.c cVar) {
        super(cVar);
        this.f167905w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f167906x |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.signup.b.I2(this.f167905w, null, null, this);
    }
}
