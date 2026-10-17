package ael;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigDecimal f3683a = BigDecimal.valueOf(100L);

    public static final class a {
        private a() {
        }
    }

    public final vel.j a(dj0.d currentValue, dj0.d totalContributions, dj0.d totalWithdrawals) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(totalContributions, "totalContributions");
        Intrinsics.checkNotNullParameter(totalWithdrawals, "totalWithdrawals");
        xi0.b bVar = currentValue.f115083b;
        xi0.b bVar2 = totalContributions.f115083b;
        long j2 = totalContributions.f115082a;
        if (!Intrinsics.f(bVar, bVar2) || !Intrinsics.f(bVar, totalWithdrawals.f115083b)) {
            return null;
        }
        long j3 = (currentValue.f115082a + totalWithdrawals.f115082a) - j2;
        dj0.d dVar = new dj0.d(j3, bVar);
        BigDecimal bigDecimalDivide = j2 != 0 ? BigDecimal.valueOf(j3).multiply(f3683a).divide(BigDecimal.valueOf(j2), 10, RoundingMode.HALF_UP) : BigDecimal.ZERO;
        Intrinsics.h(bigDecimalDivide);
        return new vel.j(dVar, bigDecimalDivide);
    }
}
