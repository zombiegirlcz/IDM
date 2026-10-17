package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f203141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203142x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f203141w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203142x |= Integer.MIN_VALUE;
        return this.f203141w.a(null, null, this);
    }
}
