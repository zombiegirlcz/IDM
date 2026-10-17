package gnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klh.c f145006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jbh.e f145007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hph.k f145008c;
    public final oi7.a d;
    public final mi7.a e;
    public final mi7.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ni7.a f145009g;

    public k(klh.c commoditiesUIMapper, jbh.e performanceAssetMapper, hph.k screenerPerformanceAssetMapper, oi7.a cfdsPnlDriversAssetMapper, mi7.a dividendLeadersInstrumentMapper, mi7.e recommendedBuysInstrumentMapper, ni7.a cfdsMostShortedInstrumentMapper) {
        Intrinsics.checkNotNullParameter(commoditiesUIMapper, "commoditiesUIMapper");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(screenerPerformanceAssetMapper, "screenerPerformanceAssetMapper");
        Intrinsics.checkNotNullParameter(cfdsPnlDriversAssetMapper, "cfdsPnlDriversAssetMapper");
        Intrinsics.checkNotNullParameter(dividendLeadersInstrumentMapper, "dividendLeadersInstrumentMapper");
        Intrinsics.checkNotNullParameter(recommendedBuysInstrumentMapper, "recommendedBuysInstrumentMapper");
        Intrinsics.checkNotNullParameter(cfdsMostShortedInstrumentMapper, "cfdsMostShortedInstrumentMapper");
        this.f145006a = commoditiesUIMapper;
        this.f145007b = performanceAssetMapper;
        this.f145008c = screenerPerformanceAssetMapper;
        this.d = cfdsPnlDriversAssetMapper;
        this.e = dividendLeadersInstrumentMapper;
        this.f = recommendedBuysInstrumentMapper;
        this.f145009g = cfdsMostShortedInstrumentMapper;
    }
}
