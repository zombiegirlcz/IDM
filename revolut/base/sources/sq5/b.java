package sq5;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddressHostingProviderType f264999b;

    public b(String hostingName, CryptoAddressHostingProviderType hostingType) {
        Intrinsics.checkNotNullParameter(hostingName, "hostingName");
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        this.f264998a = hostingName;
        this.f264999b = hostingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f264998a, bVar.f264998a) && this.f264999b == bVar.f264999b;
    }

    public final int hashCode() {
        return this.f264999b.hashCode() + (this.f264998a.hashCode() * 31);
    }
}
