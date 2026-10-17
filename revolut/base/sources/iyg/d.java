package iyg;

import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f169723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PnLValues f169724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vyg.c f169725c;
    public final hel.b d;
    public final Links e;

    public d(WidgetisedAnalyticsType selectedAnalyticsType, PnLValues pnLValues, vyg.c selectedTimeframe, hel.b bVar, Links links) {
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f169723a = selectedAnalyticsType;
        this.f169724b = pnLValues;
        this.f169725c = selectedTimeframe;
        this.d = bVar;
        this.e = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f169723a, dVar.f169723a) && Intrinsics.f(this.f169724b, dVar.f169724b) && this.f169725c == dVar.f169725c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f169723a.hashCode() * 31;
        PnLValues pnLValues = this.f169724b;
        int iHashCode2 = (this.f169725c.hashCode() + ((iHashCode + (pnLValues == null ? 0 : pnLValues.hashCode())) * 31)) * 31;
        hel.b bVar = this.d;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Links links = this.e;
        return iHashCode3 + (links != null ? links.hashCode() : 0);
    }
}
