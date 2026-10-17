package y7i;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public String u;
    public MoveMoneyFlowContract$MoveMoneyProcessState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f311527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.flow.e f311528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f311529y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature_move_money.impl.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.f311528x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f311527w = obj2;
        this.f311529y |= Integer.MIN_VALUE;
        return com.revolut.feature_move_money.impl.flow.e.J2(this.f311528x, null, null, null, this);
    }
}
