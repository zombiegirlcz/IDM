package ync;

import doc.b0;
import jlc.s;
import kotlin.jvm.internal.Intrinsics;
import noc.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yoc.j f315429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f315430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final poc.a f315431c;
    public final o d;
    public final bdh.e e;
    public final ooc.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f315432g;

    public e(yoc.j riskTileProvider, d badgeMapper, b0 chartWidgetMapper, poc.a riskMetricsSectionProvider, o allocationsWidgetMapper, bdh.e helpWidgetMapper, ooc.b bioProvider, s roboFooterDisclaimersWidgetMapper) {
        Intrinsics.checkNotNullParameter(riskTileProvider, "riskTileProvider");
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(chartWidgetMapper, "chartWidgetMapper");
        Intrinsics.checkNotNullParameter(riskMetricsSectionProvider, "riskMetricsSectionProvider");
        Intrinsics.checkNotNullParameter(allocationsWidgetMapper, "allocationsWidgetMapper");
        Intrinsics.checkNotNullParameter(helpWidgetMapper, "helpWidgetMapper");
        Intrinsics.checkNotNullParameter(bioProvider, "bioProvider");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetMapper, "roboFooterDisclaimersWidgetMapper");
        this.f315429a = riskTileProvider;
        this.f315430b = chartWidgetMapper;
        this.f315431c = riskMetricsSectionProvider;
        this.d = allocationsWidgetMapper;
        this.e = helpWidgetMapper;
        this.f = bioProvider;
        this.f315432g = roboFooterDisclaimersWidgetMapper;
    }
}
