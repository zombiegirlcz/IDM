package mvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f209215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209216b;

    public d(StreetModeTrustedLocation trustedLocation, boolean z) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f209215a = trustedLocation;
        this.f209216b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f209215a, dVar.f209215a) && this.f209216b == dVar.f209216b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209216b) + (this.f209215a.hashCode() * 31);
    }
}
