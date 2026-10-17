package iyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f169714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f169715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Links f169716c;

    public b(WidgetisedAnalyticsType selectedAnalyticsType, hel.b bVar, Links links) {
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        this.f169714a = selectedAnalyticsType;
        this.f169715b = bVar;
        this.f169716c = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f169714a, bVar.f169714a) && this.f169715b == bVar.f169715b && Intrinsics.f(this.f169716c, bVar.f169716c);
    }

    public final int hashCode() {
        int iHashCode = this.f169714a.hashCode() * 31;
        hel.b bVar = this.f169715b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.f169716c;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }
}
