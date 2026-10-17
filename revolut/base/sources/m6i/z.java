package m6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.c {
    public ibd.a u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f203217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f203218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kbb.c f203219y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kbb.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f203219y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203218x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f203219y.v(null, this);
    }
}
