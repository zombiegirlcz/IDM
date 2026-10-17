package a8i;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public MoveMoneyFlowContract$MoveMoneyProcessState u;
    public MoveMoneyOrderInfo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j8l.a f2259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f2261y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f2261y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f2260x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f2261y.a(null, this);
    }
}
