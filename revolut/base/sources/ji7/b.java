package ji7;

import kotlin.jvm.internal.Intrinsics;
import mi7.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oi7.a f174378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi7.a f174379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f174380c;
    public final pi7.a d;
    public final ni7.a e;
    public final jbh.e f;

    public b(oi7.a cfdsPnlDriversInstrumentMapper, mi7.a dividendLeadersInstrumentMapper, e recommendedBuysInstrumentMapper, pi7.a mostTradedInstrumentMapper, ni7.a cfdsMostShortedInstrumentMapper, jbh.e performanceAssetMapper) {
        Intrinsics.checkNotNullParameter(cfdsPnlDriversInstrumentMapper, "cfdsPnlDriversInstrumentMapper");
        Intrinsics.checkNotNullParameter(dividendLeadersInstrumentMapper, "dividendLeadersInstrumentMapper");
        Intrinsics.checkNotNullParameter(recommendedBuysInstrumentMapper, "recommendedBuysInstrumentMapper");
        Intrinsics.checkNotNullParameter(mostTradedInstrumentMapper, "mostTradedInstrumentMapper");
        Intrinsics.checkNotNullParameter(cfdsMostShortedInstrumentMapper, "cfdsMostShortedInstrumentMapper");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        this.f174378a = cfdsPnlDriversInstrumentMapper;
        this.f174379b = dividendLeadersInstrumentMapper;
        this.f174380c = recommendedBuysInstrumentMapper;
        this.d = mostTradedInstrumentMapper;
        this.e = cfdsMostShortedInstrumentMapper;
        this.f = performanceAssetMapper;
    }
}
