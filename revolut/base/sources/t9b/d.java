package t9b;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f268972w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f268972w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new RegisteredIdentityId((String) objA);
    }
}
