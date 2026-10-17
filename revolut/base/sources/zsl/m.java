package zsl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f324973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324974c;
    public final boolean d;
    public final z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Amount minOrderAmount, boolean z, boolean z3, z instrumentType) {
        super(false);
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f324973b = minOrderAmount;
        this.f324974c = z;
        this.d = z3;
        this.e = instrumentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f324973b.equals(mVar.f324973b) && this.f324974c == mVar.f324974c && this.d == mVar.d && this.e == mVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(this.f324973b.hashCode() * 31, 31, this.f324974c), 31, this.d);
    }
}
