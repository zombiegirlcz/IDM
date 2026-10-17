package phl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f236341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f236342c;
    public final boolean d;
    public final String e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iel.f f236343g;

    public a(String str, LocalDate localDate, LocalDate localDate2, boolean z, String str2, Integer num, iel.f fVar) {
        this.f236340a = str;
        this.f236341b = localDate;
        this.f236342c = localDate2;
        this.d = z;
        this.e = str2;
        this.f = num;
        this.f236343g = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f236340a, aVar.f236340a) && Intrinsics.f(this.f236341b, aVar.f236341b) && Intrinsics.f(this.f236342c, aVar.f236342c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f236343g == aVar.f236343g;
    }

    public final int hashCode() {
        String str = this.f236340a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.f236341b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f236342c;
        int iC = j6.a.c((iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode3 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        iel.f fVar = this.f236343g;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }
}
