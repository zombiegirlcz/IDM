package njh;

import ael.z;
import kotlin.jvm.internal.Intrinsics;
import qr0.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f216522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f216523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f216524c;

    public c(nmc.d roboPortfolioUiMapper, i roboRebalanceStatusClauseMapper, z performanceCalculator) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(roboRebalanceStatusClauseMapper, "roboRebalanceStatusClauseMapper");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f216522a = roboPortfolioUiMapper;
        this.f216523b = roboRebalanceStatusClauseMapper;
        this.f216524c = performanceCalculator;
    }
}
