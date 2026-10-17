package m6g;

import com.revolut.feature.travel.flights.models.domain.booking.PrimaryContact;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrimaryContact f203098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f203099c;

    public l(String offerId, PrimaryContact primaryContact, ArrayList travellers) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(primaryContact, "primaryContact");
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        this.f203097a = offerId;
        this.f203098b = primaryContact;
        this.f203099c = travellers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f203097a, lVar.f203097a) && this.f203098b.equals(lVar.f203098b) && this.f203099c.equals(lVar.f203099c);
    }

    public final int hashCode() {
        return this.f203099c.hashCode() + ((this.f203098b.hashCode() + (this.f203097a.hashCode() * 31)) * 31);
    }
}
