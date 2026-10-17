package xvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f309236a;

    public k(StreetModeTrustedLocation trustedLocation) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f309236a = trustedLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f309236a, ((k) obj2).f309236a);
    }

    public final int hashCode() {
        return this.f309236a.hashCode();
    }
}
