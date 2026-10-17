package tn6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration f272314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272315b;

    public g(ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration, boolean z) {
        this.f272314a = externalConsentConfiguration;
        this.f272315b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f272314a, gVar.f272314a) && this.f272315b == gVar.f272315b;
    }

    public final int hashCode() {
        ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = this.f272314a;
        return Boolean.hashCode(this.f272315b) + ((externalConsentConfiguration == null ? 0 : externalConsentConfiguration.hashCode()) * 31);
    }
}
