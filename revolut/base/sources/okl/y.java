package okl;

import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.sso.impl.ui.auth.n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226250w |= Integer.MIN_VALUE;
        Object objI2 = com.revolut.sso.impl.ui.auth.n.I2(this.v, this);
        if (objI2 == fim.a.COROUTINE_SUSPENDED) {
            return objI2;
        }
        String str = (String) objI2;
        if (str != null) {
            return new IndividualIdentityId(str);
        }
        return null;
    }
}
