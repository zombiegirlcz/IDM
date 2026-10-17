package t1j;

import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f267382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f267383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountryProfile f267384c;

    public d(LinkedHashMap balancesInfoByCountryProfile, ArrayList countryProfiles, CountryProfile initialSelectedCountryProfile) {
        Intrinsics.checkNotNullParameter(balancesInfoByCountryProfile, "balancesInfoByCountryProfile");
        Intrinsics.checkNotNullParameter(countryProfiles, "countryProfiles");
        Intrinsics.checkNotNullParameter(initialSelectedCountryProfile, "initialSelectedCountryProfile");
        this.f267382a = balancesInfoByCountryProfile;
        this.f267383b = countryProfiles;
        this.f267384c = initialSelectedCountryProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f267382a.equals(dVar.f267382a) && this.f267383b.equals(dVar.f267383b) && Intrinsics.f(this.f267384c, dVar.f267384c);
    }

    public final int hashCode() {
        return this.f267384c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f267383b, this.f267382a.hashCode() * 31, 31);
    }
}
