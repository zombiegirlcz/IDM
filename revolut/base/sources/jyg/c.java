package jyg;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f179427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f179428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f179429c;

    public c(WidgetisedAnalyticsType selectedType, hel.b bVar, Data availableAnalyticsTypes) {
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(availableAnalyticsTypes, "availableAnalyticsTypes");
        this.f179427a = selectedType;
        this.f179428b = bVar;
        this.f179429c = availableAnalyticsTypes;
    }

    public static c a(c cVar, WidgetisedAnalyticsType selectedType, Data availableAnalyticsTypes, int i) {
        if ((i & 1) != 0) {
            selectedType = cVar.f179427a;
        }
        hel.b bVar = cVar.f179428b;
        if ((i & 4) != 0) {
            availableAnalyticsTypes = cVar.f179429c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        Intrinsics.checkNotNullParameter(availableAnalyticsTypes, "availableAnalyticsTypes");
        return new c(selectedType, bVar, availableAnalyticsTypes);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f179427a, cVar.f179427a) && this.f179428b == cVar.f179428b && Intrinsics.f(this.f179429c, cVar.f179429c);
    }

    public final int hashCode() {
        int iHashCode = this.f179427a.hashCode() * 31;
        hel.b bVar = this.f179428b;
        return this.f179429c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
