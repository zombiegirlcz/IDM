package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyAutomationFlowContract$InputData f277806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f277807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f277808c;
    public final h d = this;
    public final e4m.e e;

    public h(l lVar, MoveMoneyAutomationFlowContract$InputData moveMoneyAutomationFlowContract$InputData, od0.i iVar) {
        this.f277808c = lVar;
        this.f277806a = moveMoneyAutomationFlowContract$InputData;
        this.f277807b = iVar;
        this.e = e4m.b.b(new g(lVar, this, 0));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
