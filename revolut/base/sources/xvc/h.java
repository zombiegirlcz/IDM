package xvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f309234a;

    public h(StreetModeTrustedLocation trustedLocation) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f309234a = trustedLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f309234a, ((h) obj2).f309234a);
    }

    public final int hashCode() {
        return this.f309234a.hashCode();
    }
}
