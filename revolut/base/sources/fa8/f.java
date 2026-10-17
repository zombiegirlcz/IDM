package fa8;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f133250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f133251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f133252c;

    public f(Data juniorProfile, Address address, Data featureConfigs) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(featureConfigs, "featureConfigs");
        this.f133250a = juniorProfile;
        this.f133251b = address;
        this.f133252c = featureConfigs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f133250a, fVar.f133250a) && Intrinsics.f(this.f133251b, fVar.f133251b) && Intrinsics.f(this.f133252c, fVar.f133252c);
    }

    public final int hashCode() {
        int iHashCode = this.f133250a.hashCode() * 31;
        Address address = this.f133251b;
        return this.f133252c.hashCode() + ((iHashCode + (address == null ? 0 : address.hashCode())) * 31);
    }
}
