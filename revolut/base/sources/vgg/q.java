package vgg;

import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesAccountV2 f289172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f289173c;

    public q(String accountId, TravelMilesAccountV2 travelMilesAccountV2, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f289171a = accountId;
        this.f289172b = travelMilesAccountV2;
        this.f289173c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f289171a, qVar.f289171a) && Intrinsics.f(this.f289172b, qVar.f289172b) && Intrinsics.f(this.f289173c, qVar.f289173c);
    }

    public final int hashCode() {
        int iHashCode = this.f289171a.hashCode() * 31;
        TravelMilesAccountV2 travelMilesAccountV2 = this.f289172b;
        int iHashCode2 = (iHashCode + (travelMilesAccountV2 == null ? 0 : travelMilesAccountV2.hashCode())) * 31;
        String str = this.f289173c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
