package emd;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsFeatureConfig.TotalWealthScreen.Destination f127650a;

    public a(AnalyticsFeatureConfig.TotalWealthScreen.Destination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f127650a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f127650a.equals(((a) obj2).f127650a);
    }

    public final int hashCode() {
        return this.f127650a.hashCode();
    }
}
