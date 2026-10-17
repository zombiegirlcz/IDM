package yel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f313034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f313035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313036c;
    public final String d;

    public b(a rating, LocalDate lastUpdatedAt, String str, String str2) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(lastUpdatedAt, "lastUpdatedAt");
        this.f313034a = rating;
        this.f313035b = lastUpdatedAt;
        this.f313036c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f313034a == bVar.f313034a && Intrinsics.f(this.f313035b, bVar.f313035b) && Intrinsics.f(this.f313036c, bVar.f313036c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iA = y.a(this.f313034a.hashCode() * 31, 31, this.f313035b);
        String str = this.f313036c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
