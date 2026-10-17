package c8i;

import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public mri.v u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f22193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyBalanceSyncWorker f22194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f22195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MoveMoneyBalanceSyncWorker moveMoneyBalanceSyncWorker, gim.c cVar) {
        super(cVar);
        this.f22194x = moveMoneyBalanceSyncWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f22193w = obj2;
        this.f22195y |= Integer.MIN_VALUE;
        return this.f22194x.a(null, this);
    }
}
