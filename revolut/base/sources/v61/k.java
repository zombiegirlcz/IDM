package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286304c;
    public final String d;
    public final DateTime e;
    public final String f;

    public k(String id10, String str, String str2, String str3, DateTime expiryDate, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.f286302a = id10;
        this.f286303b = str;
        this.f286304c = str2;
        this.d = str3;
        this.e = expiryDate;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f286302a, kVar.f286302a) && Intrinsics.f(this.f286303b, kVar.f286303b) && Intrinsics.f(this.f286304c, kVar.f286304c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f286302a.hashCode() * 31;
        String str = this.f286303b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f286304c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iF = m72.b.f(this.e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f;
        return iF + (str4 != null ? str4.hashCode() : 0);
    }
}
