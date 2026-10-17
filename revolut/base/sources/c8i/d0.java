package c8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.c {
    public int A;
    public long u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f22186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f22187x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f22188y;
    public final /* synthetic */ f0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.z = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f22188y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(0L, null, null, null, null, null, null, this);
    }
}
