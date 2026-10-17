package fw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f138577a;

    public f(dj0.d downPayment) {
        Intrinsics.checkNotNullParameter(downPayment, "downPayment");
        this.f138577a = downPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f138577a, ((f) obj2).f138577a);
    }

    public final int hashCode() {
        return this.f138577a.hashCode();
    }
}
