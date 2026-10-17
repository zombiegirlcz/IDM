package r58;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251538c;
    public final LocalDate d;
    public final String e;
    public final bj0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kf8.b f251539g;

    public a(String juniorId, String str, String str2, LocalDate localDate, String juniorCode, bj0.b gender, kf8.b relationship) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(juniorCode, "juniorCode");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        this.f251536a = juniorId;
        this.f251537b = str;
        this.f251538c = str2;
        this.d = localDate;
        this.e = juniorCode;
        this.f = gender;
        this.f251539g = relationship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251536a, aVar.f251536a) && Intrinsics.f(this.f251537b, aVar.f251537b) && Intrinsics.f(this.f251538c, aVar.f251538c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f251539g == aVar.f251539g;
    }

    public final int hashCode() {
        int iHashCode = this.f251536a.hashCode() * 31;
        String str = this.f251537b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f251538c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.d;
        return this.f251539g.hashCode() + ((this.f.hashCode() + p.a.c((iHashCode3 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }
}
