package z16;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f318753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f318754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f318755c;

    public b(ej0.b totalBalance, ej0.b totalPnl, BigDecimal performancePercent) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(totalPnl, "totalPnl");
        Intrinsics.checkNotNullParameter(performancePercent, "performancePercent");
        this.f318753a = totalBalance;
        this.f318754b = totalPnl;
        this.f318755c = performancePercent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f318753a, bVar.f318753a) && Intrinsics.f(this.f318754b, bVar.f318754b) && Intrinsics.f(this.f318755c, bVar.f318755c);
    }

    public final int hashCode() {
        return this.f318755c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.d(this.f318754b, this.f318753a.hashCode() * 31, 31);
    }
}
