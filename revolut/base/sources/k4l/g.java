package k4l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f180968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f180969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f180970c;

    public g(Instant instant, Instant instant2, BigDecimal bigDecimal) {
        this.f180968a = instant;
        this.f180969b = instant2;
        this.f180970c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f180968a, gVar.f180968a) && Intrinsics.f(this.f180969b, gVar.f180969b) && Intrinsics.f(this.f180970c, gVar.f180970c);
    }

    public final int hashCode() {
        Instant instant = this.f180968a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.f180969b;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f180970c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
