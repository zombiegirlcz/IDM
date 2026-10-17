package n3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.b f212052a;

    public g(jo3.b fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f212052a = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f212052a, ((g) obj2).f212052a);
    }

    public final int hashCode() {
        return this.f212052a.hashCode();
    }
}
