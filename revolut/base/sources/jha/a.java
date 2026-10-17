package jha;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f174183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f174184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f174185c;

    public a(DateTime endDate, BigDecimal largePercent, BigDecimal smallPercent) {
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(largePercent, "largePercent");
        Intrinsics.checkNotNullParameter(smallPercent, "smallPercent");
        this.f174183a = endDate;
        this.f174184b = largePercent;
        this.f174185c = smallPercent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f174183a, aVar.f174183a) && Intrinsics.f(this.f174184b, aVar.f174184b) && Intrinsics.f(this.f174185c, aVar.f174185c);
    }

    public final int hashCode() {
        return this.f174185c.hashCode() + t61.a.d(this.f174184b, this.f174183a.hashCode() * 31, 31);
    }
}
