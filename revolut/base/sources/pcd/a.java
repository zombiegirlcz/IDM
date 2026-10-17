package pcd;

import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f234843c;
    public final dj0.d d;
    public final ncd.j e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f234844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f234845h;
    public final lcd.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lcd.r f234846j;
    public final xi0.b k;

    public a(String name, String productId, String str, dj0.d depositAmount, ncd.j displayRate, LocalDate localDate, String str2, dj0.d dVar, lcd.h hVar, lcd.r rVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        this.f234841a = name;
        this.f234842b = productId;
        this.f234843c = str;
        this.d = depositAmount;
        this.e = displayRate;
        this.f = localDate;
        this.f234844g = str2;
        this.f234845h = dVar;
        this.i = hVar;
        this.f234846j = rVar;
        this.k = depositAmount.f115083b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f234841a, aVar.f234841a) && Intrinsics.f(this.f234842b, aVar.f234842b) && Intrinsics.f(this.f234843c, aVar.f234843c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f234844g, aVar.f234844g) && Intrinsics.f(this.f234845h, aVar.f234845h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f234846j, aVar.f234846j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f234841a.hashCode() * 31, 31, this.f234842b);
        String str = this.f234843c;
        int iHashCode = (this.e.hashCode() + v7.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        LocalDate localDate = this.f;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.f234844g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dj0.d dVar = this.f234845h;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        lcd.h hVar = this.i;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        lcd.r rVar = this.f234846j;
        return iHashCode5 + (rVar != null ? rVar.hashCode() : 0);
    }
}
