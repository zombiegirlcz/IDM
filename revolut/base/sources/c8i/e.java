package c8i;

import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyBalanceSyncWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MoveMoneyBalanceSyncWorker moveMoneyBalanceSyncWorker, Continuation continuation) {
        super(continuation);
        this.v = moveMoneyBalanceSyncWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22189w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
