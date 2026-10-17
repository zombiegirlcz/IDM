package r7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.c {
    public pcd.s u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x5i.d f252258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f252259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a0 f252260y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.f252260y = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f252259x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f252260y.a(null, null, null, this);
    }
}
