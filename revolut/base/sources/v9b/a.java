package v9b;

import kotlin.jvm.internal.Intrinsics;
import wi0.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f287016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287017b;

    public a(b countryCode, String displayName) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f287016a = countryCode;
        this.f287017b = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f287016a, aVar.f287016a) && Intrinsics.f(this.f287017b, aVar.f287017b);
    }

    public final int hashCode() {
        return this.f287017b.hashCode() + (this.f287016a.f297794a.hashCode() * 31);
    }
}
