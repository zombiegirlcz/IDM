package vag;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsCheckoutParams f287287a;

    public c(TravelHotelsCheckoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f287287a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f287287a, ((c) obj2).f287287a);
    }

    public final int hashCode() {
        return this.f287287a.hashCode();
    }
}
