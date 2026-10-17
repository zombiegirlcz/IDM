package sq5;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddressHostingProviderType f265006b;

    public f(String hostingName, CryptoAddressHostingProviderType hostingType) {
        Intrinsics.checkNotNullParameter(hostingName, "hostingName");
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        this.f265005a = hostingName;
        this.f265006b = hostingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f265005a, fVar.f265005a) && this.f265006b == fVar.f265006b;
    }

    public final int hashCode() {
        return this.f265006b.hashCode() + (this.f265005a.hashCode() * 31);
    }
}
