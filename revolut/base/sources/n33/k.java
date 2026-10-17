package n33;

import com.revolut.domain.models.user.UserCompanyRegion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCompanyRegion f211747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f211748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f211749c;

    public k(UserCompanyRegion userCompanyRegion, wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f211747a = userCompanyRegion;
        this.f211748b = countryCode;
        this.f211749c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f211747a == kVar.f211747a && Intrinsics.f(this.f211748b, kVar.f211748b) && this.f211749c == kVar.f211749c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211749c) + p.a.c(this.f211747a.hashCode() * 31, 31, this.f211748b.f297794a);
    }
}
