package zsl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f324951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f324952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324953c;
    public final z d;

    public a(Amount minOrderAmount, boolean z, boolean z3, z instrumentType) {
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f324951a = minOrderAmount;
        this.f324952b = z;
        this.f324953c = z3;
        this.d = instrumentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f324951a.equals(aVar.f324951a) && this.f324952b == aVar.f324952b && this.f324953c == aVar.f324953c && this.d == aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f324951a.hashCode() * 31, 31, this.f324952b), 31, this.f324953c);
    }
}
