package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126261c;
    public final jo3.b d;

    public k(String symbol, String ref2, LocalDate paymentDate, jo3.b amount) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f126259a = symbol;
        this.f126260b = ref2;
        this.f126261c = paymentDate;
        this.d = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f126259a, kVar.f126259a) && Intrinsics.f(this.f126260b, kVar.f126260b) && Intrinsics.f(this.f126261c, kVar.f126261c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(p.a.c(this.f126259a.hashCode() * 31, 31, this.f126260b), 31, this.f126261c);
    }
}
