package mvc;

import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreetModeTrustedLocation f209213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209214b;

    public c(StreetModeTrustedLocation trustedLocation, boolean z) {
        Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
        this.f209213a = trustedLocation;
        this.f209214b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f209213a, cVar.f209213a) && this.f209214b == cVar.f209214b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209214b) + (this.f209213a.hashCode() * 31);
    }
}
