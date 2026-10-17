package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 extends gim.c {
    public j u;
    public s6i.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountWrapper f12768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f12769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.f f12770y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.revolut.feature_move_money.impl.amount.f fVar, gim.c cVar) {
        super(cVar);
        this.f12770y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12769x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f12770y.a(null, null, null, null, this);
    }
}
