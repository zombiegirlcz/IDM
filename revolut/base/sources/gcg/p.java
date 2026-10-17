package gcg;

import com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigableTravelHotelsDropoff f142464a;

    public p(NavigableTravelHotelsDropoff navigableDropOff) {
        Intrinsics.checkNotNullParameter(navigableDropOff, "navigableDropOff");
        this.f142464a = navigableDropOff;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f142464a, ((p) obj2).f142464a);
    }

    public final int hashCode() {
        return this.f142464a.hashCode();
    }
}
