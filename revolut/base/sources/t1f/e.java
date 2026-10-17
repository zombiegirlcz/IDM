package t1f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements xki.c, b2f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAgentDetailsFlowContract$InputData f267287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f267288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f267289c = this;
    public final e4m.e d;

    public e(h hVar, TradeRevPointsAgentDetailsFlowContract$InputData tradeRevPointsAgentDetailsFlowContract$InputData) {
        this.f267288b = hVar;
        this.f267287a = tradeRevPointsAgentDetailsFlowContract$InputData;
        this.d = e4m.b.b(new r6e.m(hVar, this, 24));
    }

    @Override // b2f.b
    public final b2f.a b() {
        return new m(this.f267288b, this.f267289c);
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
