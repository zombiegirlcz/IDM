package qo2;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f247983c;
    public final c d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f247984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f247985h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f247986j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f247987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f247988m;

    public b(String id10, String merchantName, String str, c cVar, LocalDate localDate, LocalDate localDate2, boolean z, boolean z3, String str2, a type, dj0.d dVar, boolean z4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f247981a = id10;
        this.f247982b = merchantName;
        this.f247983c = str;
        this.d = cVar;
        this.e = localDate;
        this.f = localDate2;
        this.f247984g = z;
        this.f247985h = z3;
        this.i = str2;
        this.f247986j = type;
        this.k = dVar;
        this.f247987l = z4;
        this.f247988m = z && !z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f247981a, bVar.f247981a) && Intrinsics.f(this.f247982b, bVar.f247982b) && Intrinsics.f(this.f247983c, bVar.f247983c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f247984g == bVar.f247984g && this.f247985h == bVar.f247985h && Intrinsics.f(this.i, bVar.i) && this.f247986j == bVar.f247986j && Intrinsics.f(this.k, bVar.k) && this.f247987l == bVar.f247987l;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f247981a.hashCode() * 31, 31, this.f247982b);
        String str = this.f247983c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iC2 = j6.a.c(j6.a.c((iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.f247984g), 31, this.f247985h);
        String str2 = this.i;
        int iHashCode4 = (this.f247986j.hashCode() + ((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        dj0.d dVar = this.k;
        return Boolean.hashCode(this.f247987l) + ((iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }
}
