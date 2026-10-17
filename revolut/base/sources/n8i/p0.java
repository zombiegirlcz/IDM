package n8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 extends gim.c {
    public int A;
    public k u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f213458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f213459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f213460y;
    public final /* synthetic */ com.revolut.feature_move_money.impl.topup.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.feature_move_money.impl.topup.a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213460y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.J2(null, this);
    }
}
