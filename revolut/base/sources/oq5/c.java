package oq5;

import aii.r;
import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddressHostingProviderType f227744b;

    public c(String hostingName, CryptoAddressHostingProviderType hostingType) {
        Intrinsics.checkNotNullParameter(hostingName, "hostingName");
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        this.f227743a = hostingName;
        this.f227744b = hostingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f227743a, cVar.f227743a) && this.f227744b == cVar.f227744b;
    }

    public final int hashCode() {
        return this.f227744b.hashCode() + (this.f227743a.hashCode() * 31);
    }
}
