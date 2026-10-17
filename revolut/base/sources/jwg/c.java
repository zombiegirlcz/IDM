package jwg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f178997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f178998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f178999c;

    public c(WidgetisedAnalyticsType assetType, Integer num, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f178997a = assetType;
        this.f178998b = num;
        this.f178999c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f178997a, cVar.f178997a) && Intrinsics.f(this.f178998b, cVar.f178998b) && Intrinsics.f(this.f178999c, cVar.f178999c);
    }

    public final int hashCode() {
        int iHashCode = this.f178997a.hashCode() * 31;
        Integer num = this.f178998b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        dj0.d dVar = this.f178999c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
