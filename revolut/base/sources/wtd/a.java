package wtd;

import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f299928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f299929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingProduct f299930c;
    public final DateTime d;

    public a(DateTime unstakingStartDate, b state, StakingProduct product, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(unstakingStartDate, "unstakingStartDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f299928a = unstakingStartDate;
        this.f299929b = state;
        this.f299930c = product;
        this.d = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f299928a, aVar.f299928a) && this.f299929b == aVar.f299929b && Intrinsics.f(this.f299930c, aVar.f299930c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f299930c.hashCode() + ((this.f299929b.hashCode() + (this.f299928a.hashCode() * 31)) * 31)) * 31;
        DateTime dateTime = this.d;
        return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }
}
