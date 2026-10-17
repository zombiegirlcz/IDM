package pdh;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f235227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f235228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f235229c;
    public final BigDecimal d;

    public a(Instant timestamp, BigDecimal returns, BigDecimal totalReturns, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(returns, "returns");
        Intrinsics.checkNotNullParameter(totalReturns, "totalReturns");
        this.f235227a = timestamp;
        this.f235228b = returns;
        this.f235229c = totalReturns;
        this.d = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f235227a, aVar.f235227a) && Intrinsics.f(this.f235228b, aVar.f235228b) && Intrinsics.f(this.f235229c, aVar.f235229c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f235229c, t61.a.d(this.f235228b, this.f235227a.hashCode() * 31, 31), 31);
        BigDecimal bigDecimal = this.d;
        return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
