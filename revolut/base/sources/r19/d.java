package r19;

import f19.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f250930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250931b;

    public d(h placementReference, String enabledFeatures) {
        Intrinsics.checkNotNullParameter(placementReference, "placementReference");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        this.f250930a = placementReference;
        this.f250931b = enabledFeatures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f250930a == dVar.f250930a && Intrinsics.f(this.f250931b, dVar.f250931b);
    }

    public final int hashCode() {
        return this.f250931b.hashCode() + (this.f250930a.hashCode() * 31);
    }
}
