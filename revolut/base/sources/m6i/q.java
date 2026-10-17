package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public AccountWrapper u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f203196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203197x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f203196w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203197x |= Integer.MIN_VALUE;
        return this.f203196w.c(null, null, this);
    }
}
