package u10;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276239c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f276240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Float f276241h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f276242j;
    public final Period k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Period f276243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f276244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f276245n;
    public final Period o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f276246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f276247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f276248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Instant f276249s;

    public b(UUID id10, String str, String str2, String str3, String str4, String str5, String str6, Float f, Long l2, Instant instant, Period period, Period period2, Integer num, Integer num2, Period period3, List list, boolean z, String str7, Instant instant2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f276237a = id10;
        this.f276238b = str;
        this.f276239c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f276240g = str6;
        this.f276241h = f;
        this.i = l2;
        this.f276242j = instant;
        this.k = period;
        this.f276243l = period2;
        this.f276244m = num;
        this.f276245n = num2;
        this.o = period3;
        this.f276246p = list;
        this.f276247q = z;
        this.f276248r = str7;
        this.f276249s = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f276237a, bVar.f276237a) && Intrinsics.f(this.f276238b, bVar.f276238b) && Intrinsics.f(this.f276239c, bVar.f276239c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f276240g, bVar.f276240g) && Intrinsics.f(this.f276241h, bVar.f276241h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f276242j, bVar.f276242j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f276243l, bVar.f276243l) && Intrinsics.f(this.f276244m, bVar.f276244m) && Intrinsics.f(this.f276245n, bVar.f276245n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f276246p, bVar.f276246p) && this.f276247q == bVar.f276247q && Intrinsics.f(this.f276248r, bVar.f276248r) && Intrinsics.f(this.f276249s, bVar.f276249s);
    }

    public final int hashCode() {
        int iHashCode = this.f276237a.hashCode() * 31;
        String str = this.f276238b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276239c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f276240g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.f276241h;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Instant instant = this.f276242j;
        int iHashCode10 = (iHashCode9 + (instant == null ? 0 : instant.hashCode())) * 31;
        Period period = this.k;
        int iHashCode11 = (iHashCode10 + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.f276243l;
        int iHashCode12 = (iHashCode11 + (period2 == null ? 0 : period2.hashCode())) * 31;
        Integer num = this.f276244m;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f276245n;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Period period3 = this.o;
        int iHashCode15 = (iHashCode14 + (period3 == null ? 0 : period3.hashCode())) * 31;
        List list = this.f276246p;
        int iC = j6.a.c((iHashCode15 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f276247q);
        String str7 = this.f276248r;
        int iHashCode16 = (iC + (str7 == null ? 0 : str7.hashCode())) * 31;
        Instant instant2 = this.f276249s;
        return iHashCode16 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
