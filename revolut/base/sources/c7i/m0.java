package c7i;

import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends gim.c {
    public MoveMoneyAutomationScreenContract$CreationState u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.automation.screen.c f22015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22016x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.feature_move_money.impl.automation.screen.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f22015w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22016x |= Integer.MIN_VALUE;
        return com.revolut.feature_move_money.impl.automation.screen.c.I2(this.f22015w, null, this);
    }
}
