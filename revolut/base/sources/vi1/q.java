package vi1;

import com.revolut.feature.address.models.CountryState;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountryState f289515a;

    public q(CountryState countryState) {
        Intrinsics.checkNotNullParameter(countryState, "countryState");
        this.f289515a = countryState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f289515a, ((q) obj2).f289515a);
    }

    public final int hashCode() {
        return this.f289515a.hashCode();
    }
}
