package hea;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.v f151655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f151656x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r10.v vVar, gim.c cVar) {
        super(cVar);
        this.f151655w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f151656x |= Integer.MIN_VALUE;
        Object objY = this.f151655w.y(null, this);
        if (objY == fim.a.COROUTINE_SUSPENDED) {
            return objY;
        }
        String str = (String) objY;
        if (str != null) {
            return new RegisteredIdentityId(str);
        }
        return null;
    }
}
