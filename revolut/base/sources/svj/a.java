package svj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f266023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f266024c;
    public final String d;
    public final List e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f266025g;

    public a(String id10, Long l2, Long l3, String countryCode, List transactionAdjustments, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(transactionAdjustments, "transactionAdjustments");
        this.f266022a = id10;
        this.f266023b = l2;
        this.f266024c = l3;
        this.d = countryCode;
        this.e = transactionAdjustments;
        this.f = j2;
        this.f266025g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266022a, aVar.f266022a) && Intrinsics.f(this.f266023b, aVar.f266023b) && Intrinsics.f(this.f266024c, aVar.f266024c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f266025g == aVar.f266025g;
    }

    public final int hashCode() {
        int iHashCode = this.f266022a.hashCode() * 31;
        Long l2 = this.f266023b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f266024c;
        return Boolean.hashCode(this.f266025g) + a0.d.c(p.a.d(p.a.c((iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
