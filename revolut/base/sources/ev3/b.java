package ev3;

import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f129701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f129702c;
    public final a d;

    public b(String fullName, LocalDate localDate, Address address, a partialTaxPayerNumber) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(partialTaxPayerNumber, "partialTaxPayerNumber");
        this.f129700a = fullName;
        this.f129701b = localDate;
        this.f129702c = address;
        this.d = partialTaxPayerNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f129700a, bVar.f129700a) && Intrinsics.f(this.f129701b, bVar.f129701b) && Intrinsics.f(this.f129702c, bVar.f129702c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f129700a.hashCode() * 31;
        LocalDate localDate = this.f129701b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Address address = this.f129702c;
        return this.d.f129699a.hashCode() + ((iHashCode2 + (address != null ? address.hashCode() : 0)) * 31);
    }
}
