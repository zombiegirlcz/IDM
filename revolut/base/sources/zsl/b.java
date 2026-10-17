package zsl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f324954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f324955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324956c;
    public final z d;

    public b(Amount maxOrderAmount, boolean z, boolean z3, z instrumentType) {
        Intrinsics.checkNotNullParameter(maxOrderAmount, "maxOrderAmount");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f324954a = maxOrderAmount;
        this.f324955b = z;
        this.f324956c = z3;
        this.d = instrumentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f324954a.equals(bVar.f324954a) && this.f324955b == bVar.f324955b && this.f324956c == bVar.f324956c && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f324954a.hashCode() * 31, 31, this.f324955b), 31, this.f324956c);
    }
}
