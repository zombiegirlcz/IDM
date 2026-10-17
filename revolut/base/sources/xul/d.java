package xul;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfl.a f309112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dfl.a f309113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f309114c;

    public d(dfl.a amount, dfl.a exchangedValue, BigDecimal rate) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(exchangedValue, "exchangedValue");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f309112a = amount;
        this.f309113b = exchangedValue;
        this.f309114c = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f309112a, dVar.f309112a) && Intrinsics.f(this.f309113b, dVar.f309113b) && Intrinsics.f(this.f309114c, dVar.f309114c);
    }

    public final int hashCode() {
        return this.f309114c.hashCode() + ((this.f309113b.hashCode() + (this.f309112a.hashCode() * 31)) * 31);
    }
}
