package by2;

import cli.j;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import e93.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f19737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBankingProfile f19738b;

    public b(f cardDesign, JuniorBankingProfile juniorBankingProfile) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f19737a = cardDesign;
        this.f19738b = juniorBankingProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f19737a, bVar.f19737a) && Intrinsics.f(this.f19738b, bVar.f19738b);
    }

    public final int hashCode() {
        int iHashCode = this.f19737a.hashCode() * 31;
        JuniorBankingProfile juniorBankingProfile = this.f19738b;
        return iHashCode + (juniorBankingProfile == null ? 0 : juniorBankingProfile.hashCode());
    }
}
