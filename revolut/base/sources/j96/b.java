package j96;

import aii.r;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h96.d f172293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DepositAmount f172295c;

    public b(h96.d mode, String companyName, DepositAmount depositAmount) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        this.f172293a = mode;
        this.f172294b = companyName;
        this.f172295c = depositAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f172293a == bVar.f172293a && Intrinsics.f(this.f172294b, bVar.f172294b) && Intrinsics.f(this.f172295c, bVar.f172295c);
    }

    public final int hashCode() {
        return this.f172295c.hashCode() + p.a.c(this.f172293a.hashCode() * 31, 31, this.f172294b);
    }
}
