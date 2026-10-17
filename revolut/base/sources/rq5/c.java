package rq5;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddressHostingProviderType f256479b;

    public c(String hostingName, CryptoAddressHostingProviderType hostingType) {
        Intrinsics.checkNotNullParameter(hostingName, "hostingName");
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        this.f256478a = hostingName;
        this.f256479b = hostingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256478a, cVar.f256478a) && this.f256479b == cVar.f256479b;
    }

    public final int hashCode() {
        return this.f256479b.hashCode() + (this.f256478a.hashCode() * 31);
    }
}
