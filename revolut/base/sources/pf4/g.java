package pf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv3.n f235439a;

    public g(cv3.n handleBackIntent) {
        Intrinsics.checkNotNullParameter(handleBackIntent, "handleBackIntent");
        this.f235439a = handleBackIntent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f235439a == ((g) obj2).f235439a;
    }

    public final int hashCode() {
        return this.f235439a.hashCode();
    }

    public g() {
        this(cv3.n.DEFAULT);
    }
}
