package zpb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324228a;

    public g(String savingsAccountId) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        this.f324228a = savingsAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f324228a, ((g) obj2).f324228a);
    }

    public final int hashCode() {
        return this.f324228a.hashCode();
    }
}
