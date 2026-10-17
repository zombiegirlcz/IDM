package oag;

import com.revolut.feature_travel_hotels_models.location.HotelsSmartSearchLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsSmartSearchLocation f223629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223630b;

    public j(HotelsSmartSearchLocation smartSearchLocation, int i) {
        Intrinsics.checkNotNullParameter(smartSearchLocation, "smartSearchLocation");
        this.f223629a = smartSearchLocation;
        this.f223630b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f223629a, jVar.f223629a) && this.f223630b == jVar.f223630b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223630b) + (this.f223629a.hashCode() * 31);
    }
}
