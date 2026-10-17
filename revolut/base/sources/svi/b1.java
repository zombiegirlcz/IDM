package svi;

import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesTermsAndConditions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesTermsAndConditions f265882a;

    public b1(AirportLoungesTermsAndConditions termsAndConditions) {
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f265882a = termsAndConditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && Intrinsics.f(this.f265882a, ((b1) obj2).f265882a);
    }

    public final int hashCode() {
        return this.f265882a.hashCode();
    }
}
