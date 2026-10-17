package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TacticalAllocationsControllerContract$InputData f295117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f295118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f295119c;

    public b0(m mVar, TacticalAllocationsControllerContract$InputData tacticalAllocationsControllerContract$InputData) {
        this.f295117a = tacticalAllocationsControllerContract$InputData;
        int i = 14;
        this.f295118b = e4m.b.b(new vzc.j(mVar, this, 1, i));
        this.f295119c = e4m.b.b(new vzc.j(mVar, this, 0, i));
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
