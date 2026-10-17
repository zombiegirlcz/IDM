package w38;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends gim.c {
    public ProductAccountId u;
    public AccountId.Joint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f294196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f294197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f294198y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.f294197x = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f294196w = obj2;
        this.f294198y |= Integer.MIN_VALUE;
        return this.f294197x.h(null, this);
    }
}
