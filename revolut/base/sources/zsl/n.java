package zsl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f324975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324976c;
    public final boolean d;
    public final z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Amount maxOrderAmount, boolean z, boolean z3, z instrumentType) {
        super(false);
        Intrinsics.checkNotNullParameter(maxOrderAmount, "maxOrderAmount");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f324975b = maxOrderAmount;
        this.f324976c = z;
        this.d = z3;
        this.e = instrumentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f324975b.equals(nVar.f324975b) && this.f324976c == nVar.f324976c && this.d == nVar.d && this.e == nVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(this.f324975b.hashCode() * 31, 31, this.f324976c), 31, this.d);
    }
}
