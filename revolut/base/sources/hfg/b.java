package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151808c;
    public final TravelMilesRate d;
    public final String e;

    public b(String topUpId, String accountId, int i, TravelMilesRate rate, String str) {
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f151806a = topUpId;
        this.f151807b = accountId;
        this.f151808c = i;
        this.d = rate;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f151806a, bVar.f151806a) && Intrinsics.f(this.f151807b, bVar.f151807b) && this.f151808c == bVar.f151808c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.b(this.f151808c, p.a.c(this.f151806a.hashCode() * 31, 31, this.f151807b), 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
