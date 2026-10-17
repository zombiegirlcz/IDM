package htk;

import fmc.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f155455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f155456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r39.a f155457c;
    public final f4h.a d;

    public h(g summaryFirstContentBlockMapper, z analystsRecommendItemMapper, r39.a summaryPriceTrendingMapper, f4h.a summaryExpectedPriceChangeItemMapper) {
        Intrinsics.checkNotNullParameter(summaryFirstContentBlockMapper, "summaryFirstContentBlockMapper");
        Intrinsics.checkNotNullParameter(analystsRecommendItemMapper, "analystsRecommendItemMapper");
        Intrinsics.checkNotNullParameter(summaryPriceTrendingMapper, "summaryPriceTrendingMapper");
        Intrinsics.checkNotNullParameter(summaryExpectedPriceChangeItemMapper, "summaryExpectedPriceChangeItemMapper");
        this.f155455a = summaryFirstContentBlockMapper;
        this.f155456b = analystsRecommendItemMapper;
        this.f155457c = summaryPriceTrendingMapper;
        this.d = summaryExpectedPriceChangeItemMapper;
    }
}
