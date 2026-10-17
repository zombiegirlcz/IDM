package l7i;

import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$CreationState;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public MoveMoneyAutomationScreenContract$CreationState u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f192664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f192665x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f192664w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f192665x |= Integer.MIN_VALUE;
        return this.f192664w.a(null, this);
    }
}
