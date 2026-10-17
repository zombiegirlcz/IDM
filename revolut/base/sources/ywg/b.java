package ywg;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f317424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WidgetisedAnalyticsType f317425c;
    public final Links d;

    public b(Data data, hel.b bVar, WidgetisedAnalyticsType analyticsType, Links links) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f317423a = data;
        this.f317424b = bVar;
        this.f317425c = analyticsType;
        this.d = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f317423a, bVar.f317423a) && this.f317424b == bVar.f317424b && Intrinsics.f(this.f317425c, bVar.f317425c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        Data data = this.f317423a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        hel.b bVar = this.f317424b;
        int iHashCode2 = (this.f317425c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        Links links = this.d;
        return iHashCode2 + (links != null ? links.hashCode() : 0);
    }
}
