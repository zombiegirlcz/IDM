package fe7;

import com.revolut.feature.in_app_calls.domain.AudioRoute;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioRoute f134455b;

    public a(List availableRoutes, AudioRoute selectedRoute) {
        Intrinsics.checkNotNullParameter(availableRoutes, "availableRoutes");
        Intrinsics.checkNotNullParameter(selectedRoute, "selectedRoute");
        this.f134454a = availableRoutes;
        this.f134455b = selectedRoute;
    }

    public static a a(a aVar, AudioRoute selectedRoute) {
        List availableRoutes = aVar.f134454a;
        Intrinsics.checkNotNullParameter(availableRoutes, "availableRoutes");
        Intrinsics.checkNotNullParameter(selectedRoute, "selectedRoute");
        return new a(availableRoutes, selectedRoute);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f134454a, aVar.f134454a) && Intrinsics.f(this.f134455b, aVar.f134455b);
    }

    public final int hashCode() {
        return this.f134455b.hashCode() + (this.f134454a.hashCode() * 31);
    }
}
