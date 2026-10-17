package eq5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f128295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f128296b;

    public n1(ArrayList toBaseCurrency, ArrayList toSourceCurrency) {
        Intrinsics.checkNotNullParameter(toBaseCurrency, "toBaseCurrency");
        Intrinsics.checkNotNullParameter(toSourceCurrency, "toSourceCurrency");
        this.f128295a = toBaseCurrency;
        this.f128296b = toSourceCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return this.f128295a.equals(n1Var.f128295a) && this.f128296b.equals(n1Var.f128296b);
    }

    public final int hashCode() {
        return this.f128296b.hashCode() + (this.f128295a.hashCode() * 31);
    }
}
