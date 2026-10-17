package a5k;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public AccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f1466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1467x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, gim.c cVar) {
        super(cVar);
        this.f1466w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f1467x |= Integer.MIN_VALUE;
        return this.f1466w.b3(null, null, null, null, this);
    }
}
