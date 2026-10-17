package jcg;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsDropoff f172796a;

    public d(TravelHotelsDropoff dropOff) {
        Intrinsics.checkNotNullParameter(dropOff, "dropOff");
        this.f172796a = dropOff;
    }

    @Override // jcg.f
    public final String a() {
        return this.f172796a.e;
    }

    @Override // jcg.f
    public final String b() {
        return this.f172796a.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f172796a, ((d) obj2).f172796a);
    }

    public final int hashCode() {
        return this.f172796a.hashCode();
    }
}
