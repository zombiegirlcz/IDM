package iyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f169732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vyg.c f169733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f169734c;
    public final Links d;

    public g(WidgetisedAnalyticsType selectedAnalyticsType, Links links, hel.b bVar, vyg.c selectedTimeframe) {
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f169732a = selectedAnalyticsType;
        this.f169733b = selectedTimeframe;
        this.f169734c = bVar;
        this.d = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f169732a, gVar.f169732a) && this.f169733b == gVar.f169733b && this.f169734c == gVar.f169734c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f169733b.hashCode() + (this.f169732a.hashCode() * 31)) * 31;
        hel.b bVar = this.f169734c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.d;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }
}
