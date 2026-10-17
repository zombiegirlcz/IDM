package q12;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public AccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f241315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241316x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f241315w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241316x |= Integer.MIN_VALUE;
        return this.f241315w.c(null, this, null);
    }
}
