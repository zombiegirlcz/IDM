package hbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150712a;

    public o(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f150712a = propertyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f150712a, ((o) obj2).f150712a);
    }

    public final int hashCode() {
        return this.f150712a.hashCode();
    }
}
