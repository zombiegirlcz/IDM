package jyg;

import aii.r;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f179432a;

    public e(WidgetisedAnalyticsType selectedType) {
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        this.f179432a = selectedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f179432a, ((e) obj2).f179432a);
    }

    public final int hashCode() {
        return this.f179432a.hashCode();
    }
}
