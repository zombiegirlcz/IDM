package oxg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f230813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f230814b;

    public a(a3 sector, WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f230813a = sector;
        this.f230814b = analyticsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f230813a == aVar.f230813a && Intrinsics.f(this.f230814b, aVar.f230814b);
    }

    public final int hashCode() {
        return this.f230814b.hashCode() + (this.f230813a.hashCode() * 31);
    }
}
