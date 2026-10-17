package ml;

import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class u extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountryCode f206548a;

    public u(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f206548a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f206548a == ((u) obj2).f206548a;
    }

    public final int hashCode() {
        return this.f206548a.hashCode();
    }

    public final String toString() {
        return "CountrySelectionFragmentResult(countryCode=" + this.f206548a + ")";
    }
}
