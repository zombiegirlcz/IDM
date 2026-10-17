package n7e;

import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultsKompotFeatureConfig.AddMoney.Destination f213076a;

    public e(VaultsKompotFeatureConfig.AddMoney.Destination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f213076a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f213076a, ((e) obj2).f213076a);
    }

    public final int hashCode() {
        return this.f213076a.f94716a.hashCode();
    }
}
