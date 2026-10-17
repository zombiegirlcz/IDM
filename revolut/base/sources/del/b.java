package del;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f113708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f113709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f113710c;
    public final BigDecimal d;
    public final List e;

    public b(ej0.b balancePrecise, ej0.b cashBalancePrecise, ej0.b deltaCostMoneyPrecise, BigDecimal bigDecimal, List instrumentBalances) {
        Intrinsics.checkNotNullParameter(balancePrecise, "balancePrecise");
        Intrinsics.checkNotNullParameter(cashBalancePrecise, "cashBalancePrecise");
        Intrinsics.checkNotNullParameter(deltaCostMoneyPrecise, "deltaCostMoneyPrecise");
        Intrinsics.checkNotNullParameter(instrumentBalances, "instrumentBalances");
        this.f113708a = balancePrecise;
        this.f113709b = cashBalancePrecise;
        this.f113710c = deltaCostMoneyPrecise;
        this.d = bigDecimal;
        this.e = instrumentBalances;
    }

    public static b a(b bVar, List instrumentBalances) {
        ej0.b balancePrecise = bVar.f113708a;
        ej0.b cashBalancePrecise = bVar.f113709b;
        ej0.b deltaCostMoneyPrecise = bVar.f113710c;
        BigDecimal bigDecimal = bVar.d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(balancePrecise, "balancePrecise");
        Intrinsics.checkNotNullParameter(cashBalancePrecise, "cashBalancePrecise");
        Intrinsics.checkNotNullParameter(deltaCostMoneyPrecise, "deltaCostMoneyPrecise");
        Intrinsics.checkNotNullParameter(instrumentBalances, "instrumentBalances");
        return new b(balancePrecise, cashBalancePrecise, deltaCostMoneyPrecise, bigDecimal, instrumentBalances);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f113708a, bVar.f113708a) && Intrinsics.f(this.f113709b, bVar.f113709b) && Intrinsics.f(this.f113710c, bVar.f113710c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.f113710c, org.bouncycastle.jcajce.provider.digest.a.d(this.f113709b, this.f113708a.hashCode() * 31, 31), 31);
        BigDecimal bigDecimal = this.d;
        return this.e.hashCode() + ((iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31);
    }
}
