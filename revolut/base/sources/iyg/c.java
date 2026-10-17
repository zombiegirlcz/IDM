package iyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f169719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vyg.c f169720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f169721c;
    public final Links d;

    public c(WidgetisedAnalyticsType selectedAnalyticsType, Links links, hel.b bVar, vyg.c selectedTimeframe) {
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f169719a = selectedAnalyticsType;
        this.f169720b = selectedTimeframe;
        this.f169721c = bVar;
        this.d = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f169719a, cVar.f169719a) && this.f169720b == cVar.f169720b && this.f169721c == cVar.f169721c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f169720b.hashCode() + (this.f169719a.hashCode() * 31)) * 31;
        hel.b bVar = this.f169721c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.d;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }
}
