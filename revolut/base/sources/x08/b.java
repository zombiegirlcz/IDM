package x08;

import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f301526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f301527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f301528c;
    public final Integer d;
    public final Instant e;

    public b(a attributionStatus, ej0.b priceAtPublication, BigDecimal bigDecimal, Integer num, Instant instant) {
        Intrinsics.checkNotNullParameter(attributionStatus, "attributionStatus");
        Intrinsics.checkNotNullParameter(priceAtPublication, "priceAtPublication");
        this.f301526a = attributionStatus;
        this.f301527b = priceAtPublication;
        this.f301528c = bigDecimal;
        this.d = num;
        this.e = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f301526a == bVar.f301526a && Intrinsics.f(this.f301527b, bVar.f301527b) && Intrinsics.f(this.f301528c, bVar.f301528c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.f301527b, this.f301526a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f301528c;
        int iHashCode = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.e;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }
}
