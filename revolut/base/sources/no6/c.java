package no6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.DirectLink f217923a;

    public c(ExternalAccountsFeatureConfig.Configuration.DirectLink configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f217923a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f217923a, ((c) obj2).f217923a);
    }

    public final int hashCode() {
        return this.f217923a.hashCode();
    }
}
