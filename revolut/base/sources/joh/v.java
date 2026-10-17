package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersControllerContract$InputData;
import java.util.Set;
import jm4.o3;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yph.g f177064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerStatsFiltersControllerContract$InputData f177065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f177066c;
    public final e4m.e d;
    public final e4m.e e;

    public v(w wVar, ScreenerStatsFiltersControllerContract$InputData screenerStatsFiltersControllerContract$InputData, yph.g gVar) {
        this.f177066c = wVar;
        this.f177064a = gVar;
        this.f177065b = screenerStatsFiltersControllerContract$InputData;
        int i = 5;
        this.d = e4m.b.b(new o3(this, 1, i));
        this.e = e4m.b.b(new o3(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
