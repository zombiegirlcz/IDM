package myf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceLocation f210485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f210487c;
    public final p d;

    public o(TravelExperienceLocation location, String str, s sVar, p pVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f210485a = location;
        this.f210486b = str;
        this.f210487c = sVar;
        this.d = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f210485a, oVar.f210485a) && Intrinsics.f(this.f210486b, oVar.f210486b) && Intrinsics.f(this.f210487c, oVar.f210487c) && this.d == oVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f210485a.hashCode() * 31;
        String str = this.f210486b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s sVar = this.f210487c;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        p pVar = this.d;
        return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }
}
