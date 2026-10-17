package oxg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f230817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f230818b;

    public c(xi0.b currency, WidgetisedAnalyticsType analyticsType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        this.f230817a = currency;
        this.f230818b = analyticsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f230817a, cVar.f230817a) && Intrinsics.f(this.f230818b, cVar.f230818b);
    }

    public final int hashCode() {
        return this.f230818b.hashCode() + (this.f230817a.hashCode() * 31);
    }
}
