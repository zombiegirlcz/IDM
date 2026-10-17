package vjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f289816c;
    public final String d;
    public final String e;

    public k(String streetAddress, String postalCode, String country, String str, String str2) {
        Intrinsics.checkNotNullParameter(streetAddress, "streetAddress");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f289814a = streetAddress;
        this.f289815b = postalCode;
        this.f289816c = country;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f289814a, kVar.f289814a) && Intrinsics.f(this.f289815b, kVar.f289815b) && Intrinsics.f(this.f289816c, kVar.f289816c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f289814a.hashCode() * 31, 31, this.f289815b), 31, this.f289816c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
