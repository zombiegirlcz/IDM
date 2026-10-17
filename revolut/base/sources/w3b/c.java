package w3b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f294252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f294253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f294254c;
    public final dj0.d d;

    public c(dj0.d targetPrice, BigDecimal quantity, BigDecimal leverage, dj0.d margin) {
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f294252a = targetPrice;
        this.f294253b = quantity;
        this.f294254c = leverage;
        this.d = margin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f294252a, cVar.f294252a) && Intrinsics.f(this.f294253b, cVar.f294253b) && Intrinsics.f(this.f294254c, cVar.f294254c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.d(this.f294254c, t61.a.d(this.f294253b, this.f294252a.hashCode() * 31, 31), 31);
    }
}
