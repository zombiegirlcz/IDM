package gd4;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f143065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.DirectLink f143066b;

    public a(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer, ExternalAccountsFeatureConfig.Configuration.DirectLink directLink) {
        this.f143065a = trueLayer;
        this.f143066b = directLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f143065a, aVar.f143065a) && Intrinsics.f(this.f143066b, aVar.f143066b);
    }

    public final int hashCode() {
        ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer = this.f143065a;
        int iHashCode = (trueLayer == null ? 0 : trueLayer.hashCode()) * 31;
        ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = this.f143066b;
        return iHashCode + (directLink != null ? directLink.hashCode() : 0);
    }
}
