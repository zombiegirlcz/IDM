package qjh;

import ael.z;
import kotlin.jvm.internal.Intrinsics;
import nmc.d;
import qr0.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f246884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f246885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ljh.c f246886c;
    public final z d;

    public c(d roboPortfolioUiMapper, i roboRebalanceStatusClauseMapper, ljh.c wealthActionsAccountWidgetMapper, z performanceCalculator) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(roboRebalanceStatusClauseMapper, "roboRebalanceStatusClauseMapper");
        Intrinsics.checkNotNullParameter(wealthActionsAccountWidgetMapper, "wealthActionsAccountWidgetMapper");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f246884a = roboPortfolioUiMapper;
        this.f246885b = roboRebalanceStatusClauseMapper;
        this.f246886c = wealthActionsAccountWidgetMapper;
        this.d = performanceCalculator;
    }
}
