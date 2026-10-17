package xn6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration f307319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.g f307320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307321c;

    public f(ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration configuration, oe6.g institutionPurpose, String str) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(institutionPurpose, "institutionPurpose");
        this.f307319a = configuration;
        this.f307320b = institutionPurpose;
        this.f307321c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f307319a, fVar.f307319a) && Intrinsics.f(this.f307320b, fVar.f307320b) && Intrinsics.f(this.f307321c, fVar.f307321c);
    }

    public final int hashCode() {
        int iHashCode = (this.f307320b.hashCode() + (this.f307319a.hashCode() * 31)) * 31;
        String str = this.f307321c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
