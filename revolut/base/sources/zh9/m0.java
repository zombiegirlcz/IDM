package zh9;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f322307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f322308c;

    public m0(dj0.d interest, BigDecimal interestRate) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.f322306a = interest;
        this.f322307b = interestRate;
        this.f322308c = interest;
    }

    @Override // zh9.n0
    public final dj0.d a() {
        return this.f322308c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f322306a, m0Var.f322306a) && Intrinsics.f(this.f322307b, m0Var.f322307b);
    }

    public final int hashCode() {
        return this.f322307b.hashCode() + (this.f322306a.hashCode() * 31);
    }
}
