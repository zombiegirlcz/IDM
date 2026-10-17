package p16;

import ej0.b;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f231876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f231877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f231878c;
    public final BigDecimal d;

    public a(b currentValue, b pnl2, b averagePrice, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f231876a = currentValue;
        this.f231877b = pnl2;
        this.f231878c = averagePrice;
        this.d = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f231876a, aVar.f231876a) && Intrinsics.f(this.f231877b, aVar.f231877b) && Intrinsics.f(this.f231878c, aVar.f231878c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + org.bouncycastle.jcajce.provider.digest.a.d(this.f231878c, org.bouncycastle.jcajce.provider.digest.a.d(this.f231877b, this.f231876a.hashCode() * 31, 31), 31);
    }
}
