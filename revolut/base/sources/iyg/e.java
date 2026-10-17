package iyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f169728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f169729c;
    public final Links d;

    public e(WidgetisedAnalyticsType selectedAnalyticsType, Links links, hel.b bVar, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        this.f169727a = portfolioId;
        this.f169728b = selectedAnalyticsType;
        this.f169729c = bVar;
        this.d = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f169727a, eVar.f169727a) && Intrinsics.f(this.f169728b, eVar.f169728b) && this.f169729c == eVar.f169729c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f169728b.hashCode() + (this.f169727a.hashCode() * 31)) * 31;
        hel.b bVar = this.f169729c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.d;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }
}
