package u2f;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f276646c;

    public m(String orderToken, String quoteToken, BigDecimal pointsAmount) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
        this.f276644a = orderToken;
        this.f276645b = quoteToken;
        this.f276646c = pointsAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f276644a, mVar.f276644a) && Intrinsics.f(this.f276645b, mVar.f276645b) && Intrinsics.f(this.f276646c, mVar.f276646c);
    }

    public final int hashCode() {
        return this.f276646c.hashCode() + p.a.c(this.f276644a.hashCode() * 31, 31, this.f276645b);
    }
}
