package vb3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashTopUpLocationInfo f287381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f287382b;

    public g(CashTopUpLocationInfo location, f fVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f287381a = location;
        this.f287382b = fVar;
    }

    public static g a(g gVar, f fVar) {
        CashTopUpLocationInfo location = gVar.f287381a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        return new g(location, fVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f287381a, gVar.f287381a) && this.f287382b == gVar.f287382b;
    }

    public final int hashCode() {
        int iHashCode = this.f287381a.hashCode() * 31;
        f fVar = this.f287382b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
