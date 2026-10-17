package jt5;

import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f178351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f178352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f178353c;

    public a(d totalBalance, d totalDelta, BigDecimal totalDeltaPercentage) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(totalDelta, "totalDelta");
        Intrinsics.checkNotNullParameter(totalDeltaPercentage, "totalDeltaPercentage");
        this.f178351a = totalBalance;
        this.f178352b = totalDelta;
        this.f178353c = totalDeltaPercentage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f178351a, aVar.f178351a) && Intrinsics.f(this.f178352b, aVar.f178352b) && Intrinsics.f(this.f178353c, aVar.f178353c);
    }

    public final int hashCode() {
        return this.f178353c.hashCode() + v7.c(this.f178351a.hashCode() * 31, 31, this.f178352b);
    }
}
