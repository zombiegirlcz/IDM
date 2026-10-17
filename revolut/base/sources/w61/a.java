package w61;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295363c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f295364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f295365h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f295366j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f295367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LocalDate f295368m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f295369n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f295370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f295371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f295372r;

    public a(String id10, String content, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List scopes, LocalDate localDate, LocalDate localDate2, Boolean bool, String str9, String str10, Boolean bool2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f295361a = id10;
        this.f295362b = content;
        this.f295363c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f295364g = str5;
        this.f295365h = str6;
        this.i = str7;
        this.f295366j = str8;
        this.k = scopes;
        this.f295367l = localDate;
        this.f295368m = localDate2;
        this.f295369n = bool;
        this.o = str9;
        this.f295370p = str10;
        this.f295371q = bool2;
        this.f295372r = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f295361a, aVar.f295361a) && Intrinsics.f(this.f295362b, aVar.f295362b) && Intrinsics.f(this.f295363c, aVar.f295363c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f295364g, aVar.f295364g) && Intrinsics.f(this.f295365h, aVar.f295365h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f295366j, aVar.f295366j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f295367l, aVar.f295367l) && Intrinsics.f(this.f295368m, aVar.f295368m) && Intrinsics.f(this.f295369n, aVar.f295369n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f295370p, aVar.f295370p) && Intrinsics.f(this.f295371q, aVar.f295371q) && this.f295372r == aVar.f295372r;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f295361a.hashCode() * 31, 31, this.f295362b);
        String str = this.f295363c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f295364g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f295365h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f295366j;
        int iD = p.a.d((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.k);
        LocalDate localDate = this.f295367l;
        int iHashCode8 = (iD + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f295368m;
        int iHashCode9 = (iHashCode8 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        Boolean bool = this.f295369n;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f295370p;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.f295371q;
        return Boolean.hashCode(this.f295372r) + ((iHashCode12 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
