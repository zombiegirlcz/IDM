package q6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.c {
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f242611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g0 f242612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f242613y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, gim.c cVar) {
        super(cVar);
        this.f242612x = g0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f242611w = obj2;
        this.f242613y |= Integer.MIN_VALUE;
        return this.f242612x.a(null, null, this);
    }
}
