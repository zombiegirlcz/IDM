package ahf;

import com.revolut.core.model.account.AccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.c {
    public AccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f5070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5071x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f5070w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f5071x |= Integer.MIN_VALUE;
        return this.f5070w.b(null, this);
    }
}
