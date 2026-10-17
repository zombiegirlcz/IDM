package sdh;

import java.math.BigDecimal;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f261887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f261888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f261889c;

    public a(Instant timestamp, BigDecimal drawdown, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(drawdown, "drawdown");
        this.f261887a = timestamp;
        this.f261888b = drawdown;
        this.f261889c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f261887a, aVar.f261887a) && Intrinsics.f(this.f261888b, aVar.f261888b) && Intrinsics.f(this.f261889c, aVar.f261889c);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f261888b, this.f261887a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f261889c;
        return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
