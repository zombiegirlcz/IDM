package wvg;

import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f300506c;
    public final String d;
    public final xi0.b e;

    public y1(String userId, iwg.a analyticsProductType, a3 sector, String str, xi0.b currency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300504a = userId;
        this.f300505b = analyticsProductType;
        this.f300506c = sector;
        this.d = str;
        this.e = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f300504a, y1Var.f300504a) && this.f300505b == y1Var.f300505b && this.f300506c == y1Var.f300506c && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f300506c.hashCode() + ((this.f300505b.hashCode() + (this.f300504a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
