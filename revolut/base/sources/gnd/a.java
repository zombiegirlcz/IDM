package gnd;

import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsFeatureConfig f144956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelableDestination f144957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q06.c f144958c;

    public a(AnalyticsFeatureConfig featureConfig, KompotDestination destination, q06.b bVar) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f144956a = featureConfig;
        this.f144957b = destination;
        this.f144958c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f144956a, aVar.f144956a) && Intrinsics.f(this.f144957b, aVar.f144957b) && Intrinsics.f(this.f144958c, aVar.f144958c);
    }

    public final int hashCode() {
        int iHashCode = (this.f144957b.hashCode() + (this.f144956a.hashCode() * 31)) * 31;
        q06.c cVar = this.f144958c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
