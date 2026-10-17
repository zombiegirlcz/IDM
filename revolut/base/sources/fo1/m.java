package fo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136763a;

    public m(String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f136763a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f136763a, ((m) obj2).f136763a);
    }

    public final int hashCode() {
        return this.f136763a.hashCode();
    }
}
