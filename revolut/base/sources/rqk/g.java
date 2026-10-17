package rqk;

import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256579w |= Integer.MIN_VALUE;
        Object objA = this.v.a(this);
        if (objA == fim.a.COROUTINE_SUSPENDED) {
            return objA;
        }
        String str = (String) objA;
        if (str != null) {
            return new IndividualIdentityId(str);
        }
        return null;
    }
}
