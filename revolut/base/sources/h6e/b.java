package h6e;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f149624c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f149625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f149626h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f149627j;

    public b(String cardId, String str, LocalDate localDate, String design, String brand, String cardName, String partnerId, String partnerContactCode, String partnerName, String partnerShortName) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(partnerContactCode, "partnerContactCode");
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(partnerShortName, "partnerShortName");
        this.f149622a = cardId;
        this.f149623b = str;
        this.f149624c = localDate;
        this.d = design;
        this.e = brand;
        this.f = cardName;
        this.f149625g = partnerId;
        this.f149626h = partnerContactCode;
        this.i = partnerName;
        this.f149627j = partnerShortName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f149622a, bVar.f149622a) && Intrinsics.f(this.f149623b, bVar.f149623b) && Intrinsics.f(this.f149624c, bVar.f149624c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f149625g, bVar.f149625g) && Intrinsics.f(this.f149626h, bVar.f149626h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f149627j, bVar.f149627j);
    }

    public final int hashCode() {
        int iHashCode = this.f149622a.hashCode() * 31;
        String str = this.f149623b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f149624c;
        return this.f149627j.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f149625g), 31, this.f149626h), 31, this.i);
    }
}
