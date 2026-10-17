package en6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem f127747a;

    public d(ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f127747a = account;
    }

    @Override // en6.f
    public final String a() {
        return this.f127747a.f72294b;
    }

    @Override // en6.f
    public final String b() {
        return this.f127747a.f72293a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f127747a, ((d) obj2).f127747a);
    }

    public final int hashCode() {
        return this.f127747a.hashCode();
    }
}
