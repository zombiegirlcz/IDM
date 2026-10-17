package sxf;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f266481c;
    public final LocalDate d;
    public final Integer e;
    public final c f;

    public b(String id10, String currency, LocalDate startDate, LocalDate localDate, Integer num, c recommendations) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.f266479a = id10;
        this.f266480b = currency;
        this.f266481c = startDate;
        this.d = localDate;
        this.e = num;
        this.f = recommendations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f266479a, bVar.f266479a) && Intrinsics.f(this.f266480b, bVar.f266480b) && Intrinsics.f(this.f266481c, bVar.f266481c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(this.f266479a.hashCode() * 31, 31, this.f266480b), 31, this.f266481c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
