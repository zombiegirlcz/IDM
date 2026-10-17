package jyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f179424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f179425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f179426c;

    public b(WidgetisedAnalyticsType analyticsType, Integer num, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f179424a = analyticsType;
        this.f179425b = num;
        this.f179426c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f179424a, bVar.f179424a) && Intrinsics.f(this.f179425b, bVar.f179425b) && Intrinsics.f(this.f179426c, bVar.f179426c);
    }

    public final int hashCode() {
        int iHashCode = this.f179424a.hashCode() * 31;
        Integer num = this.f179425b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        dj0.d dVar = this.f179426c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
