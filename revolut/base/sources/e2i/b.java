package e2i;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements mm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2i.g f122099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f122100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f122101c;
    public final dj0.d d;
    public final String e;

    public b(f2i.g periodType, LocalDate startDate, xi0.b cryptoCurrency, dj0.d amount, String str) {
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f122099a = periodType;
        this.f122100b = startDate;
        this.f122101c = cryptoCurrency;
        this.d = amount;
        this.e = str;
    }

    @Override // mm.c
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f122099a == bVar.f122099a && Intrinsics.f(this.f122100b, bVar.f122100b) && Intrinsics.f(this.f122101c, bVar.f122101c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(h30.l.j(this.f122101c, com.revolut.data.database.models.openbanking.d.g(this.f122100b, this.f122099a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
