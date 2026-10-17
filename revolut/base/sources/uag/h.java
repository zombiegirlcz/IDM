package uag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278641a;

    public h(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f278641a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f278641a, ((h) obj2).f278641a);
    }

    public final int hashCode() {
        return this.f278641a.hashCode();
    }
}
