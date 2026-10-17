package ftk;

import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final htk.h f138046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f138047b;

    public o(n headerRecommendationBuilder, htk.h summaryItemsBuilder, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(headerRecommendationBuilder, "headerRecommendationBuilder");
        Intrinsics.checkNotNullParameter(summaryItemsBuilder, "summaryItemsBuilder");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f138046a = summaryItemsBuilder;
        this.f138047b = wealthDisclaimersMapper;
    }
}
