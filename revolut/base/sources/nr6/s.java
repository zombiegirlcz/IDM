package nr6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218582c;
    public final dj0.d d;
    public final dj0.d e;
    public final double f;

    public s(String name, String str, String str2, dj0.d totalAmount, dj0.d unitPrice, double d) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        this.f218580a = name;
        this.f218581b = str;
        this.f218582c = str2;
        this.d = totalAmount;
        this.e = unitPrice;
        this.f = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f218580a, sVar.f218580a) && Intrinsics.f(this.f218581b, sVar.f218581b) && Intrinsics.f(this.f218582c, sVar.f218582c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Double.compare(this.f, sVar.f) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f218580a.hashCode() * 31;
        String str = this.f218581b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218582c;
        return Double.hashCode(this.f) + v7.c(v7.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
