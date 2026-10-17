package y54;

import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f310982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BirthCity f310983b;

    public f(wi0.b countryCode, BirthCity city) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(city, "city");
        this.f310982a = countryCode;
        this.f310983b = city;
    }

    public static f a(f fVar, BirthCity city) {
        wi0.b countryCode = fVar.f310982a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(city, "city");
        return new f(countryCode, city);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f310982a, fVar.f310982a) && Intrinsics.f(this.f310983b, fVar.f310983b);
    }

    public final int hashCode() {
        return this.f310983b.hashCode() + (this.f310982a.f297794a.hashCode() * 31);
    }
}
