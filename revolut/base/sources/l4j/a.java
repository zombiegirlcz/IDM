package l4j;

import cli.j;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f192142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeneficiaryRouteDetails f192143b;

    public a(List routes, BeneficiaryRouteDetails selectedRoute) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(selectedRoute, "selectedRoute");
        this.f192142a = routes;
        this.f192143b = selectedRoute;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f192142a, aVar.f192142a) && Intrinsics.f(this.f192143b, aVar.f192143b);
    }

    public final int hashCode() {
        return this.f192143b.hashCode() + (this.f192142a.hashCode() * 31);
    }
}
