package wk2;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GmsLatLngBounds f298219a;

    public q(GmsLatLngBounds bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f298219a = bounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f298219a.equals(((q) obj2).f298219a);
    }

    public final int hashCode() {
        return this.f298219a.hashCode();
    }
}
