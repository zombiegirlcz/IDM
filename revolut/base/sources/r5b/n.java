package r5b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251577b;

    public n(List transactions, String str) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f251576a = transactions;
        this.f251577b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f251576a, nVar.f251576a) && Intrinsics.f(this.f251577b, nVar.f251577b);
    }

    public final int hashCode() {
        int iHashCode = this.f251576a.hashCode() * 31;
        String str = this.f251577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
