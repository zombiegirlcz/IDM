package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyAutomationLimitScreenContract$InputData f277809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f277810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277811c;

    public i(l lVar, MoveMoneyAutomationLimitScreenContract$InputData moveMoneyAutomationLimitScreenContract$InputData) {
        this.f277810b = lVar;
        this.f277809a = moveMoneyAutomationLimitScreenContract$InputData;
        this.f277811c = e4m.b.b(new g(lVar, this, 1));
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
