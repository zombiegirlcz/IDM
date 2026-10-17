package hbg;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData.BookedProperty f150714a;

    public q(HotelsPropertyInputData.BookedProperty data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f150714a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f150714a.equals(((q) obj2).f150714a);
    }

    public final int hashCode() {
        return this.f150714a.f93675b.hashCode();
    }
}
