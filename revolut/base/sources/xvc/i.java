package xvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f309235a;

    public i(StreetModeTrustedLocation trustedLocation) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f309235a = trustedLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f309235a, ((i) obj2).f309235a);
    }

    public final int hashCode() {
        return this.f309235a.hashCode();
    }
}
