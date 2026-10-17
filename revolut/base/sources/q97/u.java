package q97;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.c {
    public AccountId.Personal u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f243796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f243797x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.f243796w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f243797x |= Integer.MIN_VALUE;
        return this.f243796w.g(this);
    }
}
