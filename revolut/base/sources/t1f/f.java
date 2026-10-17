package t1f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAgentDetailsScreenContract$InputData f267290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f267291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f267292c;
    public final e4m.e d;
    public final t0b.l e;
    public final t0b.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0b.l f267293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f267294h;
    public final e4m.e i;

    public f(h hVar, e eVar, TradeRevPointsAgentDetailsScreenContract$InputData tradeRevPointsAgentDetailsScreenContract$InputData) {
        this.f267291b = hVar;
        this.f267290a = tradeRevPointsAgentDetailsScreenContract$InputData;
        int i = 6;
        this.f267292c = e4m.b.b(new t0b.l(hVar, this, 1, i));
        this.d = e4m.b.b(new t0b.l(hVar, this, 0, i));
        this.e = new t0b.l(hVar, this, 4, i);
        this.f = new t0b.l(hVar, this, 5, i);
        this.f267293g = new t0b.l(hVar, this, 6, i);
        this.f267294h = e4m.b.b(new t0b.l(hVar, this, 3, i));
        this.i = e4m.b.b(new t0b.l(hVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
