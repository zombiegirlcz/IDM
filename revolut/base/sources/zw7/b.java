package zw7;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f325755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f325756c;
    public final dj0.d d;

    public b(String petId, LocalDate newPriceStartDate, dj0.d newPrice, dj0.d previousPrice) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(newPriceStartDate, "newPriceStartDate");
        Intrinsics.checkNotNullParameter(newPrice, "newPrice");
        Intrinsics.checkNotNullParameter(previousPrice, "previousPrice");
        this.f325754a = petId;
        this.f325755b = newPriceStartDate;
        this.f325756c = newPrice;
        this.d = previousPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f325754a, bVar.f325754a) && Intrinsics.f(this.f325755b, bVar.f325755b) && Intrinsics.f(this.f325756c, bVar.f325756c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(com.revolut.data.database.models.openbanking.d.g(this.f325755b, this.f325754a.hashCode() * 31, 31), 31, this.f325756c);
    }
}
