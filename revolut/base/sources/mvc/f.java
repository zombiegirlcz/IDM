package mvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f209218a;

    public f(StreetModeTrustedLocation trustedLocation) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f209218a = trustedLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f209218a, ((f) obj2).f209218a);
    }

    public final int hashCode() {
        return this.f209218a.hashCode();
    }
}
