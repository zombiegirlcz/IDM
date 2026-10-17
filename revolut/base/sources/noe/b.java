package noe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f218003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f218004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f218005c;
    public final Data d;

    public b(Data taxResidencyRules, Data userCountry, Data skippableTinCountries, Data taxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f218003a = taxResidencyRules;
        this.f218004b = userCountry;
        this.f218005c = skippableTinCountries;
        this.d = taxResidencies;
    }

    public static b a(b bVar, Data taxResidencyRules, Data userCountry, Data skippableTinCountries, Data taxResidencies, int i) {
        if ((i & 1) != 0) {
            taxResidencyRules = bVar.f218003a;
        }
        if ((i & 2) != 0) {
            userCountry = bVar.f218004b;
        }
        if ((i & 4) != 0) {
            skippableTinCountries = bVar.f218005c;
        }
        if ((i & 8) != 0) {
            taxResidencies = bVar.d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        return new b(taxResidencyRules, userCountry, skippableTinCountries, taxResidencies);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218003a, bVar.f218003a) && Intrinsics.f(this.f218004b, bVar.f218004b) && Intrinsics.f(this.f218005c, bVar.f218005c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f218005c, kii.e.c(this.f218004b, this.f218003a.hashCode() * 31, 31), 31);
    }
}
