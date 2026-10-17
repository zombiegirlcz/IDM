package mvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f209217a;

    public e(StreetModeTrustedLocation trustedLocation) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f209217a = trustedLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f209217a, ((e) obj2).f209217a);
    }

    public final int hashCode() {
        return this.f209217a.hashCode();
    }
}
