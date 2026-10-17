package e23;

import com.revolut.feature.address.models.CountryState;
import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountryState f122018a;

    public f(CountryState countryState) {
        this.f122018a = countryState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f122018a, ((f) obj2).f122018a);
    }

    public final int hashCode() {
        CountryState countryState = this.f122018a;
        if (countryState == null) {
            return 0;
        }
        return countryState.hashCode();
    }
}
