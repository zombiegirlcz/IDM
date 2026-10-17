package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends gim.c {
    public s6i.e u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f12801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f12802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c f12803y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.feature_move_money.impl.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f12803y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12802x = obj2;
        this.z |= Integer.MIN_VALUE;
        return com.revolut.feature_move_money.impl.amount.c.L2(this.f12803y, this);
    }
}
