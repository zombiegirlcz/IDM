package lee;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194532a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f194532a, ((g) obj2).f194532a);
    }

    public final int hashCode() {
        return this.f194532a.hashCode();
    }

    public g(String uniqueTransactionReference) {
        Intrinsics.checkNotNullParameter(uniqueTransactionReference, "uniqueTransactionReference");
        this.f194532a = uniqueTransactionReference;
    }

    public /* synthetic */ g(int i) {
        this("");
    }
}
