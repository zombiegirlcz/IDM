package s2f;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tsk.t;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends h implements dli.b {
    public final TradeRevPointsAccountUnlinkingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f259306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f259307q;

    public d(n stateMapper, TradeRevPointsAccountUnlinkingScreenContract$InputData inputData, t accountsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        this.o = inputData;
        this.f259306p = accountsInteractor;
        this.f259307q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f259307q;
    }
}
