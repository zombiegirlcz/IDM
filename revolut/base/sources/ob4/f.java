package ob4;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f223877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xu3.f f223878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f223879c;

    public f(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayerConfiguration, xu3.f fVar, String str) {
        Intrinsics.checkNotNullParameter(trueLayerConfiguration, "trueLayerConfiguration");
        this.f223877a = trueLayerConfiguration;
        this.f223878b = fVar;
        this.f223879c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f223877a, fVar.f223877a) && Intrinsics.f(this.f223878b, fVar.f223878b) && Intrinsics.f(this.f223879c, fVar.f223879c);
    }

    public final int hashCode() {
        int iHashCode = this.f223877a.hashCode() * 31;
        xu3.f fVar = this.f223878b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f223879c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
