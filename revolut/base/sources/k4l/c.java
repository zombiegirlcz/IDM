package k4l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f180950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f180951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f180952c;
    public final Instant d;
    public final g e;
    public final Instant f;

    public c(Instant internalCutoffDate, Instant tradeDate, BigDecimal bigDecimal, Instant instant, g gVar, Instant instant2) {
        Intrinsics.checkNotNullParameter(internalCutoffDate, "internalCutoffDate");
        Intrinsics.checkNotNullParameter(tradeDate, "tradeDate");
        this.f180950a = internalCutoffDate;
        this.f180951b = tradeDate;
        this.f180952c = bigDecimal;
        this.d = instant;
        this.e = gVar;
        this.f = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f180950a, cVar.f180950a) && Intrinsics.f(this.f180951b, cVar.f180951b) && Intrinsics.f(this.f180952c, cVar.f180952c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = r6.b.c(this.f180950a.hashCode() * 31, 31, this.f180951b);
        BigDecimal bigDecimal = this.f180952c;
        int iHashCode = (iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instant instant = this.d;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        g gVar = this.e;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Instant instant2 = this.f;
        return iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
    }
}
