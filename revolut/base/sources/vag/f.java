package vag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287290a;

    public f(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f287290a = propertyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f287290a, ((f) obj2).f287290a);
    }

    public final int hashCode() {
        return this.f287290a.hashCode();
    }
}
