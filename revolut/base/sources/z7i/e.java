package z7i;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public MoveMoneyFlowContract$MoveMoneyProcessState u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.flow.delegate.a f320013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320014x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature_move_money.impl.flow.delegate.a aVar, gim.c cVar) {
        super(cVar);
        this.f320013w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320014x |= Integer.MIN_VALUE;
        return this.f320013w.e(null, this);
    }
}
