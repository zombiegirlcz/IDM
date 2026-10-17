package t1f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccountUnlinkingScreenContract$InputData f267281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f267282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f267283c;

    public c(h hVar, TradeRevPointsAccountUnlinkingScreenContract$InputData tradeRevPointsAccountUnlinkingScreenContract$InputData) {
        this.f267281a = tradeRevPointsAccountUnlinkingScreenContract$InputData;
        int i = 4;
        this.f267282b = e4m.b.b(new t0b.l(hVar, this, 1, i));
        this.f267283c = e4m.b.b(new t0b.l(hVar, this, 0, i));
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
