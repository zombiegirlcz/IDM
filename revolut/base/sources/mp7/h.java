package mp7;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f207772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f207773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f207774c;
    public final Map d;

    public h(Data drivers, Map licenceNumbers, Map validationErrors, Map licenceIssuingCountries) {
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        Intrinsics.checkNotNullParameter(licenceNumbers, "licenceNumbers");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(licenceIssuingCountries, "licenceIssuingCountries");
        this.f207772a = drivers;
        this.f207773b = licenceNumbers;
        this.f207774c = validationErrors;
        this.d = licenceIssuingCountries;
    }

    public static h a(h hVar, Data drivers, Map licenceNumbers, Map validationErrors, Map licenceIssuingCountries, int i) {
        if ((i & 1) != 0) {
            drivers = hVar.f207772a;
        }
        if ((i & 2) != 0) {
            licenceNumbers = hVar.f207773b;
        }
        if ((i & 4) != 0) {
            validationErrors = hVar.f207774c;
        }
        if ((i & 8) != 0) {
            licenceIssuingCountries = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        Intrinsics.checkNotNullParameter(licenceNumbers, "licenceNumbers");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        Intrinsics.checkNotNullParameter(licenceIssuingCountries, "licenceIssuingCountries");
        return new h(drivers, licenceNumbers, validationErrors, licenceIssuingCountries);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f207772a, hVar.f207772a) && Intrinsics.f(this.f207773b, hVar.f207773b) && Intrinsics.f(this.f207774c, hVar.f207774c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.e(this.f207772a.hashCode() * 31, 31, this.f207773b), 31, this.f207774c);
    }
}
