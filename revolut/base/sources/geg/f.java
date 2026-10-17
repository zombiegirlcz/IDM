package geg;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCheckoutParams f143290a;

    public f(TravelHotelsCheckoutParams checkoutParams) {
        Intrinsics.checkNotNullParameter(checkoutParams, "checkoutParams");
        this.f143290a = checkoutParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f143290a, ((f) obj2).f143290a);
    }

    public final int hashCode() {
        return this.f143290a.hashCode();
    }
}
