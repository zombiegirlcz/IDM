package gob;

import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultsKompotFeatureConfig.AddMoney.Destination f145123a;

    public d(VaultsKompotFeatureConfig.AddMoney.Destination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f145123a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f145123a, ((d) obj2).f145123a);
    }

    public final int hashCode() {
        return this.f145123a.f94716a.hashCode();
    }
}
